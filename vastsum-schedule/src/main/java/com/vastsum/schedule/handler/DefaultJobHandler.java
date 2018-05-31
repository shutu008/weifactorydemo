package com.vastsum.schedule.handler;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vastsum.core.service.HandRemoteService;
import com.vastsum.entity.Batch;
import com.vastsum.entity.Device;
import com.vastsum.entity.GrowthPatternParam;
import com.vastsum.service.BatchService;
import com.vastsum.service.DeviceService;
import com.vastsum.utils.BizUtils;
import com.vastsum.utils.DateTimeUtils;
import com.vastsum.utils.GrowthParamCache;
import com.vastsum.utils.ParamHelper;
import com.vastsum.utils.ResourceProperty;

@Service(value ="defaultJobHandler")
public class DefaultJobHandler implements JobHandler {
	
	private static Logger logger = LoggerFactory.getLogger(Logger.class);
	
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private HandRemoteService handRemoteService;
	@Autowired
	private BatchService batchService;
	@Override
	public void test() {
		System.err.println("========定时任务测试方法============");
	}

	/**
	 * 1.先查询出所有托管给服务器的设备。
	 * 2.判断这些设备是否在线。
	 * 3.如果在线，则查询设备对应的最新的批次信息，从批次信息中找出生长模式
	 * 4.根据生长模式ID，生长模式参数设置。
	 * 5.将生长模式参数设置，组装成下发的hashmap,执行下发操作
	 */
	@Override
	public void selfParamSet() {
		//在线并且托管给服务器的设备
		List<String> onAndTrust = new ArrayList<>();
		List<Device> list = deviceService.findByTrustStatus("1");
		List<String> listSn = new ArrayList<>();
		for (Device device : list) {
			listSn.add(device.getSn());
		}
		logger.info("调度参数设置-下发设备列表："+ReflectionToStringBuilder.toString(listSn));
		if (listSn.isEmpty()) {
			return;
		}
		ArrayList<String> onlineDeviceList = handRemoteService.getOnlineDeviceList();
		for (int i = 0; i < listSn.size(); i++) {
			for (int j = 0; j < onlineDeviceList.size(); j++) {
				if (listSn.get(i).equals(onlineDeviceList.get(j))) {
					onAndTrust.add(onlineDeviceList.get(j));
				}
			}
		}
		logger.info("调度参数设置-在线并托管给服务器的设备："+ReflectionToStringBuilder.toString(onAndTrust));
		if (onAndTrust.isEmpty()) {
			return;
		}
		
		List<Integer> deviceIdList = new ArrayList<>();
		for (int i = 0; i < onAndTrust.size(); i++) {
			Device device = deviceService.getDeviceBySn(onAndTrust.get(i));
			deviceIdList.add(device.getDeviceId());
		}
		List<Batch> batchList = new ArrayList<>();
		for (int i = 0; i < deviceIdList.size(); i++) {
			batchList.add(batchService.selectLastBatchByDeviceId(deviceIdList.get(i)));
		}
		
		logger.info("调度参数设置-待下发的批次列表："+batchList);
		try {
			for (Batch batch : batchList) {
				Integer g1 = Integer.parseInt(batch.getCultModelOne());
				String p1 = batch.getPlantOne();
				if (g1 != null && StringUtils.isNotBlank(p1)) {
					this.sendByGrowthNo(batch, g1, p1,1);
				}
				
				Thread.sleep(Integer.parseInt(ParamHelper.getParam("selfParamInterval")));
				Integer g2 = Integer.parseInt(batch.getCultModelTwo());
				String p2 = batch.getPlantTwo();
				if (g2 != null && StringUtils.isNotBlank(p2)) {
					this.sendByGrowthNo(batch, g2, p2,2);
				}
				
				Thread.sleep(Integer.parseInt(ParamHelper.getParam("selfParamInterval")));
				Integer g3 = Integer.parseInt(batch.getCultModelThree());
				String p3 = batch.getPlantThree();
				if (g3 != null) {
					this.sendByGrowthNo(batch, g3,p3,3);
				}
			}
		} catch (InterruptedException e) {
			logger.error("下发自定义参数异常，延时异常");
			e.printStackTrace();
		}
		
	}
	
	/**
	 *  组装生长模式对应的hashmap
	 * @param param
	 * @return HashMap<String, Object>
	 */
	private HashMap<String, Object> hashMap(GrowthPatternParam param){
		Class<GrowthPatternParam> clazz = GrowthPatternParam.class;
		HashMap<String, Object> hashMap = new HashMap<>();
		Field[] fields = clazz.getDeclaredFields();
		for(Field f : fields) {
			logger.info("字段的类型："+f.getType().toString());
				try {
					String fieldName = f.getName();
					logger.info("字段名："+fieldName);
					String publicMethodName = null;
					if (fieldName.substring(0, 1).equals("a") || fieldName.substring(0, 1).equals("b")) {
						publicMethodName = "get"+fieldName;
					}else {
						publicMethodName = "get"+fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1);
					}
							
					logger.info("方法名："+publicMethodName);
					Method m = clazz.getMethod(publicMethodName);
					Object resultCurrent = (Object)m.invoke(param);
					logger.info("要下发的原始数据："+resultCurrent);
					String function = StringUtils.trim(ResourceProperty.getProperties("dataConvert.properties").getProperty("growthPatternParam."+fieldName));
					if (StringUtils.isNotBlank(function) && resultCurrent != null) {
						hashMap.put(function, resultCurrent);
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
		
		return hashMap;
	}
	
	/**
	 * 批次对应生长模式，数据发送
	 * @param batch
	 * @param growthNo
	 * @param layer 层级
	 */
	private void sendByGrowthNo(Batch batch ,Integer growthNo, String plantNo, Integer layer) {
		List<GrowthPatternParam> listGrowth = GrowthParamCache.listByModelId(plantNo,growthNo);
		if (listGrowth == null || listGrowth.isEmpty()) {
			logger.info("植物名称为："+plantNo+"；生长模式为："+growthNo+"没有参数设置数据！");
			return;
		}
		//根据批次生成的日期来处理
		int batchDay = (int) ((System.currentTimeMillis()-batch.getGmtCreate().getTime())/(24*60*60*1000+0.5));
		logger.info("当前时间距离批次生成时间为"+batchDay+"天！");
		//本次要下发的参数
		GrowthPatternParam param = null;
		int b = 0;
		for (int i = 0; i < listGrowth.size(); i++) {
			int a = listGrowth.get(i).getDays();
			 b = a+b;
			if ( b >= batchDay) {
				param = listGrowth.get(i);
				break;
			}
		}
		if (param == null) {
			//时间已过，没有参数要下发
			logger.info("当前时间周期没有要下发的数据，对应的设备ID为："+batch.getDeviceId());
			return;
		}
		//添加对应的设备序列号
		String sn = deviceService.getSnByDeviceId(batch.getDeviceId());
		logger.info("设备序列号为："+sn + ";批次为："+batch.getBatchId()+";植物名称为："
		+plantNo+"；生长模式为："+growthNo+"进行数据自动下发，下发时间为："+DateTimeUtils.nowLocaleDateString());
		HashMap<String,Object> hashMap = this.hashMap(param);
		//数据处理
		hashMap = this.handler(hashMap);
		//分层转化
		hashMap = this.reverse(hashMap, layer, growthNo);
		if (hashMap != null) {
		//准备下发	
			hashMap.put("sn", sn);
			handRemoteService.sendOrder(hashMap);
		}
	}
	
	/**
	 * 数据处理，时间和温湿度
	 * @param hashMap
	 * @return HashMap<String, Object>
	 */
	private HashMap<String, Object> handler(HashMap<String, Object> hashMap){
		//数据处理
		Set<Entry<String, Object>> entrySet = hashMap.entrySet();
		for (Entry<String, Object> entry : entrySet) {
			String key = entry.getKey();
			
			//处理一天之内的时间，白天开始时间，晚上开始时间
			if ("T0007004".equals(key) || "T0007005".equals(key) || "T0007006".equals(key) || "T0007007".equals(key)) {
				String data = BizUtils.timeFormat((hashMap.get(key).toString()));
				hashMap.put(key, data);
			}
			
			//处理温湿度
			if ("T0007109".equals(key) || "T0007110".equals(key) 
					|| "T0007111".equals(key) || "T0007112".equals(key)) {
				String data = BizUtils.handle3data((String)hashMap.get(key));
				hashMap.put(key, data);
			}
		}
		
		logger.info("准备下发的hashmap:"+hashMap.toString());
		return hashMap;
	}
	
	/**
	 * 分层数据转化
	 * @param hashMap
	 * @param layer
	 * @param groupModel 生长模式
	 * @return HashMap<String, Object>
	 */
	private HashMap<String, Object> reverse(HashMap<String, Object> hashMap, Integer layer, Integer groupModel){
		HashMap<String, Object> newHashmap = new HashMap<>();
		Set<String> keySet = hashMap.keySet();
		for (String key : keySet) {
			if ("T00071".equals(key.substring(0, 6))) {
				String lastStr = key.substring(6);
				String newKey = "T0007"+layer+lastStr;
				newHashmap.put(newKey, hashMap.get(key));
			}else if ("T00079".equals(key.substring(0,6))) {
				String newKey = "T000790"+groupModel;
				newHashmap.put(newKey, hashMap.get(key));
			}else {
				newHashmap.put(key, hashMap.get(key));
			}
		}
		return newHashmap;
	}
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());;
	}
	

}

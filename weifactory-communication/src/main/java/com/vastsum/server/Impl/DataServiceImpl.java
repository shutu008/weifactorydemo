package com.vastsum.server.Impl;

import com.vastsum.entity.BizException;
import com.vastsum.entity.SensorCollection;
import com.vastsum.pojo.BizExceptionContent;
import com.vastsum.pojo.ExceptionTypeEnum;
import com.vastsum.pojo.ModelEntity;
import com.vastsum.server.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ssj
 * @create 2017-09-25 22:11
 */
public class DataServiceImpl implements DataService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DataServiceImpl.class);
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DataServiceImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    //将采集数据插入到数据库
    @Override
    public int insert(SensorCollection sensorCollection) {
        String sql = "insert into sensor_collection(sn, sensor,data,data_type,batch_no,gmt_create) values(?,?,?,?,?,?)";
        int j = this.jdbcTemplate.update(sql, sensorCollection.getSn(), sensorCollection.getSensor(), sensorCollection.getData(), sensorCollection.getDataType(), sensorCollection.getBatchNo(), new Date());
        bizExceptionSave(sensorCollection);
       return j;
    }

    //获取任务调度开始位置
    @Override
    public int getTempSensorId() {
        String sql  = "select * from temp_quarz_sensor_id";
        Map<String, Object> objectMap = jdbcTemplate.queryForMap(sql);
        Integer val = (Integer) objectMap.get("sensor_id");
        return val;
    }

    //业务异常插入到数据库中
    @Override
    public int exceptionInsert(BizException bizExption) {
        //获取用户id
        String sql = "select user_id from device where sn = ? order by device_id desc LIMIT 1";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql,bizExption.getSn());
        if (mapList == null || mapList.isEmpty()){
            return 0;
        }
        Map<String, Object> objectMap = mapList.get(0);

        Integer userId = (Integer) objectMap.get("user_id");
        //执行插入操作
        String insertSql = "insert into biz_exception(sn, sensor_no, user_id, exception_type, exception_content) values(?,?,?,?,?)";
        return jdbcTemplate.update(insertSql, bizExption.getSn(),bizExption.getSensorNo(),userId, bizExption.getExceptionType(), bizExption.getExceptionContent());
    }

    //保存业务异常
    @Override
    public int bizExceptionSave(SensorCollection sensorCollection) {
        //业务异常处理
        //根据设备序列号获取对应的批次号，判断当前批次有没有关联模型
        String sqlBatch = "select device_id from device where sn = ?";
        List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sqlBatch,sensorCollection.getSn());
        if (mapList == null || mapList.isEmpty()){
            return 0;
        }
        Map<String, Object> objectMap = mapList.get(0);
        Integer device_id = (Integer)objectMap.get("device_id");
        if (device_id == null){
            return 0;
        }
        //获取最新的批次信息
        String sqlLastBatch = "select model_id from batch where device_id = ? order by batch_id desc limit 1";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sqlLastBatch,device_id);
        if (maps == null || maps.isEmpty()){
            return 0;
        }
        Integer modelId = (Integer)maps.get(0).get("model_id");
        if (modelId == null){
            return 0;
        }

        //查询模型信息并进行缓存(后期优化)
        String sqlModel = "select * from model where model_id = ?";
        List<Map<String,Object>> modelList = jdbcTemplate.queryForList(sqlModel,modelId);
        if (modelList == null || modelList.isEmpty()){
            return 0;
        }
        Map<String,Object> modelMap = modelList.get(0);
        ModelEntity modelEntity = new ModelEntity();
        modelEntity.setTemperatureUp((Double) modelMap.get("temperature_up"));
        modelEntity.setTemperatureDown((Double) modelMap.get("temperature_down"));
        modelEntity.setHumidityUp((Double)modelMap.get("humidity_up"));
        modelEntity.setHumidityDown((Double)modelMap.get("humidity_down"));
        modelEntity.setIlluminationUp((Double)modelMap.get("illumination_up"));
        modelEntity.setIlluminationDown((Double)modelMap.get("illumination_down"));
        modelEntity.setCo2Up((Double)modelMap.get("co2_up"));
        modelEntity.setCo2Down((Double)modelMap.get("co2_down"));
        modelEntity.setPhUp((Double)modelMap.get("ph_up"));
        modelEntity.setPhDown((Double)modelMap.get("ph_down"));
        modelEntity.setEcUp((Double)modelMap.get("ec_up"));
        modelEntity.setEcDown((Double)modelMap.get("ec_down"));
        modelEntity.setOxygenUp((Double)modelMap.get("oxygen_up"));
        modelEntity.setOxygenDown((Double)modelMap.get("oxygen_down"));
        modelEntity.setHighLevelUp((Double)modelMap.get("high_level_up"));
        modelEntity.setHightLevelDown((Double)modelMap.get("hight_level_down"));
        modelEntity.setLowLevelUp((Double)modelMap.get("low_level_up"));
        modelEntity.setLowLevelDown((Double)modelMap.get("low_level_down"));
        //判断数据有没有越界
        //获取传感器的数据位与传感器标识位
        Integer sensorId = sensorCollection.getSensor();
        double data = Double.parseDouble(sensorCollection.getData());
        BizException bizException = new BizException();
        bizException.setSn(sensorCollection.getSn());
        bizException.setSensorNo(sensorId);
        bizException.setExceptionType(ExceptionTypeEnum.BUSINESS_EXCEPTION.getId());
        if (sensorId == 1 || sensorId == 2 || sensorId == 3){
            double temperatureUp = modelEntity.getTemperatureUp();
            double temperatureDown = modelEntity.getTemperatureDown();
            if (data<temperatureDown){
                bizException.setExceptionContent(BizExceptionContent.TEMPERATURE_DOWN.getContent());
            }else if (data>temperatureUp){
                bizException.setExceptionContent(BizExceptionContent.TEMPERATURE_UP.getContent());
            }
        }else if (sensorId == 4 || sensorId== 5 || sensorId==6){
            double humidityUp = modelEntity.getHumidityUp();
            double humidityDown = modelEntity.getHumidityDown();
            if (data< humidityDown){
                bizException.setExceptionContent(BizExceptionContent.HUMIDITY_DOWN.getContent());
            }else if (data>humidityUp){
                bizException.setExceptionContent(BizExceptionContent.HUMIDITY_UP.getContent());
            }
        }else if (sensorId == 7 || sensorId == 8 || sensorId == 9){
            double illuminationUp = modelEntity.getIlluminationUp();
            double illuminationDown = modelEntity.getIlluminationDown();
            if (data< illuminationDown){
                bizException.setExceptionContent(BizExceptionContent.ILLUMINATION_DOWN.getContent());
            }else if (data>illuminationUp){
                bizException.setExceptionContent(BizExceptionContent.ILLUMINATION_UP.getContent());
            }
        }else if (sensorId == 10){
            double co2Up = modelEntity.getCo2Up();
            double co2Down = modelEntity.getCo2Down();
            if (data<co2Down){
                bizException.setExceptionContent(BizExceptionContent.CO2_DOWN.getContent());
            }else if (data>co2Up){
                bizException.setExceptionContent(BizExceptionContent.CO2_UP.getContent());
            }
        }else if (sensorId == 11){
            double phUp = modelEntity.getPhUp();
            double phDown = modelEntity.getPhDown();
            if (data<phDown){
                bizException.setExceptionContent(BizExceptionContent.PH_DOWN.getContent());
            }else if (data>phUp){
                bizException.setExceptionContent(BizExceptionContent.PH_UP.getContent());
            }
        }else if (sensorId == 12){
            double ecUp = modelEntity.getEcUp();
            double ecDown = modelEntity.getEcDown();
            if (data<ecDown){
                bizException.setExceptionContent(BizExceptionContent.EC_DOWN.getContent());
            }else if (data>ecUp){
                bizException.setExceptionContent(BizExceptionContent.EC_UP.getContent());
            }
        }else if (sensorId == 13){
            double oxygenUp = modelEntity.getOxygenUp();
            double oxygenDown = modelEntity.getOxygenDown();
            if (data<oxygenDown){
                bizException.setExceptionContent(BizExceptionContent.OXYGEN_DOWN.getContent());
            }else if (data> oxygenUp){
                bizException.setExceptionContent(BizExceptionContent.OXYGEN_UP.getContent());
            }
        }else if (sensorId == 16){
            double highLevelUp = modelEntity.getHighLevelUp();
            double hightLevelDown = modelEntity.getHightLevelDown();
            if (data<hightLevelDown){
                bizException.setExceptionContent(BizExceptionContent.HIGHT_LEVEL_DOWN.getContent());
            }else if (data>highLevelUp){
                bizException.setExceptionContent(BizExceptionContent.HIGH_LEVEL_UP.getContent());
            }
        }else if (sensorId == 17){
            double lowLevelUp = modelEntity.getLowLevelUp();
            double lowLevelDown = modelEntity.getLowLevelDown();
            if (data<lowLevelDown){
                bizException.setExceptionContent(BizExceptionContent.LOW_LEVEL_DOWN.getContent());
            }else if (data>lowLevelUp){
                bizException.setExceptionContent(BizExceptionContent.LOW_LEVEL_UP.getContent());
            }
        }
        if (bizException.getExceptionContent() == null){
            return 0;
        }
        return exceptionInsert(bizException);
    }

}

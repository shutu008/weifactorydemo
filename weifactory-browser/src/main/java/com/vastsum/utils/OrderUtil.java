package com.vastsum.utils;

import org.apache.commons.lang.RandomStringUtils;

import com.vastsum.exception.OrderException;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-10-16 21:41
 */
public class OrderUtil {

    public static String getOutTradeOrder(){
       // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYMMddhhmmss");
        //当前时间戳+4位随机数（保证不重复）
        return "M"+System.currentTimeMillis()+ RandomStringUtils.randomNumeric(4);
    }

    public static String getOrderBody(){
       // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYMMddhhmmss");
        return "植物工厂"+System.currentTimeMillis()+ RandomStringUtils.randomNumeric(4);
    }

    //订单价格计算策略工具
    public static BigDecimal getTotalFee(String deposit, Date startTime, Date endTime) throws OrderException{
    	if ("1".equals(deposit)) {
			BigDecimal decimal = new BigDecimal(ParamHelper.getValueByCode("allPrice"));
			BigDecimal bigDecimal = decimal.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入保留两位小数
	        return bigDecimal;
		}else if ("2".equals(deposit)) {
			if (startTime == null || endTime == null) {
				throw new OrderException("订单生成异常");
			}else{
				int days = (int)((endTime.getTime() - startTime.getTime()) / (1000*3600*24-10));
				days++;
		        BigDecimal decimal = new BigDecimal(days * Float.valueOf(ParamHelper.getValueByCode("price")));
		        BigDecimal bigDecimal = decimal.setScale(2, BigDecimal.ROUND_HALF_UP);//四舍五入保留两位小数
		        return bigDecimal;
			}
		}
    	throw new OrderException("订单生成异常");
    }
}

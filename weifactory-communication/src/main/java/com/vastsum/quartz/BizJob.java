package com.vastsum.quartz;

import com.vastsum.server.SensorService;
import com.vastsum.utils.SpringConfigUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ssj
 * @create 2017-10-10 22:46
 */
public class BizJob extends QuartzJobBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(BizJob.class);

    @Override
    protected void executeInternal(JobExecutionContext ctx)
            throws JobExecutionException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        LOGGER.info("本次定时任务开始时间："+s);
        //执行调度程序
        SensorService sensorService = (SensorService)SpringConfigUtil.getBean("sensorService");
        sensorService.workData();
    }
}

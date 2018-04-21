package com.vastsum.schedule.utils;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.lang.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.vastsum.core.utils.SpringContextUtils;
import com.vastsum.schedule.entity.ScheduleJobEntity;
import com.vastsum.schedule.entity.ScheduleJobLog;
import com.vastsum.schedule.service.ScheduleJobLogService;

/**
 * 定时任务
 * @author shutu008
 *
 */
public class ScheduleJob extends QuartzJobBean {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private ExecutorService service = Executors.newSingleThreadExecutor(); 
	
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
//        ScheduleJobEntity scheduleJob = (ScheduleJobEntity) context.getJobDetail().getJobDataMap()
//        		.get(ScheduleJobEntity.JOB_PARAM_KEY);
    	Object object = context.getJobDetail().getJobDataMap().get(ScheduleJobEntity.JOB_PARAM_KEY);
    	@SuppressWarnings("unchecked")
		Map<String, Object> map = (Map<String, Object>) objectToMap(object);
    	ScheduleJobEntity scheduleJob = new ScheduleJobEntity();
    	if (map.get("beanName") != null) {
    		scheduleJob.setBeanName(map.get("beanName").toString());
		}
    	if (map.get("jobId") != null) {
    		scheduleJob.setJobId(Long.valueOf(map.get("jobId").toString()));
		}
    	if (map.get("cronExpression") != null) {
    		scheduleJob.setCronExpression(map.get("cronExpression").toString());
		}
    	if (map.get("methodName") != null) {
    		scheduleJob.setMethodName(map.get("methodName").toString());
		}
    	if (map.get("params") != null) {
    		scheduleJob.setParams(map.get("params").toString());
		}
    	if (map.get("status") != null) {
    		scheduleJob.setStatus(map.get("status").toString());
		}
    	if (map.get("scheduleName") != null) {
    		scheduleJob.setStatus(map.get("scheduleName").toString());
		} 

        //获取spring bean
        ScheduleJobLogService scheduleJobLogService = (ScheduleJobLogService) SpringContextUtils.getBean("scheduleJobLogService");
        
        //数据库保存执行记录
        ScheduleJobLog log = new ScheduleJobLog();
        log.setJobId(scheduleJob.getJobId());
        log.setBeanName(scheduleJob.getBeanName());
        log.setMethodName(scheduleJob.getMethodName());
        log.setParams(scheduleJob.getParams());
        log.setGmtCreate(new Date());
        
        //任务开始时间
        long startTime = System.currentTimeMillis();
        
        try {
            //执行任务
        	logger.info("任务准备执行，任务ID：" + scheduleJob.getJobId());
            ScheduleRunnable task = new ScheduleRunnable(scheduleJob.getBeanName(), 
            		scheduleJob.getMethodName(), scheduleJob.getParams());
            Future<?> future = service.submit(task);
            
			future.get();
			
			//任务执行总时长
			long times = System.currentTimeMillis() - startTime;
			log.setTimes((int)times);
			//任务状态   成功：1,失败：0
			log.setStatus("1");
			
			logger.info("任务执行完毕，任务ID：" + scheduleJob.getJobId() + "  总共耗时：" + times + "毫秒");
		} catch (Exception e) {
			logger.error("任务执行失败，任务ID：" + scheduleJob.getJobId(), e);
			
			//任务执行总时长
			long times = System.currentTimeMillis() - startTime;
			log.setTimes((int)times);
			
			//任务状态    0：成功    1：失败
			log.setStatus("0");
			log.setErrorMessage(StringUtils.substring(e.toString(), 0, 254));
		}finally {
			scheduleJobLogService.save(log);
		}
    }
    
    public static Object mapToObject(Map<String, Object> map, Class<?> beanClass)
            throws Exception {
        if (map == null)
            return null;
        Object obj = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(obj, map);
        return obj;
    }

    public static Map<?, ?> objectToMap(Object obj) {
        if (obj == null) {
            return null;
        }
        return new org.apache.commons.beanutils.BeanMap(obj);
    }
}

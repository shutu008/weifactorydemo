package com.vastsum.schedule.enums;

/**
 * 定时任务状态
 * @author shutu008
 *
 */
 public enum ScheduleStatus {
     /**
      * 正常
      */
 	NORMAL("1"),
     /**
      * 暂停
      */
 	PAUSE("0");

     private String value;

     private ScheduleStatus(String value) {
         this.value = value;
     }
     
     public String getValue() {
         return value;
     }

	public void setValue(String value) {
		this.value = value;
	}
     
 }
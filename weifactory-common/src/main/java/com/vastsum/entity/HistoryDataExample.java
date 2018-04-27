package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHistoryIdIsNull() {
            addCriterion("history_id is null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIsNotNull() {
            addCriterion("history_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryIdEqualTo(Long value) {
            addCriterion("history_id =", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotEqualTo(Long value) {
            addCriterion("history_id <>", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThan(Long value) {
            addCriterion("history_id >", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("history_id >=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThan(Long value) {
            addCriterion("history_id <", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdLessThanOrEqualTo(Long value) {
            addCriterion("history_id <=", value, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdIn(List<Long> values) {
            addCriterion("history_id in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotIn(List<Long> values) {
            addCriterion("history_id not in", values, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdBetween(Long value1, Long value2) {
            addCriterion("history_id between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andHistoryIdNotBetween(Long value1, Long value2) {
            addCriterion("history_id not between", value1, value2, "historyId");
            return (Criteria) this;
        }

        public Criteria andSnIsNull() {
            addCriterion("sn is null");
            return (Criteria) this;
        }

        public Criteria andSnIsNotNull() {
            addCriterion("sn is not null");
            return (Criteria) this;
        }

        public Criteria andSnEqualTo(String value) {
            addCriterion("sn =", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotEqualTo(String value) {
            addCriterion("sn <>", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThan(String value) {
            addCriterion("sn >", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnGreaterThanOrEqualTo(String value) {
            addCriterion("sn >=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThan(String value) {
            addCriterion("sn <", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLessThanOrEqualTo(String value) {
            addCriterion("sn <=", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnLike(String value) {
            addCriterion("sn like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotLike(String value) {
            addCriterion("sn not like", value, "sn");
            return (Criteria) this;
        }

        public Criteria andSnIn(List<String> values) {
            addCriterion("sn in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotIn(List<String> values) {
            addCriterion("sn not in", values, "sn");
            return (Criteria) this;
        }

        public Criteria andSnBetween(String value1, String value2) {
            addCriterion("sn between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andSnNotBetween(String value1, String value2) {
            addCriterion("sn not between", value1, value2, "sn");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNull() {
            addCriterion("identify is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNotNull() {
            addCriterion("identify is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyEqualTo(String value) {
            addCriterion("identify =", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotEqualTo(String value) {
            addCriterion("identify <>", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThan(String value) {
            addCriterion("identify >", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThanOrEqualTo(String value) {
            addCriterion("identify >=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThan(String value) {
            addCriterion("identify <", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThanOrEqualTo(String value) {
            addCriterion("identify <=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLike(String value) {
            addCriterion("identify like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotLike(String value) {
            addCriterion("identify not like", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyIn(List<String> values) {
            addCriterion("identify in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotIn(List<String> values) {
            addCriterion("identify not in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyBetween(String value1, String value2) {
            addCriterion("identify between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotBetween(String value1, String value2) {
            addCriterion("identify not between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andServerTimeIsNull() {
            addCriterion("server_time is null");
            return (Criteria) this;
        }

        public Criteria andServerTimeIsNotNull() {
            addCriterion("server_time is not null");
            return (Criteria) this;
        }

        public Criteria andServerTimeEqualTo(Date value) {
            addCriterion("server_time =", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotEqualTo(Date value) {
            addCriterion("server_time <>", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeGreaterThan(Date value) {
            addCriterion("server_time >", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("server_time >=", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeLessThan(Date value) {
            addCriterion("server_time <", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeLessThanOrEqualTo(Date value) {
            addCriterion("server_time <=", value, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeIn(List<Date> values) {
            addCriterion("server_time in", values, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotIn(List<Date> values) {
            addCriterion("server_time not in", values, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeBetween(Date value1, Date value2) {
            addCriterion("server_time between", value1, value2, "serverTime");
            return (Criteria) this;
        }

        public Criteria andServerTimeNotBetween(Date value1, Date value2) {
            addCriterion("server_time not between", value1, value2, "serverTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNull() {
            addCriterion("device_time is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIsNotNull() {
            addCriterion("device_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeEqualTo(Date value) {
            addCriterion("device_time =", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotEqualTo(Date value) {
            addCriterion("device_time <>", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThan(Date value) {
            addCriterion("device_time >", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("device_time >=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThan(Date value) {
            addCriterion("device_time <", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeLessThanOrEqualTo(Date value) {
            addCriterion("device_time <=", value, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeIn(List<Date> values) {
            addCriterion("device_time in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotIn(List<Date> values) {
            addCriterion("device_time not in", values, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeBetween(Date value1, Date value2) {
            addCriterion("device_time between", value1, value2, "deviceTime");
            return (Criteria) this;
        }

        public Criteria andDeviceTimeNotBetween(Date value1, Date value2) {
            addCriterion("device_time not between", value1, value2, "deviceTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizExceptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizExceptionExample() {
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

        public Criteria andExceptionIdIsNull() {
            addCriterion("exception_id is null");
            return (Criteria) this;
        }

        public Criteria andExceptionIdIsNotNull() {
            addCriterion("exception_id is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionIdEqualTo(Long value) {
            addCriterion("exception_id =", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdNotEqualTo(Long value) {
            addCriterion("exception_id <>", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdGreaterThan(Long value) {
            addCriterion("exception_id >", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("exception_id >=", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdLessThan(Long value) {
            addCriterion("exception_id <", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdLessThanOrEqualTo(Long value) {
            addCriterion("exception_id <=", value, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdIn(List<Long> values) {
            addCriterion("exception_id in", values, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdNotIn(List<Long> values) {
            addCriterion("exception_id not in", values, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdBetween(Long value1, Long value2) {
            addCriterion("exception_id between", value1, value2, "exceptionId");
            return (Criteria) this;
        }

        public Criteria andExceptionIdNotBetween(Long value1, Long value2) {
            addCriterion("exception_id not between", value1, value2, "exceptionId");
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

        public Criteria andSensorNoIsNull() {
            addCriterion("sensor_no is null");
            return (Criteria) this;
        }

        public Criteria andSensorNoIsNotNull() {
            addCriterion("sensor_no is not null");
            return (Criteria) this;
        }

        public Criteria andSensorNoEqualTo(Integer value) {
            addCriterion("sensor_no =", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoNotEqualTo(Integer value) {
            addCriterion("sensor_no <>", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoGreaterThan(Integer value) {
            addCriterion("sensor_no >", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_no >=", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoLessThan(Integer value) {
            addCriterion("sensor_no <", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_no <=", value, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoIn(List<Integer> values) {
            addCriterion("sensor_no in", values, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoNotIn(List<Integer> values) {
            addCriterion("sensor_no not in", values, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoBetween(Integer value1, Integer value2) {
            addCriterion("sensor_no between", value1, value2, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andSensorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_no not between", value1, value2, "sensorNo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIsNull() {
            addCriterion("exception_type is null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIsNotNull() {
            addCriterion("exception_type is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeEqualTo(Integer value) {
            addCriterion("exception_type =", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotEqualTo(Integer value) {
            addCriterion("exception_type <>", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeGreaterThan(Integer value) {
            addCriterion("exception_type >", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_type >=", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeLessThan(Integer value) {
            addCriterion("exception_type <", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("exception_type <=", value, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeIn(List<Integer> values) {
            addCriterion("exception_type in", values, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotIn(List<Integer> values) {
            addCriterion("exception_type not in", values, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeBetween(Integer value1, Integer value2) {
            addCriterion("exception_type between", value1, value2, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_type not between", value1, value2, "exceptionType");
            return (Criteria) this;
        }

        public Criteria andExceptionContentIsNull() {
            addCriterion("exception_content is null");
            return (Criteria) this;
        }

        public Criteria andExceptionContentIsNotNull() {
            addCriterion("exception_content is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionContentEqualTo(String value) {
            addCriterion("exception_content =", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentNotEqualTo(String value) {
            addCriterion("exception_content <>", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentGreaterThan(String value) {
            addCriterion("exception_content >", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentGreaterThanOrEqualTo(String value) {
            addCriterion("exception_content >=", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentLessThan(String value) {
            addCriterion("exception_content <", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentLessThanOrEqualTo(String value) {
            addCriterion("exception_content <=", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentLike(String value) {
            addCriterion("exception_content like", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentNotLike(String value) {
            addCriterion("exception_content not like", value, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentIn(List<String> values) {
            addCriterion("exception_content in", values, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentNotIn(List<String> values) {
            addCriterion("exception_content not in", values, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentBetween(String value1, String value2) {
            addCriterion("exception_content between", value1, value2, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andExceptionContentNotBetween(String value1, String value2) {
            addCriterion("exception_content not between", value1, value2, "exceptionContent");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
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
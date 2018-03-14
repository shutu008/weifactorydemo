package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Long value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Long value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Long value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Long value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Long value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Long> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Long> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Long value1, Long value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Long value1, Long value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andSensorMarkIsNull() {
            addCriterion("sensor_mark is null");
            return (Criteria) this;
        }

        public Criteria andSensorMarkIsNotNull() {
            addCriterion("sensor_mark is not null");
            return (Criteria) this;
        }

        public Criteria andSensorMarkEqualTo(String value) {
            addCriterion("sensor_mark =", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkNotEqualTo(String value) {
            addCriterion("sensor_mark <>", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkGreaterThan(String value) {
            addCriterion("sensor_mark >", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkGreaterThanOrEqualTo(String value) {
            addCriterion("sensor_mark >=", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkLessThan(String value) {
            addCriterion("sensor_mark <", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkLessThanOrEqualTo(String value) {
            addCriterion("sensor_mark <=", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkLike(String value) {
            addCriterion("sensor_mark like", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkNotLike(String value) {
            addCriterion("sensor_mark not like", value, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkIn(List<String> values) {
            addCriterion("sensor_mark in", values, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkNotIn(List<String> values) {
            addCriterion("sensor_mark not in", values, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkBetween(String value1, String value2) {
            addCriterion("sensor_mark between", value1, value2, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andSensorMarkNotBetween(String value1, String value2) {
            addCriterion("sensor_mark not between", value1, value2, "sensorMark");
            return (Criteria) this;
        }

        public Criteria andOnePicNameIsNull() {
            addCriterion("one_pic_name is null");
            return (Criteria) this;
        }

        public Criteria andOnePicNameIsNotNull() {
            addCriterion("one_pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andOnePicNameEqualTo(String value) {
            addCriterion("one_pic_name =", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameNotEqualTo(String value) {
            addCriterion("one_pic_name <>", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameGreaterThan(String value) {
            addCriterion("one_pic_name >", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameGreaterThanOrEqualTo(String value) {
            addCriterion("one_pic_name >=", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameLessThan(String value) {
            addCriterion("one_pic_name <", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameLessThanOrEqualTo(String value) {
            addCriterion("one_pic_name <=", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameLike(String value) {
            addCriterion("one_pic_name like", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameNotLike(String value) {
            addCriterion("one_pic_name not like", value, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameIn(List<String> values) {
            addCriterion("one_pic_name in", values, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameNotIn(List<String> values) {
            addCriterion("one_pic_name not in", values, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameBetween(String value1, String value2) {
            addCriterion("one_pic_name between", value1, value2, "onePicName");
            return (Criteria) this;
        }

        public Criteria andOnePicNameNotBetween(String value1, String value2) {
            addCriterion("one_pic_name not between", value1, value2, "onePicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameIsNull() {
            addCriterion("two_pic_name is null");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameIsNotNull() {
            addCriterion("two_pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameEqualTo(String value) {
            addCriterion("two_pic_name =", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameNotEqualTo(String value) {
            addCriterion("two_pic_name <>", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameGreaterThan(String value) {
            addCriterion("two_pic_name >", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("two_pic_name >=", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameLessThan(String value) {
            addCriterion("two_pic_name <", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameLessThanOrEqualTo(String value) {
            addCriterion("two_pic_name <=", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameLike(String value) {
            addCriterion("two_pic_name like", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameNotLike(String value) {
            addCriterion("two_pic_name not like", value, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameIn(List<String> values) {
            addCriterion("two_pic_name in", values, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameNotIn(List<String> values) {
            addCriterion("two_pic_name not in", values, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameBetween(String value1, String value2) {
            addCriterion("two_pic_name between", value1, value2, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andTwoPicNameNotBetween(String value1, String value2) {
            addCriterion("two_pic_name not between", value1, value2, "twoPicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameIsNull() {
            addCriterion("three_pic_name is null");
            return (Criteria) this;
        }

        public Criteria andThreePicNameIsNotNull() {
            addCriterion("three_pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andThreePicNameEqualTo(String value) {
            addCriterion("three_pic_name =", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameNotEqualTo(String value) {
            addCriterion("three_pic_name <>", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameGreaterThan(String value) {
            addCriterion("three_pic_name >", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameGreaterThanOrEqualTo(String value) {
            addCriterion("three_pic_name >=", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameLessThan(String value) {
            addCriterion("three_pic_name <", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameLessThanOrEqualTo(String value) {
            addCriterion("three_pic_name <=", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameLike(String value) {
            addCriterion("three_pic_name like", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameNotLike(String value) {
            addCriterion("three_pic_name not like", value, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameIn(List<String> values) {
            addCriterion("three_pic_name in", values, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameNotIn(List<String> values) {
            addCriterion("three_pic_name not in", values, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameBetween(String value1, String value2) {
            addCriterion("three_pic_name between", value1, value2, "threePicName");
            return (Criteria) this;
        }

        public Criteria andThreePicNameNotBetween(String value1, String value2) {
            addCriterion("three_pic_name not between", value1, value2, "threePicName");
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
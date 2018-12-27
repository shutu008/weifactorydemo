package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HistoryInfoExample() {
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

        public Criteria andHistoryNoIsNull() {
            addCriterion("history_no is null");
            return (Criteria) this;
        }

        public Criteria andHistoryNoIsNotNull() {
            addCriterion("history_no is not null");
            return (Criteria) this;
        }

        public Criteria andHistoryNoEqualTo(String value) {
            addCriterion("history_no =", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoNotEqualTo(String value) {
            addCriterion("history_no <>", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoGreaterThan(String value) {
            addCriterion("history_no >", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoGreaterThanOrEqualTo(String value) {
            addCriterion("history_no >=", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoLessThan(String value) {
            addCriterion("history_no <", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoLessThanOrEqualTo(String value) {
            addCriterion("history_no <=", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoLike(String value) {
            addCriterion("history_no like", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoNotLike(String value) {
            addCriterion("history_no not like", value, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoIn(List<String> values) {
            addCriterion("history_no in", values, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoNotIn(List<String> values) {
            addCriterion("history_no not in", values, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoBetween(String value1, String value2) {
            addCriterion("history_no between", value1, value2, "historyNo");
            return (Criteria) this;
        }

        public Criteria andHistoryNoNotBetween(String value1, String value2) {
            addCriterion("history_no not between", value1, value2, "historyNo");
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

        public Criteria andOneTemperatureIsNull() {
            addCriterion("one_temperature is null");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureIsNotNull() {
            addCriterion("one_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureEqualTo(Double value) {
            addCriterion("one_temperature =", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureNotEqualTo(Double value) {
            addCriterion("one_temperature <>", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureGreaterThan(Double value) {
            addCriterion("one_temperature >", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("one_temperature >=", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureLessThan(Double value) {
            addCriterion("one_temperature <", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("one_temperature <=", value, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureIn(List<Double> values) {
            addCriterion("one_temperature in", values, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureNotIn(List<Double> values) {
            addCriterion("one_temperature not in", values, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureBetween(Double value1, Double value2) {
            addCriterion("one_temperature between", value1, value2, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("one_temperature not between", value1, value2, "oneTemperature");
            return (Criteria) this;
        }

        public Criteria andOneHumidityIsNull() {
            addCriterion("one_humidity is null");
            return (Criteria) this;
        }

        public Criteria andOneHumidityIsNotNull() {
            addCriterion("one_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andOneHumidityEqualTo(Double value) {
            addCriterion("one_humidity =", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityNotEqualTo(Double value) {
            addCriterion("one_humidity <>", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityGreaterThan(Double value) {
            addCriterion("one_humidity >", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("one_humidity >=", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityLessThan(Double value) {
            addCriterion("one_humidity <", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityLessThanOrEqualTo(Double value) {
            addCriterion("one_humidity <=", value, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityIn(List<Double> values) {
            addCriterion("one_humidity in", values, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityNotIn(List<Double> values) {
            addCriterion("one_humidity not in", values, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityBetween(Double value1, Double value2) {
            addCriterion("one_humidity between", value1, value2, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneHumidityNotBetween(Double value1, Double value2) {
            addCriterion("one_humidity not between", value1, value2, "oneHumidity");
            return (Criteria) this;
        }

        public Criteria andOneYyIsNull() {
            addCriterion("one_yy is null");
            return (Criteria) this;
        }

        public Criteria andOneYyIsNotNull() {
            addCriterion("one_yy is not null");
            return (Criteria) this;
        }

        public Criteria andOneYyEqualTo(String value) {
            addCriterion("one_yy =", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyNotEqualTo(String value) {
            addCriterion("one_yy <>", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyGreaterThan(String value) {
            addCriterion("one_yy >", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyGreaterThanOrEqualTo(String value) {
            addCriterion("one_yy >=", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyLessThan(String value) {
            addCriterion("one_yy <", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyLessThanOrEqualTo(String value) {
            addCriterion("one_yy <=", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyLike(String value) {
            addCriterion("one_yy like", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyNotLike(String value) {
            addCriterion("one_yy not like", value, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyIn(List<String> values) {
            addCriterion("one_yy in", values, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyNotIn(List<String> values) {
            addCriterion("one_yy not in", values, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyBetween(String value1, String value2) {
            addCriterion("one_yy between", value1, value2, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneYyNotBetween(String value1, String value2) {
            addCriterion("one_yy not between", value1, value2, "oneYy");
            return (Criteria) this;
        }

        public Criteria andOneLed1IsNull() {
            addCriterion("one_led_1 is null");
            return (Criteria) this;
        }

        public Criteria andOneLed1IsNotNull() {
            addCriterion("one_led_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOneLed1EqualTo(String value) {
            addCriterion("one_led_1 =", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1NotEqualTo(String value) {
            addCriterion("one_led_1 <>", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1GreaterThan(String value) {
            addCriterion("one_led_1 >", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1GreaterThanOrEqualTo(String value) {
            addCriterion("one_led_1 >=", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1LessThan(String value) {
            addCriterion("one_led_1 <", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1LessThanOrEqualTo(String value) {
            addCriterion("one_led_1 <=", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1Like(String value) {
            addCriterion("one_led_1 like", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1NotLike(String value) {
            addCriterion("one_led_1 not like", value, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1In(List<String> values) {
            addCriterion("one_led_1 in", values, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1NotIn(List<String> values) {
            addCriterion("one_led_1 not in", values, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1Between(String value1, String value2) {
            addCriterion("one_led_1 between", value1, value2, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed1NotBetween(String value1, String value2) {
            addCriterion("one_led_1 not between", value1, value2, "oneLed1");
            return (Criteria) this;
        }

        public Criteria andOneLed2IsNull() {
            addCriterion("one_led_2 is null");
            return (Criteria) this;
        }

        public Criteria andOneLed2IsNotNull() {
            addCriterion("one_led_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOneLed2EqualTo(String value) {
            addCriterion("one_led_2 =", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2NotEqualTo(String value) {
            addCriterion("one_led_2 <>", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2GreaterThan(String value) {
            addCriterion("one_led_2 >", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2GreaterThanOrEqualTo(String value) {
            addCriterion("one_led_2 >=", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2LessThan(String value) {
            addCriterion("one_led_2 <", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2LessThanOrEqualTo(String value) {
            addCriterion("one_led_2 <=", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2Like(String value) {
            addCriterion("one_led_2 like", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2NotLike(String value) {
            addCriterion("one_led_2 not like", value, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2In(List<String> values) {
            addCriterion("one_led_2 in", values, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2NotIn(List<String> values) {
            addCriterion("one_led_2 not in", values, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2Between(String value1, String value2) {
            addCriterion("one_led_2 between", value1, value2, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed2NotBetween(String value1, String value2) {
            addCriterion("one_led_2 not between", value1, value2, "oneLed2");
            return (Criteria) this;
        }

        public Criteria andOneLed3IsNull() {
            addCriterion("one_led_3 is null");
            return (Criteria) this;
        }

        public Criteria andOneLed3IsNotNull() {
            addCriterion("one_led_3 is not null");
            return (Criteria) this;
        }

        public Criteria andOneLed3EqualTo(String value) {
            addCriterion("one_led_3 =", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3NotEqualTo(String value) {
            addCriterion("one_led_3 <>", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3GreaterThan(String value) {
            addCriterion("one_led_3 >", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3GreaterThanOrEqualTo(String value) {
            addCriterion("one_led_3 >=", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3LessThan(String value) {
            addCriterion("one_led_3 <", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3LessThanOrEqualTo(String value) {
            addCriterion("one_led_3 <=", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3Like(String value) {
            addCriterion("one_led_3 like", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3NotLike(String value) {
            addCriterion("one_led_3 not like", value, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3In(List<String> values) {
            addCriterion("one_led_3 in", values, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3NotIn(List<String> values) {
            addCriterion("one_led_3 not in", values, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3Between(String value1, String value2) {
            addCriterion("one_led_3 between", value1, value2, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andOneLed3NotBetween(String value1, String value2) {
            addCriterion("one_led_3 not between", value1, value2, "oneLed3");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureIsNull() {
            addCriterion("two_temperature is null");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureIsNotNull() {
            addCriterion("two_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureEqualTo(Double value) {
            addCriterion("two_temperature =", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureNotEqualTo(Double value) {
            addCriterion("two_temperature <>", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureGreaterThan(Double value) {
            addCriterion("two_temperature >", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("two_temperature >=", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureLessThan(Double value) {
            addCriterion("two_temperature <", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("two_temperature <=", value, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureIn(List<Double> values) {
            addCriterion("two_temperature in", values, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureNotIn(List<Double> values) {
            addCriterion("two_temperature not in", values, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureBetween(Double value1, Double value2) {
            addCriterion("two_temperature between", value1, value2, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("two_temperature not between", value1, value2, "twoTemperature");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityIsNull() {
            addCriterion("two_humidity is null");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityIsNotNull() {
            addCriterion("two_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityEqualTo(Double value) {
            addCriterion("two_humidity =", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityNotEqualTo(Double value) {
            addCriterion("two_humidity <>", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityGreaterThan(Double value) {
            addCriterion("two_humidity >", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("two_humidity >=", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityLessThan(Double value) {
            addCriterion("two_humidity <", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityLessThanOrEqualTo(Double value) {
            addCriterion("two_humidity <=", value, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityIn(List<Double> values) {
            addCriterion("two_humidity in", values, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityNotIn(List<Double> values) {
            addCriterion("two_humidity not in", values, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityBetween(Double value1, Double value2) {
            addCriterion("two_humidity between", value1, value2, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoHumidityNotBetween(Double value1, Double value2) {
            addCriterion("two_humidity not between", value1, value2, "twoHumidity");
            return (Criteria) this;
        }

        public Criteria andTwoYyIsNull() {
            addCriterion("two_yy is null");
            return (Criteria) this;
        }

        public Criteria andTwoYyIsNotNull() {
            addCriterion("two_yy is not null");
            return (Criteria) this;
        }

        public Criteria andTwoYyEqualTo(String value) {
            addCriterion("two_yy =", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyNotEqualTo(String value) {
            addCriterion("two_yy <>", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyGreaterThan(String value) {
            addCriterion("two_yy >", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyGreaterThanOrEqualTo(String value) {
            addCriterion("two_yy >=", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyLessThan(String value) {
            addCriterion("two_yy <", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyLessThanOrEqualTo(String value) {
            addCriterion("two_yy <=", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyLike(String value) {
            addCriterion("two_yy like", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyNotLike(String value) {
            addCriterion("two_yy not like", value, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyIn(List<String> values) {
            addCriterion("two_yy in", values, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyNotIn(List<String> values) {
            addCriterion("two_yy not in", values, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyBetween(String value1, String value2) {
            addCriterion("two_yy between", value1, value2, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoYyNotBetween(String value1, String value2) {
            addCriterion("two_yy not between", value1, value2, "twoYy");
            return (Criteria) this;
        }

        public Criteria andTwoLed1IsNull() {
            addCriterion("two_led_1 is null");
            return (Criteria) this;
        }

        public Criteria andTwoLed1IsNotNull() {
            addCriterion("two_led_1 is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLed1EqualTo(String value) {
            addCriterion("two_led_1 =", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1NotEqualTo(String value) {
            addCriterion("two_led_1 <>", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1GreaterThan(String value) {
            addCriterion("two_led_1 >", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1GreaterThanOrEqualTo(String value) {
            addCriterion("two_led_1 >=", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1LessThan(String value) {
            addCriterion("two_led_1 <", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1LessThanOrEqualTo(String value) {
            addCriterion("two_led_1 <=", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1Like(String value) {
            addCriterion("two_led_1 like", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1NotLike(String value) {
            addCriterion("two_led_1 not like", value, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1In(List<String> values) {
            addCriterion("two_led_1 in", values, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1NotIn(List<String> values) {
            addCriterion("two_led_1 not in", values, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1Between(String value1, String value2) {
            addCriterion("two_led_1 between", value1, value2, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed1NotBetween(String value1, String value2) {
            addCriterion("two_led_1 not between", value1, value2, "twoLed1");
            return (Criteria) this;
        }

        public Criteria andTwoLed2IsNull() {
            addCriterion("two_led_2 is null");
            return (Criteria) this;
        }

        public Criteria andTwoLed2IsNotNull() {
            addCriterion("two_led_2 is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLed2EqualTo(String value) {
            addCriterion("two_led_2 =", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2NotEqualTo(String value) {
            addCriterion("two_led_2 <>", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2GreaterThan(String value) {
            addCriterion("two_led_2 >", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2GreaterThanOrEqualTo(String value) {
            addCriterion("two_led_2 >=", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2LessThan(String value) {
            addCriterion("two_led_2 <", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2LessThanOrEqualTo(String value) {
            addCriterion("two_led_2 <=", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2Like(String value) {
            addCriterion("two_led_2 like", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2NotLike(String value) {
            addCriterion("two_led_2 not like", value, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2In(List<String> values) {
            addCriterion("two_led_2 in", values, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2NotIn(List<String> values) {
            addCriterion("two_led_2 not in", values, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2Between(String value1, String value2) {
            addCriterion("two_led_2 between", value1, value2, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed2NotBetween(String value1, String value2) {
            addCriterion("two_led_2 not between", value1, value2, "twoLed2");
            return (Criteria) this;
        }

        public Criteria andTwoLed3IsNull() {
            addCriterion("two_led_3 is null");
            return (Criteria) this;
        }

        public Criteria andTwoLed3IsNotNull() {
            addCriterion("two_led_3 is not null");
            return (Criteria) this;
        }

        public Criteria andTwoLed3EqualTo(String value) {
            addCriterion("two_led_3 =", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3NotEqualTo(String value) {
            addCriterion("two_led_3 <>", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3GreaterThan(String value) {
            addCriterion("two_led_3 >", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3GreaterThanOrEqualTo(String value) {
            addCriterion("two_led_3 >=", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3LessThan(String value) {
            addCriterion("two_led_3 <", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3LessThanOrEqualTo(String value) {
            addCriterion("two_led_3 <=", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3Like(String value) {
            addCriterion("two_led_3 like", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3NotLike(String value) {
            addCriterion("two_led_3 not like", value, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3In(List<String> values) {
            addCriterion("two_led_3 in", values, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3NotIn(List<String> values) {
            addCriterion("two_led_3 not in", values, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3Between(String value1, String value2) {
            addCriterion("two_led_3 between", value1, value2, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andTwoLed3NotBetween(String value1, String value2) {
            addCriterion("two_led_3 not between", value1, value2, "twoLed3");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureIsNull() {
            addCriterion("three_temperature is null");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureIsNotNull() {
            addCriterion("three_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureEqualTo(Double value) {
            addCriterion("three_temperature =", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureNotEqualTo(Double value) {
            addCriterion("three_temperature <>", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureGreaterThan(Double value) {
            addCriterion("three_temperature >", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("three_temperature >=", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureLessThan(Double value) {
            addCriterion("three_temperature <", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("three_temperature <=", value, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureIn(List<Double> values) {
            addCriterion("three_temperature in", values, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureNotIn(List<Double> values) {
            addCriterion("three_temperature not in", values, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureBetween(Double value1, Double value2) {
            addCriterion("three_temperature between", value1, value2, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("three_temperature not between", value1, value2, "threeTemperature");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityIsNull() {
            addCriterion("three_humidity is null");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityIsNotNull() {
            addCriterion("three_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityEqualTo(Double value) {
            addCriterion("three_humidity =", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityNotEqualTo(Double value) {
            addCriterion("three_humidity <>", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityGreaterThan(Double value) {
            addCriterion("three_humidity >", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("three_humidity >=", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityLessThan(Double value) {
            addCriterion("three_humidity <", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityLessThanOrEqualTo(Double value) {
            addCriterion("three_humidity <=", value, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityIn(List<Double> values) {
            addCriterion("three_humidity in", values, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityNotIn(List<Double> values) {
            addCriterion("three_humidity not in", values, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityBetween(Double value1, Double value2) {
            addCriterion("three_humidity between", value1, value2, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeHumidityNotBetween(Double value1, Double value2) {
            addCriterion("three_humidity not between", value1, value2, "threeHumidity");
            return (Criteria) this;
        }

        public Criteria andThreeYyIsNull() {
            addCriterion("three_yy is null");
            return (Criteria) this;
        }

        public Criteria andThreeYyIsNotNull() {
            addCriterion("three_yy is not null");
            return (Criteria) this;
        }

        public Criteria andThreeYyEqualTo(String value) {
            addCriterion("three_yy =", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyNotEqualTo(String value) {
            addCriterion("three_yy <>", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyGreaterThan(String value) {
            addCriterion("three_yy >", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyGreaterThanOrEqualTo(String value) {
            addCriterion("three_yy >=", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyLessThan(String value) {
            addCriterion("three_yy <", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyLessThanOrEqualTo(String value) {
            addCriterion("three_yy <=", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyLike(String value) {
            addCriterion("three_yy like", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyNotLike(String value) {
            addCriterion("three_yy not like", value, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyIn(List<String> values) {
            addCriterion("three_yy in", values, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyNotIn(List<String> values) {
            addCriterion("three_yy not in", values, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyBetween(String value1, String value2) {
            addCriterion("three_yy between", value1, value2, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeYyNotBetween(String value1, String value2) {
            addCriterion("three_yy not between", value1, value2, "threeYy");
            return (Criteria) this;
        }

        public Criteria andThreeLed1IsNull() {
            addCriterion("three_led_1 is null");
            return (Criteria) this;
        }

        public Criteria andThreeLed1IsNotNull() {
            addCriterion("three_led_1 is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLed1EqualTo(String value) {
            addCriterion("three_led_1 =", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1NotEqualTo(String value) {
            addCriterion("three_led_1 <>", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1GreaterThan(String value) {
            addCriterion("three_led_1 >", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1GreaterThanOrEqualTo(String value) {
            addCriterion("three_led_1 >=", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1LessThan(String value) {
            addCriterion("three_led_1 <", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1LessThanOrEqualTo(String value) {
            addCriterion("three_led_1 <=", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1Like(String value) {
            addCriterion("three_led_1 like", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1NotLike(String value) {
            addCriterion("three_led_1 not like", value, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1In(List<String> values) {
            addCriterion("three_led_1 in", values, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1NotIn(List<String> values) {
            addCriterion("three_led_1 not in", values, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1Between(String value1, String value2) {
            addCriterion("three_led_1 between", value1, value2, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed1NotBetween(String value1, String value2) {
            addCriterion("three_led_1 not between", value1, value2, "threeLed1");
            return (Criteria) this;
        }

        public Criteria andThreeLed2IsNull() {
            addCriterion("three_led_2 is null");
            return (Criteria) this;
        }

        public Criteria andThreeLed2IsNotNull() {
            addCriterion("three_led_2 is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLed2EqualTo(String value) {
            addCriterion("three_led_2 =", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2NotEqualTo(String value) {
            addCriterion("three_led_2 <>", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2GreaterThan(String value) {
            addCriterion("three_led_2 >", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2GreaterThanOrEqualTo(String value) {
            addCriterion("three_led_2 >=", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2LessThan(String value) {
            addCriterion("three_led_2 <", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2LessThanOrEqualTo(String value) {
            addCriterion("three_led_2 <=", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2Like(String value) {
            addCriterion("three_led_2 like", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2NotLike(String value) {
            addCriterion("three_led_2 not like", value, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2In(List<String> values) {
            addCriterion("three_led_2 in", values, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2NotIn(List<String> values) {
            addCriterion("three_led_2 not in", values, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2Between(String value1, String value2) {
            addCriterion("three_led_2 between", value1, value2, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed2NotBetween(String value1, String value2) {
            addCriterion("three_led_2 not between", value1, value2, "threeLed2");
            return (Criteria) this;
        }

        public Criteria andThreeLed3IsNull() {
            addCriterion("three_led_3 is null");
            return (Criteria) this;
        }

        public Criteria andThreeLed3IsNotNull() {
            addCriterion("three_led_3 is not null");
            return (Criteria) this;
        }

        public Criteria andThreeLed3EqualTo(String value) {
            addCriterion("three_led_3 =", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3NotEqualTo(String value) {
            addCriterion("three_led_3 <>", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3GreaterThan(String value) {
            addCriterion("three_led_3 >", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3GreaterThanOrEqualTo(String value) {
            addCriterion("three_led_3 >=", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3LessThan(String value) {
            addCriterion("three_led_3 <", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3LessThanOrEqualTo(String value) {
            addCriterion("three_led_3 <=", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3Like(String value) {
            addCriterion("three_led_3 like", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3NotLike(String value) {
            addCriterion("three_led_3 not like", value, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3In(List<String> values) {
            addCriterion("three_led_3 in", values, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3NotIn(List<String> values) {
            addCriterion("three_led_3 not in", values, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3Between(String value1, String value2) {
            addCriterion("three_led_3 between", value1, value2, "threeLed3");
            return (Criteria) this;
        }

        public Criteria andThreeLed3NotBetween(String value1, String value2) {
            addCriterion("three_led_3 not between", value1, value2, "threeLed3");
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

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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
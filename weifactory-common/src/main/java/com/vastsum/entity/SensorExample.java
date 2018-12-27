package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SensorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SensorExample() {
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

        public Criteria andSensorIdIsNull() {
            addCriterion("sensor_id is null");
            return (Criteria) this;
        }

        public Criteria andSensorIdIsNotNull() {
            addCriterion("sensor_id is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIdEqualTo(Integer value) {
            addCriterion("sensor_id =", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotEqualTo(Integer value) {
            addCriterion("sensor_id <>", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThan(Integer value) {
            addCriterion("sensor_id >", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sensor_id >=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThan(Integer value) {
            addCriterion("sensor_id <", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdLessThanOrEqualTo(Integer value) {
            addCriterion("sensor_id <=", value, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdIn(List<Integer> values) {
            addCriterion("sensor_id in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotIn(List<Integer> values) {
            addCriterion("sensor_id not in", values, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andSensorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sensor_id not between", value1, value2, "sensorId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
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

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(String value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(String value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(String value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(String value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(String value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLike(String value) {
            addCriterion("batch_no like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotLike(String value) {
            addCriterion("batch_no not like", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<String> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<String> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(String value1, String value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(String value1, String value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1IsNull() {
            addCriterion("sensor_temperature_1 is null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1IsNotNull() {
            addCriterion("sensor_temperature_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1EqualTo(Double value) {
            addCriterion("sensor_temperature_1 =", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1NotEqualTo(Double value) {
            addCriterion("sensor_temperature_1 <>", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1GreaterThan(Double value) {
            addCriterion("sensor_temperature_1 >", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_1 >=", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1LessThan(Double value) {
            addCriterion("sensor_temperature_1 <", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1LessThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_1 <=", value, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1In(List<Double> values) {
            addCriterion("sensor_temperature_1 in", values, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1NotIn(List<Double> values) {
            addCriterion("sensor_temperature_1 not in", values, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1Between(Double value1, Double value2) {
            addCriterion("sensor_temperature_1 between", value1, value2, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature1NotBetween(Double value1, Double value2) {
            addCriterion("sensor_temperature_1 not between", value1, value2, "sensorTemperature1");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2IsNull() {
            addCriterion("sensor_temperature_2 is null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2IsNotNull() {
            addCriterion("sensor_temperature_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2EqualTo(Double value) {
            addCriterion("sensor_temperature_2 =", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2NotEqualTo(Double value) {
            addCriterion("sensor_temperature_2 <>", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2GreaterThan(Double value) {
            addCriterion("sensor_temperature_2 >", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_2 >=", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2LessThan(Double value) {
            addCriterion("sensor_temperature_2 <", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2LessThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_2 <=", value, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2In(List<Double> values) {
            addCriterion("sensor_temperature_2 in", values, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2NotIn(List<Double> values) {
            addCriterion("sensor_temperature_2 not in", values, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2Between(Double value1, Double value2) {
            addCriterion("sensor_temperature_2 between", value1, value2, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature2NotBetween(Double value1, Double value2) {
            addCriterion("sensor_temperature_2 not between", value1, value2, "sensorTemperature2");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3IsNull() {
            addCriterion("sensor_temperature_3 is null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3IsNotNull() {
            addCriterion("sensor_temperature_3 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3EqualTo(Double value) {
            addCriterion("sensor_temperature_3 =", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3NotEqualTo(Double value) {
            addCriterion("sensor_temperature_3 <>", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3GreaterThan(Double value) {
            addCriterion("sensor_temperature_3 >", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_3 >=", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3LessThan(Double value) {
            addCriterion("sensor_temperature_3 <", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3LessThanOrEqualTo(Double value) {
            addCriterion("sensor_temperature_3 <=", value, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3In(List<Double> values) {
            addCriterion("sensor_temperature_3 in", values, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3NotIn(List<Double> values) {
            addCriterion("sensor_temperature_3 not in", values, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3Between(Double value1, Double value2) {
            addCriterion("sensor_temperature_3 between", value1, value2, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorTemperature3NotBetween(Double value1, Double value2) {
            addCriterion("sensor_temperature_3 not between", value1, value2, "sensorTemperature3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1IsNull() {
            addCriterion("sensor_humidity_1 is null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1IsNotNull() {
            addCriterion("sensor_humidity_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1EqualTo(Double value) {
            addCriterion("sensor_humidity_1 =", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1NotEqualTo(Double value) {
            addCriterion("sensor_humidity_1 <>", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1GreaterThan(Double value) {
            addCriterion("sensor_humidity_1 >", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_1 >=", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1LessThan(Double value) {
            addCriterion("sensor_humidity_1 <", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1LessThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_1 <=", value, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1In(List<Double> values) {
            addCriterion("sensor_humidity_1 in", values, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1NotIn(List<Double> values) {
            addCriterion("sensor_humidity_1 not in", values, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1Between(Double value1, Double value2) {
            addCriterion("sensor_humidity_1 between", value1, value2, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity1NotBetween(Double value1, Double value2) {
            addCriterion("sensor_humidity_1 not between", value1, value2, "sensorHumidity1");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2IsNull() {
            addCriterion("sensor_humidity_2 is null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2IsNotNull() {
            addCriterion("sensor_humidity_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2EqualTo(Double value) {
            addCriterion("sensor_humidity_2 =", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2NotEqualTo(Double value) {
            addCriterion("sensor_humidity_2 <>", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2GreaterThan(Double value) {
            addCriterion("sensor_humidity_2 >", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_2 >=", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2LessThan(Double value) {
            addCriterion("sensor_humidity_2 <", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2LessThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_2 <=", value, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2In(List<Double> values) {
            addCriterion("sensor_humidity_2 in", values, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2NotIn(List<Double> values) {
            addCriterion("sensor_humidity_2 not in", values, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2Between(Double value1, Double value2) {
            addCriterion("sensor_humidity_2 between", value1, value2, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity2NotBetween(Double value1, Double value2) {
            addCriterion("sensor_humidity_2 not between", value1, value2, "sensorHumidity2");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3IsNull() {
            addCriterion("sensor_humidity_3 is null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3IsNotNull() {
            addCriterion("sensor_humidity_3 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3EqualTo(Double value) {
            addCriterion("sensor_humidity_3 =", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3NotEqualTo(Double value) {
            addCriterion("sensor_humidity_3 <>", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3GreaterThan(Double value) {
            addCriterion("sensor_humidity_3 >", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_3 >=", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3LessThan(Double value) {
            addCriterion("sensor_humidity_3 <", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3LessThanOrEqualTo(Double value) {
            addCriterion("sensor_humidity_3 <=", value, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3In(List<Double> values) {
            addCriterion("sensor_humidity_3 in", values, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3NotIn(List<Double> values) {
            addCriterion("sensor_humidity_3 not in", values, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3Between(Double value1, Double value2) {
            addCriterion("sensor_humidity_3 between", value1, value2, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorHumidity3NotBetween(Double value1, Double value2) {
            addCriterion("sensor_humidity_3 not between", value1, value2, "sensorHumidity3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1IsNull() {
            addCriterion("sensor_illumination_1 is null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1IsNotNull() {
            addCriterion("sensor_illumination_1 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1EqualTo(Double value) {
            addCriterion("sensor_illumination_1 =", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1NotEqualTo(Double value) {
            addCriterion("sensor_illumination_1 <>", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1GreaterThan(Double value) {
            addCriterion("sensor_illumination_1 >", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_1 >=", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1LessThan(Double value) {
            addCriterion("sensor_illumination_1 <", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1LessThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_1 <=", value, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1In(List<Double> values) {
            addCriterion("sensor_illumination_1 in", values, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1NotIn(List<Double> values) {
            addCriterion("sensor_illumination_1 not in", values, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1Between(Double value1, Double value2) {
            addCriterion("sensor_illumination_1 between", value1, value2, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination1NotBetween(Double value1, Double value2) {
            addCriterion("sensor_illumination_1 not between", value1, value2, "sensorIllumination1");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2IsNull() {
            addCriterion("sensor_illumination_2 is null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2IsNotNull() {
            addCriterion("sensor_illumination_2 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2EqualTo(Double value) {
            addCriterion("sensor_illumination_2 =", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2NotEqualTo(Double value) {
            addCriterion("sensor_illumination_2 <>", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2GreaterThan(Double value) {
            addCriterion("sensor_illumination_2 >", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_2 >=", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2LessThan(Double value) {
            addCriterion("sensor_illumination_2 <", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2LessThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_2 <=", value, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2In(List<Double> values) {
            addCriterion("sensor_illumination_2 in", values, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2NotIn(List<Double> values) {
            addCriterion("sensor_illumination_2 not in", values, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2Between(Double value1, Double value2) {
            addCriterion("sensor_illumination_2 between", value1, value2, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination2NotBetween(Double value1, Double value2) {
            addCriterion("sensor_illumination_2 not between", value1, value2, "sensorIllumination2");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3IsNull() {
            addCriterion("sensor_illumination_3 is null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3IsNotNull() {
            addCriterion("sensor_illumination_3 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3EqualTo(Double value) {
            addCriterion("sensor_illumination_3 =", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3NotEqualTo(Double value) {
            addCriterion("sensor_illumination_3 <>", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3GreaterThan(Double value) {
            addCriterion("sensor_illumination_3 >", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_3 >=", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3LessThan(Double value) {
            addCriterion("sensor_illumination_3 <", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3LessThanOrEqualTo(Double value) {
            addCriterion("sensor_illumination_3 <=", value, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3In(List<Double> values) {
            addCriterion("sensor_illumination_3 in", values, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3NotIn(List<Double> values) {
            addCriterion("sensor_illumination_3 not in", values, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3Between(Double value1, Double value2) {
            addCriterion("sensor_illumination_3 between", value1, value2, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorIllumination3NotBetween(Double value1, Double value2) {
            addCriterion("sensor_illumination_3 not between", value1, value2, "sensorIllumination3");
            return (Criteria) this;
        }

        public Criteria andSensorCo2IsNull() {
            addCriterion("sensor_co2 is null");
            return (Criteria) this;
        }

        public Criteria andSensorCo2IsNotNull() {
            addCriterion("sensor_co2 is not null");
            return (Criteria) this;
        }

        public Criteria andSensorCo2EqualTo(Double value) {
            addCriterion("sensor_co2 =", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2NotEqualTo(Double value) {
            addCriterion("sensor_co2 <>", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2GreaterThan(Double value) {
            addCriterion("sensor_co2 >", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2GreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_co2 >=", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2LessThan(Double value) {
            addCriterion("sensor_co2 <", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2LessThanOrEqualTo(Double value) {
            addCriterion("sensor_co2 <=", value, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2In(List<Double> values) {
            addCriterion("sensor_co2 in", values, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2NotIn(List<Double> values) {
            addCriterion("sensor_co2 not in", values, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2Between(Double value1, Double value2) {
            addCriterion("sensor_co2 between", value1, value2, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorCo2NotBetween(Double value1, Double value2) {
            addCriterion("sensor_co2 not between", value1, value2, "sensorCo2");
            return (Criteria) this;
        }

        public Criteria andSensorPhIsNull() {
            addCriterion("sensor_ph is null");
            return (Criteria) this;
        }

        public Criteria andSensorPhIsNotNull() {
            addCriterion("sensor_ph is not null");
            return (Criteria) this;
        }

        public Criteria andSensorPhEqualTo(Double value) {
            addCriterion("sensor_ph =", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhNotEqualTo(Double value) {
            addCriterion("sensor_ph <>", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhGreaterThan(Double value) {
            addCriterion("sensor_ph >", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_ph >=", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhLessThan(Double value) {
            addCriterion("sensor_ph <", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhLessThanOrEqualTo(Double value) {
            addCriterion("sensor_ph <=", value, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhIn(List<Double> values) {
            addCriterion("sensor_ph in", values, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhNotIn(List<Double> values) {
            addCriterion("sensor_ph not in", values, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhBetween(Double value1, Double value2) {
            addCriterion("sensor_ph between", value1, value2, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorPhNotBetween(Double value1, Double value2) {
            addCriterion("sensor_ph not between", value1, value2, "sensorPh");
            return (Criteria) this;
        }

        public Criteria andSensorEcIsNull() {
            addCriterion("sensor_ec is null");
            return (Criteria) this;
        }

        public Criteria andSensorEcIsNotNull() {
            addCriterion("sensor_ec is not null");
            return (Criteria) this;
        }

        public Criteria andSensorEcEqualTo(Double value) {
            addCriterion("sensor_ec =", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcNotEqualTo(Double value) {
            addCriterion("sensor_ec <>", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcGreaterThan(Double value) {
            addCriterion("sensor_ec >", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_ec >=", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcLessThan(Double value) {
            addCriterion("sensor_ec <", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcLessThanOrEqualTo(Double value) {
            addCriterion("sensor_ec <=", value, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcIn(List<Double> values) {
            addCriterion("sensor_ec in", values, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcNotIn(List<Double> values) {
            addCriterion("sensor_ec not in", values, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcBetween(Double value1, Double value2) {
            addCriterion("sensor_ec between", value1, value2, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorEcNotBetween(Double value1, Double value2) {
            addCriterion("sensor_ec not between", value1, value2, "sensorEc");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenIsNull() {
            addCriterion("sensor_oxygen is null");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenIsNotNull() {
            addCriterion("sensor_oxygen is not null");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenEqualTo(Double value) {
            addCriterion("sensor_oxygen =", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenNotEqualTo(Double value) {
            addCriterion("sensor_oxygen <>", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenGreaterThan(Double value) {
            addCriterion("sensor_oxygen >", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_oxygen >=", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenLessThan(Double value) {
            addCriterion("sensor_oxygen <", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenLessThanOrEqualTo(Double value) {
            addCriterion("sensor_oxygen <=", value, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenIn(List<Double> values) {
            addCriterion("sensor_oxygen in", values, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenNotIn(List<Double> values) {
            addCriterion("sensor_oxygen not in", values, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenBetween(Double value1, Double value2) {
            addCriterion("sensor_oxygen between", value1, value2, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorOxygenNotBetween(Double value1, Double value2) {
            addCriterion("sensor_oxygen not between", value1, value2, "sensorOxygen");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionIsNull() {
            addCriterion("sensor_nutrient_solution is null");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionIsNotNull() {
            addCriterion("sensor_nutrient_solution is not null");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionEqualTo(Double value) {
            addCriterion("sensor_nutrient_solution =", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionNotEqualTo(Double value) {
            addCriterion("sensor_nutrient_solution <>", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionGreaterThan(Double value) {
            addCriterion("sensor_nutrient_solution >", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_nutrient_solution >=", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionLessThan(Double value) {
            addCriterion("sensor_nutrient_solution <", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionLessThanOrEqualTo(Double value) {
            addCriterion("sensor_nutrient_solution <=", value, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionIn(List<Double> values) {
            addCriterion("sensor_nutrient_solution in", values, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionNotIn(List<Double> values) {
            addCriterion("sensor_nutrient_solution not in", values, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionBetween(Double value1, Double value2) {
            addCriterion("sensor_nutrient_solution between", value1, value2, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andSensorNutrientSolutionNotBetween(Double value1, Double value2) {
            addCriterion("sensor_nutrient_solution not between", value1, value2, "sensorNutrientSolution");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureIsNull() {
            addCriterion("outdoor_temperature is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureIsNotNull() {
            addCriterion("outdoor_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureEqualTo(Double value) {
            addCriterion("outdoor_temperature =", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureNotEqualTo(Double value) {
            addCriterion("outdoor_temperature <>", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureGreaterThan(Double value) {
            addCriterion("outdoor_temperature >", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("outdoor_temperature >=", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureLessThan(Double value) {
            addCriterion("outdoor_temperature <", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("outdoor_temperature <=", value, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureIn(List<Double> values) {
            addCriterion("outdoor_temperature in", values, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureNotIn(List<Double> values) {
            addCriterion("outdoor_temperature not in", values, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureBetween(Double value1, Double value2) {
            addCriterion("outdoor_temperature between", value1, value2, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andOutdoorTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("outdoor_temperature not between", value1, value2, "outdoorTemperature");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelIsNull() {
            addCriterion("sensor_high_level is null");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelIsNotNull() {
            addCriterion("sensor_high_level is not null");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelEqualTo(Double value) {
            addCriterion("sensor_high_level =", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelNotEqualTo(Double value) {
            addCriterion("sensor_high_level <>", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelGreaterThan(Double value) {
            addCriterion("sensor_high_level >", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_high_level >=", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelLessThan(Double value) {
            addCriterion("sensor_high_level <", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelLessThanOrEqualTo(Double value) {
            addCriterion("sensor_high_level <=", value, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelIn(List<Double> values) {
            addCriterion("sensor_high_level in", values, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelNotIn(List<Double> values) {
            addCriterion("sensor_high_level not in", values, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelBetween(Double value1, Double value2) {
            addCriterion("sensor_high_level between", value1, value2, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorHighLevelNotBetween(Double value1, Double value2) {
            addCriterion("sensor_high_level not between", value1, value2, "sensorHighLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelIsNull() {
            addCriterion("sensor_low_level is null");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelIsNotNull() {
            addCriterion("sensor_low_level is not null");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelEqualTo(Double value) {
            addCriterion("sensor_low_level =", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelNotEqualTo(Double value) {
            addCriterion("sensor_low_level <>", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelGreaterThan(Double value) {
            addCriterion("sensor_low_level >", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("sensor_low_level >=", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelLessThan(Double value) {
            addCriterion("sensor_low_level <", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelLessThanOrEqualTo(Double value) {
            addCriterion("sensor_low_level <=", value, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelIn(List<Double> values) {
            addCriterion("sensor_low_level in", values, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelNotIn(List<Double> values) {
            addCriterion("sensor_low_level not in", values, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelBetween(Double value1, Double value2) {
            addCriterion("sensor_low_level between", value1, value2, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andSensorLowLevelNotBetween(Double value1, Double value2) {
            addCriterion("sensor_low_level not between", value1, value2, "sensorLowLevel");
            return (Criteria) this;
        }

        public Criteria andImgPath1IsNull() {
            addCriterion("img_path_1 is null");
            return (Criteria) this;
        }

        public Criteria andImgPath1IsNotNull() {
            addCriterion("img_path_1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgPath1EqualTo(String value) {
            addCriterion("img_path_1 =", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1NotEqualTo(String value) {
            addCriterion("img_path_1 <>", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1GreaterThan(String value) {
            addCriterion("img_path_1 >", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1GreaterThanOrEqualTo(String value) {
            addCriterion("img_path_1 >=", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1LessThan(String value) {
            addCriterion("img_path_1 <", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1LessThanOrEqualTo(String value) {
            addCriterion("img_path_1 <=", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1Like(String value) {
            addCriterion("img_path_1 like", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1NotLike(String value) {
            addCriterion("img_path_1 not like", value, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1In(List<String> values) {
            addCriterion("img_path_1 in", values, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1NotIn(List<String> values) {
            addCriterion("img_path_1 not in", values, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1Between(String value1, String value2) {
            addCriterion("img_path_1 between", value1, value2, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath1NotBetween(String value1, String value2) {
            addCriterion("img_path_1 not between", value1, value2, "imgPath1");
            return (Criteria) this;
        }

        public Criteria andImgPath2IsNull() {
            addCriterion("img_path_2 is null");
            return (Criteria) this;
        }

        public Criteria andImgPath2IsNotNull() {
            addCriterion("img_path_2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgPath2EqualTo(String value) {
            addCriterion("img_path_2 =", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2NotEqualTo(String value) {
            addCriterion("img_path_2 <>", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2GreaterThan(String value) {
            addCriterion("img_path_2 >", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2GreaterThanOrEqualTo(String value) {
            addCriterion("img_path_2 >=", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2LessThan(String value) {
            addCriterion("img_path_2 <", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2LessThanOrEqualTo(String value) {
            addCriterion("img_path_2 <=", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2Like(String value) {
            addCriterion("img_path_2 like", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2NotLike(String value) {
            addCriterion("img_path_2 not like", value, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2In(List<String> values) {
            addCriterion("img_path_2 in", values, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2NotIn(List<String> values) {
            addCriterion("img_path_2 not in", values, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2Between(String value1, String value2) {
            addCriterion("img_path_2 between", value1, value2, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath2NotBetween(String value1, String value2) {
            addCriterion("img_path_2 not between", value1, value2, "imgPath2");
            return (Criteria) this;
        }

        public Criteria andImgPath3IsNull() {
            addCriterion("img_path_3 is null");
            return (Criteria) this;
        }

        public Criteria andImgPath3IsNotNull() {
            addCriterion("img_path_3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgPath3EqualTo(String value) {
            addCriterion("img_path_3 =", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3NotEqualTo(String value) {
            addCriterion("img_path_3 <>", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3GreaterThan(String value) {
            addCriterion("img_path_3 >", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3GreaterThanOrEqualTo(String value) {
            addCriterion("img_path_3 >=", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3LessThan(String value) {
            addCriterion("img_path_3 <", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3LessThanOrEqualTo(String value) {
            addCriterion("img_path_3 <=", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3Like(String value) {
            addCriterion("img_path_3 like", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3NotLike(String value) {
            addCriterion("img_path_3 not like", value, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3In(List<String> values) {
            addCriterion("img_path_3 in", values, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3NotIn(List<String> values) {
            addCriterion("img_path_3 not in", values, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3Between(String value1, String value2) {
            addCriterion("img_path_3 between", value1, value2, "imgPath3");
            return (Criteria) this;
        }

        public Criteria andImgPath3NotBetween(String value1, String value2) {
            addCriterion("img_path_3 not between", value1, value2, "imgPath3");
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
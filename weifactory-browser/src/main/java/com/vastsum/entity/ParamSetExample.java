package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParamSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParamSetExample() {
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

        public Criteria andParamSetIdIsNull() {
            addCriterion("param_set_id is null");
            return (Criteria) this;
        }

        public Criteria andParamSetIdIsNotNull() {
            addCriterion("param_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andParamSetIdEqualTo(Long value) {
            addCriterion("param_set_id =", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdNotEqualTo(Long value) {
            addCriterion("param_set_id <>", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdGreaterThan(Long value) {
            addCriterion("param_set_id >", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("param_set_id >=", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdLessThan(Long value) {
            addCriterion("param_set_id <", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdLessThanOrEqualTo(Long value) {
            addCriterion("param_set_id <=", value, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdIn(List<Long> values) {
            addCriterion("param_set_id in", values, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdNotIn(List<Long> values) {
            addCriterion("param_set_id not in", values, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdBetween(Long value1, Long value2) {
            addCriterion("param_set_id between", value1, value2, "paramSetId");
            return (Criteria) this;
        }

        public Criteria andParamSetIdNotBetween(Long value1, Long value2) {
            addCriterion("param_set_id not between", value1, value2, "paramSetId");
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

        public Criteria andDaySetIsNull() {
            addCriterion("day_set is null");
            return (Criteria) this;
        }

        public Criteria andDaySetIsNotNull() {
            addCriterion("day_set is not null");
            return (Criteria) this;
        }

        public Criteria andDaySetEqualTo(Date value) {
            addCriterion("day_set =", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotEqualTo(Date value) {
            addCriterion("day_set <>", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetGreaterThan(Date value) {
            addCriterion("day_set >", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetGreaterThanOrEqualTo(Date value) {
            addCriterion("day_set >=", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetLessThan(Date value) {
            addCriterion("day_set <", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetLessThanOrEqualTo(Date value) {
            addCriterion("day_set <=", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetIn(List<Date> values) {
            addCriterion("day_set in", values, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotIn(List<Date> values) {
            addCriterion("day_set not in", values, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetBetween(Date value1, Date value2) {
            addCriterion("day_set between", value1, value2, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotBetween(Date value1, Date value2) {
            addCriterion("day_set not between", value1, value2, "daySet");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIsNull() {
            addCriterion("day_start_time is null");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIsNotNull() {
            addCriterion("day_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeEqualTo(Date value) {
            addCriterion("day_start_time =", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotEqualTo(Date value) {
            addCriterion("day_start_time <>", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThan(Date value) {
            addCriterion("day_start_time >", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("day_start_time >=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThan(Date value) {
            addCriterion("day_start_time <", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("day_start_time <=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIn(List<Date> values) {
            addCriterion("day_start_time in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotIn(List<Date> values) {
            addCriterion("day_start_time not in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeBetween(Date value1, Date value2) {
            addCriterion("day_start_time between", value1, value2, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("day_start_time not between", value1, value2, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeIsNull() {
            addCriterion("day_end_time is null");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeIsNotNull() {
            addCriterion("day_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeEqualTo(Date value) {
            addCriterion("day_end_time =", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotEqualTo(Date value) {
            addCriterion("day_end_time <>", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeGreaterThan(Date value) {
            addCriterion("day_end_time >", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("day_end_time >=", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeLessThan(Date value) {
            addCriterion("day_end_time <", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("day_end_time <=", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeIn(List<Date> values) {
            addCriterion("day_end_time in", values, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotIn(List<Date> values) {
            addCriterion("day_end_time not in", values, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeBetween(Date value1, Date value2) {
            addCriterion("day_end_time between", value1, value2, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("day_end_time not between", value1, value2, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIsNull() {
            addCriterion("night_start_time is null");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIsNotNull() {
            addCriterion("night_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeEqualTo(Date value) {
            addCriterion("night_start_time =", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotEqualTo(Date value) {
            addCriterion("night_start_time <>", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThan(Date value) {
            addCriterion("night_start_time >", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("night_start_time >=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThan(Date value) {
            addCriterion("night_start_time <", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("night_start_time <=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIn(List<Date> values) {
            addCriterion("night_start_time in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotIn(List<Date> values) {
            addCriterion("night_start_time not in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeBetween(Date value1, Date value2) {
            addCriterion("night_start_time between", value1, value2, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("night_start_time not between", value1, value2, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeIsNull() {
            addCriterion("night_end_time is null");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeIsNotNull() {
            addCriterion("night_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeEqualTo(Date value) {
            addCriterion("night_end_time =", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotEqualTo(Date value) {
            addCriterion("night_end_time <>", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeGreaterThan(Date value) {
            addCriterion("night_end_time >", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("night_end_time >=", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeLessThan(Date value) {
            addCriterion("night_end_time <", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("night_end_time <=", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeIn(List<Date> values) {
            addCriterion("night_end_time in", values, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotIn(List<Date> values) {
            addCriterion("night_end_time not in", values, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeBetween(Date value1, Date value2) {
            addCriterion("night_end_time between", value1, value2, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("night_end_time not between", value1, value2, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureIsNull() {
            addCriterion("day_temperature is null");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureIsNotNull() {
            addCriterion("day_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureEqualTo(Double value) {
            addCriterion("day_temperature =", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureNotEqualTo(Double value) {
            addCriterion("day_temperature <>", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureGreaterThan(Double value) {
            addCriterion("day_temperature >", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("day_temperature >=", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureLessThan(Double value) {
            addCriterion("day_temperature <", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("day_temperature <=", value, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureIn(List<Double> values) {
            addCriterion("day_temperature in", values, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureNotIn(List<Double> values) {
            addCriterion("day_temperature not in", values, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureBetween(Double value1, Double value2) {
            addCriterion("day_temperature between", value1, value2, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("day_temperature not between", value1, value2, "dayTemperature");
            return (Criteria) this;
        }

        public Criteria andDayHumidityIsNull() {
            addCriterion("day_humidity is null");
            return (Criteria) this;
        }

        public Criteria andDayHumidityIsNotNull() {
            addCriterion("day_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andDayHumidityEqualTo(Double value) {
            addCriterion("day_humidity =", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityNotEqualTo(Double value) {
            addCriterion("day_humidity <>", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityGreaterThan(Double value) {
            addCriterion("day_humidity >", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("day_humidity >=", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityLessThan(Double value) {
            addCriterion("day_humidity <", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityLessThanOrEqualTo(Double value) {
            addCriterion("day_humidity <=", value, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityIn(List<Double> values) {
            addCriterion("day_humidity in", values, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityNotIn(List<Double> values) {
            addCriterion("day_humidity not in", values, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityBetween(Double value1, Double value2) {
            addCriterion("day_humidity between", value1, value2, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayHumidityNotBetween(Double value1, Double value2) {
            addCriterion("day_humidity not between", value1, value2, "dayHumidity");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeIsNull() {
            addCriterion("day_wind_lenght_time is null");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeIsNotNull() {
            addCriterion("day_wind_lenght_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeEqualTo(Integer value) {
            addCriterion("day_wind_lenght_time =", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeNotEqualTo(Integer value) {
            addCriterion("day_wind_lenght_time <>", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeGreaterThan(Integer value) {
            addCriterion("day_wind_lenght_time >", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_wind_lenght_time >=", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeLessThan(Integer value) {
            addCriterion("day_wind_lenght_time <", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeLessThanOrEqualTo(Integer value) {
            addCriterion("day_wind_lenght_time <=", value, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeIn(List<Integer> values) {
            addCriterion("day_wind_lenght_time in", values, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeNotIn(List<Integer> values) {
            addCriterion("day_wind_lenght_time not in", values, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeBetween(Integer value1, Integer value2) {
            addCriterion("day_wind_lenght_time between", value1, value2, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindLenghtTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("day_wind_lenght_time not between", value1, value2, "dayWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeIsNull() {
            addCriterion("day_wind_cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeIsNotNull() {
            addCriterion("day_wind_cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeEqualTo(Integer value) {
            addCriterion("day_wind_cycle_time =", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeNotEqualTo(Integer value) {
            addCriterion("day_wind_cycle_time <>", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeGreaterThan(Integer value) {
            addCriterion("day_wind_cycle_time >", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_wind_cycle_time >=", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeLessThan(Integer value) {
            addCriterion("day_wind_cycle_time <", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("day_wind_cycle_time <=", value, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeIn(List<Integer> values) {
            addCriterion("day_wind_cycle_time in", values, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeNotIn(List<Integer> values) {
            addCriterion("day_wind_cycle_time not in", values, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeBetween(Integer value1, Integer value2) {
            addCriterion("day_wind_cycle_time between", value1, value2, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayWindCycleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("day_wind_cycle_time not between", value1, value2, "dayWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1IsNull() {
            addCriterion("day_bg_lenght_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1IsNotNull() {
            addCriterion("day_bg_lenght_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1EqualTo(Integer value) {
            addCriterion("day_bg_lenght_1 =", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1NotEqualTo(Integer value) {
            addCriterion("day_bg_lenght_1 <>", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1GreaterThan(Integer value) {
            addCriterion("day_bg_lenght_1 >", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_1 >=", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1LessThan(Integer value) {
            addCriterion("day_bg_lenght_1 <", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_1 <=", value, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1In(List<Integer> values) {
            addCriterion("day_bg_lenght_1 in", values, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1NotIn(List<Integer> values) {
            addCriterion("day_bg_lenght_1 not in", values, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1Between(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_1 between", value1, value2, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght1NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_1 not between", value1, value2, "dayBgLenght1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1IsNull() {
            addCriterion("day_bg_cycle_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1IsNotNull() {
            addCriterion("day_bg_cycle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1EqualTo(Integer value) {
            addCriterion("day_bg_cycle_1 =", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1NotEqualTo(Integer value) {
            addCriterion("day_bg_cycle_1 <>", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1GreaterThan(Integer value) {
            addCriterion("day_bg_cycle_1 >", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_1 >=", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1LessThan(Integer value) {
            addCriterion("day_bg_cycle_1 <", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_1 <=", value, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1In(List<Integer> values) {
            addCriterion("day_bg_cycle_1 in", values, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1NotIn(List<Integer> values) {
            addCriterion("day_bg_cycle_1 not in", values, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1Between(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_1 between", value1, value2, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle1NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_1 not between", value1, value2, "dayBgCycle1");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2IsNull() {
            addCriterion("day_bg_lenght_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2IsNotNull() {
            addCriterion("day_bg_lenght_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2EqualTo(Integer value) {
            addCriterion("day_bg_lenght_2 =", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2NotEqualTo(Integer value) {
            addCriterion("day_bg_lenght_2 <>", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2GreaterThan(Integer value) {
            addCriterion("day_bg_lenght_2 >", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_2 >=", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2LessThan(Integer value) {
            addCriterion("day_bg_lenght_2 <", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_2 <=", value, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2In(List<Integer> values) {
            addCriterion("day_bg_lenght_2 in", values, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2NotIn(List<Integer> values) {
            addCriterion("day_bg_lenght_2 not in", values, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2Between(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_2 between", value1, value2, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght2NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_2 not between", value1, value2, "dayBgLenght2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2IsNull() {
            addCriterion("day_bg_cycle_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2IsNotNull() {
            addCriterion("day_bg_cycle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2EqualTo(Integer value) {
            addCriterion("day_bg_cycle_2 =", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2NotEqualTo(Integer value) {
            addCriterion("day_bg_cycle_2 <>", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2GreaterThan(Integer value) {
            addCriterion("day_bg_cycle_2 >", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_2 >=", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2LessThan(Integer value) {
            addCriterion("day_bg_cycle_2 <", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_2 <=", value, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2In(List<Integer> values) {
            addCriterion("day_bg_cycle_2 in", values, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2NotIn(List<Integer> values) {
            addCriterion("day_bg_cycle_2 not in", values, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2Between(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_2 between", value1, value2, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle2NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_2 not between", value1, value2, "dayBgCycle2");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3IsNull() {
            addCriterion("day_bg_lenght_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3IsNotNull() {
            addCriterion("day_bg_lenght_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3EqualTo(Integer value) {
            addCriterion("day_bg_lenght_3 =", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3NotEqualTo(Integer value) {
            addCriterion("day_bg_lenght_3 <>", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3GreaterThan(Integer value) {
            addCriterion("day_bg_lenght_3 >", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_3 >=", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3LessThan(Integer value) {
            addCriterion("day_bg_lenght_3 <", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_lenght_3 <=", value, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3In(List<Integer> values) {
            addCriterion("day_bg_lenght_3 in", values, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3NotIn(List<Integer> values) {
            addCriterion("day_bg_lenght_3 not in", values, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3Between(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_3 between", value1, value2, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgLenght3NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_lenght_3 not between", value1, value2, "dayBgLenght3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3IsNull() {
            addCriterion("day_bg_cycle_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3IsNotNull() {
            addCriterion("day_bg_cycle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3EqualTo(Integer value) {
            addCriterion("day_bg_cycle_3 =", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3NotEqualTo(Integer value) {
            addCriterion("day_bg_cycle_3 <>", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3GreaterThan(Integer value) {
            addCriterion("day_bg_cycle_3 >", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_3 >=", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3LessThan(Integer value) {
            addCriterion("day_bg_cycle_3 <", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3LessThanOrEqualTo(Integer value) {
            addCriterion("day_bg_cycle_3 <=", value, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3In(List<Integer> values) {
            addCriterion("day_bg_cycle_3 in", values, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3NotIn(List<Integer> values) {
            addCriterion("day_bg_cycle_3 not in", values, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3Between(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_3 between", value1, value2, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayBgCycle3NotBetween(Integer value1, Integer value2) {
            addCriterion("day_bg_cycle_3 not between", value1, value2, "dayBgCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1IsNull() {
            addCriterion("day_yy_length_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1IsNotNull() {
            addCriterion("day_yy_length_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1EqualTo(Integer value) {
            addCriterion("day_yy_length_1 =", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1NotEqualTo(Integer value) {
            addCriterion("day_yy_length_1 <>", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1GreaterThan(Integer value) {
            addCriterion("day_yy_length_1 >", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_1 >=", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1LessThan(Integer value) {
            addCriterion("day_yy_length_1 <", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_1 <=", value, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1In(List<Integer> values) {
            addCriterion("day_yy_length_1 in", values, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1NotIn(List<Integer> values) {
            addCriterion("day_yy_length_1 not in", values, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1Between(Integer value1, Integer value2) {
            addCriterion("day_yy_length_1 between", value1, value2, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength1NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_length_1 not between", value1, value2, "dayYyLength1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1IsNull() {
            addCriterion("day_yy_cycle_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1IsNotNull() {
            addCriterion("day_yy_cycle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1EqualTo(Integer value) {
            addCriterion("day_yy_cycle_1 =", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1NotEqualTo(Integer value) {
            addCriterion("day_yy_cycle_1 <>", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1GreaterThan(Integer value) {
            addCriterion("day_yy_cycle_1 >", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_1 >=", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1LessThan(Integer value) {
            addCriterion("day_yy_cycle_1 <", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_1 <=", value, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1In(List<Integer> values) {
            addCriterion("day_yy_cycle_1 in", values, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1NotIn(List<Integer> values) {
            addCriterion("day_yy_cycle_1 not in", values, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1Between(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_1 between", value1, value2, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle1NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_1 not between", value1, value2, "dayYyCycle1");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2IsNull() {
            addCriterion("day_yy_length_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2IsNotNull() {
            addCriterion("day_yy_length_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2EqualTo(Integer value) {
            addCriterion("day_yy_length_2 =", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2NotEqualTo(Integer value) {
            addCriterion("day_yy_length_2 <>", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2GreaterThan(Integer value) {
            addCriterion("day_yy_length_2 >", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_2 >=", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2LessThan(Integer value) {
            addCriterion("day_yy_length_2 <", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_2 <=", value, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2In(List<Integer> values) {
            addCriterion("day_yy_length_2 in", values, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2NotIn(List<Integer> values) {
            addCriterion("day_yy_length_2 not in", values, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2Between(Integer value1, Integer value2) {
            addCriterion("day_yy_length_2 between", value1, value2, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength2NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_length_2 not between", value1, value2, "dayYyLength2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2IsNull() {
            addCriterion("day_yy_cycle_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2IsNotNull() {
            addCriterion("day_yy_cycle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2EqualTo(Integer value) {
            addCriterion("day_yy_cycle_2 =", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2NotEqualTo(Integer value) {
            addCriterion("day_yy_cycle_2 <>", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2GreaterThan(Integer value) {
            addCriterion("day_yy_cycle_2 >", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_2 >=", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2LessThan(Integer value) {
            addCriterion("day_yy_cycle_2 <", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_2 <=", value, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2In(List<Integer> values) {
            addCriterion("day_yy_cycle_2 in", values, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2NotIn(List<Integer> values) {
            addCriterion("day_yy_cycle_2 not in", values, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2Between(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_2 between", value1, value2, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle2NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_2 not between", value1, value2, "dayYyCycle2");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3IsNull() {
            addCriterion("day_yy_length_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3IsNotNull() {
            addCriterion("day_yy_length_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3EqualTo(Integer value) {
            addCriterion("day_yy_length_3 =", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3NotEqualTo(Integer value) {
            addCriterion("day_yy_length_3 <>", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3GreaterThan(Integer value) {
            addCriterion("day_yy_length_3 >", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_3 >=", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3LessThan(Integer value) {
            addCriterion("day_yy_length_3 <", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_length_3 <=", value, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3In(List<Integer> values) {
            addCriterion("day_yy_length_3 in", values, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3NotIn(List<Integer> values) {
            addCriterion("day_yy_length_3 not in", values, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3Between(Integer value1, Integer value2) {
            addCriterion("day_yy_length_3 between", value1, value2, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyLength3NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_length_3 not between", value1, value2, "dayYyLength3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3IsNull() {
            addCriterion("day_yy_cycle_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3IsNotNull() {
            addCriterion("day_yy_cycle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3EqualTo(Integer value) {
            addCriterion("day_yy_cycle_3 =", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3NotEqualTo(Integer value) {
            addCriterion("day_yy_cycle_3 <>", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3GreaterThan(Integer value) {
            addCriterion("day_yy_cycle_3 >", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3GreaterThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_3 >=", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3LessThan(Integer value) {
            addCriterion("day_yy_cycle_3 <", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3LessThanOrEqualTo(Integer value) {
            addCriterion("day_yy_cycle_3 <=", value, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3In(List<Integer> values) {
            addCriterion("day_yy_cycle_3 in", values, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3NotIn(List<Integer> values) {
            addCriterion("day_yy_cycle_3 not in", values, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3Between(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_3 between", value1, value2, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayYyCycle3NotBetween(Integer value1, Integer value2) {
            addCriterion("day_yy_cycle_3 not between", value1, value2, "dayYyCycle3");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthIsNull() {
            addCriterion("day_new_wind_length is null");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthIsNotNull() {
            addCriterion("day_new_wind_length is not null");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthEqualTo(Integer value) {
            addCriterion("day_new_wind_length =", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthNotEqualTo(Integer value) {
            addCriterion("day_new_wind_length <>", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthGreaterThan(Integer value) {
            addCriterion("day_new_wind_length >", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_new_wind_length >=", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthLessThan(Integer value) {
            addCriterion("day_new_wind_length <", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthLessThanOrEqualTo(Integer value) {
            addCriterion("day_new_wind_length <=", value, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthIn(List<Integer> values) {
            addCriterion("day_new_wind_length in", values, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthNotIn(List<Integer> values) {
            addCriterion("day_new_wind_length not in", values, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthBetween(Integer value1, Integer value2) {
            addCriterion("day_new_wind_length between", value1, value2, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("day_new_wind_length not between", value1, value2, "dayNewWindLength");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeIsNull() {
            addCriterion("day_new_wind_time is null");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeIsNotNull() {
            addCriterion("day_new_wind_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeEqualTo(Integer value) {
            addCriterion("day_new_wind_time =", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeNotEqualTo(Integer value) {
            addCriterion("day_new_wind_time <>", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeGreaterThan(Integer value) {
            addCriterion("day_new_wind_time >", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_new_wind_time >=", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeLessThan(Integer value) {
            addCriterion("day_new_wind_time <", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("day_new_wind_time <=", value, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeIn(List<Integer> values) {
            addCriterion("day_new_wind_time in", values, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeNotIn(List<Integer> values) {
            addCriterion("day_new_wind_time not in", values, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeBetween(Integer value1, Integer value2) {
            addCriterion("day_new_wind_time between", value1, value2, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayNewWindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("day_new_wind_time not between", value1, value2, "dayNewWindTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeIsNull() {
            addCriterion("day_feed_bg_time is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeIsNotNull() {
            addCriterion("day_feed_bg_time is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeEqualTo(Integer value) {
            addCriterion("day_feed_bg_time =", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeNotEqualTo(Integer value) {
            addCriterion("day_feed_bg_time <>", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeGreaterThan(Integer value) {
            addCriterion("day_feed_bg_time >", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_time >=", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeLessThan(Integer value) {
            addCriterion("day_feed_bg_time <", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_time <=", value, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeIn(List<Integer> values) {
            addCriterion("day_feed_bg_time in", values, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeNotIn(List<Integer> values) {
            addCriterion("day_feed_bg_time not in", values, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_time between", value1, value2, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_time not between", value1, value2, "dayFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthIsNull() {
            addCriterion("day_feed_bg_length is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthIsNotNull() {
            addCriterion("day_feed_bg_length is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthEqualTo(Integer value) {
            addCriterion("day_feed_bg_length =", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthNotEqualTo(Integer value) {
            addCriterion("day_feed_bg_length <>", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthGreaterThan(Integer value) {
            addCriterion("day_feed_bg_length >", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_length >=", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthLessThan(Integer value) {
            addCriterion("day_feed_bg_length <", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_length <=", value, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthIn(List<Integer> values) {
            addCriterion("day_feed_bg_length in", values, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthNotIn(List<Integer> values) {
            addCriterion("day_feed_bg_length not in", values, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_length between", value1, value2, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_length not between", value1, value2, "dayFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthIsNull() {
            addCriterion("day_feed_water_length is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthIsNotNull() {
            addCriterion("day_feed_water_length is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthEqualTo(Integer value) {
            addCriterion("day_feed_water_length =", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthNotEqualTo(Integer value) {
            addCriterion("day_feed_water_length <>", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthGreaterThan(Integer value) {
            addCriterion("day_feed_water_length >", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_length >=", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthLessThan(Integer value) {
            addCriterion("day_feed_water_length <", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_length <=", value, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthIn(List<Integer> values) {
            addCriterion("day_feed_water_length in", values, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthNotIn(List<Integer> values) {
            addCriterion("day_feed_water_length not in", values, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_length between", value1, value2, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_length not between", value1, value2, "dayFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleIsNull() {
            addCriterion("day_feed_water_cycle is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleIsNotNull() {
            addCriterion("day_feed_water_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleEqualTo(Integer value) {
            addCriterion("day_feed_water_cycle =", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleNotEqualTo(Integer value) {
            addCriterion("day_feed_water_cycle <>", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleGreaterThan(Integer value) {
            addCriterion("day_feed_water_cycle >", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_cycle >=", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleLessThan(Integer value) {
            addCriterion("day_feed_water_cycle <", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_cycle <=", value, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleIn(List<Integer> values) {
            addCriterion("day_feed_water_cycle in", values, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleNotIn(List<Integer> values) {
            addCriterion("day_feed_water_cycle not in", values, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_cycle between", value1, value2, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_cycle not between", value1, value2, "dayFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureIsNull() {
            addCriterion("night_temperature is null");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureIsNotNull() {
            addCriterion("night_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureEqualTo(Double value) {
            addCriterion("night_temperature =", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureNotEqualTo(Double value) {
            addCriterion("night_temperature <>", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureGreaterThan(Double value) {
            addCriterion("night_temperature >", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("night_temperature >=", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureLessThan(Double value) {
            addCriterion("night_temperature <", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("night_temperature <=", value, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureIn(List<Double> values) {
            addCriterion("night_temperature in", values, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureNotIn(List<Double> values) {
            addCriterion("night_temperature not in", values, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureBetween(Double value1, Double value2) {
            addCriterion("night_temperature between", value1, value2, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("night_temperature not between", value1, value2, "nightTemperature");
            return (Criteria) this;
        }

        public Criteria andNightHumidityIsNull() {
            addCriterion("night_humidity is null");
            return (Criteria) this;
        }

        public Criteria andNightHumidityIsNotNull() {
            addCriterion("night_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andNightHumidityEqualTo(Double value) {
            addCriterion("night_humidity =", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityNotEqualTo(Double value) {
            addCriterion("night_humidity <>", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityGreaterThan(Double value) {
            addCriterion("night_humidity >", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("night_humidity >=", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityLessThan(Double value) {
            addCriterion("night_humidity <", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityLessThanOrEqualTo(Double value) {
            addCriterion("night_humidity <=", value, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityIn(List<Double> values) {
            addCriterion("night_humidity in", values, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityNotIn(List<Double> values) {
            addCriterion("night_humidity not in", values, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityBetween(Double value1, Double value2) {
            addCriterion("night_humidity between", value1, value2, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightHumidityNotBetween(Double value1, Double value2) {
            addCriterion("night_humidity not between", value1, value2, "nightHumidity");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeIsNull() {
            addCriterion("night_wind_lenght_time is null");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeIsNotNull() {
            addCriterion("night_wind_lenght_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeEqualTo(Integer value) {
            addCriterion("night_wind_lenght_time =", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeNotEqualTo(Integer value) {
            addCriterion("night_wind_lenght_time <>", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeGreaterThan(Integer value) {
            addCriterion("night_wind_lenght_time >", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_wind_lenght_time >=", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeLessThan(Integer value) {
            addCriterion("night_wind_lenght_time <", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeLessThanOrEqualTo(Integer value) {
            addCriterion("night_wind_lenght_time <=", value, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeIn(List<Integer> values) {
            addCriterion("night_wind_lenght_time in", values, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeNotIn(List<Integer> values) {
            addCriterion("night_wind_lenght_time not in", values, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeBetween(Integer value1, Integer value2) {
            addCriterion("night_wind_lenght_time between", value1, value2, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindLenghtTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("night_wind_lenght_time not between", value1, value2, "nightWindLenghtTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeIsNull() {
            addCriterion("night_wind_cycle_time is null");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeIsNotNull() {
            addCriterion("night_wind_cycle_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeEqualTo(Integer value) {
            addCriterion("night_wind_cycle_time =", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeNotEqualTo(Integer value) {
            addCriterion("night_wind_cycle_time <>", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeGreaterThan(Integer value) {
            addCriterion("night_wind_cycle_time >", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_wind_cycle_time >=", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeLessThan(Integer value) {
            addCriterion("night_wind_cycle_time <", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeLessThanOrEqualTo(Integer value) {
            addCriterion("night_wind_cycle_time <=", value, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeIn(List<Integer> values) {
            addCriterion("night_wind_cycle_time in", values, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeNotIn(List<Integer> values) {
            addCriterion("night_wind_cycle_time not in", values, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeBetween(Integer value1, Integer value2) {
            addCriterion("night_wind_cycle_time between", value1, value2, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightWindCycleTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("night_wind_cycle_time not between", value1, value2, "nightWindCycleTime");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1IsNull() {
            addCriterion("night_bg_lenght_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1IsNotNull() {
            addCriterion("night_bg_lenght_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1EqualTo(Integer value) {
            addCriterion("night_bg_lenght_1 =", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1NotEqualTo(Integer value) {
            addCriterion("night_bg_lenght_1 <>", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1GreaterThan(Integer value) {
            addCriterion("night_bg_lenght_1 >", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_1 >=", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1LessThan(Integer value) {
            addCriterion("night_bg_lenght_1 <", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_1 <=", value, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1In(List<Integer> values) {
            addCriterion("night_bg_lenght_1 in", values, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1NotIn(List<Integer> values) {
            addCriterion("night_bg_lenght_1 not in", values, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1Between(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_1 between", value1, value2, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght1NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_1 not between", value1, value2, "nightBgLenght1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1IsNull() {
            addCriterion("night_bg_cycle_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1IsNotNull() {
            addCriterion("night_bg_cycle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1EqualTo(Integer value) {
            addCriterion("night_bg_cycle_1 =", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1NotEqualTo(Integer value) {
            addCriterion("night_bg_cycle_1 <>", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1GreaterThan(Integer value) {
            addCriterion("night_bg_cycle_1 >", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_1 >=", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1LessThan(Integer value) {
            addCriterion("night_bg_cycle_1 <", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_1 <=", value, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1In(List<Integer> values) {
            addCriterion("night_bg_cycle_1 in", values, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1NotIn(List<Integer> values) {
            addCriterion("night_bg_cycle_1 not in", values, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1Between(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_1 between", value1, value2, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle1NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_1 not between", value1, value2, "nightBgCycle1");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2IsNull() {
            addCriterion("night_bg_lenght_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2IsNotNull() {
            addCriterion("night_bg_lenght_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2EqualTo(Integer value) {
            addCriterion("night_bg_lenght_2 =", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2NotEqualTo(Integer value) {
            addCriterion("night_bg_lenght_2 <>", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2GreaterThan(Integer value) {
            addCriterion("night_bg_lenght_2 >", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_2 >=", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2LessThan(Integer value) {
            addCriterion("night_bg_lenght_2 <", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_2 <=", value, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2In(List<Integer> values) {
            addCriterion("night_bg_lenght_2 in", values, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2NotIn(List<Integer> values) {
            addCriterion("night_bg_lenght_2 not in", values, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2Between(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_2 between", value1, value2, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght2NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_2 not between", value1, value2, "nightBgLenght2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2IsNull() {
            addCriterion("night_bg_cycle_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2IsNotNull() {
            addCriterion("night_bg_cycle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2EqualTo(Integer value) {
            addCriterion("night_bg_cycle_2 =", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2NotEqualTo(Integer value) {
            addCriterion("night_bg_cycle_2 <>", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2GreaterThan(Integer value) {
            addCriterion("night_bg_cycle_2 >", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_2 >=", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2LessThan(Integer value) {
            addCriterion("night_bg_cycle_2 <", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_2 <=", value, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2In(List<Integer> values) {
            addCriterion("night_bg_cycle_2 in", values, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2NotIn(List<Integer> values) {
            addCriterion("night_bg_cycle_2 not in", values, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2Between(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_2 between", value1, value2, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle2NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_2 not between", value1, value2, "nightBgCycle2");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3IsNull() {
            addCriterion("night_bg_lenght_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3IsNotNull() {
            addCriterion("night_bg_lenght_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3EqualTo(Integer value) {
            addCriterion("night_bg_lenght_3 =", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3NotEqualTo(Integer value) {
            addCriterion("night_bg_lenght_3 <>", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3GreaterThan(Integer value) {
            addCriterion("night_bg_lenght_3 >", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_3 >=", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3LessThan(Integer value) {
            addCriterion("night_bg_lenght_3 <", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_lenght_3 <=", value, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3In(List<Integer> values) {
            addCriterion("night_bg_lenght_3 in", values, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3NotIn(List<Integer> values) {
            addCriterion("night_bg_lenght_3 not in", values, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3Between(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_3 between", value1, value2, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgLenght3NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_lenght_3 not between", value1, value2, "nightBgLenght3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3IsNull() {
            addCriterion("night_bg_cycle_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3IsNotNull() {
            addCriterion("night_bg_cycle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3EqualTo(Integer value) {
            addCriterion("night_bg_cycle_3 =", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3NotEqualTo(Integer value) {
            addCriterion("night_bg_cycle_3 <>", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3GreaterThan(Integer value) {
            addCriterion("night_bg_cycle_3 >", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_3 >=", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3LessThan(Integer value) {
            addCriterion("night_bg_cycle_3 <", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3LessThanOrEqualTo(Integer value) {
            addCriterion("night_bg_cycle_3 <=", value, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3In(List<Integer> values) {
            addCriterion("night_bg_cycle_3 in", values, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3NotIn(List<Integer> values) {
            addCriterion("night_bg_cycle_3 not in", values, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3Between(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_3 between", value1, value2, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightBgCycle3NotBetween(Integer value1, Integer value2) {
            addCriterion("night_bg_cycle_3 not between", value1, value2, "nightBgCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1IsNull() {
            addCriterion("night_yy_length_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1IsNotNull() {
            addCriterion("night_yy_length_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1EqualTo(Integer value) {
            addCriterion("night_yy_length_1 =", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1NotEqualTo(Integer value) {
            addCriterion("night_yy_length_1 <>", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1GreaterThan(Integer value) {
            addCriterion("night_yy_length_1 >", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_1 >=", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1LessThan(Integer value) {
            addCriterion("night_yy_length_1 <", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_1 <=", value, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1In(List<Integer> values) {
            addCriterion("night_yy_length_1 in", values, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1NotIn(List<Integer> values) {
            addCriterion("night_yy_length_1 not in", values, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1Between(Integer value1, Integer value2) {
            addCriterion("night_yy_length_1 between", value1, value2, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength1NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_length_1 not between", value1, value2, "nightYyLength1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1IsNull() {
            addCriterion("night_yy_cycle_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1IsNotNull() {
            addCriterion("night_yy_cycle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1EqualTo(Integer value) {
            addCriterion("night_yy_cycle_1 =", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1NotEqualTo(Integer value) {
            addCriterion("night_yy_cycle_1 <>", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1GreaterThan(Integer value) {
            addCriterion("night_yy_cycle_1 >", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_1 >=", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1LessThan(Integer value) {
            addCriterion("night_yy_cycle_1 <", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_1 <=", value, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1In(List<Integer> values) {
            addCriterion("night_yy_cycle_1 in", values, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1NotIn(List<Integer> values) {
            addCriterion("night_yy_cycle_1 not in", values, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1Between(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_1 between", value1, value2, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle1NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_1 not between", value1, value2, "nightYyCycle1");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2IsNull() {
            addCriterion("night_yy_length_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2IsNotNull() {
            addCriterion("night_yy_length_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2EqualTo(Integer value) {
            addCriterion("night_yy_length_2 =", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2NotEqualTo(Integer value) {
            addCriterion("night_yy_length_2 <>", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2GreaterThan(Integer value) {
            addCriterion("night_yy_length_2 >", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_2 >=", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2LessThan(Integer value) {
            addCriterion("night_yy_length_2 <", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_2 <=", value, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2In(List<Integer> values) {
            addCriterion("night_yy_length_2 in", values, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2NotIn(List<Integer> values) {
            addCriterion("night_yy_length_2 not in", values, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2Between(Integer value1, Integer value2) {
            addCriterion("night_yy_length_2 between", value1, value2, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength2NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_length_2 not between", value1, value2, "nightYyLength2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2IsNull() {
            addCriterion("night_yy_cycle_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2IsNotNull() {
            addCriterion("night_yy_cycle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2EqualTo(Integer value) {
            addCriterion("night_yy_cycle_2 =", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2NotEqualTo(Integer value) {
            addCriterion("night_yy_cycle_2 <>", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2GreaterThan(Integer value) {
            addCriterion("night_yy_cycle_2 >", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_2 >=", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2LessThan(Integer value) {
            addCriterion("night_yy_cycle_2 <", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_2 <=", value, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2In(List<Integer> values) {
            addCriterion("night_yy_cycle_2 in", values, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2NotIn(List<Integer> values) {
            addCriterion("night_yy_cycle_2 not in", values, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2Between(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_2 between", value1, value2, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle2NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_2 not between", value1, value2, "nightYyCycle2");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3IsNull() {
            addCriterion("night_yy_length_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3IsNotNull() {
            addCriterion("night_yy_length_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3EqualTo(Integer value) {
            addCriterion("night_yy_length_3 =", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3NotEqualTo(Integer value) {
            addCriterion("night_yy_length_3 <>", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3GreaterThan(Integer value) {
            addCriterion("night_yy_length_3 >", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_3 >=", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3LessThan(Integer value) {
            addCriterion("night_yy_length_3 <", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_length_3 <=", value, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3In(List<Integer> values) {
            addCriterion("night_yy_length_3 in", values, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3NotIn(List<Integer> values) {
            addCriterion("night_yy_length_3 not in", values, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3Between(Integer value1, Integer value2) {
            addCriterion("night_yy_length_3 between", value1, value2, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyLength3NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_length_3 not between", value1, value2, "nightYyLength3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3IsNull() {
            addCriterion("night_yy_cycle_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3IsNotNull() {
            addCriterion("night_yy_cycle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3EqualTo(Integer value) {
            addCriterion("night_yy_cycle_3 =", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3NotEqualTo(Integer value) {
            addCriterion("night_yy_cycle_3 <>", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3GreaterThan(Integer value) {
            addCriterion("night_yy_cycle_3 >", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3GreaterThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_3 >=", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3LessThan(Integer value) {
            addCriterion("night_yy_cycle_3 <", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3LessThanOrEqualTo(Integer value) {
            addCriterion("night_yy_cycle_3 <=", value, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3In(List<Integer> values) {
            addCriterion("night_yy_cycle_3 in", values, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3NotIn(List<Integer> values) {
            addCriterion("night_yy_cycle_3 not in", values, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3Between(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_3 between", value1, value2, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightYyCycle3NotBetween(Integer value1, Integer value2) {
            addCriterion("night_yy_cycle_3 not between", value1, value2, "nightYyCycle3");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthIsNull() {
            addCriterion("night_new_wind_length is null");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthIsNotNull() {
            addCriterion("night_new_wind_length is not null");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthEqualTo(Integer value) {
            addCriterion("night_new_wind_length =", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthNotEqualTo(Integer value) {
            addCriterion("night_new_wind_length <>", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthGreaterThan(Integer value) {
            addCriterion("night_new_wind_length >", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_new_wind_length >=", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthLessThan(Integer value) {
            addCriterion("night_new_wind_length <", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthLessThanOrEqualTo(Integer value) {
            addCriterion("night_new_wind_length <=", value, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthIn(List<Integer> values) {
            addCriterion("night_new_wind_length in", values, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthNotIn(List<Integer> values) {
            addCriterion("night_new_wind_length not in", values, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthBetween(Integer value1, Integer value2) {
            addCriterion("night_new_wind_length between", value1, value2, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("night_new_wind_length not between", value1, value2, "nightNewWindLength");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeIsNull() {
            addCriterion("night_new_wind_time is null");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeIsNotNull() {
            addCriterion("night_new_wind_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeEqualTo(Integer value) {
            addCriterion("night_new_wind_time =", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeNotEqualTo(Integer value) {
            addCriterion("night_new_wind_time <>", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeGreaterThan(Integer value) {
            addCriterion("night_new_wind_time >", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_new_wind_time >=", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeLessThan(Integer value) {
            addCriterion("night_new_wind_time <", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeLessThanOrEqualTo(Integer value) {
            addCriterion("night_new_wind_time <=", value, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeIn(List<Integer> values) {
            addCriterion("night_new_wind_time in", values, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeNotIn(List<Integer> values) {
            addCriterion("night_new_wind_time not in", values, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeBetween(Integer value1, Integer value2) {
            addCriterion("night_new_wind_time between", value1, value2, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightNewWindTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("night_new_wind_time not between", value1, value2, "nightNewWindTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeIsNull() {
            addCriterion("night_feed_bg_time is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeIsNotNull() {
            addCriterion("night_feed_bg_time is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeEqualTo(Integer value) {
            addCriterion("night_feed_bg_time =", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeNotEqualTo(Integer value) {
            addCriterion("night_feed_bg_time <>", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeGreaterThan(Integer value) {
            addCriterion("night_feed_bg_time >", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_time >=", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeLessThan(Integer value) {
            addCriterion("night_feed_bg_time <", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_time <=", value, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeIn(List<Integer> values) {
            addCriterion("night_feed_bg_time in", values, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeNotIn(List<Integer> values) {
            addCriterion("night_feed_bg_time not in", values, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_time between", value1, value2, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_time not between", value1, value2, "nightFeedBgTime");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthIsNull() {
            addCriterion("night_feed_bg_length is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthIsNotNull() {
            addCriterion("night_feed_bg_length is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthEqualTo(Integer value) {
            addCriterion("night_feed_bg_length =", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthNotEqualTo(Integer value) {
            addCriterion("night_feed_bg_length <>", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthGreaterThan(Integer value) {
            addCriterion("night_feed_bg_length >", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_length >=", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthLessThan(Integer value) {
            addCriterion("night_feed_bg_length <", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_length <=", value, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthIn(List<Integer> values) {
            addCriterion("night_feed_bg_length in", values, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthNotIn(List<Integer> values) {
            addCriterion("night_feed_bg_length not in", values, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_length between", value1, value2, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_length not between", value1, value2, "nightFeedBgLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthIsNull() {
            addCriterion("night_feed_water_length is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthIsNotNull() {
            addCriterion("night_feed_water_length is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthEqualTo(Integer value) {
            addCriterion("night_feed_water_length =", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthNotEqualTo(Integer value) {
            addCriterion("night_feed_water_length <>", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthGreaterThan(Integer value) {
            addCriterion("night_feed_water_length >", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_length >=", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthLessThan(Integer value) {
            addCriterion("night_feed_water_length <", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_length <=", value, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthIn(List<Integer> values) {
            addCriterion("night_feed_water_length in", values, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthNotIn(List<Integer> values) {
            addCriterion("night_feed_water_length not in", values, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_length between", value1, value2, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_length not between", value1, value2, "nightFeedWaterLength");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleIsNull() {
            addCriterion("night_feed_water_cycle is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleIsNotNull() {
            addCriterion("night_feed_water_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleEqualTo(Integer value) {
            addCriterion("night_feed_water_cycle =", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleNotEqualTo(Integer value) {
            addCriterion("night_feed_water_cycle <>", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleGreaterThan(Integer value) {
            addCriterion("night_feed_water_cycle >", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_cycle >=", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleLessThan(Integer value) {
            addCriterion("night_feed_water_cycle <", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_cycle <=", value, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleIn(List<Integer> values) {
            addCriterion("night_feed_water_cycle in", values, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleNotIn(List<Integer> values) {
            addCriterion("night_feed_water_cycle not in", values, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_cycle between", value1, value2, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_cycle not between", value1, value2, "nightFeedWaterCycle");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeIsNull() {
            addCriterion("yy_before_time is null");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeIsNotNull() {
            addCriterion("yy_before_time is not null");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeEqualTo(Date value) {
            addCriterion("yy_before_time =", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotEqualTo(Date value) {
            addCriterion("yy_before_time <>", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeGreaterThan(Date value) {
            addCriterion("yy_before_time >", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yy_before_time >=", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeLessThan(Date value) {
            addCriterion("yy_before_time <", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeLessThanOrEqualTo(Date value) {
            addCriterion("yy_before_time <=", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeIn(List<Date> values) {
            addCriterion("yy_before_time in", values, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotIn(List<Date> values) {
            addCriterion("yy_before_time not in", values, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeBetween(Date value1, Date value2) {
            addCriterion("yy_before_time between", value1, value2, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotBetween(Date value1, Date value2) {
            addCriterion("yy_before_time not between", value1, value2, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeIsNull() {
            addCriterion("yy_next_time is null");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeIsNotNull() {
            addCriterion("yy_next_time is not null");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeEqualTo(Date value) {
            addCriterion("yy_next_time =", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotEqualTo(Date value) {
            addCriterion("yy_next_time <>", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeGreaterThan(Date value) {
            addCriterion("yy_next_time >", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("yy_next_time >=", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeLessThan(Date value) {
            addCriterion("yy_next_time <", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeLessThanOrEqualTo(Date value) {
            addCriterion("yy_next_time <=", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeIn(List<Date> values) {
            addCriterion("yy_next_time in", values, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotIn(List<Date> values) {
            addCriterion("yy_next_time not in", values, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeBetween(Date value1, Date value2) {
            addCriterion("yy_next_time between", value1, value2, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotBetween(Date value1, Date value2) {
            addCriterion("yy_next_time not between", value1, value2, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyPTime1IsNull() {
            addCriterion("yy_p_time_1 is null");
            return (Criteria) this;
        }

        public Criteria andYyPTime1IsNotNull() {
            addCriterion("yy_p_time_1 is not null");
            return (Criteria) this;
        }

        public Criteria andYyPTime1EqualTo(Integer value) {
            addCriterion("yy_p_time_1 =", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1NotEqualTo(Integer value) {
            addCriterion("yy_p_time_1 <>", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1GreaterThan(Integer value) {
            addCriterion("yy_p_time_1 >", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1GreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_1 >=", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1LessThan(Integer value) {
            addCriterion("yy_p_time_1 <", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1LessThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_1 <=", value, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1In(List<Integer> values) {
            addCriterion("yy_p_time_1 in", values, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1NotIn(List<Integer> values) {
            addCriterion("yy_p_time_1 not in", values, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1Between(Integer value1, Integer value2) {
            addCriterion("yy_p_time_1 between", value1, value2, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime1NotBetween(Integer value1, Integer value2) {
            addCriterion("yy_p_time_1 not between", value1, value2, "yyPTime1");
            return (Criteria) this;
        }

        public Criteria andYyPTime2IsNull() {
            addCriterion("yy_p_time_2 is null");
            return (Criteria) this;
        }

        public Criteria andYyPTime2IsNotNull() {
            addCriterion("yy_p_time_2 is not null");
            return (Criteria) this;
        }

        public Criteria andYyPTime2EqualTo(Integer value) {
            addCriterion("yy_p_time_2 =", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2NotEqualTo(Integer value) {
            addCriterion("yy_p_time_2 <>", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2GreaterThan(Integer value) {
            addCriterion("yy_p_time_2 >", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2GreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_2 >=", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2LessThan(Integer value) {
            addCriterion("yy_p_time_2 <", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2LessThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_2 <=", value, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2In(List<Integer> values) {
            addCriterion("yy_p_time_2 in", values, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2NotIn(List<Integer> values) {
            addCriterion("yy_p_time_2 not in", values, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2Between(Integer value1, Integer value2) {
            addCriterion("yy_p_time_2 between", value1, value2, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime2NotBetween(Integer value1, Integer value2) {
            addCriterion("yy_p_time_2 not between", value1, value2, "yyPTime2");
            return (Criteria) this;
        }

        public Criteria andYyPTime3IsNull() {
            addCriterion("yy_p_time_3 is null");
            return (Criteria) this;
        }

        public Criteria andYyPTime3IsNotNull() {
            addCriterion("yy_p_time_3 is not null");
            return (Criteria) this;
        }

        public Criteria andYyPTime3EqualTo(Integer value) {
            addCriterion("yy_p_time_3 =", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3NotEqualTo(Integer value) {
            addCriterion("yy_p_time_3 <>", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3GreaterThan(Integer value) {
            addCriterion("yy_p_time_3 >", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3GreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_3 >=", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3LessThan(Integer value) {
            addCriterion("yy_p_time_3 <", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3LessThanOrEqualTo(Integer value) {
            addCriterion("yy_p_time_3 <=", value, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3In(List<Integer> values) {
            addCriterion("yy_p_time_3 in", values, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3NotIn(List<Integer> values) {
            addCriterion("yy_p_time_3 not in", values, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3Between(Integer value1, Integer value2) {
            addCriterion("yy_p_time_3 between", value1, value2, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyPTime3NotBetween(Integer value1, Integer value2) {
            addCriterion("yy_p_time_3 not between", value1, value2, "yyPTime3");
            return (Criteria) this;
        }

        public Criteria andYyCTimeIsNull() {
            addCriterion("yy_c_time is null");
            return (Criteria) this;
        }

        public Criteria andYyCTimeIsNotNull() {
            addCriterion("yy_c_time is not null");
            return (Criteria) this;
        }

        public Criteria andYyCTimeEqualTo(Integer value) {
            addCriterion("yy_c_time =", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeNotEqualTo(Integer value) {
            addCriterion("yy_c_time <>", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeGreaterThan(Integer value) {
            addCriterion("yy_c_time >", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_c_time >=", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeLessThan(Integer value) {
            addCriterion("yy_c_time <", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeLessThanOrEqualTo(Integer value) {
            addCriterion("yy_c_time <=", value, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeIn(List<Integer> values) {
            addCriterion("yy_c_time in", values, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeNotIn(List<Integer> values) {
            addCriterion("yy_c_time not in", values, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeBetween(Integer value1, Integer value2) {
            addCriterion("yy_c_time between", value1, value2, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyCTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("yy_c_time not between", value1, value2, "yyCTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeIsNull() {
            addCriterion("yy_k_time is null");
            return (Criteria) this;
        }

        public Criteria andYyKTimeIsNotNull() {
            addCriterion("yy_k_time is not null");
            return (Criteria) this;
        }

        public Criteria andYyKTimeEqualTo(Integer value) {
            addCriterion("yy_k_time =", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeNotEqualTo(Integer value) {
            addCriterion("yy_k_time <>", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeGreaterThan(Integer value) {
            addCriterion("yy_k_time >", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_k_time >=", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeLessThan(Integer value) {
            addCriterion("yy_k_time <", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeLessThanOrEqualTo(Integer value) {
            addCriterion("yy_k_time <=", value, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeIn(List<Integer> values) {
            addCriterion("yy_k_time in", values, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeNotIn(List<Integer> values) {
            addCriterion("yy_k_time not in", values, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeBetween(Integer value1, Integer value2) {
            addCriterion("yy_k_time between", value1, value2, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andYyKTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("yy_k_time not between", value1, value2, "yyKTime");
            return (Criteria) this;
        }

        public Criteria andCommIsNull() {
            addCriterion("comm is null");
            return (Criteria) this;
        }

        public Criteria andCommIsNotNull() {
            addCriterion("comm is not null");
            return (Criteria) this;
        }

        public Criteria andCommEqualTo(Integer value) {
            addCriterion("comm =", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotEqualTo(Integer value) {
            addCriterion("comm <>", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThan(Integer value) {
            addCriterion("comm >", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommGreaterThanOrEqualTo(Integer value) {
            addCriterion("comm >=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThan(Integer value) {
            addCriterion("comm <", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommLessThanOrEqualTo(Integer value) {
            addCriterion("comm <=", value, "comm");
            return (Criteria) this;
        }

        public Criteria andCommIn(List<Integer> values) {
            addCriterion("comm in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotIn(List<Integer> values) {
            addCriterion("comm not in", values, "comm");
            return (Criteria) this;
        }

        public Criteria andCommBetween(Integer value1, Integer value2) {
            addCriterion("comm between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andCommNotBetween(Integer value1, Integer value2) {
            addCriterion("comm not between", value1, value2, "comm");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andCyCycleIsNull() {
            addCriterion("cy_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCyCycleIsNotNull() {
            addCriterion("cy_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCyCycleEqualTo(Integer value) {
            addCriterion("cy_cycle =", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleNotEqualTo(Integer value) {
            addCriterion("cy_cycle <>", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleGreaterThan(Integer value) {
            addCriterion("cy_cycle >", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("cy_cycle >=", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleLessThan(Integer value) {
            addCriterion("cy_cycle <", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleLessThanOrEqualTo(Integer value) {
            addCriterion("cy_cycle <=", value, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleIn(List<Integer> values) {
            addCriterion("cy_cycle in", values, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleNotIn(List<Integer> values) {
            addCriterion("cy_cycle not in", values, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleBetween(Integer value1, Integer value2) {
            addCriterion("cy_cycle between", value1, value2, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andCyCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("cy_cycle not between", value1, value2, "cyCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleIsNull() {
            addCriterion("st_cycle is null");
            return (Criteria) this;
        }

        public Criteria andStCycleIsNotNull() {
            addCriterion("st_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andStCycleEqualTo(Integer value) {
            addCriterion("st_cycle =", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleNotEqualTo(Integer value) {
            addCriterion("st_cycle <>", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleGreaterThan(Integer value) {
            addCriterion("st_cycle >", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("st_cycle >=", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleLessThan(Integer value) {
            addCriterion("st_cycle <", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleLessThanOrEqualTo(Integer value) {
            addCriterion("st_cycle <=", value, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleIn(List<Integer> values) {
            addCriterion("st_cycle in", values, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleNotIn(List<Integer> values) {
            addCriterion("st_cycle not in", values, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleBetween(Integer value1, Integer value2) {
            addCriterion("st_cycle between", value1, value2, "stCycle");
            return (Criteria) this;
        }

        public Criteria andStCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("st_cycle not between", value1, value2, "stCycle");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNull() {
            addCriterion("out_time is null");
            return (Criteria) this;
        }

        public Criteria andOutTimeIsNotNull() {
            addCriterion("out_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutTimeEqualTo(Date value) {
            addCriterion("out_time =", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotEqualTo(Date value) {
            addCriterion("out_time <>", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThan(Date value) {
            addCriterion("out_time >", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("out_time >=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThan(Date value) {
            addCriterion("out_time <", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeLessThanOrEqualTo(Date value) {
            addCriterion("out_time <=", value, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeIn(List<Date> values) {
            addCriterion("out_time in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotIn(List<Date> values) {
            addCriterion("out_time not in", values, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeBetween(Date value1, Date value2) {
            addCriterion("out_time between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andOutTimeNotBetween(Date value1, Date value2) {
            addCriterion("out_time not between", value1, value2, "outTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNull() {
            addCriterion("in_time is null");
            return (Criteria) this;
        }

        public Criteria andInTimeIsNotNull() {
            addCriterion("in_time is not null");
            return (Criteria) this;
        }

        public Criteria andInTimeEqualTo(Date value) {
            addCriterion("in_time =", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotEqualTo(Date value) {
            addCriterion("in_time <>", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThan(Date value) {
            addCriterion("in_time >", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("in_time >=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThan(Date value) {
            addCriterion("in_time <", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeLessThanOrEqualTo(Date value) {
            addCriterion("in_time <=", value, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeIn(List<Date> values) {
            addCriterion("in_time in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotIn(List<Date> values) {
            addCriterion("in_time not in", values, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeBetween(Date value1, Date value2) {
            addCriterion("in_time between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andInTimeNotBetween(Date value1, Date value2) {
            addCriterion("in_time not between", value1, value2, "inTime");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModIsNull() {
            addCriterion("time_lenght_mod is null");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModIsNotNull() {
            addCriterion("time_lenght_mod is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModEqualTo(Integer value) {
            addCriterion("time_lenght_mod =", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModNotEqualTo(Integer value) {
            addCriterion("time_lenght_mod <>", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModGreaterThan(Integer value) {
            addCriterion("time_lenght_mod >", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_lenght_mod >=", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModLessThan(Integer value) {
            addCriterion("time_lenght_mod <", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModLessThanOrEqualTo(Integer value) {
            addCriterion("time_lenght_mod <=", value, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModIn(List<Integer> values) {
            addCriterion("time_lenght_mod in", values, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModNotIn(List<Integer> values) {
            addCriterion("time_lenght_mod not in", values, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModBetween(Integer value1, Integer value2) {
            addCriterion("time_lenght_mod between", value1, value2, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andTimeLenghtModNotBetween(Integer value1, Integer value2) {
            addCriterion("time_lenght_mod not between", value1, value2, "timeLenghtMod");
            return (Criteria) this;
        }

        public Criteria andDateLengthIsNull() {
            addCriterion("date_length is null");
            return (Criteria) this;
        }

        public Criteria andDateLengthIsNotNull() {
            addCriterion("date_length is not null");
            return (Criteria) this;
        }

        public Criteria andDateLengthEqualTo(Integer value) {
            addCriterion("date_length =", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthNotEqualTo(Integer value) {
            addCriterion("date_length <>", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthGreaterThan(Integer value) {
            addCriterion("date_length >", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_length >=", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthLessThan(Integer value) {
            addCriterion("date_length <", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthLessThanOrEqualTo(Integer value) {
            addCriterion("date_length <=", value, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthIn(List<Integer> values) {
            addCriterion("date_length in", values, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthNotIn(List<Integer> values) {
            addCriterion("date_length not in", values, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthBetween(Integer value1, Integer value2) {
            addCriterion("date_length between", value1, value2, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("date_length not between", value1, value2, "dateLength");
            return (Criteria) this;
        }

        public Criteria andDateYiIsNull() {
            addCriterion("date_yi is null");
            return (Criteria) this;
        }

        public Criteria andDateYiIsNotNull() {
            addCriterion("date_yi is not null");
            return (Criteria) this;
        }

        public Criteria andDateYiEqualTo(Integer value) {
            addCriterion("date_yi =", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiNotEqualTo(Integer value) {
            addCriterion("date_yi <>", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiGreaterThan(Integer value) {
            addCriterion("date_yi >", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiGreaterThanOrEqualTo(Integer value) {
            addCriterion("date_yi >=", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiLessThan(Integer value) {
            addCriterion("date_yi <", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiLessThanOrEqualTo(Integer value) {
            addCriterion("date_yi <=", value, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiIn(List<Integer> values) {
            addCriterion("date_yi in", values, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiNotIn(List<Integer> values) {
            addCriterion("date_yi not in", values, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiBetween(Integer value1, Integer value2) {
            addCriterion("date_yi between", value1, value2, "dateYi");
            return (Criteria) this;
        }

        public Criteria andDateYiNotBetween(Integer value1, Integer value2) {
            addCriterion("date_yi not between", value1, value2, "dateYi");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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
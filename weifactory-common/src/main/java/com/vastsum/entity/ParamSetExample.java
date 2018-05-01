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

        public Criteria andDaySetEqualTo(String value) {
            addCriterion("day_set =", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotEqualTo(String value) {
            addCriterion("day_set <>", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetGreaterThan(String value) {
            addCriterion("day_set >", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetGreaterThanOrEqualTo(String value) {
            addCriterion("day_set >=", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetLessThan(String value) {
            addCriterion("day_set <", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetLessThanOrEqualTo(String value) {
            addCriterion("day_set <=", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetLike(String value) {
            addCriterion("day_set like", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotLike(String value) {
            addCriterion("day_set not like", value, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetIn(List<String> values) {
            addCriterion("day_set in", values, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotIn(List<String> values) {
            addCriterion("day_set not in", values, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetBetween(String value1, String value2) {
            addCriterion("day_set between", value1, value2, "daySet");
            return (Criteria) this;
        }

        public Criteria andDaySetNotBetween(String value1, String value2) {
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

        public Criteria andDayStartTimeEqualTo(String value) {
            addCriterion("day_start_time =", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotEqualTo(String value) {
            addCriterion("day_start_time <>", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThan(String value) {
            addCriterion("day_start_time >", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("day_start_time >=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThan(String value) {
            addCriterion("day_start_time <", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLessThanOrEqualTo(String value) {
            addCriterion("day_start_time <=", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeLike(String value) {
            addCriterion("day_start_time like", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotLike(String value) {
            addCriterion("day_start_time not like", value, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeIn(List<String> values) {
            addCriterion("day_start_time in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotIn(List<String> values) {
            addCriterion("day_start_time not in", values, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeBetween(String value1, String value2) {
            addCriterion("day_start_time between", value1, value2, "dayStartTime");
            return (Criteria) this;
        }

        public Criteria andDayStartTimeNotBetween(String value1, String value2) {
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

        public Criteria andDayEndTimeEqualTo(String value) {
            addCriterion("day_end_time =", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotEqualTo(String value) {
            addCriterion("day_end_time <>", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeGreaterThan(String value) {
            addCriterion("day_end_time >", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("day_end_time >=", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeLessThan(String value) {
            addCriterion("day_end_time <", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeLessThanOrEqualTo(String value) {
            addCriterion("day_end_time <=", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeLike(String value) {
            addCriterion("day_end_time like", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotLike(String value) {
            addCriterion("day_end_time not like", value, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeIn(List<String> values) {
            addCriterion("day_end_time in", values, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotIn(List<String> values) {
            addCriterion("day_end_time not in", values, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeBetween(String value1, String value2) {
            addCriterion("day_end_time between", value1, value2, "dayEndTime");
            return (Criteria) this;
        }

        public Criteria andDayEndTimeNotBetween(String value1, String value2) {
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

        public Criteria andNightStartTimeEqualTo(String value) {
            addCriterion("night_start_time =", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotEqualTo(String value) {
            addCriterion("night_start_time <>", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThan(String value) {
            addCriterion("night_start_time >", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("night_start_time >=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThan(String value) {
            addCriterion("night_start_time <", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLessThanOrEqualTo(String value) {
            addCriterion("night_start_time <=", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeLike(String value) {
            addCriterion("night_start_time like", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotLike(String value) {
            addCriterion("night_start_time not like", value, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeIn(List<String> values) {
            addCriterion("night_start_time in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotIn(List<String> values) {
            addCriterion("night_start_time not in", values, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeBetween(String value1, String value2) {
            addCriterion("night_start_time between", value1, value2, "nightStartTime");
            return (Criteria) this;
        }

        public Criteria andNightStartTimeNotBetween(String value1, String value2) {
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

        public Criteria andNightEndTimeEqualTo(String value) {
            addCriterion("night_end_time =", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotEqualTo(String value) {
            addCriterion("night_end_time <>", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeGreaterThan(String value) {
            addCriterion("night_end_time >", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("night_end_time >=", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeLessThan(String value) {
            addCriterion("night_end_time <", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeLessThanOrEqualTo(String value) {
            addCriterion("night_end_time <=", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeLike(String value) {
            addCriterion("night_end_time like", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotLike(String value) {
            addCriterion("night_end_time not like", value, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeIn(List<String> values) {
            addCriterion("night_end_time in", values, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotIn(List<String> values) {
            addCriterion("night_end_time not in", values, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeBetween(String value1, String value2) {
            addCriterion("night_end_time between", value1, value2, "nightEndTime");
            return (Criteria) this;
        }

        public Criteria andNightEndTimeNotBetween(String value1, String value2) {
            addCriterion("night_end_time not between", value1, value2, "nightEndTime");
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

        public Criteria andFeedNameIsNull() {
            addCriterion("feed_name is null");
            return (Criteria) this;
        }

        public Criteria andFeedNameIsNotNull() {
            addCriterion("feed_name is not null");
            return (Criteria) this;
        }

        public Criteria andFeedNameEqualTo(String value) {
            addCriterion("feed_name =", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameNotEqualTo(String value) {
            addCriterion("feed_name <>", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameGreaterThan(String value) {
            addCriterion("feed_name >", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameGreaterThanOrEqualTo(String value) {
            addCriterion("feed_name >=", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameLessThan(String value) {
            addCriterion("feed_name <", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameLessThanOrEqualTo(String value) {
            addCriterion("feed_name <=", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameLike(String value) {
            addCriterion("feed_name like", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameNotLike(String value) {
            addCriterion("feed_name not like", value, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameIn(List<String> values) {
            addCriterion("feed_name in", values, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameNotIn(List<String> values) {
            addCriterion("feed_name not in", values, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameBetween(String value1, String value2) {
            addCriterion("feed_name between", value1, value2, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedNameNotBetween(String value1, String value2) {
            addCriterion("feed_name not between", value1, value2, "feedName");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeIsNull() {
            addCriterion("feed_planting_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeIsNotNull() {
            addCriterion("feed_planting_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeEqualTo(Date value) {
            addCriterion("feed_planting_time =", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeNotEqualTo(Date value) {
            addCriterion("feed_planting_time <>", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeGreaterThan(Date value) {
            addCriterion("feed_planting_time >", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("feed_planting_time >=", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeLessThan(Date value) {
            addCriterion("feed_planting_time <", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeLessThanOrEqualTo(Date value) {
            addCriterion("feed_planting_time <=", value, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeIn(List<Date> values) {
            addCriterion("feed_planting_time in", values, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeNotIn(List<Date> values) {
            addCriterion("feed_planting_time not in", values, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeBetween(Date value1, Date value2) {
            addCriterion("feed_planting_time between", value1, value2, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedPlantingTimeNotBetween(Date value1, Date value2) {
            addCriterion("feed_planting_time not between", value1, value2, "feedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeIsNull() {
            addCriterion("feed_recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeIsNotNull() {
            addCriterion("feed_recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeEqualTo(Date value) {
            addCriterion("feed_recovery_time =", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeNotEqualTo(Date value) {
            addCriterion("feed_recovery_time <>", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeGreaterThan(Date value) {
            addCriterion("feed_recovery_time >", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("feed_recovery_time >=", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeLessThan(Date value) {
            addCriterion("feed_recovery_time <", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("feed_recovery_time <=", value, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeIn(List<Date> values) {
            addCriterion("feed_recovery_time in", values, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeNotIn(List<Date> values) {
            addCriterion("feed_recovery_time not in", values, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeBetween(Date value1, Date value2) {
            addCriterion("feed_recovery_time between", value1, value2, "feedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andFeedRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("feed_recovery_time not between", value1, value2, "feedRecoveryTime");
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

        public Criteria andBatchNo1IsNull() {
            addCriterion("batch_no_1 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNo1IsNotNull() {
            addCriterion("batch_no_1 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNo1EqualTo(String value) {
            addCriterion("batch_no_1 =", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1NotEqualTo(String value) {
            addCriterion("batch_no_1 <>", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1GreaterThan(String value) {
            addCriterion("batch_no_1 >", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1GreaterThanOrEqualTo(String value) {
            addCriterion("batch_no_1 >=", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1LessThan(String value) {
            addCriterion("batch_no_1 <", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1LessThanOrEqualTo(String value) {
            addCriterion("batch_no_1 <=", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1Like(String value) {
            addCriterion("batch_no_1 like", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1NotLike(String value) {
            addCriterion("batch_no_1 not like", value, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1In(List<String> values) {
            addCriterion("batch_no_1 in", values, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1NotIn(List<String> values) {
            addCriterion("batch_no_1 not in", values, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1Between(String value1, String value2) {
            addCriterion("batch_no_1 between", value1, value2, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andBatchNo1NotBetween(String value1, String value2) {
            addCriterion("batch_no_1 not between", value1, value2, "batchNo1");
            return (Criteria) this;
        }

        public Criteria andPlantName1IsNull() {
            addCriterion("plant_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantName1IsNotNull() {
            addCriterion("plant_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantName1EqualTo(String value) {
            addCriterion("plant_name_1 =", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1NotEqualTo(String value) {
            addCriterion("plant_name_1 <>", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1GreaterThan(String value) {
            addCriterion("plant_name_1 >", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1GreaterThanOrEqualTo(String value) {
            addCriterion("plant_name_1 >=", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1LessThan(String value) {
            addCriterion("plant_name_1 <", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1LessThanOrEqualTo(String value) {
            addCriterion("plant_name_1 <=", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1Like(String value) {
            addCriterion("plant_name_1 like", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1NotLike(String value) {
            addCriterion("plant_name_1 not like", value, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1In(List<String> values) {
            addCriterion("plant_name_1 in", values, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1NotIn(List<String> values) {
            addCriterion("plant_name_1 not in", values, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1Between(String value1, String value2) {
            addCriterion("plant_name_1 between", value1, value2, "plantName1");
            return (Criteria) this;
        }

        public Criteria andPlantName1NotBetween(String value1, String value2) {
            addCriterion("plant_name_1 not between", value1, value2, "plantName1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1IsNull() {
            addCriterion("growth_pattern_1 is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1IsNotNull() {
            addCriterion("growth_pattern_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1EqualTo(String value) {
            addCriterion("growth_pattern_1 =", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1NotEqualTo(String value) {
            addCriterion("growth_pattern_1 <>", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1GreaterThan(String value) {
            addCriterion("growth_pattern_1 >", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1GreaterThanOrEqualTo(String value) {
            addCriterion("growth_pattern_1 >=", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1LessThan(String value) {
            addCriterion("growth_pattern_1 <", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1LessThanOrEqualTo(String value) {
            addCriterion("growth_pattern_1 <=", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1Like(String value) {
            addCriterion("growth_pattern_1 like", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1NotLike(String value) {
            addCriterion("growth_pattern_1 not like", value, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1In(List<String> values) {
            addCriterion("growth_pattern_1 in", values, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1NotIn(List<String> values) {
            addCriterion("growth_pattern_1 not in", values, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1Between(String value1, String value2) {
            addCriterion("growth_pattern_1 between", value1, value2, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern1NotBetween(String value1, String value2) {
            addCriterion("growth_pattern_1 not between", value1, value2, "growthPattern1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1IsNull() {
            addCriterion("day_temperature_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1IsNotNull() {
            addCriterion("day_temperature_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1EqualTo(String value) {
            addCriterion("day_temperature_1 =", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1NotEqualTo(String value) {
            addCriterion("day_temperature_1 <>", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1GreaterThan(String value) {
            addCriterion("day_temperature_1 >", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1GreaterThanOrEqualTo(String value) {
            addCriterion("day_temperature_1 >=", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1LessThan(String value) {
            addCriterion("day_temperature_1 <", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1LessThanOrEqualTo(String value) {
            addCriterion("day_temperature_1 <=", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1Like(String value) {
            addCriterion("day_temperature_1 like", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1NotLike(String value) {
            addCriterion("day_temperature_1 not like", value, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1In(List<String> values) {
            addCriterion("day_temperature_1 in", values, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1NotIn(List<String> values) {
            addCriterion("day_temperature_1 not in", values, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1Between(String value1, String value2) {
            addCriterion("day_temperature_1 between", value1, value2, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayTemperature1NotBetween(String value1, String value2) {
            addCriterion("day_temperature_1 not between", value1, value2, "dayTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1IsNull() {
            addCriterion("night_temperature_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1IsNotNull() {
            addCriterion("night_temperature_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1EqualTo(String value) {
            addCriterion("night_temperature_1 =", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1NotEqualTo(String value) {
            addCriterion("night_temperature_1 <>", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1GreaterThan(String value) {
            addCriterion("night_temperature_1 >", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1GreaterThanOrEqualTo(String value) {
            addCriterion("night_temperature_1 >=", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1LessThan(String value) {
            addCriterion("night_temperature_1 <", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1LessThanOrEqualTo(String value) {
            addCriterion("night_temperature_1 <=", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1Like(String value) {
            addCriterion("night_temperature_1 like", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1NotLike(String value) {
            addCriterion("night_temperature_1 not like", value, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1In(List<String> values) {
            addCriterion("night_temperature_1 in", values, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1NotIn(List<String> values) {
            addCriterion("night_temperature_1 not in", values, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1Between(String value1, String value2) {
            addCriterion("night_temperature_1 between", value1, value2, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andNightTemperature1NotBetween(String value1, String value2) {
            addCriterion("night_temperature_1 not between", value1, value2, "nightTemperature1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1IsNull() {
            addCriterion("day_humidity_1 is null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1IsNotNull() {
            addCriterion("day_humidity_1 is not null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1EqualTo(String value) {
            addCriterion("day_humidity_1 =", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1NotEqualTo(String value) {
            addCriterion("day_humidity_1 <>", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1GreaterThan(String value) {
            addCriterion("day_humidity_1 >", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1GreaterThanOrEqualTo(String value) {
            addCriterion("day_humidity_1 >=", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1LessThan(String value) {
            addCriterion("day_humidity_1 <", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1LessThanOrEqualTo(String value) {
            addCriterion("day_humidity_1 <=", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1Like(String value) {
            addCriterion("day_humidity_1 like", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1NotLike(String value) {
            addCriterion("day_humidity_1 not like", value, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1In(List<String> values) {
            addCriterion("day_humidity_1 in", values, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1NotIn(List<String> values) {
            addCriterion("day_humidity_1 not in", values, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1Between(String value1, String value2) {
            addCriterion("day_humidity_1 between", value1, value2, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andDayHumidity1NotBetween(String value1, String value2) {
            addCriterion("day_humidity_1 not between", value1, value2, "dayHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1IsNull() {
            addCriterion("night_humidity_1 is null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1IsNotNull() {
            addCriterion("night_humidity_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1EqualTo(String value) {
            addCriterion("night_humidity_1 =", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1NotEqualTo(String value) {
            addCriterion("night_humidity_1 <>", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1GreaterThan(String value) {
            addCriterion("night_humidity_1 >", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1GreaterThanOrEqualTo(String value) {
            addCriterion("night_humidity_1 >=", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1LessThan(String value) {
            addCriterion("night_humidity_1 <", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1LessThanOrEqualTo(String value) {
            addCriterion("night_humidity_1 <=", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1Like(String value) {
            addCriterion("night_humidity_1 like", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1NotLike(String value) {
            addCriterion("night_humidity_1 not like", value, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1In(List<String> values) {
            addCriterion("night_humidity_1 in", values, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1NotIn(List<String> values) {
            addCriterion("night_humidity_1 not in", values, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1Between(String value1, String value2) {
            addCriterion("night_humidity_1 between", value1, value2, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andNightHumidity1NotBetween(String value1, String value2) {
            addCriterion("night_humidity_1 not between", value1, value2, "nightHumidity1");
            return (Criteria) this;
        }

        public Criteria andBatchNo2IsNull() {
            addCriterion("batch_no_2 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNo2IsNotNull() {
            addCriterion("batch_no_2 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNo2EqualTo(String value) {
            addCriterion("batch_no_2 =", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2NotEqualTo(String value) {
            addCriterion("batch_no_2 <>", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2GreaterThan(String value) {
            addCriterion("batch_no_2 >", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2GreaterThanOrEqualTo(String value) {
            addCriterion("batch_no_2 >=", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2LessThan(String value) {
            addCriterion("batch_no_2 <", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2LessThanOrEqualTo(String value) {
            addCriterion("batch_no_2 <=", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2Like(String value) {
            addCriterion("batch_no_2 like", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2NotLike(String value) {
            addCriterion("batch_no_2 not like", value, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2In(List<String> values) {
            addCriterion("batch_no_2 in", values, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2NotIn(List<String> values) {
            addCriterion("batch_no_2 not in", values, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2Between(String value1, String value2) {
            addCriterion("batch_no_2 between", value1, value2, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andBatchNo2NotBetween(String value1, String value2) {
            addCriterion("batch_no_2 not between", value1, value2, "batchNo2");
            return (Criteria) this;
        }

        public Criteria andPlantName2IsNull() {
            addCriterion("plant_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantName2IsNotNull() {
            addCriterion("plant_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantName2EqualTo(String value) {
            addCriterion("plant_name_2 =", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2NotEqualTo(String value) {
            addCriterion("plant_name_2 <>", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2GreaterThan(String value) {
            addCriterion("plant_name_2 >", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2GreaterThanOrEqualTo(String value) {
            addCriterion("plant_name_2 >=", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2LessThan(String value) {
            addCriterion("plant_name_2 <", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2LessThanOrEqualTo(String value) {
            addCriterion("plant_name_2 <=", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2Like(String value) {
            addCriterion("plant_name_2 like", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2NotLike(String value) {
            addCriterion("plant_name_2 not like", value, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2In(List<String> values) {
            addCriterion("plant_name_2 in", values, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2NotIn(List<String> values) {
            addCriterion("plant_name_2 not in", values, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2Between(String value1, String value2) {
            addCriterion("plant_name_2 between", value1, value2, "plantName2");
            return (Criteria) this;
        }

        public Criteria andPlantName2NotBetween(String value1, String value2) {
            addCriterion("plant_name_2 not between", value1, value2, "plantName2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2IsNull() {
            addCriterion("growth_pattern_2 is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2IsNotNull() {
            addCriterion("growth_pattern_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2EqualTo(String value) {
            addCriterion("growth_pattern_2 =", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2NotEqualTo(String value) {
            addCriterion("growth_pattern_2 <>", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2GreaterThan(String value) {
            addCriterion("growth_pattern_2 >", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2GreaterThanOrEqualTo(String value) {
            addCriterion("growth_pattern_2 >=", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2LessThan(String value) {
            addCriterion("growth_pattern_2 <", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2LessThanOrEqualTo(String value) {
            addCriterion("growth_pattern_2 <=", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2Like(String value) {
            addCriterion("growth_pattern_2 like", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2NotLike(String value) {
            addCriterion("growth_pattern_2 not like", value, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2In(List<String> values) {
            addCriterion("growth_pattern_2 in", values, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2NotIn(List<String> values) {
            addCriterion("growth_pattern_2 not in", values, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2Between(String value1, String value2) {
            addCriterion("growth_pattern_2 between", value1, value2, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern2NotBetween(String value1, String value2) {
            addCriterion("growth_pattern_2 not between", value1, value2, "growthPattern2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2IsNull() {
            addCriterion("day_temperature_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2IsNotNull() {
            addCriterion("day_temperature_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2EqualTo(String value) {
            addCriterion("day_temperature_2 =", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2NotEqualTo(String value) {
            addCriterion("day_temperature_2 <>", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2GreaterThan(String value) {
            addCriterion("day_temperature_2 >", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2GreaterThanOrEqualTo(String value) {
            addCriterion("day_temperature_2 >=", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2LessThan(String value) {
            addCriterion("day_temperature_2 <", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2LessThanOrEqualTo(String value) {
            addCriterion("day_temperature_2 <=", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2Like(String value) {
            addCriterion("day_temperature_2 like", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2NotLike(String value) {
            addCriterion("day_temperature_2 not like", value, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2In(List<String> values) {
            addCriterion("day_temperature_2 in", values, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2NotIn(List<String> values) {
            addCriterion("day_temperature_2 not in", values, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2Between(String value1, String value2) {
            addCriterion("day_temperature_2 between", value1, value2, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayTemperature2NotBetween(String value1, String value2) {
            addCriterion("day_temperature_2 not between", value1, value2, "dayTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2IsNull() {
            addCriterion("night_temperature_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2IsNotNull() {
            addCriterion("night_temperature_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2EqualTo(String value) {
            addCriterion("night_temperature_2 =", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2NotEqualTo(String value) {
            addCriterion("night_temperature_2 <>", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2GreaterThan(String value) {
            addCriterion("night_temperature_2 >", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2GreaterThanOrEqualTo(String value) {
            addCriterion("night_temperature_2 >=", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2LessThan(String value) {
            addCriterion("night_temperature_2 <", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2LessThanOrEqualTo(String value) {
            addCriterion("night_temperature_2 <=", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2Like(String value) {
            addCriterion("night_temperature_2 like", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2NotLike(String value) {
            addCriterion("night_temperature_2 not like", value, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2In(List<String> values) {
            addCriterion("night_temperature_2 in", values, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2NotIn(List<String> values) {
            addCriterion("night_temperature_2 not in", values, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2Between(String value1, String value2) {
            addCriterion("night_temperature_2 between", value1, value2, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andNightTemperature2NotBetween(String value1, String value2) {
            addCriterion("night_temperature_2 not between", value1, value2, "nightTemperature2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2IsNull() {
            addCriterion("day_humidity_2 is null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2IsNotNull() {
            addCriterion("day_humidity_2 is not null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2EqualTo(String value) {
            addCriterion("day_humidity_2 =", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2NotEqualTo(String value) {
            addCriterion("day_humidity_2 <>", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2GreaterThan(String value) {
            addCriterion("day_humidity_2 >", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2GreaterThanOrEqualTo(String value) {
            addCriterion("day_humidity_2 >=", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2LessThan(String value) {
            addCriterion("day_humidity_2 <", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2LessThanOrEqualTo(String value) {
            addCriterion("day_humidity_2 <=", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2Like(String value) {
            addCriterion("day_humidity_2 like", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2NotLike(String value) {
            addCriterion("day_humidity_2 not like", value, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2In(List<String> values) {
            addCriterion("day_humidity_2 in", values, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2NotIn(List<String> values) {
            addCriterion("day_humidity_2 not in", values, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2Between(String value1, String value2) {
            addCriterion("day_humidity_2 between", value1, value2, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andDayHumidity2NotBetween(String value1, String value2) {
            addCriterion("day_humidity_2 not between", value1, value2, "dayHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2IsNull() {
            addCriterion("night_humidity_2 is null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2IsNotNull() {
            addCriterion("night_humidity_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2EqualTo(String value) {
            addCriterion("night_humidity_2 =", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2NotEqualTo(String value) {
            addCriterion("night_humidity_2 <>", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2GreaterThan(String value) {
            addCriterion("night_humidity_2 >", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2GreaterThanOrEqualTo(String value) {
            addCriterion("night_humidity_2 >=", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2LessThan(String value) {
            addCriterion("night_humidity_2 <", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2LessThanOrEqualTo(String value) {
            addCriterion("night_humidity_2 <=", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2Like(String value) {
            addCriterion("night_humidity_2 like", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2NotLike(String value) {
            addCriterion("night_humidity_2 not like", value, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2In(List<String> values) {
            addCriterion("night_humidity_2 in", values, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2NotIn(List<String> values) {
            addCriterion("night_humidity_2 not in", values, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2Between(String value1, String value2) {
            addCriterion("night_humidity_2 between", value1, value2, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andNightHumidity2NotBetween(String value1, String value2) {
            addCriterion("night_humidity_2 not between", value1, value2, "nightHumidity2");
            return (Criteria) this;
        }

        public Criteria andBatchNo3IsNull() {
            addCriterion("batch_no_3 is null");
            return (Criteria) this;
        }

        public Criteria andBatchNo3IsNotNull() {
            addCriterion("batch_no_3 is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNo3EqualTo(String value) {
            addCriterion("batch_no_3 =", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3NotEqualTo(String value) {
            addCriterion("batch_no_3 <>", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3GreaterThan(String value) {
            addCriterion("batch_no_3 >", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3GreaterThanOrEqualTo(String value) {
            addCriterion("batch_no_3 >=", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3LessThan(String value) {
            addCriterion("batch_no_3 <", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3LessThanOrEqualTo(String value) {
            addCriterion("batch_no_3 <=", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3Like(String value) {
            addCriterion("batch_no_3 like", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3NotLike(String value) {
            addCriterion("batch_no_3 not like", value, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3In(List<String> values) {
            addCriterion("batch_no_3 in", values, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3NotIn(List<String> values) {
            addCriterion("batch_no_3 not in", values, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3Between(String value1, String value2) {
            addCriterion("batch_no_3 between", value1, value2, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andBatchNo3NotBetween(String value1, String value2) {
            addCriterion("batch_no_3 not between", value1, value2, "batchNo3");
            return (Criteria) this;
        }

        public Criteria andPlantName3IsNull() {
            addCriterion("plant_name_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantName3IsNotNull() {
            addCriterion("plant_name_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantName3EqualTo(String value) {
            addCriterion("plant_name_3 =", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3NotEqualTo(String value) {
            addCriterion("plant_name_3 <>", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3GreaterThan(String value) {
            addCriterion("plant_name_3 >", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3GreaterThanOrEqualTo(String value) {
            addCriterion("plant_name_3 >=", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3LessThan(String value) {
            addCriterion("plant_name_3 <", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3LessThanOrEqualTo(String value) {
            addCriterion("plant_name_3 <=", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3Like(String value) {
            addCriterion("plant_name_3 like", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3NotLike(String value) {
            addCriterion("plant_name_3 not like", value, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3In(List<String> values) {
            addCriterion("plant_name_3 in", values, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3NotIn(List<String> values) {
            addCriterion("plant_name_3 not in", values, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3Between(String value1, String value2) {
            addCriterion("plant_name_3 between", value1, value2, "plantName3");
            return (Criteria) this;
        }

        public Criteria andPlantName3NotBetween(String value1, String value2) {
            addCriterion("plant_name_3 not between", value1, value2, "plantName3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3IsNull() {
            addCriterion("growth_pattern_3 is null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3IsNotNull() {
            addCriterion("growth_pattern_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3EqualTo(String value) {
            addCriterion("growth_pattern_3 =", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3NotEqualTo(String value) {
            addCriterion("growth_pattern_3 <>", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3GreaterThan(String value) {
            addCriterion("growth_pattern_3 >", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3GreaterThanOrEqualTo(String value) {
            addCriterion("growth_pattern_3 >=", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3LessThan(String value) {
            addCriterion("growth_pattern_3 <", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3LessThanOrEqualTo(String value) {
            addCriterion("growth_pattern_3 <=", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3Like(String value) {
            addCriterion("growth_pattern_3 like", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3NotLike(String value) {
            addCriterion("growth_pattern_3 not like", value, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3In(List<String> values) {
            addCriterion("growth_pattern_3 in", values, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3NotIn(List<String> values) {
            addCriterion("growth_pattern_3 not in", values, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3Between(String value1, String value2) {
            addCriterion("growth_pattern_3 between", value1, value2, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andGrowthPattern3NotBetween(String value1, String value2) {
            addCriterion("growth_pattern_3 not between", value1, value2, "growthPattern3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3IsNull() {
            addCriterion("day_temperature_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3IsNotNull() {
            addCriterion("day_temperature_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3EqualTo(String value) {
            addCriterion("day_temperature_3 =", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3NotEqualTo(String value) {
            addCriterion("day_temperature_3 <>", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3GreaterThan(String value) {
            addCriterion("day_temperature_3 >", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3GreaterThanOrEqualTo(String value) {
            addCriterion("day_temperature_3 >=", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3LessThan(String value) {
            addCriterion("day_temperature_3 <", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3LessThanOrEqualTo(String value) {
            addCriterion("day_temperature_3 <=", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3Like(String value) {
            addCriterion("day_temperature_3 like", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3NotLike(String value) {
            addCriterion("day_temperature_3 not like", value, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3In(List<String> values) {
            addCriterion("day_temperature_3 in", values, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3NotIn(List<String> values) {
            addCriterion("day_temperature_3 not in", values, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3Between(String value1, String value2) {
            addCriterion("day_temperature_3 between", value1, value2, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayTemperature3NotBetween(String value1, String value2) {
            addCriterion("day_temperature_3 not between", value1, value2, "dayTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3IsNull() {
            addCriterion("night_temperature_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3IsNotNull() {
            addCriterion("night_temperature_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3EqualTo(String value) {
            addCriterion("night_temperature_3 =", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3NotEqualTo(String value) {
            addCriterion("night_temperature_3 <>", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3GreaterThan(String value) {
            addCriterion("night_temperature_3 >", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3GreaterThanOrEqualTo(String value) {
            addCriterion("night_temperature_3 >=", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3LessThan(String value) {
            addCriterion("night_temperature_3 <", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3LessThanOrEqualTo(String value) {
            addCriterion("night_temperature_3 <=", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3Like(String value) {
            addCriterion("night_temperature_3 like", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3NotLike(String value) {
            addCriterion("night_temperature_3 not like", value, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3In(List<String> values) {
            addCriterion("night_temperature_3 in", values, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3NotIn(List<String> values) {
            addCriterion("night_temperature_3 not in", values, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3Between(String value1, String value2) {
            addCriterion("night_temperature_3 between", value1, value2, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andNightTemperature3NotBetween(String value1, String value2) {
            addCriterion("night_temperature_3 not between", value1, value2, "nightTemperature3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3IsNull() {
            addCriterion("day_humidity_3 is null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3IsNotNull() {
            addCriterion("day_humidity_3 is not null");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3EqualTo(String value) {
            addCriterion("day_humidity_3 =", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3NotEqualTo(String value) {
            addCriterion("day_humidity_3 <>", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3GreaterThan(String value) {
            addCriterion("day_humidity_3 >", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3GreaterThanOrEqualTo(String value) {
            addCriterion("day_humidity_3 >=", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3LessThan(String value) {
            addCriterion("day_humidity_3 <", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3LessThanOrEqualTo(String value) {
            addCriterion("day_humidity_3 <=", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3Like(String value) {
            addCriterion("day_humidity_3 like", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3NotLike(String value) {
            addCriterion("day_humidity_3 not like", value, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3In(List<String> values) {
            addCriterion("day_humidity_3 in", values, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3NotIn(List<String> values) {
            addCriterion("day_humidity_3 not in", values, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3Between(String value1, String value2) {
            addCriterion("day_humidity_3 between", value1, value2, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andDayHumidity3NotBetween(String value1, String value2) {
            addCriterion("day_humidity_3 not between", value1, value2, "dayHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3IsNull() {
            addCriterion("night_humidity_3 is null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3IsNotNull() {
            addCriterion("night_humidity_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3EqualTo(String value) {
            addCriterion("night_humidity_3 =", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3NotEqualTo(String value) {
            addCriterion("night_humidity_3 <>", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3GreaterThan(String value) {
            addCriterion("night_humidity_3 >", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3GreaterThanOrEqualTo(String value) {
            addCriterion("night_humidity_3 >=", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3LessThan(String value) {
            addCriterion("night_humidity_3 <", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3LessThanOrEqualTo(String value) {
            addCriterion("night_humidity_3 <=", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3Like(String value) {
            addCriterion("night_humidity_3 like", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3NotLike(String value) {
            addCriterion("night_humidity_3 not like", value, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3In(List<String> values) {
            addCriterion("night_humidity_3 in", values, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3NotIn(List<String> values) {
            addCriterion("night_humidity_3 not in", values, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3Between(String value1, String value2) {
            addCriterion("night_humidity_3 between", value1, value2, "nightHumidity3");
            return (Criteria) this;
        }

        public Criteria andNightHumidity3NotBetween(String value1, String value2) {
            addCriterion("night_humidity_3 not between", value1, value2, "nightHumidity3");
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

        public Criteria andYyBeforeTimeEqualTo(String value) {
            addCriterion("yy_before_time =", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotEqualTo(String value) {
            addCriterion("yy_before_time <>", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeGreaterThan(String value) {
            addCriterion("yy_before_time >", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("yy_before_time >=", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeLessThan(String value) {
            addCriterion("yy_before_time <", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeLessThanOrEqualTo(String value) {
            addCriterion("yy_before_time <=", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeLike(String value) {
            addCriterion("yy_before_time like", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotLike(String value) {
            addCriterion("yy_before_time not like", value, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeIn(List<String> values) {
            addCriterion("yy_before_time in", values, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotIn(List<String> values) {
            addCriterion("yy_before_time not in", values, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeBetween(String value1, String value2) {
            addCriterion("yy_before_time between", value1, value2, "yyBeforeTime");
            return (Criteria) this;
        }

        public Criteria andYyBeforeTimeNotBetween(String value1, String value2) {
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

        public Criteria andYyNextTimeEqualTo(String value) {
            addCriterion("yy_next_time =", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotEqualTo(String value) {
            addCriterion("yy_next_time <>", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeGreaterThan(String value) {
            addCriterion("yy_next_time >", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeGreaterThanOrEqualTo(String value) {
            addCriterion("yy_next_time >=", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeLessThan(String value) {
            addCriterion("yy_next_time <", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeLessThanOrEqualTo(String value) {
            addCriterion("yy_next_time <=", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeLike(String value) {
            addCriterion("yy_next_time like", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotLike(String value) {
            addCriterion("yy_next_time not like", value, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeIn(List<String> values) {
            addCriterion("yy_next_time in", values, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotIn(List<String> values) {
            addCriterion("yy_next_time not in", values, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeBetween(String value1, String value2) {
            addCriterion("yy_next_time between", value1, value2, "yyNextTime");
            return (Criteria) this;
        }

        public Criteria andYyNextTimeNotBetween(String value1, String value2) {
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
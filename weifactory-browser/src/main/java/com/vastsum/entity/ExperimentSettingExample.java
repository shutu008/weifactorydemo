package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExperimentSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperimentSettingExample() {
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

        public Criteria andExperimentSettingIdIsNull() {
            addCriterion("experiment_setting_id is null");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdIsNotNull() {
            addCriterion("experiment_setting_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdEqualTo(Integer value) {
            addCriterion("experiment_setting_id =", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdNotEqualTo(Integer value) {
            addCriterion("experiment_setting_id <>", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdGreaterThan(Integer value) {
            addCriterion("experiment_setting_id >", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("experiment_setting_id >=", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdLessThan(Integer value) {
            addCriterion("experiment_setting_id <", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdLessThanOrEqualTo(Integer value) {
            addCriterion("experiment_setting_id <=", value, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdIn(List<Integer> values) {
            addCriterion("experiment_setting_id in", values, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdNotIn(List<Integer> values) {
            addCriterion("experiment_setting_id not in", values, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdBetween(Integer value1, Integer value2) {
            addCriterion("experiment_setting_id between", value1, value2, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentSettingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("experiment_setting_id not between", value1, value2, "experimentSettingId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIsNull() {
            addCriterion("experiment_id is null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIsNotNull() {
            addCriterion("experiment_id is not null");
            return (Criteria) this;
        }

        public Criteria andExperimentIdEqualTo(Integer value) {
            addCriterion("experiment_id =", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotEqualTo(Integer value) {
            addCriterion("experiment_id <>", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThan(Integer value) {
            addCriterion("experiment_id >", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("experiment_id >=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThan(Integer value) {
            addCriterion("experiment_id <", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdLessThanOrEqualTo(Integer value) {
            addCriterion("experiment_id <=", value, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdIn(List<Integer> values) {
            addCriterion("experiment_id in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotIn(List<Integer> values) {
            addCriterion("experiment_id not in", values, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdBetween(Integer value1, Integer value2) {
            addCriterion("experiment_id between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andExperimentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("experiment_id not between", value1, value2, "experimentId");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeIsNull() {
            addCriterion("nutrient_liquid_last_change_time is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeIsNotNull() {
            addCriterion("nutrient_liquid_last_change_time is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeEqualTo(Date value) {
            addCriterion("nutrient_liquid_last_change_time =", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeNotEqualTo(Date value) {
            addCriterion("nutrient_liquid_last_change_time <>", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeGreaterThan(Date value) {
            addCriterion("nutrient_liquid_last_change_time >", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nutrient_liquid_last_change_time >=", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeLessThan(Date value) {
            addCriterion("nutrient_liquid_last_change_time <", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("nutrient_liquid_last_change_time <=", value, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeIn(List<Date> values) {
            addCriterion("nutrient_liquid_last_change_time in", values, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeNotIn(List<Date> values) {
            addCriterion("nutrient_liquid_last_change_time not in", values, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeBetween(Date value1, Date value2) {
            addCriterion("nutrient_liquid_last_change_time between", value1, value2, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidLastChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("nutrient_liquid_last_change_time not between", value1, value2, "nutrientLiquidLastChangeTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeIsNull() {
            addCriterion("nutrient_liquid_remind_time is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeIsNotNull() {
            addCriterion("nutrient_liquid_remind_time is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeEqualTo(Date value) {
            addCriterion("nutrient_liquid_remind_time =", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeNotEqualTo(Date value) {
            addCriterion("nutrient_liquid_remind_time <>", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeGreaterThan(Date value) {
            addCriterion("nutrient_liquid_remind_time >", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("nutrient_liquid_remind_time >=", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeLessThan(Date value) {
            addCriterion("nutrient_liquid_remind_time <", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeLessThanOrEqualTo(Date value) {
            addCriterion("nutrient_liquid_remind_time <=", value, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeIn(List<Date> values) {
            addCriterion("nutrient_liquid_remind_time in", values, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeNotIn(List<Date> values) {
            addCriterion("nutrient_liquid_remind_time not in", values, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeBetween(Date value1, Date value2) {
            addCriterion("nutrient_liquid_remind_time between", value1, value2, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidRemindTimeNotBetween(Date value1, Date value2) {
            addCriterion("nutrient_liquid_remind_time not between", value1, value2, "nutrientLiquidRemindTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1IsNull() {
            addCriterion("nutrient_liquid_emission_time_1 is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1IsNotNull() {
            addCriterion("nutrient_liquid_emission_time_1 is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1EqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 =", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1NotEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 <>", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1GreaterThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 >", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1GreaterThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 >=", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1LessThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 <", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1LessThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_1 <=", value, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1In(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_1 in", values, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1NotIn(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_1 not in", values, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1Between(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_1 between", value1, value2, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime1NotBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_1 not between", value1, value2, "nutrientLiquidEmissionTime1");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2IsNull() {
            addCriterion("nutrient_liquid_emission_time_2 is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2IsNotNull() {
            addCriterion("nutrient_liquid_emission_time_2 is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2EqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 =", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2NotEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 <>", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2GreaterThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 >", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2GreaterThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 >=", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2LessThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 <", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2LessThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_2 <=", value, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2In(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_2 in", values, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2NotIn(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_2 not in", values, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2Between(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_2 between", value1, value2, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime2NotBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_2 not between", value1, value2, "nutrientLiquidEmissionTime2");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3IsNull() {
            addCriterion("nutrient_liquid_emission_time_3 is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3IsNotNull() {
            addCriterion("nutrient_liquid_emission_time_3 is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3EqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 =", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3NotEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 <>", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3GreaterThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 >", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3GreaterThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 >=", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3LessThan(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 <", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3LessThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_emission_time_3 <=", value, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3In(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_3 in", values, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3NotIn(List<Integer> values) {
            addCriterion("nutrient_liquid_emission_time_3 not in", values, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3Between(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_3 between", value1, value2, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmissionTime3NotBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_emission_time_3 not between", value1, value2, "nutrientLiquidEmissionTime3");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeIsNull() {
            addCriterion("nutrient_liquid_fill_time is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeIsNotNull() {
            addCriterion("nutrient_liquid_fill_time is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeEqualTo(Integer value) {
            addCriterion("nutrient_liquid_fill_time =", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeNotEqualTo(Integer value) {
            addCriterion("nutrient_liquid_fill_time <>", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeGreaterThan(Integer value) {
            addCriterion("nutrient_liquid_fill_time >", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_fill_time >=", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeLessThan(Integer value) {
            addCriterion("nutrient_liquid_fill_time <", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeLessThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_fill_time <=", value, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeIn(List<Integer> values) {
            addCriterion("nutrient_liquid_fill_time in", values, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeNotIn(List<Integer> values) {
            addCriterion("nutrient_liquid_fill_time not in", values, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_fill_time between", value1, value2, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidFillTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_fill_time not between", value1, value2, "nutrientLiquidFillTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeIsNull() {
            addCriterion("nutrient_liquid_empty_time is null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeIsNotNull() {
            addCriterion("nutrient_liquid_empty_time is not null");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeEqualTo(Integer value) {
            addCriterion("nutrient_liquid_empty_time =", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeNotEqualTo(Integer value) {
            addCriterion("nutrient_liquid_empty_time <>", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeGreaterThan(Integer value) {
            addCriterion("nutrient_liquid_empty_time >", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_empty_time >=", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeLessThan(Integer value) {
            addCriterion("nutrient_liquid_empty_time <", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("nutrient_liquid_empty_time <=", value, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeIn(List<Integer> values) {
            addCriterion("nutrient_liquid_empty_time in", values, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeNotIn(List<Integer> values) {
            addCriterion("nutrient_liquid_empty_time not in", values, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_empty_time between", value1, value2, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andNutrientLiquidEmptyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nutrient_liquid_empty_time not between", value1, value2, "nutrientLiquidEmptyTime");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyIsNull() {
            addCriterion("communication_frequency is null");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyIsNotNull() {
            addCriterion("communication_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyEqualTo(Integer value) {
            addCriterion("communication_frequency =", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyNotEqualTo(Integer value) {
            addCriterion("communication_frequency <>", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyGreaterThan(Integer value) {
            addCriterion("communication_frequency >", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("communication_frequency >=", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyLessThan(Integer value) {
            addCriterion("communication_frequency <", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("communication_frequency <=", value, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyIn(List<Integer> values) {
            addCriterion("communication_frequency in", values, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyNotIn(List<Integer> values) {
            addCriterion("communication_frequency not in", values, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("communication_frequency between", value1, value2, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andCommunicationFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("communication_frequency not between", value1, value2, "communicationFrequency");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(String value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(String value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(String value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(String value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(String value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLike(String value) {
            addCriterion("ip_address like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotLike(String value) {
            addCriterion("ip_address not like", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<String> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<String> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(String value1, String value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(String value1, String value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andPortNumberIsNull() {
            addCriterion("port_number is null");
            return (Criteria) this;
        }

        public Criteria andPortNumberIsNotNull() {
            addCriterion("port_number is not null");
            return (Criteria) this;
        }

        public Criteria andPortNumberEqualTo(Integer value) {
            addCriterion("port_number =", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberNotEqualTo(Integer value) {
            addCriterion("port_number <>", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberGreaterThan(Integer value) {
            addCriterion("port_number >", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("port_number >=", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberLessThan(Integer value) {
            addCriterion("port_number <", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberLessThanOrEqualTo(Integer value) {
            addCriterion("port_number <=", value, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberIn(List<Integer> values) {
            addCriterion("port_number in", values, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberNotIn(List<Integer> values) {
            addCriterion("port_number not in", values, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberBetween(Integer value1, Integer value2) {
            addCriterion("port_number between", value1, value2, "portNumber");
            return (Criteria) this;
        }

        public Criteria andPortNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("port_number not between", value1, value2, "portNumber");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodIsNull() {
            addCriterion("sampling_period is null");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodIsNotNull() {
            addCriterion("sampling_period is not null");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodEqualTo(Integer value) {
            addCriterion("sampling_period =", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodNotEqualTo(Integer value) {
            addCriterion("sampling_period <>", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodGreaterThan(Integer value) {
            addCriterion("sampling_period >", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("sampling_period >=", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodLessThan(Integer value) {
            addCriterion("sampling_period <", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("sampling_period <=", value, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodIn(List<Integer> values) {
            addCriterion("sampling_period in", values, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodNotIn(List<Integer> values) {
            addCriterion("sampling_period not in", values, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodBetween(Integer value1, Integer value2) {
            addCriterion("sampling_period between", value1, value2, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andSamplingPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("sampling_period not between", value1, value2, "samplingPeriod");
            return (Criteria) this;
        }

        public Criteria andStorageCycleIsNull() {
            addCriterion("storage_cycle is null");
            return (Criteria) this;
        }

        public Criteria andStorageCycleIsNotNull() {
            addCriterion("storage_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andStorageCycleEqualTo(Integer value) {
            addCriterion("storage_cycle =", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleNotEqualTo(Integer value) {
            addCriterion("storage_cycle <>", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleGreaterThan(Integer value) {
            addCriterion("storage_cycle >", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage_cycle >=", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleLessThan(Integer value) {
            addCriterion("storage_cycle <", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleLessThanOrEqualTo(Integer value) {
            addCriterion("storage_cycle <=", value, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleIn(List<Integer> values) {
            addCriterion("storage_cycle in", values, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleNotIn(List<Integer> values) {
            addCriterion("storage_cycle not in", values, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleBetween(Integer value1, Integer value2) {
            addCriterion("storage_cycle between", value1, value2, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andStorageCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("storage_cycle not between", value1, value2, "storageCycle");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeIsNull() {
            addCriterion("out_room_time is null");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeIsNotNull() {
            addCriterion("out_room_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeEqualTo(Integer value) {
            addCriterion("out_room_time =", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeNotEqualTo(Integer value) {
            addCriterion("out_room_time <>", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeGreaterThan(Integer value) {
            addCriterion("out_room_time >", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_room_time >=", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeLessThan(Integer value) {
            addCriterion("out_room_time <", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeLessThanOrEqualTo(Integer value) {
            addCriterion("out_room_time <=", value, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeIn(List<Integer> values) {
            addCriterion("out_room_time in", values, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeNotIn(List<Integer> values) {
            addCriterion("out_room_time not in", values, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeBetween(Integer value1, Integer value2) {
            addCriterion("out_room_time between", value1, value2, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andOutRoomTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("out_room_time not between", value1, value2, "outRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeIsNull() {
            addCriterion("in_room_time is null");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeIsNotNull() {
            addCriterion("in_room_time is not null");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeEqualTo(Integer value) {
            addCriterion("in_room_time =", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeNotEqualTo(Integer value) {
            addCriterion("in_room_time <>", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeGreaterThan(Integer value) {
            addCriterion("in_room_time >", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_room_time >=", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeLessThan(Integer value) {
            addCriterion("in_room_time <", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeLessThanOrEqualTo(Integer value) {
            addCriterion("in_room_time <=", value, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeIn(List<Integer> values) {
            addCriterion("in_room_time in", values, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeNotIn(List<Integer> values) {
            addCriterion("in_room_time not in", values, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeBetween(Integer value1, Integer value2) {
            addCriterion("in_room_time between", value1, value2, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andInRoomTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_room_time not between", value1, value2, "inRoomTime");
            return (Criteria) this;
        }

        public Criteria andTimeModeIsNull() {
            addCriterion("time_mode is null");
            return (Criteria) this;
        }

        public Criteria andTimeModeIsNotNull() {
            addCriterion("time_mode is not null");
            return (Criteria) this;
        }

        public Criteria andTimeModeEqualTo(Boolean value) {
            addCriterion("time_mode =", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeNotEqualTo(Boolean value) {
            addCriterion("time_mode <>", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeGreaterThan(Boolean value) {
            addCriterion("time_mode >", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("time_mode >=", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeLessThan(Boolean value) {
            addCriterion("time_mode <", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeLessThanOrEqualTo(Boolean value) {
            addCriterion("time_mode <=", value, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeIn(List<Boolean> values) {
            addCriterion("time_mode in", values, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeNotIn(List<Boolean> values) {
            addCriterion("time_mode not in", values, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeBetween(Boolean value1, Boolean value2) {
            addCriterion("time_mode between", value1, value2, "timeMode");
            return (Criteria) this;
        }

        public Criteria andTimeModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("time_mode not between", value1, value2, "timeMode");
            return (Criteria) this;
        }

        public Criteria andDayDurationIsNull() {
            addCriterion("day_duration is null");
            return (Criteria) this;
        }

        public Criteria andDayDurationIsNotNull() {
            addCriterion("day_duration is not null");
            return (Criteria) this;
        }

        public Criteria andDayDurationEqualTo(Integer value) {
            addCriterion("day_duration =", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotEqualTo(Integer value) {
            addCriterion("day_duration <>", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationGreaterThan(Integer value) {
            addCriterion("day_duration >", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_duration >=", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationLessThan(Integer value) {
            addCriterion("day_duration <", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationLessThanOrEqualTo(Integer value) {
            addCriterion("day_duration <=", value, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationIn(List<Integer> values) {
            addCriterion("day_duration in", values, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotIn(List<Integer> values) {
            addCriterion("day_duration not in", values, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationBetween(Integer value1, Integer value2) {
            addCriterion("day_duration between", value1, value2, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andDayDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("day_duration not between", value1, value2, "dayDuration");
            return (Criteria) this;
        }

        public Criteria andTimeShiftIsNull() {
            addCriterion("time_shift is null");
            return (Criteria) this;
        }

        public Criteria andTimeShiftIsNotNull() {
            addCriterion("time_shift is not null");
            return (Criteria) this;
        }

        public Criteria andTimeShiftEqualTo(Integer value) {
            addCriterion("time_shift =", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftNotEqualTo(Integer value) {
            addCriterion("time_shift <>", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftGreaterThan(Integer value) {
            addCriterion("time_shift >", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_shift >=", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftLessThan(Integer value) {
            addCriterion("time_shift <", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftLessThanOrEqualTo(Integer value) {
            addCriterion("time_shift <=", value, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftIn(List<Integer> values) {
            addCriterion("time_shift in", values, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftNotIn(List<Integer> values) {
            addCriterion("time_shift not in", values, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftBetween(Integer value1, Integer value2) {
            addCriterion("time_shift between", value1, value2, "timeShift");
            return (Criteria) this;
        }

        public Criteria andTimeShiftNotBetween(Integer value1, Integer value2) {
            addCriterion("time_shift not between", value1, value2, "timeShift");
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
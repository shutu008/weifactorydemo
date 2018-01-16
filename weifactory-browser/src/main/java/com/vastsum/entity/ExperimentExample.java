package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExperimentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExperimentExample() {
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

        public Criteria andCropName1IsNull() {
            addCriterion("crop_name_1 is null");
            return (Criteria) this;
        }

        public Criteria andCropName1IsNotNull() {
            addCriterion("crop_name_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCropName1EqualTo(String value) {
            addCriterion("crop_name_1 =", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1NotEqualTo(String value) {
            addCriterion("crop_name_1 <>", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1GreaterThan(String value) {
            addCriterion("crop_name_1 >", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1GreaterThanOrEqualTo(String value) {
            addCriterion("crop_name_1 >=", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1LessThan(String value) {
            addCriterion("crop_name_1 <", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1LessThanOrEqualTo(String value) {
            addCriterion("crop_name_1 <=", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1Like(String value) {
            addCriterion("crop_name_1 like", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1NotLike(String value) {
            addCriterion("crop_name_1 not like", value, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1In(List<String> values) {
            addCriterion("crop_name_1 in", values, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1NotIn(List<String> values) {
            addCriterion("crop_name_1 not in", values, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1Between(String value1, String value2) {
            addCriterion("crop_name_1 between", value1, value2, "cropName1");
            return (Criteria) this;
        }

        public Criteria andCropName1NotBetween(String value1, String value2) {
            addCriterion("crop_name_1 not between", value1, value2, "cropName1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1IsNull() {
            addCriterion("plant_time_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantTime1IsNotNull() {
            addCriterion("plant_time_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTime1EqualTo(Date value) {
            addCriterion("plant_time_1 =", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1NotEqualTo(Date value) {
            addCriterion("plant_time_1 <>", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1GreaterThan(Date value) {
            addCriterion("plant_time_1 >", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_time_1 >=", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1LessThan(Date value) {
            addCriterion("plant_time_1 <", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1LessThanOrEqualTo(Date value) {
            addCriterion("plant_time_1 <=", value, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1In(List<Date> values) {
            addCriterion("plant_time_1 in", values, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1NotIn(List<Date> values) {
            addCriterion("plant_time_1 not in", values, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1Between(Date value1, Date value2) {
            addCriterion("plant_time_1 between", value1, value2, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andPlantTime1NotBetween(Date value1, Date value2) {
            addCriterion("plant_time_1 not between", value1, value2, "plantTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1IsNull() {
            addCriterion("harvest_time_1 is null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1IsNotNull() {
            addCriterion("harvest_time_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1EqualTo(Date value) {
            addCriterion("harvest_time_1 =", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1NotEqualTo(Date value) {
            addCriterion("harvest_time_1 <>", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1GreaterThan(Date value) {
            addCriterion("harvest_time_1 >", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1GreaterThanOrEqualTo(Date value) {
            addCriterion("harvest_time_1 >=", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1LessThan(Date value) {
            addCriterion("harvest_time_1 <", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1LessThanOrEqualTo(Date value) {
            addCriterion("harvest_time_1 <=", value, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1In(List<Date> values) {
            addCriterion("harvest_time_1 in", values, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1NotIn(List<Date> values) {
            addCriterion("harvest_time_1 not in", values, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1Between(Date value1, Date value2) {
            addCriterion("harvest_time_1 between", value1, value2, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andHarvestTime1NotBetween(Date value1, Date value2) {
            addCriterion("harvest_time_1 not between", value1, value2, "harvestTime1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1IsNull() {
            addCriterion("plant_number_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1IsNotNull() {
            addCriterion("plant_number_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1EqualTo(Integer value) {
            addCriterion("plant_number_1 =", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1NotEqualTo(Integer value) {
            addCriterion("plant_number_1 <>", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1GreaterThan(Integer value) {
            addCriterion("plant_number_1 >", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_number_1 >=", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1LessThan(Integer value) {
            addCriterion("plant_number_1 <", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1LessThanOrEqualTo(Integer value) {
            addCriterion("plant_number_1 <=", value, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1In(List<Integer> values) {
            addCriterion("plant_number_1 in", values, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1NotIn(List<Integer> values) {
            addCriterion("plant_number_1 not in", values, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1Between(Integer value1, Integer value2) {
            addCriterion("plant_number_1 between", value1, value2, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andPlantNumber1NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_number_1 not between", value1, value2, "plantNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1IsNull() {
            addCriterion("leave_number_1 is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1IsNotNull() {
            addCriterion("leave_number_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1EqualTo(Integer value) {
            addCriterion("leave_number_1 =", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1NotEqualTo(Integer value) {
            addCriterion("leave_number_1 <>", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1GreaterThan(Integer value) {
            addCriterion("leave_number_1 >", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1GreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_number_1 >=", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1LessThan(Integer value) {
            addCriterion("leave_number_1 <", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1LessThanOrEqualTo(Integer value) {
            addCriterion("leave_number_1 <=", value, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1In(List<Integer> values) {
            addCriterion("leave_number_1 in", values, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1NotIn(List<Integer> values) {
            addCriterion("leave_number_1 not in", values, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1Between(Integer value1, Integer value2) {
            addCriterion("leave_number_1 between", value1, value2, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber1NotBetween(Integer value1, Integer value2) {
            addCriterion("leave_number_1 not between", value1, value2, "leaveNumber1");
            return (Criteria) this;
        }

        public Criteria andControlModel1IsNull() {
            addCriterion("control_model_1 is null");
            return (Criteria) this;
        }

        public Criteria andControlModel1IsNotNull() {
            addCriterion("control_model_1 is not null");
            return (Criteria) this;
        }

        public Criteria andControlModel1EqualTo(Integer value) {
            addCriterion("control_model_1 =", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1NotEqualTo(Integer value) {
            addCriterion("control_model_1 <>", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1GreaterThan(Integer value) {
            addCriterion("control_model_1 >", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_model_1 >=", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1LessThan(Integer value) {
            addCriterion("control_model_1 <", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1LessThanOrEqualTo(Integer value) {
            addCriterion("control_model_1 <=", value, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1In(List<Integer> values) {
            addCriterion("control_model_1 in", values, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1NotIn(List<Integer> values) {
            addCriterion("control_model_1 not in", values, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1Between(Integer value1, Integer value2) {
            addCriterion("control_model_1 between", value1, value2, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andControlModel1NotBetween(Integer value1, Integer value2) {
            addCriterion("control_model_1 not between", value1, value2, "controlModel1");
            return (Criteria) this;
        }

        public Criteria andCropName2IsNull() {
            addCriterion("crop_name_2 is null");
            return (Criteria) this;
        }

        public Criteria andCropName2IsNotNull() {
            addCriterion("crop_name_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCropName2EqualTo(String value) {
            addCriterion("crop_name_2 =", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2NotEqualTo(String value) {
            addCriterion("crop_name_2 <>", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2GreaterThan(String value) {
            addCriterion("crop_name_2 >", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2GreaterThanOrEqualTo(String value) {
            addCriterion("crop_name_2 >=", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2LessThan(String value) {
            addCriterion("crop_name_2 <", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2LessThanOrEqualTo(String value) {
            addCriterion("crop_name_2 <=", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2Like(String value) {
            addCriterion("crop_name_2 like", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2NotLike(String value) {
            addCriterion("crop_name_2 not like", value, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2In(List<String> values) {
            addCriterion("crop_name_2 in", values, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2NotIn(List<String> values) {
            addCriterion("crop_name_2 not in", values, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2Between(String value1, String value2) {
            addCriterion("crop_name_2 between", value1, value2, "cropName2");
            return (Criteria) this;
        }

        public Criteria andCropName2NotBetween(String value1, String value2) {
            addCriterion("crop_name_2 not between", value1, value2, "cropName2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2IsNull() {
            addCriterion("plant_time_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantTime2IsNotNull() {
            addCriterion("plant_time_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTime2EqualTo(Date value) {
            addCriterion("plant_time_2 =", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2NotEqualTo(Date value) {
            addCriterion("plant_time_2 <>", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2GreaterThan(Date value) {
            addCriterion("plant_time_2 >", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_time_2 >=", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2LessThan(Date value) {
            addCriterion("plant_time_2 <", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2LessThanOrEqualTo(Date value) {
            addCriterion("plant_time_2 <=", value, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2In(List<Date> values) {
            addCriterion("plant_time_2 in", values, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2NotIn(List<Date> values) {
            addCriterion("plant_time_2 not in", values, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2Between(Date value1, Date value2) {
            addCriterion("plant_time_2 between", value1, value2, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andPlantTime2NotBetween(Date value1, Date value2) {
            addCriterion("plant_time_2 not between", value1, value2, "plantTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2IsNull() {
            addCriterion("harvest_time_2 is null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2IsNotNull() {
            addCriterion("harvest_time_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2EqualTo(Date value) {
            addCriterion("harvest_time_2 =", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2NotEqualTo(Date value) {
            addCriterion("harvest_time_2 <>", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2GreaterThan(Date value) {
            addCriterion("harvest_time_2 >", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2GreaterThanOrEqualTo(Date value) {
            addCriterion("harvest_time_2 >=", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2LessThan(Date value) {
            addCriterion("harvest_time_2 <", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2LessThanOrEqualTo(Date value) {
            addCriterion("harvest_time_2 <=", value, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2In(List<Date> values) {
            addCriterion("harvest_time_2 in", values, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2NotIn(List<Date> values) {
            addCriterion("harvest_time_2 not in", values, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2Between(Date value1, Date value2) {
            addCriterion("harvest_time_2 between", value1, value2, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andHarvestTime2NotBetween(Date value1, Date value2) {
            addCriterion("harvest_time_2 not between", value1, value2, "harvestTime2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2IsNull() {
            addCriterion("plant_number_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2IsNotNull() {
            addCriterion("plant_number_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2EqualTo(Integer value) {
            addCriterion("plant_number_2 =", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2NotEqualTo(Integer value) {
            addCriterion("plant_number_2 <>", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2GreaterThan(Integer value) {
            addCriterion("plant_number_2 >", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_number_2 >=", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2LessThan(Integer value) {
            addCriterion("plant_number_2 <", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2LessThanOrEqualTo(Integer value) {
            addCriterion("plant_number_2 <=", value, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2In(List<Integer> values) {
            addCriterion("plant_number_2 in", values, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2NotIn(List<Integer> values) {
            addCriterion("plant_number_2 not in", values, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2Between(Integer value1, Integer value2) {
            addCriterion("plant_number_2 between", value1, value2, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andPlantNumber2NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_number_2 not between", value1, value2, "plantNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2IsNull() {
            addCriterion("leave_number_2 is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2IsNotNull() {
            addCriterion("leave_number_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2EqualTo(Integer value) {
            addCriterion("leave_number_2 =", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2NotEqualTo(Integer value) {
            addCriterion("leave_number_2 <>", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2GreaterThan(Integer value) {
            addCriterion("leave_number_2 >", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2GreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_number_2 >=", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2LessThan(Integer value) {
            addCriterion("leave_number_2 <", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2LessThanOrEqualTo(Integer value) {
            addCriterion("leave_number_2 <=", value, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2In(List<Integer> values) {
            addCriterion("leave_number_2 in", values, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2NotIn(List<Integer> values) {
            addCriterion("leave_number_2 not in", values, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2Between(Integer value1, Integer value2) {
            addCriterion("leave_number_2 between", value1, value2, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber2NotBetween(Integer value1, Integer value2) {
            addCriterion("leave_number_2 not between", value1, value2, "leaveNumber2");
            return (Criteria) this;
        }

        public Criteria andControlModel2IsNull() {
            addCriterion("control_model_2 is null");
            return (Criteria) this;
        }

        public Criteria andControlModel2IsNotNull() {
            addCriterion("control_model_2 is not null");
            return (Criteria) this;
        }

        public Criteria andControlModel2EqualTo(Integer value) {
            addCriterion("control_model_2 =", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2NotEqualTo(Integer value) {
            addCriterion("control_model_2 <>", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2GreaterThan(Integer value) {
            addCriterion("control_model_2 >", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_model_2 >=", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2LessThan(Integer value) {
            addCriterion("control_model_2 <", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2LessThanOrEqualTo(Integer value) {
            addCriterion("control_model_2 <=", value, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2In(List<Integer> values) {
            addCriterion("control_model_2 in", values, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2NotIn(List<Integer> values) {
            addCriterion("control_model_2 not in", values, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2Between(Integer value1, Integer value2) {
            addCriterion("control_model_2 between", value1, value2, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andControlModel2NotBetween(Integer value1, Integer value2) {
            addCriterion("control_model_2 not between", value1, value2, "controlModel2");
            return (Criteria) this;
        }

        public Criteria andCropName3IsNull() {
            addCriterion("crop_name_3 is null");
            return (Criteria) this;
        }

        public Criteria andCropName3IsNotNull() {
            addCriterion("crop_name_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCropName3EqualTo(String value) {
            addCriterion("crop_name_3 =", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3NotEqualTo(String value) {
            addCriterion("crop_name_3 <>", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3GreaterThan(String value) {
            addCriterion("crop_name_3 >", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3GreaterThanOrEqualTo(String value) {
            addCriterion("crop_name_3 >=", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3LessThan(String value) {
            addCriterion("crop_name_3 <", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3LessThanOrEqualTo(String value) {
            addCriterion("crop_name_3 <=", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3Like(String value) {
            addCriterion("crop_name_3 like", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3NotLike(String value) {
            addCriterion("crop_name_3 not like", value, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3In(List<String> values) {
            addCriterion("crop_name_3 in", values, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3NotIn(List<String> values) {
            addCriterion("crop_name_3 not in", values, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3Between(String value1, String value2) {
            addCriterion("crop_name_3 between", value1, value2, "cropName3");
            return (Criteria) this;
        }

        public Criteria andCropName3NotBetween(String value1, String value2) {
            addCriterion("crop_name_3 not between", value1, value2, "cropName3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3IsNull() {
            addCriterion("plant_time_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantTime3IsNotNull() {
            addCriterion("plant_time_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTime3EqualTo(Date value) {
            addCriterion("plant_time_3 =", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3NotEqualTo(Date value) {
            addCriterion("plant_time_3 <>", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3GreaterThan(Date value) {
            addCriterion("plant_time_3 >", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_time_3 >=", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3LessThan(Date value) {
            addCriterion("plant_time_3 <", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3LessThanOrEqualTo(Date value) {
            addCriterion("plant_time_3 <=", value, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3In(List<Date> values) {
            addCriterion("plant_time_3 in", values, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3NotIn(List<Date> values) {
            addCriterion("plant_time_3 not in", values, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3Between(Date value1, Date value2) {
            addCriterion("plant_time_3 between", value1, value2, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andPlantTime3NotBetween(Date value1, Date value2) {
            addCriterion("plant_time_3 not between", value1, value2, "plantTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3IsNull() {
            addCriterion("harvest_time_3 is null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3IsNotNull() {
            addCriterion("harvest_time_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3EqualTo(Date value) {
            addCriterion("harvest_time_3 =", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3NotEqualTo(Date value) {
            addCriterion("harvest_time_3 <>", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3GreaterThan(Date value) {
            addCriterion("harvest_time_3 >", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3GreaterThanOrEqualTo(Date value) {
            addCriterion("harvest_time_3 >=", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3LessThan(Date value) {
            addCriterion("harvest_time_3 <", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3LessThanOrEqualTo(Date value) {
            addCriterion("harvest_time_3 <=", value, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3In(List<Date> values) {
            addCriterion("harvest_time_3 in", values, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3NotIn(List<Date> values) {
            addCriterion("harvest_time_3 not in", values, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3Between(Date value1, Date value2) {
            addCriterion("harvest_time_3 between", value1, value2, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andHarvestTime3NotBetween(Date value1, Date value2) {
            addCriterion("harvest_time_3 not between", value1, value2, "harvestTime3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3IsNull() {
            addCriterion("plant_number_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3IsNotNull() {
            addCriterion("plant_number_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3EqualTo(Integer value) {
            addCriterion("plant_number_3 =", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3NotEqualTo(Integer value) {
            addCriterion("plant_number_3 <>", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3GreaterThan(Integer value) {
            addCriterion("plant_number_3 >", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_number_3 >=", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3LessThan(Integer value) {
            addCriterion("plant_number_3 <", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3LessThanOrEqualTo(Integer value) {
            addCriterion("plant_number_3 <=", value, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3In(List<Integer> values) {
            addCriterion("plant_number_3 in", values, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3NotIn(List<Integer> values) {
            addCriterion("plant_number_3 not in", values, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3Between(Integer value1, Integer value2) {
            addCriterion("plant_number_3 between", value1, value2, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andPlantNumber3NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_number_3 not between", value1, value2, "plantNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3IsNull() {
            addCriterion("leave_number_3 is null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3IsNotNull() {
            addCriterion("leave_number_3 is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3EqualTo(Integer value) {
            addCriterion("leave_number_3 =", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3NotEqualTo(Integer value) {
            addCriterion("leave_number_3 <>", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3GreaterThan(Integer value) {
            addCriterion("leave_number_3 >", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3GreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_number_3 >=", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3LessThan(Integer value) {
            addCriterion("leave_number_3 <", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3LessThanOrEqualTo(Integer value) {
            addCriterion("leave_number_3 <=", value, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3In(List<Integer> values) {
            addCriterion("leave_number_3 in", values, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3NotIn(List<Integer> values) {
            addCriterion("leave_number_3 not in", values, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3Between(Integer value1, Integer value2) {
            addCriterion("leave_number_3 between", value1, value2, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andLeaveNumber3NotBetween(Integer value1, Integer value2) {
            addCriterion("leave_number_3 not between", value1, value2, "leaveNumber3");
            return (Criteria) this;
        }

        public Criteria andControlModel3IsNull() {
            addCriterion("control_model_3 is null");
            return (Criteria) this;
        }

        public Criteria andControlModel3IsNotNull() {
            addCriterion("control_model_3 is not null");
            return (Criteria) this;
        }

        public Criteria andControlModel3EqualTo(Integer value) {
            addCriterion("control_model_3 =", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3NotEqualTo(Integer value) {
            addCriterion("control_model_3 <>", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3GreaterThan(Integer value) {
            addCriterion("control_model_3 >", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_model_3 >=", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3LessThan(Integer value) {
            addCriterion("control_model_3 <", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3LessThanOrEqualTo(Integer value) {
            addCriterion("control_model_3 <=", value, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3In(List<Integer> values) {
            addCriterion("control_model_3 in", values, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3NotIn(List<Integer> values) {
            addCriterion("control_model_3 not in", values, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3Between(Integer value1, Integer value2) {
            addCriterion("control_model_3 between", value1, value2, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andControlModel3NotBetween(Integer value1, Integer value2) {
            addCriterion("control_model_3 not between", value1, value2, "controlModel3");
            return (Criteria) this;
        }

        public Criteria andSeedingNameIsNull() {
            addCriterion("seeding_name is null");
            return (Criteria) this;
        }

        public Criteria andSeedingNameIsNotNull() {
            addCriterion("seeding_name is not null");
            return (Criteria) this;
        }

        public Criteria andSeedingNameEqualTo(String value) {
            addCriterion("seeding_name =", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameNotEqualTo(String value) {
            addCriterion("seeding_name <>", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameGreaterThan(String value) {
            addCriterion("seeding_name >", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameGreaterThanOrEqualTo(String value) {
            addCriterion("seeding_name >=", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameLessThan(String value) {
            addCriterion("seeding_name <", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameLessThanOrEqualTo(String value) {
            addCriterion("seeding_name <=", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameLike(String value) {
            addCriterion("seeding_name like", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameNotLike(String value) {
            addCriterion("seeding_name not like", value, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameIn(List<String> values) {
            addCriterion("seeding_name in", values, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameNotIn(List<String> values) {
            addCriterion("seeding_name not in", values, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameBetween(String value1, String value2) {
            addCriterion("seeding_name between", value1, value2, "seedingName");
            return (Criteria) this;
        }

        public Criteria andSeedingNameNotBetween(String value1, String value2) {
            addCriterion("seeding_name not between", value1, value2, "seedingName");
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
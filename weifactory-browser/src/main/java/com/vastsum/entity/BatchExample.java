package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BatchExample() {
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

        public Criteria andBatchIdIsNull() {
            addCriterion("batch_id is null");
            return (Criteria) this;
        }

        public Criteria andBatchIdIsNotNull() {
            addCriterion("batch_id is not null");
            return (Criteria) this;
        }

        public Criteria andBatchIdEqualTo(Integer value) {
            addCriterion("batch_id =", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotEqualTo(Integer value) {
            addCriterion("batch_id <>", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThan(Integer value) {
            addCriterion("batch_id >", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_id >=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThan(Integer value) {
            addCriterion("batch_id <", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("batch_id <=", value, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdIn(List<Integer> values) {
            addCriterion("batch_id in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotIn(List<Integer> values) {
            addCriterion("batch_id not in", values, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("batch_id between", value1, value2, "batchId");
            return (Criteria) this;
        }

        public Criteria andBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_id not between", value1, value2, "batchId");
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

        public Criteria andPlantOneTypeIsNull() {
            addCriterion("plant_one_type is null");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeIsNotNull() {
            addCriterion("plant_one_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeEqualTo(String value) {
            addCriterion("plant_one_type =", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeNotEqualTo(String value) {
            addCriterion("plant_one_type <>", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeGreaterThan(String value) {
            addCriterion("plant_one_type >", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plant_one_type >=", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeLessThan(String value) {
            addCriterion("plant_one_type <", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeLessThanOrEqualTo(String value) {
            addCriterion("plant_one_type <=", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeLike(String value) {
            addCriterion("plant_one_type like", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeNotLike(String value) {
            addCriterion("plant_one_type not like", value, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeIn(List<String> values) {
            addCriterion("plant_one_type in", values, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeNotIn(List<String> values) {
            addCriterion("plant_one_type not in", values, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeBetween(String value1, String value2) {
            addCriterion("plant_one_type between", value1, value2, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneTypeNotBetween(String value1, String value2) {
            addCriterion("plant_one_type not between", value1, value2, "plantOneType");
            return (Criteria) this;
        }

        public Criteria andPlantOneIsNull() {
            addCriterion("plant_one is null");
            return (Criteria) this;
        }

        public Criteria andPlantOneIsNotNull() {
            addCriterion("plant_one is not null");
            return (Criteria) this;
        }

        public Criteria andPlantOneEqualTo(String value) {
            addCriterion("plant_one =", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneNotEqualTo(String value) {
            addCriterion("plant_one <>", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneGreaterThan(String value) {
            addCriterion("plant_one >", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneGreaterThanOrEqualTo(String value) {
            addCriterion("plant_one >=", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneLessThan(String value) {
            addCriterion("plant_one <", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneLessThanOrEqualTo(String value) {
            addCriterion("plant_one <=", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneLike(String value) {
            addCriterion("plant_one like", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneNotLike(String value) {
            addCriterion("plant_one not like", value, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneIn(List<String> values) {
            addCriterion("plant_one in", values, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneNotIn(List<String> values) {
            addCriterion("plant_one not in", values, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneBetween(String value1, String value2) {
            addCriterion("plant_one between", value1, value2, "plantOne");
            return (Criteria) this;
        }

        public Criteria andPlantOneNotBetween(String value1, String value2) {
            addCriterion("plant_one not between", value1, value2, "plantOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneIsNull() {
            addCriterion("cult_model_one is null");
            return (Criteria) this;
        }

        public Criteria andCultModelOneIsNotNull() {
            addCriterion("cult_model_one is not null");
            return (Criteria) this;
        }

        public Criteria andCultModelOneEqualTo(String value) {
            addCriterion("cult_model_one =", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneNotEqualTo(String value) {
            addCriterion("cult_model_one <>", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneGreaterThan(String value) {
            addCriterion("cult_model_one >", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneGreaterThanOrEqualTo(String value) {
            addCriterion("cult_model_one >=", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneLessThan(String value) {
            addCriterion("cult_model_one <", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneLessThanOrEqualTo(String value) {
            addCriterion("cult_model_one <=", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneLike(String value) {
            addCriterion("cult_model_one like", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneNotLike(String value) {
            addCriterion("cult_model_one not like", value, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneIn(List<String> values) {
            addCriterion("cult_model_one in", values, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneNotIn(List<String> values) {
            addCriterion("cult_model_one not in", values, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneBetween(String value1, String value2) {
            addCriterion("cult_model_one between", value1, value2, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andCultModelOneNotBetween(String value1, String value2) {
            addCriterion("cult_model_one not between", value1, value2, "cultModelOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneIsNull() {
            addCriterion("temperature_one is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneIsNotNull() {
            addCriterion("temperature_one is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneEqualTo(Double value) {
            addCriterion("temperature_one =", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneNotEqualTo(Double value) {
            addCriterion("temperature_one <>", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneGreaterThan(Double value) {
            addCriterion("temperature_one >", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature_one >=", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneLessThan(Double value) {
            addCriterion("temperature_one <", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneLessThanOrEqualTo(Double value) {
            addCriterion("temperature_one <=", value, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneIn(List<Double> values) {
            addCriterion("temperature_one in", values, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneNotIn(List<Double> values) {
            addCriterion("temperature_one not in", values, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneBetween(Double value1, Double value2) {
            addCriterion("temperature_one between", value1, value2, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andTemperatureOneNotBetween(Double value1, Double value2) {
            addCriterion("temperature_one not between", value1, value2, "temperatureOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneIsNull() {
            addCriterion("humidity_one is null");
            return (Criteria) this;
        }

        public Criteria andHumidityOneIsNotNull() {
            addCriterion("humidity_one is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityOneEqualTo(Double value) {
            addCriterion("humidity_one =", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneNotEqualTo(Double value) {
            addCriterion("humidity_one <>", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneGreaterThan(Double value) {
            addCriterion("humidity_one >", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity_one >=", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneLessThan(Double value) {
            addCriterion("humidity_one <", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneLessThanOrEqualTo(Double value) {
            addCriterion("humidity_one <=", value, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneIn(List<Double> values) {
            addCriterion("humidity_one in", values, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneNotIn(List<Double> values) {
            addCriterion("humidity_one not in", values, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneBetween(Double value1, Double value2) {
            addCriterion("humidity_one between", value1, value2, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andHumidityOneNotBetween(Double value1, Double value2) {
            addCriterion("humidity_one not between", value1, value2, "humidityOne");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftIsNull() {
            addCriterion("led_one_left is null");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftIsNotNull() {
            addCriterion("led_one_left is not null");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftEqualTo(String value) {
            addCriterion("led_one_left =", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftNotEqualTo(String value) {
            addCriterion("led_one_left <>", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftGreaterThan(String value) {
            addCriterion("led_one_left >", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftGreaterThanOrEqualTo(String value) {
            addCriterion("led_one_left >=", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftLessThan(String value) {
            addCriterion("led_one_left <", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftLessThanOrEqualTo(String value) {
            addCriterion("led_one_left <=", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftLike(String value) {
            addCriterion("led_one_left like", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftNotLike(String value) {
            addCriterion("led_one_left not like", value, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftIn(List<String> values) {
            addCriterion("led_one_left in", values, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftNotIn(List<String> values) {
            addCriterion("led_one_left not in", values, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftBetween(String value1, String value2) {
            addCriterion("led_one_left between", value1, value2, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneLeftNotBetween(String value1, String value2) {
            addCriterion("led_one_left not between", value1, value2, "ledOneLeft");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleIsNull() {
            addCriterion("led_one_middle is null");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleIsNotNull() {
            addCriterion("led_one_middle is not null");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleEqualTo(String value) {
            addCriterion("led_one_middle =", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleNotEqualTo(String value) {
            addCriterion("led_one_middle <>", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleGreaterThan(String value) {
            addCriterion("led_one_middle >", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("led_one_middle >=", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleLessThan(String value) {
            addCriterion("led_one_middle <", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleLessThanOrEqualTo(String value) {
            addCriterion("led_one_middle <=", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleLike(String value) {
            addCriterion("led_one_middle like", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleNotLike(String value) {
            addCriterion("led_one_middle not like", value, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleIn(List<String> values) {
            addCriterion("led_one_middle in", values, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleNotIn(List<String> values) {
            addCriterion("led_one_middle not in", values, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleBetween(String value1, String value2) {
            addCriterion("led_one_middle between", value1, value2, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneMiddleNotBetween(String value1, String value2) {
            addCriterion("led_one_middle not between", value1, value2, "ledOneMiddle");
            return (Criteria) this;
        }

        public Criteria andLedOneRightIsNull() {
            addCriterion("led_one_right is null");
            return (Criteria) this;
        }

        public Criteria andLedOneRightIsNotNull() {
            addCriterion("led_one_right is not null");
            return (Criteria) this;
        }

        public Criteria andLedOneRightEqualTo(String value) {
            addCriterion("led_one_right =", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightNotEqualTo(String value) {
            addCriterion("led_one_right <>", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightGreaterThan(String value) {
            addCriterion("led_one_right >", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightGreaterThanOrEqualTo(String value) {
            addCriterion("led_one_right >=", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightLessThan(String value) {
            addCriterion("led_one_right <", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightLessThanOrEqualTo(String value) {
            addCriterion("led_one_right <=", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightLike(String value) {
            addCriterion("led_one_right like", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightNotLike(String value) {
            addCriterion("led_one_right not like", value, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightIn(List<String> values) {
            addCriterion("led_one_right in", values, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightNotIn(List<String> values) {
            addCriterion("led_one_right not in", values, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightBetween(String value1, String value2) {
            addCriterion("led_one_right between", value1, value2, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andLedOneRightNotBetween(String value1, String value2) {
            addCriterion("led_one_right not between", value1, value2, "ledOneRight");
            return (Criteria) this;
        }

        public Criteria andVideoOneIsNull() {
            addCriterion("video_one is null");
            return (Criteria) this;
        }

        public Criteria andVideoOneIsNotNull() {
            addCriterion("video_one is not null");
            return (Criteria) this;
        }

        public Criteria andVideoOneEqualTo(String value) {
            addCriterion("video_one =", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneNotEqualTo(String value) {
            addCriterion("video_one <>", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneGreaterThan(String value) {
            addCriterion("video_one >", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneGreaterThanOrEqualTo(String value) {
            addCriterion("video_one >=", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneLessThan(String value) {
            addCriterion("video_one <", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneLessThanOrEqualTo(String value) {
            addCriterion("video_one <=", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneLike(String value) {
            addCriterion("video_one like", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneNotLike(String value) {
            addCriterion("video_one not like", value, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneIn(List<String> values) {
            addCriterion("video_one in", values, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneNotIn(List<String> values) {
            addCriterion("video_one not in", values, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneBetween(String value1, String value2) {
            addCriterion("video_one between", value1, value2, "videoOne");
            return (Criteria) this;
        }

        public Criteria andVideoOneNotBetween(String value1, String value2) {
            addCriterion("video_one not between", value1, value2, "videoOne");
            return (Criteria) this;
        }

        public Criteria andLightOneIsNull() {
            addCriterion("light_one is null");
            return (Criteria) this;
        }

        public Criteria andLightOneIsNotNull() {
            addCriterion("light_one is not null");
            return (Criteria) this;
        }

        public Criteria andLightOneEqualTo(Double value) {
            addCriterion("light_one =", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneNotEqualTo(Double value) {
            addCriterion("light_one <>", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneGreaterThan(Double value) {
            addCriterion("light_one >", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneGreaterThanOrEqualTo(Double value) {
            addCriterion("light_one >=", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneLessThan(Double value) {
            addCriterion("light_one <", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneLessThanOrEqualTo(Double value) {
            addCriterion("light_one <=", value, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneIn(List<Double> values) {
            addCriterion("light_one in", values, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneNotIn(List<Double> values) {
            addCriterion("light_one not in", values, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneBetween(Double value1, Double value2) {
            addCriterion("light_one between", value1, value2, "lightOne");
            return (Criteria) this;
        }

        public Criteria andLightOneNotBetween(Double value1, Double value2) {
            addCriterion("light_one not between", value1, value2, "lightOne");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeIsNull() {
            addCriterion("plant_two_type is null");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeIsNotNull() {
            addCriterion("plant_two_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeEqualTo(String value) {
            addCriterion("plant_two_type =", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeNotEqualTo(String value) {
            addCriterion("plant_two_type <>", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeGreaterThan(String value) {
            addCriterion("plant_two_type >", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plant_two_type >=", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeLessThan(String value) {
            addCriterion("plant_two_type <", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeLessThanOrEqualTo(String value) {
            addCriterion("plant_two_type <=", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeLike(String value) {
            addCriterion("plant_two_type like", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeNotLike(String value) {
            addCriterion("plant_two_type not like", value, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeIn(List<String> values) {
            addCriterion("plant_two_type in", values, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeNotIn(List<String> values) {
            addCriterion("plant_two_type not in", values, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeBetween(String value1, String value2) {
            addCriterion("plant_two_type between", value1, value2, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoTypeNotBetween(String value1, String value2) {
            addCriterion("plant_two_type not between", value1, value2, "plantTwoType");
            return (Criteria) this;
        }

        public Criteria andPlantTwoIsNull() {
            addCriterion("plant_two is null");
            return (Criteria) this;
        }

        public Criteria andPlantTwoIsNotNull() {
            addCriterion("plant_two is not null");
            return (Criteria) this;
        }

        public Criteria andPlantTwoEqualTo(String value) {
            addCriterion("plant_two =", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoNotEqualTo(String value) {
            addCriterion("plant_two <>", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoGreaterThan(String value) {
            addCriterion("plant_two >", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoGreaterThanOrEqualTo(String value) {
            addCriterion("plant_two >=", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoLessThan(String value) {
            addCriterion("plant_two <", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoLessThanOrEqualTo(String value) {
            addCriterion("plant_two <=", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoLike(String value) {
            addCriterion("plant_two like", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoNotLike(String value) {
            addCriterion("plant_two not like", value, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoIn(List<String> values) {
            addCriterion("plant_two in", values, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoNotIn(List<String> values) {
            addCriterion("plant_two not in", values, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoBetween(String value1, String value2) {
            addCriterion("plant_two between", value1, value2, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andPlantTwoNotBetween(String value1, String value2) {
            addCriterion("plant_two not between", value1, value2, "plantTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoIsNull() {
            addCriterion("cult_model_two is null");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoIsNotNull() {
            addCriterion("cult_model_two is not null");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoEqualTo(String value) {
            addCriterion("cult_model_two =", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoNotEqualTo(String value) {
            addCriterion("cult_model_two <>", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoGreaterThan(String value) {
            addCriterion("cult_model_two >", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoGreaterThanOrEqualTo(String value) {
            addCriterion("cult_model_two >=", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoLessThan(String value) {
            addCriterion("cult_model_two <", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoLessThanOrEqualTo(String value) {
            addCriterion("cult_model_two <=", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoLike(String value) {
            addCriterion("cult_model_two like", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoNotLike(String value) {
            addCriterion("cult_model_two not like", value, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoIn(List<String> values) {
            addCriterion("cult_model_two in", values, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoNotIn(List<String> values) {
            addCriterion("cult_model_two not in", values, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoBetween(String value1, String value2) {
            addCriterion("cult_model_two between", value1, value2, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andCultModelTwoNotBetween(String value1, String value2) {
            addCriterion("cult_model_two not between", value1, value2, "cultModelTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoIsNull() {
            addCriterion("temperature_two is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoIsNotNull() {
            addCriterion("temperature_two is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoEqualTo(Double value) {
            addCriterion("temperature_two =", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoNotEqualTo(Double value) {
            addCriterion("temperature_two <>", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoGreaterThan(Double value) {
            addCriterion("temperature_two >", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature_two >=", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoLessThan(Double value) {
            addCriterion("temperature_two <", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoLessThanOrEqualTo(Double value) {
            addCriterion("temperature_two <=", value, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoIn(List<Double> values) {
            addCriterion("temperature_two in", values, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoNotIn(List<Double> values) {
            addCriterion("temperature_two not in", values, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoBetween(Double value1, Double value2) {
            addCriterion("temperature_two between", value1, value2, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andTemperatureTwoNotBetween(Double value1, Double value2) {
            addCriterion("temperature_two not between", value1, value2, "temperatureTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoIsNull() {
            addCriterion("humidity_two is null");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoIsNotNull() {
            addCriterion("humidity_two is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoEqualTo(Double value) {
            addCriterion("humidity_two =", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoNotEqualTo(Double value) {
            addCriterion("humidity_two <>", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoGreaterThan(Double value) {
            addCriterion("humidity_two >", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity_two >=", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoLessThan(Double value) {
            addCriterion("humidity_two <", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoLessThanOrEqualTo(Double value) {
            addCriterion("humidity_two <=", value, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoIn(List<Double> values) {
            addCriterion("humidity_two in", values, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoNotIn(List<Double> values) {
            addCriterion("humidity_two not in", values, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoBetween(Double value1, Double value2) {
            addCriterion("humidity_two between", value1, value2, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andHumidityTwoNotBetween(Double value1, Double value2) {
            addCriterion("humidity_two not between", value1, value2, "humidityTwo");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftIsNull() {
            addCriterion("led_two_left is null");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftIsNotNull() {
            addCriterion("led_two_left is not null");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftEqualTo(String value) {
            addCriterion("led_two_left =", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftNotEqualTo(String value) {
            addCriterion("led_two_left <>", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftGreaterThan(String value) {
            addCriterion("led_two_left >", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftGreaterThanOrEqualTo(String value) {
            addCriterion("led_two_left >=", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftLessThan(String value) {
            addCriterion("led_two_left <", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftLessThanOrEqualTo(String value) {
            addCriterion("led_two_left <=", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftLike(String value) {
            addCriterion("led_two_left like", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftNotLike(String value) {
            addCriterion("led_two_left not like", value, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftIn(List<String> values) {
            addCriterion("led_two_left in", values, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftNotIn(List<String> values) {
            addCriterion("led_two_left not in", values, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftBetween(String value1, String value2) {
            addCriterion("led_two_left between", value1, value2, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoLeftNotBetween(String value1, String value2) {
            addCriterion("led_two_left not between", value1, value2, "ledTwoLeft");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleIsNull() {
            addCriterion("led_two_middle is null");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleIsNotNull() {
            addCriterion("led_two_middle is not null");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleEqualTo(String value) {
            addCriterion("led_two_middle =", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleNotEqualTo(String value) {
            addCriterion("led_two_middle <>", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleGreaterThan(String value) {
            addCriterion("led_two_middle >", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("led_two_middle >=", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleLessThan(String value) {
            addCriterion("led_two_middle <", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleLessThanOrEqualTo(String value) {
            addCriterion("led_two_middle <=", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleLike(String value) {
            addCriterion("led_two_middle like", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleNotLike(String value) {
            addCriterion("led_two_middle not like", value, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleIn(List<String> values) {
            addCriterion("led_two_middle in", values, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleNotIn(List<String> values) {
            addCriterion("led_two_middle not in", values, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleBetween(String value1, String value2) {
            addCriterion("led_two_middle between", value1, value2, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoMiddleNotBetween(String value1, String value2) {
            addCriterion("led_two_middle not between", value1, value2, "ledTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightIsNull() {
            addCriterion("led_two_right is null");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightIsNotNull() {
            addCriterion("led_two_right is not null");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightEqualTo(String value) {
            addCriterion("led_two_right =", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightNotEqualTo(String value) {
            addCriterion("led_two_right <>", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightGreaterThan(String value) {
            addCriterion("led_two_right >", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightGreaterThanOrEqualTo(String value) {
            addCriterion("led_two_right >=", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightLessThan(String value) {
            addCriterion("led_two_right <", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightLessThanOrEqualTo(String value) {
            addCriterion("led_two_right <=", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightLike(String value) {
            addCriterion("led_two_right like", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightNotLike(String value) {
            addCriterion("led_two_right not like", value, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightIn(List<String> values) {
            addCriterion("led_two_right in", values, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightNotIn(List<String> values) {
            addCriterion("led_two_right not in", values, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightBetween(String value1, String value2) {
            addCriterion("led_two_right between", value1, value2, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andLedTwoRightNotBetween(String value1, String value2) {
            addCriterion("led_two_right not between", value1, value2, "ledTwoRight");
            return (Criteria) this;
        }

        public Criteria andVideoTwoIsNull() {
            addCriterion("video_two is null");
            return (Criteria) this;
        }

        public Criteria andVideoTwoIsNotNull() {
            addCriterion("video_two is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTwoEqualTo(String value) {
            addCriterion("video_two =", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoNotEqualTo(String value) {
            addCriterion("video_two <>", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoGreaterThan(String value) {
            addCriterion("video_two >", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoGreaterThanOrEqualTo(String value) {
            addCriterion("video_two >=", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoLessThan(String value) {
            addCriterion("video_two <", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoLessThanOrEqualTo(String value) {
            addCriterion("video_two <=", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoLike(String value) {
            addCriterion("video_two like", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoNotLike(String value) {
            addCriterion("video_two not like", value, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoIn(List<String> values) {
            addCriterion("video_two in", values, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoNotIn(List<String> values) {
            addCriterion("video_two not in", values, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoBetween(String value1, String value2) {
            addCriterion("video_two between", value1, value2, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andVideoTwoNotBetween(String value1, String value2) {
            addCriterion("video_two not between", value1, value2, "videoTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoIsNull() {
            addCriterion("light_two is null");
            return (Criteria) this;
        }

        public Criteria andLightTwoIsNotNull() {
            addCriterion("light_two is not null");
            return (Criteria) this;
        }

        public Criteria andLightTwoEqualTo(Double value) {
            addCriterion("light_two =", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoNotEqualTo(Double value) {
            addCriterion("light_two <>", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoGreaterThan(Double value) {
            addCriterion("light_two >", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoGreaterThanOrEqualTo(Double value) {
            addCriterion("light_two >=", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoLessThan(Double value) {
            addCriterion("light_two <", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoLessThanOrEqualTo(Double value) {
            addCriterion("light_two <=", value, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoIn(List<Double> values) {
            addCriterion("light_two in", values, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoNotIn(List<Double> values) {
            addCriterion("light_two not in", values, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoBetween(Double value1, Double value2) {
            addCriterion("light_two between", value1, value2, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andLightTwoNotBetween(Double value1, Double value2) {
            addCriterion("light_two not between", value1, value2, "lightTwo");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeIsNull() {
            addCriterion("plant_three_type is null");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeIsNotNull() {
            addCriterion("plant_three_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeEqualTo(String value) {
            addCriterion("plant_three_type =", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeNotEqualTo(String value) {
            addCriterion("plant_three_type <>", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeGreaterThan(String value) {
            addCriterion("plant_three_type >", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("plant_three_type >=", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeLessThan(String value) {
            addCriterion("plant_three_type <", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeLessThanOrEqualTo(String value) {
            addCriterion("plant_three_type <=", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeLike(String value) {
            addCriterion("plant_three_type like", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeNotLike(String value) {
            addCriterion("plant_three_type not like", value, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeIn(List<String> values) {
            addCriterion("plant_three_type in", values, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeNotIn(List<String> values) {
            addCriterion("plant_three_type not in", values, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeBetween(String value1, String value2) {
            addCriterion("plant_three_type between", value1, value2, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeTypeNotBetween(String value1, String value2) {
            addCriterion("plant_three_type not between", value1, value2, "plantThreeType");
            return (Criteria) this;
        }

        public Criteria andPlantThreeIsNull() {
            addCriterion("plant_three is null");
            return (Criteria) this;
        }

        public Criteria andPlantThreeIsNotNull() {
            addCriterion("plant_three is not null");
            return (Criteria) this;
        }

        public Criteria andPlantThreeEqualTo(String value) {
            addCriterion("plant_three =", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeNotEqualTo(String value) {
            addCriterion("plant_three <>", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeGreaterThan(String value) {
            addCriterion("plant_three >", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeGreaterThanOrEqualTo(String value) {
            addCriterion("plant_three >=", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeLessThan(String value) {
            addCriterion("plant_three <", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeLessThanOrEqualTo(String value) {
            addCriterion("plant_three <=", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeLike(String value) {
            addCriterion("plant_three like", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeNotLike(String value) {
            addCriterion("plant_three not like", value, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeIn(List<String> values) {
            addCriterion("plant_three in", values, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeNotIn(List<String> values) {
            addCriterion("plant_three not in", values, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeBetween(String value1, String value2) {
            addCriterion("plant_three between", value1, value2, "plantThree");
            return (Criteria) this;
        }

        public Criteria andPlantThreeNotBetween(String value1, String value2) {
            addCriterion("plant_three not between", value1, value2, "plantThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeIsNull() {
            addCriterion("cult_model_three is null");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeIsNotNull() {
            addCriterion("cult_model_three is not null");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeEqualTo(String value) {
            addCriterion("cult_model_three =", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeNotEqualTo(String value) {
            addCriterion("cult_model_three <>", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeGreaterThan(String value) {
            addCriterion("cult_model_three >", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeGreaterThanOrEqualTo(String value) {
            addCriterion("cult_model_three >=", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeLessThan(String value) {
            addCriterion("cult_model_three <", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeLessThanOrEqualTo(String value) {
            addCriterion("cult_model_three <=", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeLike(String value) {
            addCriterion("cult_model_three like", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeNotLike(String value) {
            addCriterion("cult_model_three not like", value, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeIn(List<String> values) {
            addCriterion("cult_model_three in", values, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeNotIn(List<String> values) {
            addCriterion("cult_model_three not in", values, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeBetween(String value1, String value2) {
            addCriterion("cult_model_three between", value1, value2, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andCultModelThreeNotBetween(String value1, String value2) {
            addCriterion("cult_model_three not between", value1, value2, "cultModelThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeIsNull() {
            addCriterion("temperature_three is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeIsNotNull() {
            addCriterion("temperature_three is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeEqualTo(Double value) {
            addCriterion("temperature_three =", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeNotEqualTo(Double value) {
            addCriterion("temperature_three <>", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeGreaterThan(Double value) {
            addCriterion("temperature_three >", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature_three >=", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeLessThan(Double value) {
            addCriterion("temperature_three <", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeLessThanOrEqualTo(Double value) {
            addCriterion("temperature_three <=", value, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeIn(List<Double> values) {
            addCriterion("temperature_three in", values, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeNotIn(List<Double> values) {
            addCriterion("temperature_three not in", values, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeBetween(Double value1, Double value2) {
            addCriterion("temperature_three between", value1, value2, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andTemperatureThreeNotBetween(Double value1, Double value2) {
            addCriterion("temperature_three not between", value1, value2, "temperatureThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeIsNull() {
            addCriterion("humidity_three is null");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeIsNotNull() {
            addCriterion("humidity_three is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeEqualTo(Double value) {
            addCriterion("humidity_three =", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeNotEqualTo(Double value) {
            addCriterion("humidity_three <>", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeGreaterThan(Double value) {
            addCriterion("humidity_three >", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity_three >=", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeLessThan(Double value) {
            addCriterion("humidity_three <", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeLessThanOrEqualTo(Double value) {
            addCriterion("humidity_three <=", value, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeIn(List<Double> values) {
            addCriterion("humidity_three in", values, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeNotIn(List<Double> values) {
            addCriterion("humidity_three not in", values, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeBetween(Double value1, Double value2) {
            addCriterion("humidity_three between", value1, value2, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andHumidityThreeNotBetween(Double value1, Double value2) {
            addCriterion("humidity_three not between", value1, value2, "humidityThree");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftIsNull() {
            addCriterion("led_three_left is null");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftIsNotNull() {
            addCriterion("led_three_left is not null");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftEqualTo(String value) {
            addCriterion("led_three_left =", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftNotEqualTo(String value) {
            addCriterion("led_three_left <>", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftGreaterThan(String value) {
            addCriterion("led_three_left >", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftGreaterThanOrEqualTo(String value) {
            addCriterion("led_three_left >=", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftLessThan(String value) {
            addCriterion("led_three_left <", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftLessThanOrEqualTo(String value) {
            addCriterion("led_three_left <=", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftLike(String value) {
            addCriterion("led_three_left like", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftNotLike(String value) {
            addCriterion("led_three_left not like", value, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftIn(List<String> values) {
            addCriterion("led_three_left in", values, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftNotIn(List<String> values) {
            addCriterion("led_three_left not in", values, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftBetween(String value1, String value2) {
            addCriterion("led_three_left between", value1, value2, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeLeftNotBetween(String value1, String value2) {
            addCriterion("led_three_left not between", value1, value2, "ledThreeLeft");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleIsNull() {
            addCriterion("led_three_middle is null");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleIsNotNull() {
            addCriterion("led_three_middle is not null");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleEqualTo(String value) {
            addCriterion("led_three_middle =", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleNotEqualTo(String value) {
            addCriterion("led_three_middle <>", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleGreaterThan(String value) {
            addCriterion("led_three_middle >", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("led_three_middle >=", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleLessThan(String value) {
            addCriterion("led_three_middle <", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleLessThanOrEqualTo(String value) {
            addCriterion("led_three_middle <=", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleLike(String value) {
            addCriterion("led_three_middle like", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleNotLike(String value) {
            addCriterion("led_three_middle not like", value, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleIn(List<String> values) {
            addCriterion("led_three_middle in", values, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleNotIn(List<String> values) {
            addCriterion("led_three_middle not in", values, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleBetween(String value1, String value2) {
            addCriterion("led_three_middle between", value1, value2, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeMiddleNotBetween(String value1, String value2) {
            addCriterion("led_three_middle not between", value1, value2, "ledThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightIsNull() {
            addCriterion("led_three_right is null");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightIsNotNull() {
            addCriterion("led_three_right is not null");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightEqualTo(String value) {
            addCriterion("led_three_right =", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightNotEqualTo(String value) {
            addCriterion("led_three_right <>", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightGreaterThan(String value) {
            addCriterion("led_three_right >", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightGreaterThanOrEqualTo(String value) {
            addCriterion("led_three_right >=", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightLessThan(String value) {
            addCriterion("led_three_right <", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightLessThanOrEqualTo(String value) {
            addCriterion("led_three_right <=", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightLike(String value) {
            addCriterion("led_three_right like", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightNotLike(String value) {
            addCriterion("led_three_right not like", value, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightIn(List<String> values) {
            addCriterion("led_three_right in", values, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightNotIn(List<String> values) {
            addCriterion("led_three_right not in", values, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightBetween(String value1, String value2) {
            addCriterion("led_three_right between", value1, value2, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andLedThreeRightNotBetween(String value1, String value2) {
            addCriterion("led_three_right not between", value1, value2, "ledThreeRight");
            return (Criteria) this;
        }

        public Criteria andVideoThreeIsNull() {
            addCriterion("video_three is null");
            return (Criteria) this;
        }

        public Criteria andVideoThreeIsNotNull() {
            addCriterion("video_three is not null");
            return (Criteria) this;
        }

        public Criteria andVideoThreeEqualTo(String value) {
            addCriterion("video_three =", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeNotEqualTo(String value) {
            addCriterion("video_three <>", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeGreaterThan(String value) {
            addCriterion("video_three >", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeGreaterThanOrEqualTo(String value) {
            addCriterion("video_three >=", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeLessThan(String value) {
            addCriterion("video_three <", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeLessThanOrEqualTo(String value) {
            addCriterion("video_three <=", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeLike(String value) {
            addCriterion("video_three like", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeNotLike(String value) {
            addCriterion("video_three not like", value, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeIn(List<String> values) {
            addCriterion("video_three in", values, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeNotIn(List<String> values) {
            addCriterion("video_three not in", values, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeBetween(String value1, String value2) {
            addCriterion("video_three between", value1, value2, "videoThree");
            return (Criteria) this;
        }

        public Criteria andVideoThreeNotBetween(String value1, String value2) {
            addCriterion("video_three not between", value1, value2, "videoThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeIsNull() {
            addCriterion("light_three is null");
            return (Criteria) this;
        }

        public Criteria andLightThreeIsNotNull() {
            addCriterion("light_three is not null");
            return (Criteria) this;
        }

        public Criteria andLightThreeEqualTo(Double value) {
            addCriterion("light_three =", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeNotEqualTo(Double value) {
            addCriterion("light_three <>", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeGreaterThan(Double value) {
            addCriterion("light_three >", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeGreaterThanOrEqualTo(Double value) {
            addCriterion("light_three >=", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeLessThan(Double value) {
            addCriterion("light_three <", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeLessThanOrEqualTo(Double value) {
            addCriterion("light_three <=", value, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeIn(List<Double> values) {
            addCriterion("light_three in", values, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeNotIn(List<Double> values) {
            addCriterion("light_three not in", values, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeBetween(Double value1, Double value2) {
            addCriterion("light_three between", value1, value2, "lightThree");
            return (Criteria) this;
        }

        public Criteria andLightThreeNotBetween(Double value1, Double value2) {
            addCriterion("light_three not between", value1, value2, "lightThree");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(Double value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(Double value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(Double value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(Double value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(Double value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(Double value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<Double> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<Double> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(Double value1, Double value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(Double value1, Double value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(Double value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(Double value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(Double value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(Double value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(Double value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(Double value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<Double> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<Double> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(Double value1, Double value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(Double value1, Double value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andEcIsNull() {
            addCriterion("ec is null");
            return (Criteria) this;
        }

        public Criteria andEcIsNotNull() {
            addCriterion("ec is not null");
            return (Criteria) this;
        }

        public Criteria andEcEqualTo(Double value) {
            addCriterion("ec =", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotEqualTo(Double value) {
            addCriterion("ec <>", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThan(Double value) {
            addCriterion("ec >", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcGreaterThanOrEqualTo(Double value) {
            addCriterion("ec >=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThan(Double value) {
            addCriterion("ec <", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcLessThanOrEqualTo(Double value) {
            addCriterion("ec <=", value, "ec");
            return (Criteria) this;
        }

        public Criteria andEcIn(List<Double> values) {
            addCriterion("ec in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotIn(List<Double> values) {
            addCriterion("ec not in", values, "ec");
            return (Criteria) this;
        }

        public Criteria andEcBetween(Double value1, Double value2) {
            addCriterion("ec between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andEcNotBetween(Double value1, Double value2) {
            addCriterion("ec not between", value1, value2, "ec");
            return (Criteria) this;
        }

        public Criteria andOxIsNull() {
            addCriterion("ox is null");
            return (Criteria) this;
        }

        public Criteria andOxIsNotNull() {
            addCriterion("ox is not null");
            return (Criteria) this;
        }

        public Criteria andOxEqualTo(Double value) {
            addCriterion("ox =", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxNotEqualTo(Double value) {
            addCriterion("ox <>", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxGreaterThan(Double value) {
            addCriterion("ox >", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxGreaterThanOrEqualTo(Double value) {
            addCriterion("ox >=", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxLessThan(Double value) {
            addCriterion("ox <", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxLessThanOrEqualTo(Double value) {
            addCriterion("ox <=", value, "ox");
            return (Criteria) this;
        }

        public Criteria andOxIn(List<Double> values) {
            addCriterion("ox in", values, "ox");
            return (Criteria) this;
        }

        public Criteria andOxNotIn(List<Double> values) {
            addCriterion("ox not in", values, "ox");
            return (Criteria) this;
        }

        public Criteria andOxBetween(Double value1, Double value2) {
            addCriterion("ox between", value1, value2, "ox");
            return (Criteria) this;
        }

        public Criteria andOxNotBetween(Double value1, Double value2) {
            addCriterion("ox not between", value1, value2, "ox");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureIsNull() {
            addCriterion("solution_temperature is null");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureIsNotNull() {
            addCriterion("solution_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureEqualTo(Double value) {
            addCriterion("solution_temperature =", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureNotEqualTo(Double value) {
            addCriterion("solution_temperature <>", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureGreaterThan(Double value) {
            addCriterion("solution_temperature >", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("solution_temperature >=", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureLessThan(Double value) {
            addCriterion("solution_temperature <", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("solution_temperature <=", value, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureIn(List<Double> values) {
            addCriterion("solution_temperature in", values, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureNotIn(List<Double> values) {
            addCriterion("solution_temperature not in", values, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureBetween(Double value1, Double value2) {
            addCriterion("solution_temperature between", value1, value2, "solutionTemperature");
            return (Criteria) this;
        }

        public Criteria andSolutionTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("solution_temperature not between", value1, value2, "solutionTemperature");
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

        public Criteria andLevelUpIsNull() {
            addCriterion("level_up is null");
            return (Criteria) this;
        }

        public Criteria andLevelUpIsNotNull() {
            addCriterion("level_up is not null");
            return (Criteria) this;
        }

        public Criteria andLevelUpEqualTo(Double value) {
            addCriterion("level_up =", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpNotEqualTo(Double value) {
            addCriterion("level_up <>", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpGreaterThan(Double value) {
            addCriterion("level_up >", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpGreaterThanOrEqualTo(Double value) {
            addCriterion("level_up >=", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpLessThan(Double value) {
            addCriterion("level_up <", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpLessThanOrEqualTo(Double value) {
            addCriterion("level_up <=", value, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpIn(List<Double> values) {
            addCriterion("level_up in", values, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpNotIn(List<Double> values) {
            addCriterion("level_up not in", values, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpBetween(Double value1, Double value2) {
            addCriterion("level_up between", value1, value2, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelUpNotBetween(Double value1, Double value2) {
            addCriterion("level_up not between", value1, value2, "levelUp");
            return (Criteria) this;
        }

        public Criteria andLevelDownIsNull() {
            addCriterion("level_down is null");
            return (Criteria) this;
        }

        public Criteria andLevelDownIsNotNull() {
            addCriterion("level_down is not null");
            return (Criteria) this;
        }

        public Criteria andLevelDownEqualTo(Double value) {
            addCriterion("level_down =", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownNotEqualTo(Double value) {
            addCriterion("level_down <>", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownGreaterThan(Double value) {
            addCriterion("level_down >", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownGreaterThanOrEqualTo(Double value) {
            addCriterion("level_down >=", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownLessThan(Double value) {
            addCriterion("level_down <", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownLessThanOrEqualTo(Double value) {
            addCriterion("level_down <=", value, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownIn(List<Double> values) {
            addCriterion("level_down in", values, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownNotIn(List<Double> values) {
            addCriterion("level_down not in", values, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownBetween(Double value1, Double value2) {
            addCriterion("level_down between", value1, value2, "levelDown");
            return (Criteria) this;
        }

        public Criteria andLevelDownNotBetween(Double value1, Double value2) {
            addCriterion("level_down not between", value1, value2, "levelDown");
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

        public Criteria andModelIdIsNull() {
            addCriterion("model_id is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("model_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("model_id =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("model_id <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("model_id >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_id >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("model_id <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_id <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("model_id in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("model_id not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("model_id between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_id not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIsNull() {
            addCriterion("trust_status is null");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIsNotNull() {
            addCriterion("trust_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrustStatusEqualTo(String value) {
            addCriterion("trust_status =", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotEqualTo(String value) {
            addCriterion("trust_status <>", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusGreaterThan(String value) {
            addCriterion("trust_status >", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusGreaterThanOrEqualTo(String value) {
            addCriterion("trust_status >=", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusLessThan(String value) {
            addCriterion("trust_status <", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusLessThanOrEqualTo(String value) {
            addCriterion("trust_status <=", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusLike(String value) {
            addCriterion("trust_status like", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotLike(String value) {
            addCriterion("trust_status not like", value, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusIn(List<String> values) {
            addCriterion("trust_status in", values, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotIn(List<String> values) {
            addCriterion("trust_status not in", values, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusBetween(String value1, String value2) {
            addCriterion("trust_status between", value1, value2, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andTrustStatusNotBetween(String value1, String value2) {
            addCriterion("trust_status not between", value1, value2, "trustStatus");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeIsNull() {
            addCriterion("one_planting_time is null");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeIsNotNull() {
            addCriterion("one_planting_time is not null");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeEqualTo(Date value) {
            addCriterion("one_planting_time =", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeNotEqualTo(Date value) {
            addCriterion("one_planting_time <>", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeGreaterThan(Date value) {
            addCriterion("one_planting_time >", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("one_planting_time >=", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeLessThan(Date value) {
            addCriterion("one_planting_time <", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeLessThanOrEqualTo(Date value) {
            addCriterion("one_planting_time <=", value, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeIn(List<Date> values) {
            addCriterion("one_planting_time in", values, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeNotIn(List<Date> values) {
            addCriterion("one_planting_time not in", values, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeBetween(Date value1, Date value2) {
            addCriterion("one_planting_time between", value1, value2, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOnePlantingTimeNotBetween(Date value1, Date value2) {
            addCriterion("one_planting_time not between", value1, value2, "onePlantingTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeIsNull() {
            addCriterion("one_recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeIsNotNull() {
            addCriterion("one_recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeEqualTo(Date value) {
            addCriterion("one_recovery_time =", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeNotEqualTo(Date value) {
            addCriterion("one_recovery_time <>", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeGreaterThan(Date value) {
            addCriterion("one_recovery_time >", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("one_recovery_time >=", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeLessThan(Date value) {
            addCriterion("one_recovery_time <", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("one_recovery_time <=", value, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeIn(List<Date> values) {
            addCriterion("one_recovery_time in", values, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeNotIn(List<Date> values) {
            addCriterion("one_recovery_time not in", values, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeBetween(Date value1, Date value2) {
            addCriterion("one_recovery_time between", value1, value2, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andOneRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("one_recovery_time not between", value1, value2, "oneRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeIsNull() {
            addCriterion("two_planting_time is null");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeIsNotNull() {
            addCriterion("two_planting_time is not null");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeEqualTo(Date value) {
            addCriterion("two_planting_time =", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeNotEqualTo(Date value) {
            addCriterion("two_planting_time <>", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeGreaterThan(Date value) {
            addCriterion("two_planting_time >", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("two_planting_time >=", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeLessThan(Date value) {
            addCriterion("two_planting_time <", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeLessThanOrEqualTo(Date value) {
            addCriterion("two_planting_time <=", value, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeIn(List<Date> values) {
            addCriterion("two_planting_time in", values, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeNotIn(List<Date> values) {
            addCriterion("two_planting_time not in", values, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeBetween(Date value1, Date value2) {
            addCriterion("two_planting_time between", value1, value2, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoPlantingTimeNotBetween(Date value1, Date value2) {
            addCriterion("two_planting_time not between", value1, value2, "twoPlantingTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeIsNull() {
            addCriterion("two_recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeIsNotNull() {
            addCriterion("two_recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeEqualTo(Date value) {
            addCriterion("two_recovery_time =", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeNotEqualTo(Date value) {
            addCriterion("two_recovery_time <>", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeGreaterThan(Date value) {
            addCriterion("two_recovery_time >", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("two_recovery_time >=", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeLessThan(Date value) {
            addCriterion("two_recovery_time <", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("two_recovery_time <=", value, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeIn(List<Date> values) {
            addCriterion("two_recovery_time in", values, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeNotIn(List<Date> values) {
            addCriterion("two_recovery_time not in", values, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeBetween(Date value1, Date value2) {
            addCriterion("two_recovery_time between", value1, value2, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andTwoRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("two_recovery_time not between", value1, value2, "twoRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeIsNull() {
            addCriterion("three_planting_time is null");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeIsNotNull() {
            addCriterion("three_planting_time is not null");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeEqualTo(Date value) {
            addCriterion("three_planting_time =", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeNotEqualTo(Date value) {
            addCriterion("three_planting_time <>", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeGreaterThan(Date value) {
            addCriterion("three_planting_time >", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("three_planting_time >=", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeLessThan(Date value) {
            addCriterion("three_planting_time <", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeLessThanOrEqualTo(Date value) {
            addCriterion("three_planting_time <=", value, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeIn(List<Date> values) {
            addCriterion("three_planting_time in", values, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeNotIn(List<Date> values) {
            addCriterion("three_planting_time not in", values, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeBetween(Date value1, Date value2) {
            addCriterion("three_planting_time between", value1, value2, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreePlantingTimeNotBetween(Date value1, Date value2) {
            addCriterion("three_planting_time not between", value1, value2, "threePlantingTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeIsNull() {
            addCriterion("three_recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeIsNotNull() {
            addCriterion("three_recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeEqualTo(Date value) {
            addCriterion("three_recovery_time =", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeNotEqualTo(Date value) {
            addCriterion("three_recovery_time <>", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeGreaterThan(Date value) {
            addCriterion("three_recovery_time >", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("three_recovery_time >=", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeLessThan(Date value) {
            addCriterion("three_recovery_time <", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("three_recovery_time <=", value, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeIn(List<Date> values) {
            addCriterion("three_recovery_time in", values, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeNotIn(List<Date> values) {
            addCriterion("three_recovery_time not in", values, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeBetween(Date value1, Date value2) {
            addCriterion("three_recovery_time between", value1, value2, "threeRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andThreeRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("three_recovery_time not between", value1, value2, "threeRecoveryTime");
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
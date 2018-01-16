package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModelExample() {
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

        public Criteria andModelNameIsNull() {
            addCriterion("model_name is null");
            return (Criteria) this;
        }

        public Criteria andModelNameIsNotNull() {
            addCriterion("model_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelNameEqualTo(String value) {
            addCriterion("model_name =", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotEqualTo(String value) {
            addCriterion("model_name <>", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThan(String value) {
            addCriterion("model_name >", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_name >=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThan(String value) {
            addCriterion("model_name <", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLessThanOrEqualTo(String value) {
            addCriterion("model_name <=", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameLike(String value) {
            addCriterion("model_name like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotLike(String value) {
            addCriterion("model_name not like", value, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameIn(List<String> values) {
            addCriterion("model_name in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotIn(List<String> values) {
            addCriterion("model_name not in", values, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameBetween(String value1, String value2) {
            addCriterion("model_name between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andModelNameNotBetween(String value1, String value2) {
            addCriterion("model_name not between", value1, value2, "modelName");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpIsNull() {
            addCriterion("temperature_up is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpIsNotNull() {
            addCriterion("temperature_up is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpEqualTo(Double value) {
            addCriterion("temperature_up =", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpNotEqualTo(Double value) {
            addCriterion("temperature_up <>", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpGreaterThan(Double value) {
            addCriterion("temperature_up >", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature_up >=", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpLessThan(Double value) {
            addCriterion("temperature_up <", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpLessThanOrEqualTo(Double value) {
            addCriterion("temperature_up <=", value, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpIn(List<Double> values) {
            addCriterion("temperature_up in", values, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpNotIn(List<Double> values) {
            addCriterion("temperature_up not in", values, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpBetween(Double value1, Double value2) {
            addCriterion("temperature_up between", value1, value2, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureUpNotBetween(Double value1, Double value2) {
            addCriterion("temperature_up not between", value1, value2, "temperatureUp");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownIsNull() {
            addCriterion("temperature_down is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownIsNotNull() {
            addCriterion("temperature_down is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownEqualTo(Double value) {
            addCriterion("temperature_down =", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownNotEqualTo(Double value) {
            addCriterion("temperature_down <>", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownGreaterThan(Double value) {
            addCriterion("temperature_down >", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature_down >=", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownLessThan(Double value) {
            addCriterion("temperature_down <", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownLessThanOrEqualTo(Double value) {
            addCriterion("temperature_down <=", value, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownIn(List<Double> values) {
            addCriterion("temperature_down in", values, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownNotIn(List<Double> values) {
            addCriterion("temperature_down not in", values, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownBetween(Double value1, Double value2) {
            addCriterion("temperature_down between", value1, value2, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andTemperatureDownNotBetween(Double value1, Double value2) {
            addCriterion("temperature_down not between", value1, value2, "temperatureDown");
            return (Criteria) this;
        }

        public Criteria andHumidityUpIsNull() {
            addCriterion("humidity_up is null");
            return (Criteria) this;
        }

        public Criteria andHumidityUpIsNotNull() {
            addCriterion("humidity_up is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityUpEqualTo(Double value) {
            addCriterion("humidity_up =", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpNotEqualTo(Double value) {
            addCriterion("humidity_up <>", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpGreaterThan(Double value) {
            addCriterion("humidity_up >", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity_up >=", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpLessThan(Double value) {
            addCriterion("humidity_up <", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpLessThanOrEqualTo(Double value) {
            addCriterion("humidity_up <=", value, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpIn(List<Double> values) {
            addCriterion("humidity_up in", values, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpNotIn(List<Double> values) {
            addCriterion("humidity_up not in", values, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpBetween(Double value1, Double value2) {
            addCriterion("humidity_up between", value1, value2, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityUpNotBetween(Double value1, Double value2) {
            addCriterion("humidity_up not between", value1, value2, "humidityUp");
            return (Criteria) this;
        }

        public Criteria andHumidityDownIsNull() {
            addCriterion("humidity_down is null");
            return (Criteria) this;
        }

        public Criteria andHumidityDownIsNotNull() {
            addCriterion("humidity_down is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityDownEqualTo(Double value) {
            addCriterion("humidity_down =", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownNotEqualTo(Double value) {
            addCriterion("humidity_down <>", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownGreaterThan(Double value) {
            addCriterion("humidity_down >", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity_down >=", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownLessThan(Double value) {
            addCriterion("humidity_down <", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownLessThanOrEqualTo(Double value) {
            addCriterion("humidity_down <=", value, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownIn(List<Double> values) {
            addCriterion("humidity_down in", values, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownNotIn(List<Double> values) {
            addCriterion("humidity_down not in", values, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownBetween(Double value1, Double value2) {
            addCriterion("humidity_down between", value1, value2, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andHumidityDownNotBetween(Double value1, Double value2) {
            addCriterion("humidity_down not between", value1, value2, "humidityDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpIsNull() {
            addCriterion("illumination_up is null");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpIsNotNull() {
            addCriterion("illumination_up is not null");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpEqualTo(Double value) {
            addCriterion("illumination_up =", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpNotEqualTo(Double value) {
            addCriterion("illumination_up <>", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpGreaterThan(Double value) {
            addCriterion("illumination_up >", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpGreaterThanOrEqualTo(Double value) {
            addCriterion("illumination_up >=", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpLessThan(Double value) {
            addCriterion("illumination_up <", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpLessThanOrEqualTo(Double value) {
            addCriterion("illumination_up <=", value, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpIn(List<Double> values) {
            addCriterion("illumination_up in", values, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpNotIn(List<Double> values) {
            addCriterion("illumination_up not in", values, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpBetween(Double value1, Double value2) {
            addCriterion("illumination_up between", value1, value2, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationUpNotBetween(Double value1, Double value2) {
            addCriterion("illumination_up not between", value1, value2, "illuminationUp");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownIsNull() {
            addCriterion("illumination_down is null");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownIsNotNull() {
            addCriterion("illumination_down is not null");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownEqualTo(Double value) {
            addCriterion("illumination_down =", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownNotEqualTo(Double value) {
            addCriterion("illumination_down <>", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownGreaterThan(Double value) {
            addCriterion("illumination_down >", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownGreaterThanOrEqualTo(Double value) {
            addCriterion("illumination_down >=", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownLessThan(Double value) {
            addCriterion("illumination_down <", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownLessThanOrEqualTo(Double value) {
            addCriterion("illumination_down <=", value, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownIn(List<Double> values) {
            addCriterion("illumination_down in", values, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownNotIn(List<Double> values) {
            addCriterion("illumination_down not in", values, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownBetween(Double value1, Double value2) {
            addCriterion("illumination_down between", value1, value2, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andIlluminationDownNotBetween(Double value1, Double value2) {
            addCriterion("illumination_down not between", value1, value2, "illuminationDown");
            return (Criteria) this;
        }

        public Criteria andCo2UpIsNull() {
            addCriterion("co2_up is null");
            return (Criteria) this;
        }

        public Criteria andCo2UpIsNotNull() {
            addCriterion("co2_up is not null");
            return (Criteria) this;
        }

        public Criteria andCo2UpEqualTo(Double value) {
            addCriterion("co2_up =", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpNotEqualTo(Double value) {
            addCriterion("co2_up <>", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpGreaterThan(Double value) {
            addCriterion("co2_up >", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpGreaterThanOrEqualTo(Double value) {
            addCriterion("co2_up >=", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpLessThan(Double value) {
            addCriterion("co2_up <", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpLessThanOrEqualTo(Double value) {
            addCriterion("co2_up <=", value, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpIn(List<Double> values) {
            addCriterion("co2_up in", values, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpNotIn(List<Double> values) {
            addCriterion("co2_up not in", values, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpBetween(Double value1, Double value2) {
            addCriterion("co2_up between", value1, value2, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2UpNotBetween(Double value1, Double value2) {
            addCriterion("co2_up not between", value1, value2, "co2Up");
            return (Criteria) this;
        }

        public Criteria andCo2DownIsNull() {
            addCriterion("co2_down is null");
            return (Criteria) this;
        }

        public Criteria andCo2DownIsNotNull() {
            addCriterion("co2_down is not null");
            return (Criteria) this;
        }

        public Criteria andCo2DownEqualTo(Double value) {
            addCriterion("co2_down =", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownNotEqualTo(Double value) {
            addCriterion("co2_down <>", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownGreaterThan(Double value) {
            addCriterion("co2_down >", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownGreaterThanOrEqualTo(Double value) {
            addCriterion("co2_down >=", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownLessThan(Double value) {
            addCriterion("co2_down <", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownLessThanOrEqualTo(Double value) {
            addCriterion("co2_down <=", value, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownIn(List<Double> values) {
            addCriterion("co2_down in", values, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownNotIn(List<Double> values) {
            addCriterion("co2_down not in", values, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownBetween(Double value1, Double value2) {
            addCriterion("co2_down between", value1, value2, "co2Down");
            return (Criteria) this;
        }

        public Criteria andCo2DownNotBetween(Double value1, Double value2) {
            addCriterion("co2_down not between", value1, value2, "co2Down");
            return (Criteria) this;
        }

        public Criteria andPhUpIsNull() {
            addCriterion("ph_up is null");
            return (Criteria) this;
        }

        public Criteria andPhUpIsNotNull() {
            addCriterion("ph_up is not null");
            return (Criteria) this;
        }

        public Criteria andPhUpEqualTo(Double value) {
            addCriterion("ph_up =", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpNotEqualTo(Double value) {
            addCriterion("ph_up <>", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpGreaterThan(Double value) {
            addCriterion("ph_up >", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpGreaterThanOrEqualTo(Double value) {
            addCriterion("ph_up >=", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpLessThan(Double value) {
            addCriterion("ph_up <", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpLessThanOrEqualTo(Double value) {
            addCriterion("ph_up <=", value, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpIn(List<Double> values) {
            addCriterion("ph_up in", values, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpNotIn(List<Double> values) {
            addCriterion("ph_up not in", values, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpBetween(Double value1, Double value2) {
            addCriterion("ph_up between", value1, value2, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhUpNotBetween(Double value1, Double value2) {
            addCriterion("ph_up not between", value1, value2, "phUp");
            return (Criteria) this;
        }

        public Criteria andPhDownIsNull() {
            addCriterion("ph_down is null");
            return (Criteria) this;
        }

        public Criteria andPhDownIsNotNull() {
            addCriterion("ph_down is not null");
            return (Criteria) this;
        }

        public Criteria andPhDownEqualTo(Double value) {
            addCriterion("ph_down =", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownNotEqualTo(Double value) {
            addCriterion("ph_down <>", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownGreaterThan(Double value) {
            addCriterion("ph_down >", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownGreaterThanOrEqualTo(Double value) {
            addCriterion("ph_down >=", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownLessThan(Double value) {
            addCriterion("ph_down <", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownLessThanOrEqualTo(Double value) {
            addCriterion("ph_down <=", value, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownIn(List<Double> values) {
            addCriterion("ph_down in", values, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownNotIn(List<Double> values) {
            addCriterion("ph_down not in", values, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownBetween(Double value1, Double value2) {
            addCriterion("ph_down between", value1, value2, "phDown");
            return (Criteria) this;
        }

        public Criteria andPhDownNotBetween(Double value1, Double value2) {
            addCriterion("ph_down not between", value1, value2, "phDown");
            return (Criteria) this;
        }

        public Criteria andEcUpIsNull() {
            addCriterion("ec_up is null");
            return (Criteria) this;
        }

        public Criteria andEcUpIsNotNull() {
            addCriterion("ec_up is not null");
            return (Criteria) this;
        }

        public Criteria andEcUpEqualTo(Double value) {
            addCriterion("ec_up =", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpNotEqualTo(Double value) {
            addCriterion("ec_up <>", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpGreaterThan(Double value) {
            addCriterion("ec_up >", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpGreaterThanOrEqualTo(Double value) {
            addCriterion("ec_up >=", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpLessThan(Double value) {
            addCriterion("ec_up <", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpLessThanOrEqualTo(Double value) {
            addCriterion("ec_up <=", value, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpIn(List<Double> values) {
            addCriterion("ec_up in", values, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpNotIn(List<Double> values) {
            addCriterion("ec_up not in", values, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpBetween(Double value1, Double value2) {
            addCriterion("ec_up between", value1, value2, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcUpNotBetween(Double value1, Double value2) {
            addCriterion("ec_up not between", value1, value2, "ecUp");
            return (Criteria) this;
        }

        public Criteria andEcDownIsNull() {
            addCriterion("ec_down is null");
            return (Criteria) this;
        }

        public Criteria andEcDownIsNotNull() {
            addCriterion("ec_down is not null");
            return (Criteria) this;
        }

        public Criteria andEcDownEqualTo(Double value) {
            addCriterion("ec_down =", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownNotEqualTo(Double value) {
            addCriterion("ec_down <>", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownGreaterThan(Double value) {
            addCriterion("ec_down >", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownGreaterThanOrEqualTo(Double value) {
            addCriterion("ec_down >=", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownLessThan(Double value) {
            addCriterion("ec_down <", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownLessThanOrEqualTo(Double value) {
            addCriterion("ec_down <=", value, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownIn(List<Double> values) {
            addCriterion("ec_down in", values, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownNotIn(List<Double> values) {
            addCriterion("ec_down not in", values, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownBetween(Double value1, Double value2) {
            addCriterion("ec_down between", value1, value2, "ecDown");
            return (Criteria) this;
        }

        public Criteria andEcDownNotBetween(Double value1, Double value2) {
            addCriterion("ec_down not between", value1, value2, "ecDown");
            return (Criteria) this;
        }

        public Criteria andOxygenUpIsNull() {
            addCriterion("oxygen_up is null");
            return (Criteria) this;
        }

        public Criteria andOxygenUpIsNotNull() {
            addCriterion("oxygen_up is not null");
            return (Criteria) this;
        }

        public Criteria andOxygenUpEqualTo(Double value) {
            addCriterion("oxygen_up =", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpNotEqualTo(Double value) {
            addCriterion("oxygen_up <>", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpGreaterThan(Double value) {
            addCriterion("oxygen_up >", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpGreaterThanOrEqualTo(Double value) {
            addCriterion("oxygen_up >=", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpLessThan(Double value) {
            addCriterion("oxygen_up <", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpLessThanOrEqualTo(Double value) {
            addCriterion("oxygen_up <=", value, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpIn(List<Double> values) {
            addCriterion("oxygen_up in", values, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpNotIn(List<Double> values) {
            addCriterion("oxygen_up not in", values, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpBetween(Double value1, Double value2) {
            addCriterion("oxygen_up between", value1, value2, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenUpNotBetween(Double value1, Double value2) {
            addCriterion("oxygen_up not between", value1, value2, "oxygenUp");
            return (Criteria) this;
        }

        public Criteria andOxygenDownIsNull() {
            addCriterion("oxygen_down is null");
            return (Criteria) this;
        }

        public Criteria andOxygenDownIsNotNull() {
            addCriterion("oxygen_down is not null");
            return (Criteria) this;
        }

        public Criteria andOxygenDownEqualTo(Double value) {
            addCriterion("oxygen_down =", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownNotEqualTo(Double value) {
            addCriterion("oxygen_down <>", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownGreaterThan(Double value) {
            addCriterion("oxygen_down >", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownGreaterThanOrEqualTo(Double value) {
            addCriterion("oxygen_down >=", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownLessThan(Double value) {
            addCriterion("oxygen_down <", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownLessThanOrEqualTo(Double value) {
            addCriterion("oxygen_down <=", value, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownIn(List<Double> values) {
            addCriterion("oxygen_down in", values, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownNotIn(List<Double> values) {
            addCriterion("oxygen_down not in", values, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownBetween(Double value1, Double value2) {
            addCriterion("oxygen_down between", value1, value2, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andOxygenDownNotBetween(Double value1, Double value2) {
            addCriterion("oxygen_down not between", value1, value2, "oxygenDown");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpIsNull() {
            addCriterion("high_level_up is null");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpIsNotNull() {
            addCriterion("high_level_up is not null");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpEqualTo(Double value) {
            addCriterion("high_level_up =", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpNotEqualTo(Double value) {
            addCriterion("high_level_up <>", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpGreaterThan(Double value) {
            addCriterion("high_level_up >", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpGreaterThanOrEqualTo(Double value) {
            addCriterion("high_level_up >=", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpLessThan(Double value) {
            addCriterion("high_level_up <", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpLessThanOrEqualTo(Double value) {
            addCriterion("high_level_up <=", value, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpIn(List<Double> values) {
            addCriterion("high_level_up in", values, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpNotIn(List<Double> values) {
            addCriterion("high_level_up not in", values, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpBetween(Double value1, Double value2) {
            addCriterion("high_level_up between", value1, value2, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHighLevelUpNotBetween(Double value1, Double value2) {
            addCriterion("high_level_up not between", value1, value2, "highLevelUp");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownIsNull() {
            addCriterion("hight_level_down is null");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownIsNotNull() {
            addCriterion("hight_level_down is not null");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownEqualTo(Double value) {
            addCriterion("hight_level_down =", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownNotEqualTo(Double value) {
            addCriterion("hight_level_down <>", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownGreaterThan(Double value) {
            addCriterion("hight_level_down >", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownGreaterThanOrEqualTo(Double value) {
            addCriterion("hight_level_down >=", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownLessThan(Double value) {
            addCriterion("hight_level_down <", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownLessThanOrEqualTo(Double value) {
            addCriterion("hight_level_down <=", value, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownIn(List<Double> values) {
            addCriterion("hight_level_down in", values, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownNotIn(List<Double> values) {
            addCriterion("hight_level_down not in", values, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownBetween(Double value1, Double value2) {
            addCriterion("hight_level_down between", value1, value2, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andHightLevelDownNotBetween(Double value1, Double value2) {
            addCriterion("hight_level_down not between", value1, value2, "hightLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpIsNull() {
            addCriterion("low_level_up is null");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpIsNotNull() {
            addCriterion("low_level_up is not null");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpEqualTo(Double value) {
            addCriterion("low_level_up =", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpNotEqualTo(Double value) {
            addCriterion("low_level_up <>", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpGreaterThan(Double value) {
            addCriterion("low_level_up >", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpGreaterThanOrEqualTo(Double value) {
            addCriterion("low_level_up >=", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpLessThan(Double value) {
            addCriterion("low_level_up <", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpLessThanOrEqualTo(Double value) {
            addCriterion("low_level_up <=", value, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpIn(List<Double> values) {
            addCriterion("low_level_up in", values, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpNotIn(List<Double> values) {
            addCriterion("low_level_up not in", values, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpBetween(Double value1, Double value2) {
            addCriterion("low_level_up between", value1, value2, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelUpNotBetween(Double value1, Double value2) {
            addCriterion("low_level_up not between", value1, value2, "lowLevelUp");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownIsNull() {
            addCriterion("low_level_down is null");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownIsNotNull() {
            addCriterion("low_level_down is not null");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownEqualTo(Double value) {
            addCriterion("low_level_down =", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownNotEqualTo(Double value) {
            addCriterion("low_level_down <>", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownGreaterThan(Double value) {
            addCriterion("low_level_down >", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownGreaterThanOrEqualTo(Double value) {
            addCriterion("low_level_down >=", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownLessThan(Double value) {
            addCriterion("low_level_down <", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownLessThanOrEqualTo(Double value) {
            addCriterion("low_level_down <=", value, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownIn(List<Double> values) {
            addCriterion("low_level_down in", values, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownNotIn(List<Double> values) {
            addCriterion("low_level_down not in", values, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownBetween(Double value1, Double value2) {
            addCriterion("low_level_down between", value1, value2, "lowLevelDown");
            return (Criteria) this;
        }

        public Criteria andLowLevelDownNotBetween(Double value1, Double value2) {
            addCriterion("low_level_down not between", value1, value2, "lowLevelDown");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
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
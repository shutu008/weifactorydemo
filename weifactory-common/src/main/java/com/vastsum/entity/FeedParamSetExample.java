package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeedParamSetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FeedParamSetExample() {
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

        public Criteria andFeedParamIdIsNull() {
            addCriterion("feed_param_id is null");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdIsNotNull() {
            addCriterion("feed_param_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdEqualTo(Long value) {
            addCriterion("feed_param_id =", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdNotEqualTo(Long value) {
            addCriterion("feed_param_id <>", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdGreaterThan(Long value) {
            addCriterion("feed_param_id >", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feed_param_id >=", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdLessThan(Long value) {
            addCriterion("feed_param_id <", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdLessThanOrEqualTo(Long value) {
            addCriterion("feed_param_id <=", value, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdIn(List<Long> values) {
            addCriterion("feed_param_id in", values, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdNotIn(List<Long> values) {
            addCriterion("feed_param_id not in", values, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdBetween(Long value1, Long value2) {
            addCriterion("feed_param_id between", value1, value2, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andFeedParamIdNotBetween(Long value1, Long value2) {
            addCriterion("feed_param_id not between", value1, value2, "feedParamId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNull() {
            addCriterion("plant_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantIdIsNotNull() {
            addCriterion("plant_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantIdEqualTo(String value) {
            addCriterion("plant_id =", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotEqualTo(String value) {
            addCriterion("plant_id <>", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThan(String value) {
            addCriterion("plant_id >", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdGreaterThanOrEqualTo(String value) {
            addCriterion("plant_id >=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThan(String value) {
            addCriterion("plant_id <", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLessThanOrEqualTo(String value) {
            addCriterion("plant_id <=", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdLike(String value) {
            addCriterion("plant_id like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotLike(String value) {
            addCriterion("plant_id not like", value, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdIn(List<String> values) {
            addCriterion("plant_id in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotIn(List<String> values) {
            addCriterion("plant_id not in", values, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdBetween(String value1, String value2) {
            addCriterion("plant_id between", value1, value2, "plantId");
            return (Criteria) this;
        }

        public Criteria andPlantIdNotBetween(String value1, String value2) {
            addCriterion("plant_id not between", value1, value2, "plantId");
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

        public Criteria andDayFeedBgIntervalIsNull() {
            addCriterion("day_feed_bg_interval is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalIsNotNull() {
            addCriterion("day_feed_bg_interval is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalEqualTo(Integer value) {
            addCriterion("day_feed_bg_interval =", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalNotEqualTo(Integer value) {
            addCriterion("day_feed_bg_interval <>", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalGreaterThan(Integer value) {
            addCriterion("day_feed_bg_interval >", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_interval >=", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalLessThan(Integer value) {
            addCriterion("day_feed_bg_interval <", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_bg_interval <=", value, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalIn(List<Integer> values) {
            addCriterion("day_feed_bg_interval in", values, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalNotIn(List<Integer> values) {
            addCriterion("day_feed_bg_interval not in", values, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_interval between", value1, value2, "dayFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedBgIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_bg_interval not between", value1, value2, "dayFeedBgInterval");
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

        public Criteria andNightFeedBgIntervalIsNull() {
            addCriterion("night_feed_bg_interval is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalIsNotNull() {
            addCriterion("night_feed_bg_interval is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalEqualTo(Integer value) {
            addCriterion("night_feed_bg_interval =", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalNotEqualTo(Integer value) {
            addCriterion("night_feed_bg_interval <>", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalGreaterThan(Integer value) {
            addCriterion("night_feed_bg_interval >", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_interval >=", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalLessThan(Integer value) {
            addCriterion("night_feed_bg_interval <", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_bg_interval <=", value, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalIn(List<Integer> values) {
            addCriterion("night_feed_bg_interval in", values, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalNotIn(List<Integer> values) {
            addCriterion("night_feed_bg_interval not in", values, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_interval between", value1, value2, "nightFeedBgInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedBgIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_bg_interval not between", value1, value2, "nightFeedBgInterval");
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

        public Criteria andDayFeedWaterIntervalIsNull() {
            addCriterion("day_feed_water_interval is null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalIsNotNull() {
            addCriterion("day_feed_water_interval is not null");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalEqualTo(Integer value) {
            addCriterion("day_feed_water_interval =", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalNotEqualTo(Integer value) {
            addCriterion("day_feed_water_interval <>", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalGreaterThan(Integer value) {
            addCriterion("day_feed_water_interval >", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_interval >=", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalLessThan(Integer value) {
            addCriterion("day_feed_water_interval <", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("day_feed_water_interval <=", value, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalIn(List<Integer> values) {
            addCriterion("day_feed_water_interval in", values, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalNotIn(List<Integer> values) {
            addCriterion("day_feed_water_interval not in", values, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_interval between", value1, value2, "dayFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andDayFeedWaterIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("day_feed_water_interval not between", value1, value2, "dayFeedWaterInterval");
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

        public Criteria andNightFeedWaterIntervalIsNull() {
            addCriterion("night_feed_water_interval is null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalIsNotNull() {
            addCriterion("night_feed_water_interval is not null");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalEqualTo(Integer value) {
            addCriterion("night_feed_water_interval =", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalNotEqualTo(Integer value) {
            addCriterion("night_feed_water_interval <>", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalGreaterThan(Integer value) {
            addCriterion("night_feed_water_interval >", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_interval >=", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalLessThan(Integer value) {
            addCriterion("night_feed_water_interval <", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("night_feed_water_interval <=", value, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalIn(List<Integer> values) {
            addCriterion("night_feed_water_interval in", values, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalNotIn(List<Integer> values) {
            addCriterion("night_feed_water_interval not in", values, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_interval between", value1, value2, "nightFeedWaterInterval");
            return (Criteria) this;
        }

        public Criteria andNightFeedWaterIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("night_feed_water_interval not between", value1, value2, "nightFeedWaterInterval");
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
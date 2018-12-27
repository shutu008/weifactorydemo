package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrowthPatternParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowthPatternParamExample() {
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

        public Criteria andGrowthIdIsNull() {
            addCriterion("growth_id is null");
            return (Criteria) this;
        }

        public Criteria andGrowthIdIsNotNull() {
            addCriterion("growth_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthIdEqualTo(Long value) {
            addCriterion("growth_id =", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdNotEqualTo(Long value) {
            addCriterion("growth_id <>", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdGreaterThan(Long value) {
            addCriterion("growth_id >", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdGreaterThanOrEqualTo(Long value) {
            addCriterion("growth_id >=", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdLessThan(Long value) {
            addCriterion("growth_id <", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdLessThanOrEqualTo(Long value) {
            addCriterion("growth_id <=", value, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdIn(List<Long> values) {
            addCriterion("growth_id in", values, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdNotIn(List<Long> values) {
            addCriterion("growth_id not in", values, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdBetween(Long value1, Long value2) {
            addCriterion("growth_id between", value1, value2, "growthId");
            return (Criteria) this;
        }

        public Criteria andGrowthIdNotBetween(Long value1, Long value2) {
            addCriterion("growth_id not between", value1, value2, "growthId");
            return (Criteria) this;
        }

        public Criteria andPlantNoIsNull() {
            addCriterion("plant_no is null");
            return (Criteria) this;
        }

        public Criteria andPlantNoIsNotNull() {
            addCriterion("plant_no is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNoEqualTo(String value) {
            addCriterion("plant_no =", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoNotEqualTo(String value) {
            addCriterion("plant_no <>", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoGreaterThan(String value) {
            addCriterion("plant_no >", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoGreaterThanOrEqualTo(String value) {
            addCriterion("plant_no >=", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoLessThan(String value) {
            addCriterion("plant_no <", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoLessThanOrEqualTo(String value) {
            addCriterion("plant_no <=", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoLike(String value) {
            addCriterion("plant_no like", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoNotLike(String value) {
            addCriterion("plant_no not like", value, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoIn(List<String> values) {
            addCriterion("plant_no in", values, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoNotIn(List<String> values) {
            addCriterion("plant_no not in", values, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoBetween(String value1, String value2) {
            addCriterion("plant_no between", value1, value2, "plantNo");
            return (Criteria) this;
        }

        public Criteria andPlantNoNotBetween(String value1, String value2) {
            addCriterion("plant_no not between", value1, value2, "plantNo");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderIsNull() {
            addCriterion("growth_order is null");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderIsNotNull() {
            addCriterion("growth_order is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderEqualTo(Integer value) {
            addCriterion("growth_order =", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderNotEqualTo(Integer value) {
            addCriterion("growth_order <>", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderGreaterThan(Integer value) {
            addCriterion("growth_order >", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_order >=", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderLessThan(Integer value) {
            addCriterion("growth_order <", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderLessThanOrEqualTo(Integer value) {
            addCriterion("growth_order <=", value, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderIn(List<Integer> values) {
            addCriterion("growth_order in", values, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderNotIn(List<Integer> values) {
            addCriterion("growth_order not in", values, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderBetween(Integer value1, Integer value2) {
            addCriterion("growth_order between", value1, value2, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_order not between", value1, value2, "growthOrder");
            return (Criteria) this;
        }

        public Criteria andGrowthNameIsNull() {
            addCriterion("growth_name is null");
            return (Criteria) this;
        }

        public Criteria andGrowthNameIsNotNull() {
            addCriterion("growth_name is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthNameEqualTo(String value) {
            addCriterion("growth_name =", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameNotEqualTo(String value) {
            addCriterion("growth_name <>", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameGreaterThan(String value) {
            addCriterion("growth_name >", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameGreaterThanOrEqualTo(String value) {
            addCriterion("growth_name >=", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameLessThan(String value) {
            addCriterion("growth_name <", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameLessThanOrEqualTo(String value) {
            addCriterion("growth_name <=", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameLike(String value) {
            addCriterion("growth_name like", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameNotLike(String value) {
            addCriterion("growth_name not like", value, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameIn(List<String> values) {
            addCriterion("growth_name in", values, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameNotIn(List<String> values) {
            addCriterion("growth_name not in", values, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameBetween(String value1, String value2) {
            addCriterion("growth_name between", value1, value2, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNameNotBetween(String value1, String value2) {
            addCriterion("growth_name not between", value1, value2, "growthName");
            return (Criteria) this;
        }

        public Criteria andGrowthNoIsNull() {
            addCriterion("growth_no is null");
            return (Criteria) this;
        }

        public Criteria andGrowthNoIsNotNull() {
            addCriterion("growth_no is not null");
            return (Criteria) this;
        }

        public Criteria andGrowthNoEqualTo(Integer value) {
            addCriterion("growth_no =", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoNotEqualTo(Integer value) {
            addCriterion("growth_no <>", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoGreaterThan(Integer value) {
            addCriterion("growth_no >", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("growth_no >=", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoLessThan(Integer value) {
            addCriterion("growth_no <", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoLessThanOrEqualTo(Integer value) {
            addCriterion("growth_no <=", value, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoIn(List<Integer> values) {
            addCriterion("growth_no in", values, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoNotIn(List<Integer> values) {
            addCriterion("growth_no not in", values, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoBetween(Integer value1, Integer value2) {
            addCriterion("growth_no between", value1, value2, "growthNo");
            return (Criteria) this;
        }

        public Criteria andGrowthNoNotBetween(Integer value1, Integer value2) {
            addCriterion("growth_no not between", value1, value2, "growthNo");
            return (Criteria) this;
        }

        public Criteria andAScIsNull() {
            addCriterion("a_sc is null");
            return (Criteria) this;
        }

        public Criteria andAScIsNotNull() {
            addCriterion("a_sc is not null");
            return (Criteria) this;
        }

        public Criteria andAScEqualTo(String value) {
            addCriterion("a_sc =", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScNotEqualTo(String value) {
            addCriterion("a_sc <>", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScGreaterThan(String value) {
            addCriterion("a_sc >", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScGreaterThanOrEqualTo(String value) {
            addCriterion("a_sc >=", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScLessThan(String value) {
            addCriterion("a_sc <", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScLessThanOrEqualTo(String value) {
            addCriterion("a_sc <=", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScLike(String value) {
            addCriterion("a_sc like", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScNotLike(String value) {
            addCriterion("a_sc not like", value, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScIn(List<String> values) {
            addCriterion("a_sc in", values, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScNotIn(List<String> values) {
            addCriterion("a_sc not in", values, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScBetween(String value1, String value2) {
            addCriterion("a_sc between", value1, value2, "aSc");
            return (Criteria) this;
        }

        public Criteria andAScNotBetween(String value1, String value2) {
            addCriterion("a_sc not between", value1, value2, "aSc");
            return (Criteria) this;
        }

        public Criteria andASyIsNull() {
            addCriterion("a_sy is null");
            return (Criteria) this;
        }

        public Criteria andASyIsNotNull() {
            addCriterion("a_sy is not null");
            return (Criteria) this;
        }

        public Criteria andASyEqualTo(String value) {
            addCriterion("a_sy =", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyNotEqualTo(String value) {
            addCriterion("a_sy <>", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyGreaterThan(String value) {
            addCriterion("a_sy >", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyGreaterThanOrEqualTo(String value) {
            addCriterion("a_sy >=", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyLessThan(String value) {
            addCriterion("a_sy <", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyLessThanOrEqualTo(String value) {
            addCriterion("a_sy <=", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyLike(String value) {
            addCriterion("a_sy like", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyNotLike(String value) {
            addCriterion("a_sy not like", value, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyIn(List<String> values) {
            addCriterion("a_sy in", values, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyNotIn(List<String> values) {
            addCriterion("a_sy not in", values, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyBetween(String value1, String value2) {
            addCriterion("a_sy between", value1, value2, "aSy");
            return (Criteria) this;
        }

        public Criteria andASyNotBetween(String value1, String value2) {
            addCriterion("a_sy not between", value1, value2, "aSy");
            return (Criteria) this;
        }

        public Criteria andADayStartIsNull() {
            addCriterion("a_day_start is null");
            return (Criteria) this;
        }

        public Criteria andADayStartIsNotNull() {
            addCriterion("a_day_start is not null");
            return (Criteria) this;
        }

        public Criteria andADayStartEqualTo(String value) {
            addCriterion("a_day_start =", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartNotEqualTo(String value) {
            addCriterion("a_day_start <>", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartGreaterThan(String value) {
            addCriterion("a_day_start >", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartGreaterThanOrEqualTo(String value) {
            addCriterion("a_day_start >=", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartLessThan(String value) {
            addCriterion("a_day_start <", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartLessThanOrEqualTo(String value) {
            addCriterion("a_day_start <=", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartLike(String value) {
            addCriterion("a_day_start like", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartNotLike(String value) {
            addCriterion("a_day_start not like", value, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartIn(List<String> values) {
            addCriterion("a_day_start in", values, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartNotIn(List<String> values) {
            addCriterion("a_day_start not in", values, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartBetween(String value1, String value2) {
            addCriterion("a_day_start between", value1, value2, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayStartNotBetween(String value1, String value2) {
            addCriterion("a_day_start not between", value1, value2, "aDayStart");
            return (Criteria) this;
        }

        public Criteria andADayEndIsNull() {
            addCriterion("a_day_end is null");
            return (Criteria) this;
        }

        public Criteria andADayEndIsNotNull() {
            addCriterion("a_day_end is not null");
            return (Criteria) this;
        }

        public Criteria andADayEndEqualTo(String value) {
            addCriterion("a_day_end =", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndNotEqualTo(String value) {
            addCriterion("a_day_end <>", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndGreaterThan(String value) {
            addCriterion("a_day_end >", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndGreaterThanOrEqualTo(String value) {
            addCriterion("a_day_end >=", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndLessThan(String value) {
            addCriterion("a_day_end <", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndLessThanOrEqualTo(String value) {
            addCriterion("a_day_end <=", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndLike(String value) {
            addCriterion("a_day_end like", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndNotLike(String value) {
            addCriterion("a_day_end not like", value, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndIn(List<String> values) {
            addCriterion("a_day_end in", values, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndNotIn(List<String> values) {
            addCriterion("a_day_end not in", values, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndBetween(String value1, String value2) {
            addCriterion("a_day_end between", value1, value2, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andADayEndNotBetween(String value1, String value2) {
            addCriterion("a_day_end not between", value1, value2, "aDayEnd");
            return (Criteria) this;
        }

        public Criteria andANightStartIsNull() {
            addCriterion("a_night_start is null");
            return (Criteria) this;
        }

        public Criteria andANightStartIsNotNull() {
            addCriterion("a_night_start is not null");
            return (Criteria) this;
        }

        public Criteria andANightStartEqualTo(String value) {
            addCriterion("a_night_start =", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartNotEqualTo(String value) {
            addCriterion("a_night_start <>", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartGreaterThan(String value) {
            addCriterion("a_night_start >", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartGreaterThanOrEqualTo(String value) {
            addCriterion("a_night_start >=", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartLessThan(String value) {
            addCriterion("a_night_start <", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartLessThanOrEqualTo(String value) {
            addCriterion("a_night_start <=", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartLike(String value) {
            addCriterion("a_night_start like", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartNotLike(String value) {
            addCriterion("a_night_start not like", value, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartIn(List<String> values) {
            addCriterion("a_night_start in", values, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartNotIn(List<String> values) {
            addCriterion("a_night_start not in", values, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartBetween(String value1, String value2) {
            addCriterion("a_night_start between", value1, value2, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightStartNotBetween(String value1, String value2) {
            addCriterion("a_night_start not between", value1, value2, "aNightStart");
            return (Criteria) this;
        }

        public Criteria andANightEndIsNull() {
            addCriterion("a_night_end is null");
            return (Criteria) this;
        }

        public Criteria andANightEndIsNotNull() {
            addCriterion("a_night_end is not null");
            return (Criteria) this;
        }

        public Criteria andANightEndEqualTo(String value) {
            addCriterion("a_night_end =", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndNotEqualTo(String value) {
            addCriterion("a_night_end <>", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndGreaterThan(String value) {
            addCriterion("a_night_end >", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndGreaterThanOrEqualTo(String value) {
            addCriterion("a_night_end >=", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndLessThan(String value) {
            addCriterion("a_night_end <", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndLessThanOrEqualTo(String value) {
            addCriterion("a_night_end <=", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndLike(String value) {
            addCriterion("a_night_end like", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndNotLike(String value) {
            addCriterion("a_night_end not like", value, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndIn(List<String> values) {
            addCriterion("a_night_end in", values, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndNotIn(List<String> values) {
            addCriterion("a_night_end not in", values, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndBetween(String value1, String value2) {
            addCriterion("a_night_end between", value1, value2, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andANightEndNotBetween(String value1, String value2) {
            addCriterion("a_night_end not between", value1, value2, "aNightEnd");
            return (Criteria) this;
        }

        public Criteria andADayWindLenIsNull() {
            addCriterion("a_day_wind_len is null");
            return (Criteria) this;
        }

        public Criteria andADayWindLenIsNotNull() {
            addCriterion("a_day_wind_len is not null");
            return (Criteria) this;
        }

        public Criteria andADayWindLenEqualTo(String value) {
            addCriterion("a_day_wind_len =", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenNotEqualTo(String value) {
            addCriterion("a_day_wind_len <>", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenGreaterThan(String value) {
            addCriterion("a_day_wind_len >", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenGreaterThanOrEqualTo(String value) {
            addCriterion("a_day_wind_len >=", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenLessThan(String value) {
            addCriterion("a_day_wind_len <", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenLessThanOrEqualTo(String value) {
            addCriterion("a_day_wind_len <=", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenLike(String value) {
            addCriterion("a_day_wind_len like", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenNotLike(String value) {
            addCriterion("a_day_wind_len not like", value, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenIn(List<String> values) {
            addCriterion("a_day_wind_len in", values, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenNotIn(List<String> values) {
            addCriterion("a_day_wind_len not in", values, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenBetween(String value1, String value2) {
            addCriterion("a_day_wind_len between", value1, value2, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindLenNotBetween(String value1, String value2) {
            addCriterion("a_day_wind_len not between", value1, value2, "aDayWindLen");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalIsNull() {
            addCriterion("a_day_wind_interval is null");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalIsNotNull() {
            addCriterion("a_day_wind_interval is not null");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalEqualTo(String value) {
            addCriterion("a_day_wind_interval =", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalNotEqualTo(String value) {
            addCriterion("a_day_wind_interval <>", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalGreaterThan(String value) {
            addCriterion("a_day_wind_interval >", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("a_day_wind_interval >=", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalLessThan(String value) {
            addCriterion("a_day_wind_interval <", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalLessThanOrEqualTo(String value) {
            addCriterion("a_day_wind_interval <=", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalLike(String value) {
            addCriterion("a_day_wind_interval like", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalNotLike(String value) {
            addCriterion("a_day_wind_interval not like", value, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalIn(List<String> values) {
            addCriterion("a_day_wind_interval in", values, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalNotIn(List<String> values) {
            addCriterion("a_day_wind_interval not in", values, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalBetween(String value1, String value2) {
            addCriterion("a_day_wind_interval between", value1, value2, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andADayWindIntervalNotBetween(String value1, String value2) {
            addCriterion("a_day_wind_interval not between", value1, value2, "aDayWindInterval");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenIsNull() {
            addCriterion("a_nigth_wind_len is null");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenIsNotNull() {
            addCriterion("a_nigth_wind_len is not null");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenEqualTo(String value) {
            addCriterion("a_nigth_wind_len =", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenNotEqualTo(String value) {
            addCriterion("a_nigth_wind_len <>", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenGreaterThan(String value) {
            addCriterion("a_nigth_wind_len >", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenGreaterThanOrEqualTo(String value) {
            addCriterion("a_nigth_wind_len >=", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenLessThan(String value) {
            addCriterion("a_nigth_wind_len <", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenLessThanOrEqualTo(String value) {
            addCriterion("a_nigth_wind_len <=", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenLike(String value) {
            addCriterion("a_nigth_wind_len like", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenNotLike(String value) {
            addCriterion("a_nigth_wind_len not like", value, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenIn(List<String> values) {
            addCriterion("a_nigth_wind_len in", values, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenNotIn(List<String> values) {
            addCriterion("a_nigth_wind_len not in", values, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenBetween(String value1, String value2) {
            addCriterion("a_nigth_wind_len between", value1, value2, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANigthWindLenNotBetween(String value1, String value2) {
            addCriterion("a_nigth_wind_len not between", value1, value2, "aNigthWindLen");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalIsNull() {
            addCriterion("a_night_wind_interval is null");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalIsNotNull() {
            addCriterion("a_night_wind_interval is not null");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalEqualTo(String value) {
            addCriterion("a_night_wind_interval =", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalNotEqualTo(String value) {
            addCriterion("a_night_wind_interval <>", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalGreaterThan(String value) {
            addCriterion("a_night_wind_interval >", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("a_night_wind_interval >=", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalLessThan(String value) {
            addCriterion("a_night_wind_interval <", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalLessThanOrEqualTo(String value) {
            addCriterion("a_night_wind_interval <=", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalLike(String value) {
            addCriterion("a_night_wind_interval like", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalNotLike(String value) {
            addCriterion("a_night_wind_interval not like", value, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalIn(List<String> values) {
            addCriterion("a_night_wind_interval in", values, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalNotIn(List<String> values) {
            addCriterion("a_night_wind_interval not in", values, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalBetween(String value1, String value2) {
            addCriterion("a_night_wind_interval between", value1, value2, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andANightWindIntervalNotBetween(String value1, String value2) {
            addCriterion("a_night_wind_interval not between", value1, value2, "aNightWindInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenIsNull() {
            addCriterion("b_day_bg_len is null");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenIsNotNull() {
            addCriterion("b_day_bg_len is not null");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenEqualTo(String value) {
            addCriterion("b_day_bg_len =", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenNotEqualTo(String value) {
            addCriterion("b_day_bg_len <>", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenGreaterThan(String value) {
            addCriterion("b_day_bg_len >", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_bg_len >=", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenLessThan(String value) {
            addCriterion("b_day_bg_len <", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenLessThanOrEqualTo(String value) {
            addCriterion("b_day_bg_len <=", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenLike(String value) {
            addCriterion("b_day_bg_len like", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenNotLike(String value) {
            addCriterion("b_day_bg_len not like", value, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenIn(List<String> values) {
            addCriterion("b_day_bg_len in", values, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenNotIn(List<String> values) {
            addCriterion("b_day_bg_len not in", values, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenBetween(String value1, String value2) {
            addCriterion("b_day_bg_len between", value1, value2, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgLenNotBetween(String value1, String value2) {
            addCriterion("b_day_bg_len not between", value1, value2, "bDayBgLen");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalIsNull() {
            addCriterion("b_day_bg_interval is null");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalIsNotNull() {
            addCriterion("b_day_bg_interval is not null");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalEqualTo(String value) {
            addCriterion("b_day_bg_interval =", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalNotEqualTo(String value) {
            addCriterion("b_day_bg_interval <>", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalGreaterThan(String value) {
            addCriterion("b_day_bg_interval >", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_bg_interval >=", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalLessThan(String value) {
            addCriterion("b_day_bg_interval <", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalLessThanOrEqualTo(String value) {
            addCriterion("b_day_bg_interval <=", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalLike(String value) {
            addCriterion("b_day_bg_interval like", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalNotLike(String value) {
            addCriterion("b_day_bg_interval not like", value, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalIn(List<String> values) {
            addCriterion("b_day_bg_interval in", values, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalNotIn(List<String> values) {
            addCriterion("b_day_bg_interval not in", values, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalBetween(String value1, String value2) {
            addCriterion("b_day_bg_interval between", value1, value2, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayBgIntervalNotBetween(String value1, String value2) {
            addCriterion("b_day_bg_interval not between", value1, value2, "bDayBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenIsNull() {
            addCriterion("b_night_bg_len is null");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenIsNotNull() {
            addCriterion("b_night_bg_len is not null");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenEqualTo(String value) {
            addCriterion("b_night_bg_len =", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenNotEqualTo(String value) {
            addCriterion("b_night_bg_len <>", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenGreaterThan(String value) {
            addCriterion("b_night_bg_len >", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_bg_len >=", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenLessThan(String value) {
            addCriterion("b_night_bg_len <", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenLessThanOrEqualTo(String value) {
            addCriterion("b_night_bg_len <=", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenLike(String value) {
            addCriterion("b_night_bg_len like", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenNotLike(String value) {
            addCriterion("b_night_bg_len not like", value, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenIn(List<String> values) {
            addCriterion("b_night_bg_len in", values, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenNotIn(List<String> values) {
            addCriterion("b_night_bg_len not in", values, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenBetween(String value1, String value2) {
            addCriterion("b_night_bg_len between", value1, value2, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgLenNotBetween(String value1, String value2) {
            addCriterion("b_night_bg_len not between", value1, value2, "bNightBgLen");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalIsNull() {
            addCriterion("b_night_bg_interval is null");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalIsNotNull() {
            addCriterion("b_night_bg_interval is not null");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalEqualTo(String value) {
            addCriterion("b_night_bg_interval =", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalNotEqualTo(String value) {
            addCriterion("b_night_bg_interval <>", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalGreaterThan(String value) {
            addCriterion("b_night_bg_interval >", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_bg_interval >=", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalLessThan(String value) {
            addCriterion("b_night_bg_interval <", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalLessThanOrEqualTo(String value) {
            addCriterion("b_night_bg_interval <=", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalLike(String value) {
            addCriterion("b_night_bg_interval like", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalNotLike(String value) {
            addCriterion("b_night_bg_interval not like", value, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalIn(List<String> values) {
            addCriterion("b_night_bg_interval in", values, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalNotIn(List<String> values) {
            addCriterion("b_night_bg_interval not in", values, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalBetween(String value1, String value2) {
            addCriterion("b_night_bg_interval between", value1, value2, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBNightBgIntervalNotBetween(String value1, String value2) {
            addCriterion("b_night_bg_interval not between", value1, value2, "bNightBgInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenIsNull() {
            addCriterion("b_day_yy_len is null");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenIsNotNull() {
            addCriterion("b_day_yy_len is not null");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenEqualTo(String value) {
            addCriterion("b_day_yy_len =", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenNotEqualTo(String value) {
            addCriterion("b_day_yy_len <>", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenGreaterThan(String value) {
            addCriterion("b_day_yy_len >", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_yy_len >=", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenLessThan(String value) {
            addCriterion("b_day_yy_len <", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenLessThanOrEqualTo(String value) {
            addCriterion("b_day_yy_len <=", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenLike(String value) {
            addCriterion("b_day_yy_len like", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenNotLike(String value) {
            addCriterion("b_day_yy_len not like", value, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenIn(List<String> values) {
            addCriterion("b_day_yy_len in", values, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenNotIn(List<String> values) {
            addCriterion("b_day_yy_len not in", values, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenBetween(String value1, String value2) {
            addCriterion("b_day_yy_len between", value1, value2, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyLenNotBetween(String value1, String value2) {
            addCriterion("b_day_yy_len not between", value1, value2, "bDayYyLen");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalIsNull() {
            addCriterion("b_day_yy_interval is null");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalIsNotNull() {
            addCriterion("b_day_yy_interval is not null");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalEqualTo(String value) {
            addCriterion("b_day_yy_interval =", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalNotEqualTo(String value) {
            addCriterion("b_day_yy_interval <>", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalGreaterThan(String value) {
            addCriterion("b_day_yy_interval >", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_yy_interval >=", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalLessThan(String value) {
            addCriterion("b_day_yy_interval <", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalLessThanOrEqualTo(String value) {
            addCriterion("b_day_yy_interval <=", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalLike(String value) {
            addCriterion("b_day_yy_interval like", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalNotLike(String value) {
            addCriterion("b_day_yy_interval not like", value, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalIn(List<String> values) {
            addCriterion("b_day_yy_interval in", values, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalNotIn(List<String> values) {
            addCriterion("b_day_yy_interval not in", values, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalBetween(String value1, String value2) {
            addCriterion("b_day_yy_interval between", value1, value2, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayYyIntervalNotBetween(String value1, String value2) {
            addCriterion("b_day_yy_interval not between", value1, value2, "bDayYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenIsNull() {
            addCriterion("b_night_yy_len is null");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenIsNotNull() {
            addCriterion("b_night_yy_len is not null");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenEqualTo(String value) {
            addCriterion("b_night_yy_len =", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenNotEqualTo(String value) {
            addCriterion("b_night_yy_len <>", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenGreaterThan(String value) {
            addCriterion("b_night_yy_len >", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_yy_len >=", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenLessThan(String value) {
            addCriterion("b_night_yy_len <", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenLessThanOrEqualTo(String value) {
            addCriterion("b_night_yy_len <=", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenLike(String value) {
            addCriterion("b_night_yy_len like", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenNotLike(String value) {
            addCriterion("b_night_yy_len not like", value, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenIn(List<String> values) {
            addCriterion("b_night_yy_len in", values, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenNotIn(List<String> values) {
            addCriterion("b_night_yy_len not in", values, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenBetween(String value1, String value2) {
            addCriterion("b_night_yy_len between", value1, value2, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyLenNotBetween(String value1, String value2) {
            addCriterion("b_night_yy_len not between", value1, value2, "bNightYyLen");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalIsNull() {
            addCriterion("b_night_yy_interval is null");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalIsNotNull() {
            addCriterion("b_night_yy_interval is not null");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalEqualTo(String value) {
            addCriterion("b_night_yy_interval =", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalNotEqualTo(String value) {
            addCriterion("b_night_yy_interval <>", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalGreaterThan(String value) {
            addCriterion("b_night_yy_interval >", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_yy_interval >=", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalLessThan(String value) {
            addCriterion("b_night_yy_interval <", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalLessThanOrEqualTo(String value) {
            addCriterion("b_night_yy_interval <=", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalLike(String value) {
            addCriterion("b_night_yy_interval like", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalNotLike(String value) {
            addCriterion("b_night_yy_interval not like", value, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalIn(List<String> values) {
            addCriterion("b_night_yy_interval in", values, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalNotIn(List<String> values) {
            addCriterion("b_night_yy_interval not in", values, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalBetween(String value1, String value2) {
            addCriterion("b_night_yy_interval between", value1, value2, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBNightYyIntervalNotBetween(String value1, String value2) {
            addCriterion("b_night_yy_interval not between", value1, value2, "bNightYyInterval");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureIsNull() {
            addCriterion("b_day_temperature is null");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureIsNotNull() {
            addCriterion("b_day_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureEqualTo(String value) {
            addCriterion("b_day_temperature =", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureNotEqualTo(String value) {
            addCriterion("b_day_temperature <>", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureGreaterThan(String value) {
            addCriterion("b_day_temperature >", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_temperature >=", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureLessThan(String value) {
            addCriterion("b_day_temperature <", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureLessThanOrEqualTo(String value) {
            addCriterion("b_day_temperature <=", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureLike(String value) {
            addCriterion("b_day_temperature like", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureNotLike(String value) {
            addCriterion("b_day_temperature not like", value, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureIn(List<String> values) {
            addCriterion("b_day_temperature in", values, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureNotIn(List<String> values) {
            addCriterion("b_day_temperature not in", values, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureBetween(String value1, String value2) {
            addCriterion("b_day_temperature between", value1, value2, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayTemperatureNotBetween(String value1, String value2) {
            addCriterion("b_day_temperature not between", value1, value2, "bDayTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureIsNull() {
            addCriterion("b_night_temperature is null");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureIsNotNull() {
            addCriterion("b_night_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureEqualTo(String value) {
            addCriterion("b_night_temperature =", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureNotEqualTo(String value) {
            addCriterion("b_night_temperature <>", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureGreaterThan(String value) {
            addCriterion("b_night_temperature >", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_temperature >=", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureLessThan(String value) {
            addCriterion("b_night_temperature <", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureLessThanOrEqualTo(String value) {
            addCriterion("b_night_temperature <=", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureLike(String value) {
            addCriterion("b_night_temperature like", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureNotLike(String value) {
            addCriterion("b_night_temperature not like", value, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureIn(List<String> values) {
            addCriterion("b_night_temperature in", values, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureNotIn(List<String> values) {
            addCriterion("b_night_temperature not in", values, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureBetween(String value1, String value2) {
            addCriterion("b_night_temperature between", value1, value2, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBNightTemperatureNotBetween(String value1, String value2) {
            addCriterion("b_night_temperature not between", value1, value2, "bNightTemperature");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityIsNull() {
            addCriterion("b_day_humidity is null");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityIsNotNull() {
            addCriterion("b_day_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityEqualTo(String value) {
            addCriterion("b_day_humidity =", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityNotEqualTo(String value) {
            addCriterion("b_day_humidity <>", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityGreaterThan(String value) {
            addCriterion("b_day_humidity >", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("b_day_humidity >=", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityLessThan(String value) {
            addCriterion("b_day_humidity <", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityLessThanOrEqualTo(String value) {
            addCriterion("b_day_humidity <=", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityLike(String value) {
            addCriterion("b_day_humidity like", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityNotLike(String value) {
            addCriterion("b_day_humidity not like", value, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityIn(List<String> values) {
            addCriterion("b_day_humidity in", values, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityNotIn(List<String> values) {
            addCriterion("b_day_humidity not in", values, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityBetween(String value1, String value2) {
            addCriterion("b_day_humidity between", value1, value2, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBDayHumidityNotBetween(String value1, String value2) {
            addCriterion("b_day_humidity not between", value1, value2, "bDayHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityIsNull() {
            addCriterion("b_night_humidity is null");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityIsNotNull() {
            addCriterion("b_night_humidity is not null");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityEqualTo(String value) {
            addCriterion("b_night_humidity =", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityNotEqualTo(String value) {
            addCriterion("b_night_humidity <>", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityGreaterThan(String value) {
            addCriterion("b_night_humidity >", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityGreaterThanOrEqualTo(String value) {
            addCriterion("b_night_humidity >=", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityLessThan(String value) {
            addCriterion("b_night_humidity <", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityLessThanOrEqualTo(String value) {
            addCriterion("b_night_humidity <=", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityLike(String value) {
            addCriterion("b_night_humidity like", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityNotLike(String value) {
            addCriterion("b_night_humidity not like", value, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityIn(List<String> values) {
            addCriterion("b_night_humidity in", values, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityNotIn(List<String> values) {
            addCriterion("b_night_humidity not in", values, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityBetween(String value1, String value2) {
            addCriterion("b_night_humidity between", value1, value2, "bNightHumidity");
            return (Criteria) this;
        }

        public Criteria andBNightHumidityNotBetween(String value1, String value2) {
            addCriterion("b_night_humidity not between", value1, value2, "bNightHumidity");
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
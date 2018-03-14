package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HandControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandControlExample() {
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

        public Criteria andHandControlIdIsNull() {
            addCriterion("hand_control_id is null");
            return (Criteria) this;
        }

        public Criteria andHandControlIdIsNotNull() {
            addCriterion("hand_control_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandControlIdEqualTo(Long value) {
            addCriterion("hand_control_id =", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdNotEqualTo(Long value) {
            addCriterion("hand_control_id <>", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdGreaterThan(Long value) {
            addCriterion("hand_control_id >", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("hand_control_id >=", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdLessThan(Long value) {
            addCriterion("hand_control_id <", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdLessThanOrEqualTo(Long value) {
            addCriterion("hand_control_id <=", value, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdIn(List<Long> values) {
            addCriterion("hand_control_id in", values, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdNotIn(List<Long> values) {
            addCriterion("hand_control_id not in", values, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdBetween(Long value1, Long value2) {
            addCriterion("hand_control_id between", value1, value2, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHandControlIdNotBetween(Long value1, Long value2) {
            addCriterion("hand_control_id not between", value1, value2, "handControlId");
            return (Criteria) this;
        }

        public Criteria andHeadControlModIsNull() {
            addCriterion("head_control_mod is null");
            return (Criteria) this;
        }

        public Criteria andHeadControlModIsNotNull() {
            addCriterion("head_control_mod is not null");
            return (Criteria) this;
        }

        public Criteria andHeadControlModEqualTo(String value) {
            addCriterion("head_control_mod =", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModNotEqualTo(String value) {
            addCriterion("head_control_mod <>", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModGreaterThan(String value) {
            addCriterion("head_control_mod >", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModGreaterThanOrEqualTo(String value) {
            addCriterion("head_control_mod >=", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModLessThan(String value) {
            addCriterion("head_control_mod <", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModLessThanOrEqualTo(String value) {
            addCriterion("head_control_mod <=", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModLike(String value) {
            addCriterion("head_control_mod like", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModNotLike(String value) {
            addCriterion("head_control_mod not like", value, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModIn(List<String> values) {
            addCriterion("head_control_mod in", values, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModNotIn(List<String> values) {
            addCriterion("head_control_mod not in", values, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModBetween(String value1, String value2) {
            addCriterion("head_control_mod between", value1, value2, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andHeadControlModNotBetween(String value1, String value2) {
            addCriterion("head_control_mod not between", value1, value2, "headControlMod");
            return (Criteria) this;
        }

        public Criteria andSkyIsNull() {
            addCriterion("sky is null");
            return (Criteria) this;
        }

        public Criteria andSkyIsNotNull() {
            addCriterion("sky is not null");
            return (Criteria) this;
        }

        public Criteria andSkyEqualTo(String value) {
            addCriterion("sky =", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyNotEqualTo(String value) {
            addCriterion("sky <>", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyGreaterThan(String value) {
            addCriterion("sky >", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyGreaterThanOrEqualTo(String value) {
            addCriterion("sky >=", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyLessThan(String value) {
            addCriterion("sky <", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyLessThanOrEqualTo(String value) {
            addCriterion("sky <=", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyLike(String value) {
            addCriterion("sky like", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyNotLike(String value) {
            addCriterion("sky not like", value, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyIn(List<String> values) {
            addCriterion("sky in", values, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyNotIn(List<String> values) {
            addCriterion("sky not in", values, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyBetween(String value1, String value2) {
            addCriterion("sky between", value1, value2, "sky");
            return (Criteria) this;
        }

        public Criteria andSkyNotBetween(String value1, String value2) {
            addCriterion("sky not between", value1, value2, "sky");
            return (Criteria) this;
        }

        public Criteria andYyIsNull() {
            addCriterion("yy is null");
            return (Criteria) this;
        }

        public Criteria andYyIsNotNull() {
            addCriterion("yy is not null");
            return (Criteria) this;
        }

        public Criteria andYyEqualTo(String value) {
            addCriterion("yy =", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotEqualTo(String value) {
            addCriterion("yy <>", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThan(String value) {
            addCriterion("yy >", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyGreaterThanOrEqualTo(String value) {
            addCriterion("yy >=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThan(String value) {
            addCriterion("yy <", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLessThanOrEqualTo(String value) {
            addCriterion("yy <=", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyLike(String value) {
            addCriterion("yy like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotLike(String value) {
            addCriterion("yy not like", value, "yy");
            return (Criteria) this;
        }

        public Criteria andYyIn(List<String> values) {
            addCriterion("yy in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotIn(List<String> values) {
            addCriterion("yy not in", values, "yy");
            return (Criteria) this;
        }

        public Criteria andYyBetween(String value1, String value2) {
            addCriterion("yy between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andYyNotBetween(String value1, String value2) {
            addCriterion("yy not between", value1, value2, "yy");
            return (Criteria) this;
        }

        public Criteria andWindIsNull() {
            addCriterion("wind is null");
            return (Criteria) this;
        }

        public Criteria andWindIsNotNull() {
            addCriterion("wind is not null");
            return (Criteria) this;
        }

        public Criteria andWindEqualTo(String value) {
            addCriterion("wind =", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotEqualTo(String value) {
            addCriterion("wind <>", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThan(String value) {
            addCriterion("wind >", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThanOrEqualTo(String value) {
            addCriterion("wind >=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThan(String value) {
            addCriterion("wind <", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThanOrEqualTo(String value) {
            addCriterion("wind <=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLike(String value) {
            addCriterion("wind like", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotLike(String value) {
            addCriterion("wind not like", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindIn(List<String> values) {
            addCriterion("wind in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotIn(List<String> values) {
            addCriterion("wind not in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindBetween(String value1, String value2) {
            addCriterion("wind between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotBetween(String value1, String value2) {
            addCriterion("wind not between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andYsIsNull() {
            addCriterion("ys is null");
            return (Criteria) this;
        }

        public Criteria andYsIsNotNull() {
            addCriterion("ys is not null");
            return (Criteria) this;
        }

        public Criteria andYsEqualTo(String value) {
            addCriterion("ys =", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotEqualTo(String value) {
            addCriterion("ys <>", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThan(String value) {
            addCriterion("ys >", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsGreaterThanOrEqualTo(String value) {
            addCriterion("ys >=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThan(String value) {
            addCriterion("ys <", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLessThanOrEqualTo(String value) {
            addCriterion("ys <=", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsLike(String value) {
            addCriterion("ys like", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotLike(String value) {
            addCriterion("ys not like", value, "ys");
            return (Criteria) this;
        }

        public Criteria andYsIn(List<String> values) {
            addCriterion("ys in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotIn(List<String> values) {
            addCriterion("ys not in", values, "ys");
            return (Criteria) this;
        }

        public Criteria andYsBetween(String value1, String value2) {
            addCriterion("ys between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andYsNotBetween(String value1, String value2) {
            addCriterion("ys not between", value1, value2, "ys");
            return (Criteria) this;
        }

        public Criteria andPlIsNull() {
            addCriterion("pl is null");
            return (Criteria) this;
        }

        public Criteria andPlIsNotNull() {
            addCriterion("pl is not null");
            return (Criteria) this;
        }

        public Criteria andPlEqualTo(String value) {
            addCriterion("pl =", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotEqualTo(String value) {
            addCriterion("pl <>", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlGreaterThan(String value) {
            addCriterion("pl >", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlGreaterThanOrEqualTo(String value) {
            addCriterion("pl >=", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLessThan(String value) {
            addCriterion("pl <", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLessThanOrEqualTo(String value) {
            addCriterion("pl <=", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlLike(String value) {
            addCriterion("pl like", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotLike(String value) {
            addCriterion("pl not like", value, "pl");
            return (Criteria) this;
        }

        public Criteria andPlIn(List<String> values) {
            addCriterion("pl in", values, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotIn(List<String> values) {
            addCriterion("pl not in", values, "pl");
            return (Criteria) this;
        }

        public Criteria andPlBetween(String value1, String value2) {
            addCriterion("pl between", value1, value2, "pl");
            return (Criteria) this;
        }

        public Criteria andPlNotBetween(String value1, String value2) {
            addCriterion("pl not between", value1, value2, "pl");
            return (Criteria) this;
        }

        public Criteria andGrowInner1IsNull() {
            addCriterion("grow_inner_1 is null");
            return (Criteria) this;
        }

        public Criteria andGrowInner1IsNotNull() {
            addCriterion("grow_inner_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowInner1EqualTo(String value) {
            addCriterion("grow_inner_1 =", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1NotEqualTo(String value) {
            addCriterion("grow_inner_1 <>", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1GreaterThan(String value) {
            addCriterion("grow_inner_1 >", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1GreaterThanOrEqualTo(String value) {
            addCriterion("grow_inner_1 >=", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1LessThan(String value) {
            addCriterion("grow_inner_1 <", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1LessThanOrEqualTo(String value) {
            addCriterion("grow_inner_1 <=", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1Like(String value) {
            addCriterion("grow_inner_1 like", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1NotLike(String value) {
            addCriterion("grow_inner_1 not like", value, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1In(List<String> values) {
            addCriterion("grow_inner_1 in", values, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1NotIn(List<String> values) {
            addCriterion("grow_inner_1 not in", values, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1Between(String value1, String value2) {
            addCriterion("grow_inner_1 between", value1, value2, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowInner1NotBetween(String value1, String value2) {
            addCriterion("grow_inner_1 not between", value1, value2, "growInner1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1IsNull() {
            addCriterion("grow_middle_1 is null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1IsNotNull() {
            addCriterion("grow_middle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1EqualTo(String value) {
            addCriterion("grow_middle_1 =", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1NotEqualTo(String value) {
            addCriterion("grow_middle_1 <>", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1GreaterThan(String value) {
            addCriterion("grow_middle_1 >", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1GreaterThanOrEqualTo(String value) {
            addCriterion("grow_middle_1 >=", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1LessThan(String value) {
            addCriterion("grow_middle_1 <", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1LessThanOrEqualTo(String value) {
            addCriterion("grow_middle_1 <=", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1Like(String value) {
            addCriterion("grow_middle_1 like", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1NotLike(String value) {
            addCriterion("grow_middle_1 not like", value, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1In(List<String> values) {
            addCriterion("grow_middle_1 in", values, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1NotIn(List<String> values) {
            addCriterion("grow_middle_1 not in", values, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1Between(String value1, String value2) {
            addCriterion("grow_middle_1 between", value1, value2, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle1NotBetween(String value1, String value2) {
            addCriterion("grow_middle_1 not between", value1, value2, "growMiddle1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1IsNull() {
            addCriterion("grow_out_1 is null");
            return (Criteria) this;
        }

        public Criteria andGrowOut1IsNotNull() {
            addCriterion("grow_out_1 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOut1EqualTo(String value) {
            addCriterion("grow_out_1 =", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1NotEqualTo(String value) {
            addCriterion("grow_out_1 <>", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1GreaterThan(String value) {
            addCriterion("grow_out_1 >", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1GreaterThanOrEqualTo(String value) {
            addCriterion("grow_out_1 >=", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1LessThan(String value) {
            addCriterion("grow_out_1 <", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1LessThanOrEqualTo(String value) {
            addCriterion("grow_out_1 <=", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1Like(String value) {
            addCriterion("grow_out_1 like", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1NotLike(String value) {
            addCriterion("grow_out_1 not like", value, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1In(List<String> values) {
            addCriterion("grow_out_1 in", values, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1NotIn(List<String> values) {
            addCriterion("grow_out_1 not in", values, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1Between(String value1, String value2) {
            addCriterion("grow_out_1 between", value1, value2, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowOut1NotBetween(String value1, String value2) {
            addCriterion("grow_out_1 not between", value1, value2, "growOut1");
            return (Criteria) this;
        }

        public Criteria andGrowInner2IsNull() {
            addCriterion("grow_inner_2 is null");
            return (Criteria) this;
        }

        public Criteria andGrowInner2IsNotNull() {
            addCriterion("grow_inner_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowInner2EqualTo(String value) {
            addCriterion("grow_inner_2 =", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2NotEqualTo(String value) {
            addCriterion("grow_inner_2 <>", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2GreaterThan(String value) {
            addCriterion("grow_inner_2 >", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2GreaterThanOrEqualTo(String value) {
            addCriterion("grow_inner_2 >=", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2LessThan(String value) {
            addCriterion("grow_inner_2 <", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2LessThanOrEqualTo(String value) {
            addCriterion("grow_inner_2 <=", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2Like(String value) {
            addCriterion("grow_inner_2 like", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2NotLike(String value) {
            addCriterion("grow_inner_2 not like", value, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2In(List<String> values) {
            addCriterion("grow_inner_2 in", values, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2NotIn(List<String> values) {
            addCriterion("grow_inner_2 not in", values, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2Between(String value1, String value2) {
            addCriterion("grow_inner_2 between", value1, value2, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowInner2NotBetween(String value1, String value2) {
            addCriterion("grow_inner_2 not between", value1, value2, "growInner2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2IsNull() {
            addCriterion("grow_middle_2 is null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2IsNotNull() {
            addCriterion("grow_middle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2EqualTo(String value) {
            addCriterion("grow_middle_2 =", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2NotEqualTo(String value) {
            addCriterion("grow_middle_2 <>", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2GreaterThan(String value) {
            addCriterion("grow_middle_2 >", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2GreaterThanOrEqualTo(String value) {
            addCriterion("grow_middle_2 >=", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2LessThan(String value) {
            addCriterion("grow_middle_2 <", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2LessThanOrEqualTo(String value) {
            addCriterion("grow_middle_2 <=", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2Like(String value) {
            addCriterion("grow_middle_2 like", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2NotLike(String value) {
            addCriterion("grow_middle_2 not like", value, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2In(List<String> values) {
            addCriterion("grow_middle_2 in", values, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2NotIn(List<String> values) {
            addCriterion("grow_middle_2 not in", values, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2Between(String value1, String value2) {
            addCriterion("grow_middle_2 between", value1, value2, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle2NotBetween(String value1, String value2) {
            addCriterion("grow_middle_2 not between", value1, value2, "growMiddle2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2IsNull() {
            addCriterion("grow_out_2 is null");
            return (Criteria) this;
        }

        public Criteria andGrowOut2IsNotNull() {
            addCriterion("grow_out_2 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOut2EqualTo(String value) {
            addCriterion("grow_out_2 =", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2NotEqualTo(String value) {
            addCriterion("grow_out_2 <>", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2GreaterThan(String value) {
            addCriterion("grow_out_2 >", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2GreaterThanOrEqualTo(String value) {
            addCriterion("grow_out_2 >=", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2LessThan(String value) {
            addCriterion("grow_out_2 <", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2LessThanOrEqualTo(String value) {
            addCriterion("grow_out_2 <=", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2Like(String value) {
            addCriterion("grow_out_2 like", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2NotLike(String value) {
            addCriterion("grow_out_2 not like", value, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2In(List<String> values) {
            addCriterion("grow_out_2 in", values, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2NotIn(List<String> values) {
            addCriterion("grow_out_2 not in", values, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2Between(String value1, String value2) {
            addCriterion("grow_out_2 between", value1, value2, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowOut2NotBetween(String value1, String value2) {
            addCriterion("grow_out_2 not between", value1, value2, "growOut2");
            return (Criteria) this;
        }

        public Criteria andGrowInner3IsNull() {
            addCriterion("grow_inner_3 is null");
            return (Criteria) this;
        }

        public Criteria andGrowInner3IsNotNull() {
            addCriterion("grow_inner_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowInner3EqualTo(String value) {
            addCriterion("grow_inner_3 =", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3NotEqualTo(String value) {
            addCriterion("grow_inner_3 <>", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3GreaterThan(String value) {
            addCriterion("grow_inner_3 >", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3GreaterThanOrEqualTo(String value) {
            addCriterion("grow_inner_3 >=", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3LessThan(String value) {
            addCriterion("grow_inner_3 <", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3LessThanOrEqualTo(String value) {
            addCriterion("grow_inner_3 <=", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3Like(String value) {
            addCriterion("grow_inner_3 like", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3NotLike(String value) {
            addCriterion("grow_inner_3 not like", value, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3In(List<String> values) {
            addCriterion("grow_inner_3 in", values, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3NotIn(List<String> values) {
            addCriterion("grow_inner_3 not in", values, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3Between(String value1, String value2) {
            addCriterion("grow_inner_3 between", value1, value2, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowInner3NotBetween(String value1, String value2) {
            addCriterion("grow_inner_3 not between", value1, value2, "growInner3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3IsNull() {
            addCriterion("grow_middle_3 is null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3IsNotNull() {
            addCriterion("grow_middle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3EqualTo(String value) {
            addCriterion("grow_middle_3 =", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3NotEqualTo(String value) {
            addCriterion("grow_middle_3 <>", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3GreaterThan(String value) {
            addCriterion("grow_middle_3 >", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3GreaterThanOrEqualTo(String value) {
            addCriterion("grow_middle_3 >=", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3LessThan(String value) {
            addCriterion("grow_middle_3 <", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3LessThanOrEqualTo(String value) {
            addCriterion("grow_middle_3 <=", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3Like(String value) {
            addCriterion("grow_middle_3 like", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3NotLike(String value) {
            addCriterion("grow_middle_3 not like", value, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3In(List<String> values) {
            addCriterion("grow_middle_3 in", values, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3NotIn(List<String> values) {
            addCriterion("grow_middle_3 not in", values, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3Between(String value1, String value2) {
            addCriterion("grow_middle_3 between", value1, value2, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowMiddle3NotBetween(String value1, String value2) {
            addCriterion("grow_middle_3 not between", value1, value2, "growMiddle3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3IsNull() {
            addCriterion("grow_out_3 is null");
            return (Criteria) this;
        }

        public Criteria andGrowOut3IsNotNull() {
            addCriterion("grow_out_3 is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOut3EqualTo(String value) {
            addCriterion("grow_out_3 =", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3NotEqualTo(String value) {
            addCriterion("grow_out_3 <>", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3GreaterThan(String value) {
            addCriterion("grow_out_3 >", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3GreaterThanOrEqualTo(String value) {
            addCriterion("grow_out_3 >=", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3LessThan(String value) {
            addCriterion("grow_out_3 <", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3LessThanOrEqualTo(String value) {
            addCriterion("grow_out_3 <=", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3Like(String value) {
            addCriterion("grow_out_3 like", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3NotLike(String value) {
            addCriterion("grow_out_3 not like", value, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3In(List<String> values) {
            addCriterion("grow_out_3 in", values, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3NotIn(List<String> values) {
            addCriterion("grow_out_3 not in", values, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3Between(String value1, String value2) {
            addCriterion("grow_out_3 between", value1, value2, "growOut3");
            return (Criteria) this;
        }

        public Criteria andGrowOut3NotBetween(String value1, String value2) {
            addCriterion("grow_out_3 not between", value1, value2, "growOut3");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNull() {
            addCriterion("add_1 is null");
            return (Criteria) this;
        }

        public Criteria andAdd1IsNotNull() {
            addCriterion("add_1 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd1EqualTo(String value) {
            addCriterion("add_1 =", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotEqualTo(String value) {
            addCriterion("add_1 <>", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThan(String value) {
            addCriterion("add_1 >", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1GreaterThanOrEqualTo(String value) {
            addCriterion("add_1 >=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThan(String value) {
            addCriterion("add_1 <", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1LessThanOrEqualTo(String value) {
            addCriterion("add_1 <=", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Like(String value) {
            addCriterion("add_1 like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotLike(String value) {
            addCriterion("add_1 not like", value, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1In(List<String> values) {
            addCriterion("add_1 in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotIn(List<String> values) {
            addCriterion("add_1 not in", values, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1Between(String value1, String value2) {
            addCriterion("add_1 between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd1NotBetween(String value1, String value2) {
            addCriterion("add_1 not between", value1, value2, "add1");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNull() {
            addCriterion("add_2 is null");
            return (Criteria) this;
        }

        public Criteria andAdd2IsNotNull() {
            addCriterion("add_2 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd2EqualTo(String value) {
            addCriterion("add_2 =", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotEqualTo(String value) {
            addCriterion("add_2 <>", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThan(String value) {
            addCriterion("add_2 >", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2GreaterThanOrEqualTo(String value) {
            addCriterion("add_2 >=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThan(String value) {
            addCriterion("add_2 <", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2LessThanOrEqualTo(String value) {
            addCriterion("add_2 <=", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Like(String value) {
            addCriterion("add_2 like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotLike(String value) {
            addCriterion("add_2 not like", value, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2In(List<String> values) {
            addCriterion("add_2 in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotIn(List<String> values) {
            addCriterion("add_2 not in", values, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2Between(String value1, String value2) {
            addCriterion("add_2 between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd2NotBetween(String value1, String value2) {
            addCriterion("add_2 not between", value1, value2, "add2");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNull() {
            addCriterion("add_3 is null");
            return (Criteria) this;
        }

        public Criteria andAdd3IsNotNull() {
            addCriterion("add_3 is not null");
            return (Criteria) this;
        }

        public Criteria andAdd3EqualTo(String value) {
            addCriterion("add_3 =", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotEqualTo(String value) {
            addCriterion("add_3 <>", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThan(String value) {
            addCriterion("add_3 >", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3GreaterThanOrEqualTo(String value) {
            addCriterion("add_3 >=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThan(String value) {
            addCriterion("add_3 <", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3LessThanOrEqualTo(String value) {
            addCriterion("add_3 <=", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Like(String value) {
            addCriterion("add_3 like", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotLike(String value) {
            addCriterion("add_3 not like", value, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3In(List<String> values) {
            addCriterion("add_3 in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotIn(List<String> values) {
            addCriterion("add_3 not in", values, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3Between(String value1, String value2) {
            addCriterion("add_3 between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andAdd3NotBetween(String value1, String value2) {
            addCriterion("add_3 not between", value1, value2, "add3");
            return (Criteria) this;
        }

        public Criteria andInlet1IsNull() {
            addCriterion("inlet_1 is null");
            return (Criteria) this;
        }

        public Criteria andInlet1IsNotNull() {
            addCriterion("inlet_1 is not null");
            return (Criteria) this;
        }

        public Criteria andInlet1EqualTo(String value) {
            addCriterion("inlet_1 =", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1NotEqualTo(String value) {
            addCriterion("inlet_1 <>", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1GreaterThan(String value) {
            addCriterion("inlet_1 >", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1GreaterThanOrEqualTo(String value) {
            addCriterion("inlet_1 >=", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1LessThan(String value) {
            addCriterion("inlet_1 <", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1LessThanOrEqualTo(String value) {
            addCriterion("inlet_1 <=", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1Like(String value) {
            addCriterion("inlet_1 like", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1NotLike(String value) {
            addCriterion("inlet_1 not like", value, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1In(List<String> values) {
            addCriterion("inlet_1 in", values, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1NotIn(List<String> values) {
            addCriterion("inlet_1 not in", values, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1Between(String value1, String value2) {
            addCriterion("inlet_1 between", value1, value2, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet1NotBetween(String value1, String value2) {
            addCriterion("inlet_1 not between", value1, value2, "inlet1");
            return (Criteria) this;
        }

        public Criteria andInlet2IsNull() {
            addCriterion("inlet_2 is null");
            return (Criteria) this;
        }

        public Criteria andInlet2IsNotNull() {
            addCriterion("inlet_2 is not null");
            return (Criteria) this;
        }

        public Criteria andInlet2EqualTo(String value) {
            addCriterion("inlet_2 =", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2NotEqualTo(String value) {
            addCriterion("inlet_2 <>", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2GreaterThan(String value) {
            addCriterion("inlet_2 >", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2GreaterThanOrEqualTo(String value) {
            addCriterion("inlet_2 >=", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2LessThan(String value) {
            addCriterion("inlet_2 <", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2LessThanOrEqualTo(String value) {
            addCriterion("inlet_2 <=", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2Like(String value) {
            addCriterion("inlet_2 like", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2NotLike(String value) {
            addCriterion("inlet_2 not like", value, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2In(List<String> values) {
            addCriterion("inlet_2 in", values, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2NotIn(List<String> values) {
            addCriterion("inlet_2 not in", values, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2Between(String value1, String value2) {
            addCriterion("inlet_2 between", value1, value2, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet2NotBetween(String value1, String value2) {
            addCriterion("inlet_2 not between", value1, value2, "inlet2");
            return (Criteria) this;
        }

        public Criteria andInlet3IsNull() {
            addCriterion("inlet_3 is null");
            return (Criteria) this;
        }

        public Criteria andInlet3IsNotNull() {
            addCriterion("inlet_3 is not null");
            return (Criteria) this;
        }

        public Criteria andInlet3EqualTo(String value) {
            addCriterion("inlet_3 =", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3NotEqualTo(String value) {
            addCriterion("inlet_3 <>", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3GreaterThan(String value) {
            addCriterion("inlet_3 >", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3GreaterThanOrEqualTo(String value) {
            addCriterion("inlet_3 >=", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3LessThan(String value) {
            addCriterion("inlet_3 <", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3LessThanOrEqualTo(String value) {
            addCriterion("inlet_3 <=", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3Like(String value) {
            addCriterion("inlet_3 like", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3NotLike(String value) {
            addCriterion("inlet_3 not like", value, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3In(List<String> values) {
            addCriterion("inlet_3 in", values, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3NotIn(List<String> values) {
            addCriterion("inlet_3 not in", values, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3Between(String value1, String value2) {
            addCriterion("inlet_3 between", value1, value2, "inlet3");
            return (Criteria) this;
        }

        public Criteria andInlet3NotBetween(String value1, String value2) {
            addCriterion("inlet_3 not between", value1, value2, "inlet3");
            return (Criteria) this;
        }

        public Criteria andOut1IsNull() {
            addCriterion("out_1 is null");
            return (Criteria) this;
        }

        public Criteria andOut1IsNotNull() {
            addCriterion("out_1 is not null");
            return (Criteria) this;
        }

        public Criteria andOut1EqualTo(String value) {
            addCriterion("out_1 =", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1NotEqualTo(String value) {
            addCriterion("out_1 <>", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1GreaterThan(String value) {
            addCriterion("out_1 >", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1GreaterThanOrEqualTo(String value) {
            addCriterion("out_1 >=", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1LessThan(String value) {
            addCriterion("out_1 <", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1LessThanOrEqualTo(String value) {
            addCriterion("out_1 <=", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1Like(String value) {
            addCriterion("out_1 like", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1NotLike(String value) {
            addCriterion("out_1 not like", value, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1In(List<String> values) {
            addCriterion("out_1 in", values, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1NotIn(List<String> values) {
            addCriterion("out_1 not in", values, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1Between(String value1, String value2) {
            addCriterion("out_1 between", value1, value2, "out1");
            return (Criteria) this;
        }

        public Criteria andOut1NotBetween(String value1, String value2) {
            addCriterion("out_1 not between", value1, value2, "out1");
            return (Criteria) this;
        }

        public Criteria andOut2IsNull() {
            addCriterion("out_2 is null");
            return (Criteria) this;
        }

        public Criteria andOut2IsNotNull() {
            addCriterion("out_2 is not null");
            return (Criteria) this;
        }

        public Criteria andOut2EqualTo(String value) {
            addCriterion("out_2 =", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2NotEqualTo(String value) {
            addCriterion("out_2 <>", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2GreaterThan(String value) {
            addCriterion("out_2 >", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2GreaterThanOrEqualTo(String value) {
            addCriterion("out_2 >=", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2LessThan(String value) {
            addCriterion("out_2 <", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2LessThanOrEqualTo(String value) {
            addCriterion("out_2 <=", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2Like(String value) {
            addCriterion("out_2 like", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2NotLike(String value) {
            addCriterion("out_2 not like", value, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2In(List<String> values) {
            addCriterion("out_2 in", values, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2NotIn(List<String> values) {
            addCriterion("out_2 not in", values, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2Between(String value1, String value2) {
            addCriterion("out_2 between", value1, value2, "out2");
            return (Criteria) this;
        }

        public Criteria andOut2NotBetween(String value1, String value2) {
            addCriterion("out_2 not between", value1, value2, "out2");
            return (Criteria) this;
        }

        public Criteria andOut3IsNull() {
            addCriterion("out_3 is null");
            return (Criteria) this;
        }

        public Criteria andOut3IsNotNull() {
            addCriterion("out_3 is not null");
            return (Criteria) this;
        }

        public Criteria andOut3EqualTo(String value) {
            addCriterion("out_3 =", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3NotEqualTo(String value) {
            addCriterion("out_3 <>", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3GreaterThan(String value) {
            addCriterion("out_3 >", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3GreaterThanOrEqualTo(String value) {
            addCriterion("out_3 >=", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3LessThan(String value) {
            addCriterion("out_3 <", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3LessThanOrEqualTo(String value) {
            addCriterion("out_3 <=", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3Like(String value) {
            addCriterion("out_3 like", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3NotLike(String value) {
            addCriterion("out_3 not like", value, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3In(List<String> values) {
            addCriterion("out_3 in", values, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3NotIn(List<String> values) {
            addCriterion("out_3 not in", values, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3Between(String value1, String value2) {
            addCriterion("out_3 between", value1, value2, "out3");
            return (Criteria) this;
        }

        public Criteria andOut3NotBetween(String value1, String value2) {
            addCriterion("out_3 not between", value1, value2, "out3");
            return (Criteria) this;
        }

        public Criteria andFeedLedIsNull() {
            addCriterion("feed_led is null");
            return (Criteria) this;
        }

        public Criteria andFeedLedIsNotNull() {
            addCriterion("feed_led is not null");
            return (Criteria) this;
        }

        public Criteria andFeedLedEqualTo(String value) {
            addCriterion("feed_led =", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedNotEqualTo(String value) {
            addCriterion("feed_led <>", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedGreaterThan(String value) {
            addCriterion("feed_led >", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedGreaterThanOrEqualTo(String value) {
            addCriterion("feed_led >=", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedLessThan(String value) {
            addCriterion("feed_led <", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedLessThanOrEqualTo(String value) {
            addCriterion("feed_led <=", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedLike(String value) {
            addCriterion("feed_led like", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedNotLike(String value) {
            addCriterion("feed_led not like", value, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedIn(List<String> values) {
            addCriterion("feed_led in", values, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedNotIn(List<String> values) {
            addCriterion("feed_led not in", values, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedBetween(String value1, String value2) {
            addCriterion("feed_led between", value1, value2, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedLedNotBetween(String value1, String value2) {
            addCriterion("feed_led not between", value1, value2, "feedLed");
            return (Criteria) this;
        }

        public Criteria andFeedPlIsNull() {
            addCriterion("feed_pl is null");
            return (Criteria) this;
        }

        public Criteria andFeedPlIsNotNull() {
            addCriterion("feed_pl is not null");
            return (Criteria) this;
        }

        public Criteria andFeedPlEqualTo(String value) {
            addCriterion("feed_pl =", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlNotEqualTo(String value) {
            addCriterion("feed_pl <>", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlGreaterThan(String value) {
            addCriterion("feed_pl >", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlGreaterThanOrEqualTo(String value) {
            addCriterion("feed_pl >=", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlLessThan(String value) {
            addCriterion("feed_pl <", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlLessThanOrEqualTo(String value) {
            addCriterion("feed_pl <=", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlLike(String value) {
            addCriterion("feed_pl like", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlNotLike(String value) {
            addCriterion("feed_pl not like", value, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlIn(List<String> values) {
            addCriterion("feed_pl in", values, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlNotIn(List<String> values) {
            addCriterion("feed_pl not in", values, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlBetween(String value1, String value2) {
            addCriterion("feed_pl between", value1, value2, "feedPl");
            return (Criteria) this;
        }

        public Criteria andFeedPlNotBetween(String value1, String value2) {
            addCriterion("feed_pl not between", value1, value2, "feedPl");
            return (Criteria) this;
        }

        public Criteria andSbIsNull() {
            addCriterion("sb is null");
            return (Criteria) this;
        }

        public Criteria andSbIsNotNull() {
            addCriterion("sb is not null");
            return (Criteria) this;
        }

        public Criteria andSbEqualTo(String value) {
            addCriterion("sb =", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotEqualTo(String value) {
            addCriterion("sb <>", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThan(String value) {
            addCriterion("sb >", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbGreaterThanOrEqualTo(String value) {
            addCriterion("sb >=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThan(String value) {
            addCriterion("sb <", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLessThanOrEqualTo(String value) {
            addCriterion("sb <=", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbLike(String value) {
            addCriterion("sb like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotLike(String value) {
            addCriterion("sb not like", value, "sb");
            return (Criteria) this;
        }

        public Criteria andSbIn(List<String> values) {
            addCriterion("sb in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotIn(List<String> values) {
            addCriterion("sb not in", values, "sb");
            return (Criteria) this;
        }

        public Criteria andSbBetween(String value1, String value2) {
            addCriterion("sb between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andSbNotBetween(String value1, String value2) {
            addCriterion("sb not between", value1, value2, "sb");
            return (Criteria) this;
        }

        public Criteria andFs1IsNull() {
            addCriterion("fs_1 is null");
            return (Criteria) this;
        }

        public Criteria andFs1IsNotNull() {
            addCriterion("fs_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFs1EqualTo(String value) {
            addCriterion("fs_1 =", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1NotEqualTo(String value) {
            addCriterion("fs_1 <>", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1GreaterThan(String value) {
            addCriterion("fs_1 >", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1GreaterThanOrEqualTo(String value) {
            addCriterion("fs_1 >=", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1LessThan(String value) {
            addCriterion("fs_1 <", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1LessThanOrEqualTo(String value) {
            addCriterion("fs_1 <=", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1Like(String value) {
            addCriterion("fs_1 like", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1NotLike(String value) {
            addCriterion("fs_1 not like", value, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1In(List<String> values) {
            addCriterion("fs_1 in", values, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1NotIn(List<String> values) {
            addCriterion("fs_1 not in", values, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1Between(String value1, String value2) {
            addCriterion("fs_1 between", value1, value2, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs1NotBetween(String value1, String value2) {
            addCriterion("fs_1 not between", value1, value2, "fs1");
            return (Criteria) this;
        }

        public Criteria andFs2IsNull() {
            addCriterion("fs_2 is null");
            return (Criteria) this;
        }

        public Criteria andFs2IsNotNull() {
            addCriterion("fs_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFs2EqualTo(String value) {
            addCriterion("fs_2 =", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2NotEqualTo(String value) {
            addCriterion("fs_2 <>", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2GreaterThan(String value) {
            addCriterion("fs_2 >", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2GreaterThanOrEqualTo(String value) {
            addCriterion("fs_2 >=", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2LessThan(String value) {
            addCriterion("fs_2 <", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2LessThanOrEqualTo(String value) {
            addCriterion("fs_2 <=", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2Like(String value) {
            addCriterion("fs_2 like", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2NotLike(String value) {
            addCriterion("fs_2 not like", value, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2In(List<String> values) {
            addCriterion("fs_2 in", values, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2NotIn(List<String> values) {
            addCriterion("fs_2 not in", values, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2Between(String value1, String value2) {
            addCriterion("fs_2 between", value1, value2, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs2NotBetween(String value1, String value2) {
            addCriterion("fs_2 not between", value1, value2, "fs2");
            return (Criteria) this;
        }

        public Criteria andFs3IsNull() {
            addCriterion("fs_3 is null");
            return (Criteria) this;
        }

        public Criteria andFs3IsNotNull() {
            addCriterion("fs_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFs3EqualTo(String value) {
            addCriterion("fs_3 =", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3NotEqualTo(String value) {
            addCriterion("fs_3 <>", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3GreaterThan(String value) {
            addCriterion("fs_3 >", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3GreaterThanOrEqualTo(String value) {
            addCriterion("fs_3 >=", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3LessThan(String value) {
            addCriterion("fs_3 <", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3LessThanOrEqualTo(String value) {
            addCriterion("fs_3 <=", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3Like(String value) {
            addCriterion("fs_3 like", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3NotLike(String value) {
            addCriterion("fs_3 not like", value, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3In(List<String> values) {
            addCriterion("fs_3 in", values, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3NotIn(List<String> values) {
            addCriterion("fs_3 not in", values, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3Between(String value1, String value2) {
            addCriterion("fs_3 between", value1, value2, "fs3");
            return (Criteria) this;
        }

        public Criteria andFs3NotBetween(String value1, String value2) {
            addCriterion("fs_3 not between", value1, value2, "fs3");
            return (Criteria) this;
        }

        public Criteria andBsIsNull() {
            addCriterion("bs is null");
            return (Criteria) this;
        }

        public Criteria andBsIsNotNull() {
            addCriterion("bs is not null");
            return (Criteria) this;
        }

        public Criteria andBsEqualTo(String value) {
            addCriterion("bs =", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotEqualTo(String value) {
            addCriterion("bs <>", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsGreaterThan(String value) {
            addCriterion("bs >", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsGreaterThanOrEqualTo(String value) {
            addCriterion("bs >=", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsLessThan(String value) {
            addCriterion("bs <", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsLessThanOrEqualTo(String value) {
            addCriterion("bs <=", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsLike(String value) {
            addCriterion("bs like", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotLike(String value) {
            addCriterion("bs not like", value, "bs");
            return (Criteria) this;
        }

        public Criteria andBsIn(List<String> values) {
            addCriterion("bs in", values, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotIn(List<String> values) {
            addCriterion("bs not in", values, "bs");
            return (Criteria) this;
        }

        public Criteria andBsBetween(String value1, String value2) {
            addCriterion("bs between", value1, value2, "bs");
            return (Criteria) this;
        }

        public Criteria andBsNotBetween(String value1, String value2) {
            addCriterion("bs not between", value1, value2, "bs");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("ps is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("ps is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("ps =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("ps <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("ps >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("ps >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("ps <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("ps <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("ps like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("ps not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("ps in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("ps not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("ps between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("ps not between", value1, value2, "ps");
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
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

        public Criteria andWd1IsNull() {
            addCriterion("wd1 is null");
            return (Criteria) this;
        }

        public Criteria andWd1IsNotNull() {
            addCriterion("wd1 is not null");
            return (Criteria) this;
        }

        public Criteria andWd1EqualTo(String value) {
            addCriterion("wd1 =", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1NotEqualTo(String value) {
            addCriterion("wd1 <>", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1GreaterThan(String value) {
            addCriterion("wd1 >", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1GreaterThanOrEqualTo(String value) {
            addCriterion("wd1 >=", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1LessThan(String value) {
            addCriterion("wd1 <", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1LessThanOrEqualTo(String value) {
            addCriterion("wd1 <=", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1Like(String value) {
            addCriterion("wd1 like", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1NotLike(String value) {
            addCriterion("wd1 not like", value, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1In(List<String> values) {
            addCriterion("wd1 in", values, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1NotIn(List<String> values) {
            addCriterion("wd1 not in", values, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1Between(String value1, String value2) {
            addCriterion("wd1 between", value1, value2, "wd1");
            return (Criteria) this;
        }

        public Criteria andWd1NotBetween(String value1, String value2) {
            addCriterion("wd1 not between", value1, value2, "wd1");
            return (Criteria) this;
        }

        public Criteria andKqxh1IsNull() {
            addCriterion("kqxh1 is null");
            return (Criteria) this;
        }

        public Criteria andKqxh1IsNotNull() {
            addCriterion("kqxh1 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxh1EqualTo(String value) {
            addCriterion("kqxh1 =", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1NotEqualTo(String value) {
            addCriterion("kqxh1 <>", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1GreaterThan(String value) {
            addCriterion("kqxh1 >", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1GreaterThanOrEqualTo(String value) {
            addCriterion("kqxh1 >=", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1LessThan(String value) {
            addCriterion("kqxh1 <", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1LessThanOrEqualTo(String value) {
            addCriterion("kqxh1 <=", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1Like(String value) {
            addCriterion("kqxh1 like", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1NotLike(String value) {
            addCriterion("kqxh1 not like", value, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1In(List<String> values) {
            addCriterion("kqxh1 in", values, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1NotIn(List<String> values) {
            addCriterion("kqxh1 not in", values, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1Between(String value1, String value2) {
            addCriterion("kqxh1 between", value1, value2, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxh1NotBetween(String value1, String value2) {
            addCriterion("kqxh1 not between", value1, value2, "kqxh1");
            return (Criteria) this;
        }

        public Criteria andKqxd1IsNull() {
            addCriterion("kqxd1 is null");
            return (Criteria) this;
        }

        public Criteria andKqxd1IsNotNull() {
            addCriterion("kqxd1 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxd1EqualTo(String value) {
            addCriterion("kqxd1 =", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1NotEqualTo(String value) {
            addCriterion("kqxd1 <>", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1GreaterThan(String value) {
            addCriterion("kqxd1 >", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1GreaterThanOrEqualTo(String value) {
            addCriterion("kqxd1 >=", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1LessThan(String value) {
            addCriterion("kqxd1 <", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1LessThanOrEqualTo(String value) {
            addCriterion("kqxd1 <=", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1Like(String value) {
            addCriterion("kqxd1 like", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1NotLike(String value) {
            addCriterion("kqxd1 not like", value, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1In(List<String> values) {
            addCriterion("kqxd1 in", values, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1NotIn(List<String> values) {
            addCriterion("kqxd1 not in", values, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1Between(String value1, String value2) {
            addCriterion("kqxd1 between", value1, value2, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andKqxd1NotBetween(String value1, String value2) {
            addCriterion("kqxd1 not between", value1, value2, "kqxd1");
            return (Criteria) this;
        }

        public Criteria andHxf1IsNull() {
            addCriterion("hxf1 is null");
            return (Criteria) this;
        }

        public Criteria andHxf1IsNotNull() {
            addCriterion("hxf1 is not null");
            return (Criteria) this;
        }

        public Criteria andHxf1EqualTo(String value) {
            addCriterion("hxf1 =", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1NotEqualTo(String value) {
            addCriterion("hxf1 <>", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1GreaterThan(String value) {
            addCriterion("hxf1 >", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1GreaterThanOrEqualTo(String value) {
            addCriterion("hxf1 >=", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1LessThan(String value) {
            addCriterion("hxf1 <", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1LessThanOrEqualTo(String value) {
            addCriterion("hxf1 <=", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1Like(String value) {
            addCriterion("hxf1 like", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1NotLike(String value) {
            addCriterion("hxf1 not like", value, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1In(List<String> values) {
            addCriterion("hxf1 in", values, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1NotIn(List<String> values) {
            addCriterion("hxf1 not in", values, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1Between(String value1, String value2) {
            addCriterion("hxf1 between", value1, value2, "hxf1");
            return (Criteria) this;
        }

        public Criteria andHxf1NotBetween(String value1, String value2) {
            addCriterion("hxf1 not between", value1, value2, "hxf1");
            return (Criteria) this;
        }

        public Criteria andSyyy1IsNull() {
            addCriterion("syyy1 is null");
            return (Criteria) this;
        }

        public Criteria andSyyy1IsNotNull() {
            addCriterion("syyy1 is not null");
            return (Criteria) this;
        }

        public Criteria andSyyy1EqualTo(String value) {
            addCriterion("syyy1 =", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1NotEqualTo(String value) {
            addCriterion("syyy1 <>", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1GreaterThan(String value) {
            addCriterion("syyy1 >", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1GreaterThanOrEqualTo(String value) {
            addCriterion("syyy1 >=", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1LessThan(String value) {
            addCriterion("syyy1 <", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1LessThanOrEqualTo(String value) {
            addCriterion("syyy1 <=", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1Like(String value) {
            addCriterion("syyy1 like", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1NotLike(String value) {
            addCriterion("syyy1 not like", value, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1In(List<String> values) {
            addCriterion("syyy1 in", values, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1NotIn(List<String> values) {
            addCriterion("syyy1 not in", values, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1Between(String value1, String value2) {
            addCriterion("syyy1 between", value1, value2, "syyy1");
            return (Criteria) this;
        }

        public Criteria andSyyy1NotBetween(String value1, String value2) {
            addCriterion("syyy1 not between", value1, value2, "syyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1IsNull() {
            addCriterion("pyyy1 is null");
            return (Criteria) this;
        }

        public Criteria andPyyy1IsNotNull() {
            addCriterion("pyyy1 is not null");
            return (Criteria) this;
        }

        public Criteria andPyyy1EqualTo(String value) {
            addCriterion("pyyy1 =", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1NotEqualTo(String value) {
            addCriterion("pyyy1 <>", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1GreaterThan(String value) {
            addCriterion("pyyy1 >", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1GreaterThanOrEqualTo(String value) {
            addCriterion("pyyy1 >=", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1LessThan(String value) {
            addCriterion("pyyy1 <", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1LessThanOrEqualTo(String value) {
            addCriterion("pyyy1 <=", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1Like(String value) {
            addCriterion("pyyy1 like", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1NotLike(String value) {
            addCriterion("pyyy1 not like", value, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1In(List<String> values) {
            addCriterion("pyyy1 in", values, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1NotIn(List<String> values) {
            addCriterion("pyyy1 not in", values, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1Between(String value1, String value2) {
            addCriterion("pyyy1 between", value1, value2, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andPyyy1NotBetween(String value1, String value2) {
            addCriterion("pyyy1 not between", value1, value2, "pyyy1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1IsNull() {
            addCriterion("yyyxd1 is null");
            return (Criteria) this;
        }

        public Criteria andYyyxd1IsNotNull() {
            addCriterion("yyyxd1 is not null");
            return (Criteria) this;
        }

        public Criteria andYyyxd1EqualTo(String value) {
            addCriterion("yyyxd1 =", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1NotEqualTo(String value) {
            addCriterion("yyyxd1 <>", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1GreaterThan(String value) {
            addCriterion("yyyxd1 >", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1GreaterThanOrEqualTo(String value) {
            addCriterion("yyyxd1 >=", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1LessThan(String value) {
            addCriterion("yyyxd1 <", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1LessThanOrEqualTo(String value) {
            addCriterion("yyyxd1 <=", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1Like(String value) {
            addCriterion("yyyxd1 like", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1NotLike(String value) {
            addCriterion("yyyxd1 not like", value, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1In(List<String> values) {
            addCriterion("yyyxd1 in", values, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1NotIn(List<String> values) {
            addCriterion("yyyxd1 not in", values, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1Between(String value1, String value2) {
            addCriterion("yyyxd1 between", value1, value2, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andYyyxd1NotBetween(String value1, String value2) {
            addCriterion("yyyxd1 not between", value1, value2, "yyyxd1");
            return (Criteria) this;
        }

        public Criteria andLed11IsNull() {
            addCriterion("led11 is null");
            return (Criteria) this;
        }

        public Criteria andLed11IsNotNull() {
            addCriterion("led11 is not null");
            return (Criteria) this;
        }

        public Criteria andLed11EqualTo(String value) {
            addCriterion("led11 =", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11NotEqualTo(String value) {
            addCriterion("led11 <>", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11GreaterThan(String value) {
            addCriterion("led11 >", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11GreaterThanOrEqualTo(String value) {
            addCriterion("led11 >=", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11LessThan(String value) {
            addCriterion("led11 <", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11LessThanOrEqualTo(String value) {
            addCriterion("led11 <=", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11Like(String value) {
            addCriterion("led11 like", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11NotLike(String value) {
            addCriterion("led11 not like", value, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11In(List<String> values) {
            addCriterion("led11 in", values, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11NotIn(List<String> values) {
            addCriterion("led11 not in", values, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11Between(String value1, String value2) {
            addCriterion("led11 between", value1, value2, "led11");
            return (Criteria) this;
        }

        public Criteria andLed11NotBetween(String value1, String value2) {
            addCriterion("led11 not between", value1, value2, "led11");
            return (Criteria) this;
        }

        public Criteria andLed12IsNull() {
            addCriterion("led12 is null");
            return (Criteria) this;
        }

        public Criteria andLed12IsNotNull() {
            addCriterion("led12 is not null");
            return (Criteria) this;
        }

        public Criteria andLed12EqualTo(String value) {
            addCriterion("led12 =", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12NotEqualTo(String value) {
            addCriterion("led12 <>", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12GreaterThan(String value) {
            addCriterion("led12 >", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12GreaterThanOrEqualTo(String value) {
            addCriterion("led12 >=", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12LessThan(String value) {
            addCriterion("led12 <", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12LessThanOrEqualTo(String value) {
            addCriterion("led12 <=", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12Like(String value) {
            addCriterion("led12 like", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12NotLike(String value) {
            addCriterion("led12 not like", value, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12In(List<String> values) {
            addCriterion("led12 in", values, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12NotIn(List<String> values) {
            addCriterion("led12 not in", values, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12Between(String value1, String value2) {
            addCriterion("led12 between", value1, value2, "led12");
            return (Criteria) this;
        }

        public Criteria andLed12NotBetween(String value1, String value2) {
            addCriterion("led12 not between", value1, value2, "led12");
            return (Criteria) this;
        }

        public Criteria andLed13IsNull() {
            addCriterion("led13 is null");
            return (Criteria) this;
        }

        public Criteria andLed13IsNotNull() {
            addCriterion("led13 is not null");
            return (Criteria) this;
        }

        public Criteria andLed13EqualTo(String value) {
            addCriterion("led13 =", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13NotEqualTo(String value) {
            addCriterion("led13 <>", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13GreaterThan(String value) {
            addCriterion("led13 >", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13GreaterThanOrEqualTo(String value) {
            addCriterion("led13 >=", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13LessThan(String value) {
            addCriterion("led13 <", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13LessThanOrEqualTo(String value) {
            addCriterion("led13 <=", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13Like(String value) {
            addCriterion("led13 like", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13NotLike(String value) {
            addCriterion("led13 not like", value, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13In(List<String> values) {
            addCriterion("led13 in", values, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13NotIn(List<String> values) {
            addCriterion("led13 not in", values, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13Between(String value1, String value2) {
            addCriterion("led13 between", value1, value2, "led13");
            return (Criteria) this;
        }

        public Criteria andLed13NotBetween(String value1, String value2) {
            addCriterion("led13 not between", value1, value2, "led13");
            return (Criteria) this;
        }

        public Criteria andWd2IsNull() {
            addCriterion("wd2 is null");
            return (Criteria) this;
        }

        public Criteria andWd2IsNotNull() {
            addCriterion("wd2 is not null");
            return (Criteria) this;
        }

        public Criteria andWd2EqualTo(String value) {
            addCriterion("wd2 =", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2NotEqualTo(String value) {
            addCriterion("wd2 <>", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2GreaterThan(String value) {
            addCriterion("wd2 >", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2GreaterThanOrEqualTo(String value) {
            addCriterion("wd2 >=", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2LessThan(String value) {
            addCriterion("wd2 <", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2LessThanOrEqualTo(String value) {
            addCriterion("wd2 <=", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2Like(String value) {
            addCriterion("wd2 like", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2NotLike(String value) {
            addCriterion("wd2 not like", value, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2In(List<String> values) {
            addCriterion("wd2 in", values, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2NotIn(List<String> values) {
            addCriterion("wd2 not in", values, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2Between(String value1, String value2) {
            addCriterion("wd2 between", value1, value2, "wd2");
            return (Criteria) this;
        }

        public Criteria andWd2NotBetween(String value1, String value2) {
            addCriterion("wd2 not between", value1, value2, "wd2");
            return (Criteria) this;
        }

        public Criteria andKqxh2IsNull() {
            addCriterion("kqxh2 is null");
            return (Criteria) this;
        }

        public Criteria andKqxh2IsNotNull() {
            addCriterion("kqxh2 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxh2EqualTo(String value) {
            addCriterion("kqxh2 =", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2NotEqualTo(String value) {
            addCriterion("kqxh2 <>", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2GreaterThan(String value) {
            addCriterion("kqxh2 >", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2GreaterThanOrEqualTo(String value) {
            addCriterion("kqxh2 >=", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2LessThan(String value) {
            addCriterion("kqxh2 <", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2LessThanOrEqualTo(String value) {
            addCriterion("kqxh2 <=", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2Like(String value) {
            addCriterion("kqxh2 like", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2NotLike(String value) {
            addCriterion("kqxh2 not like", value, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2In(List<String> values) {
            addCriterion("kqxh2 in", values, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2NotIn(List<String> values) {
            addCriterion("kqxh2 not in", values, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2Between(String value1, String value2) {
            addCriterion("kqxh2 between", value1, value2, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxh2NotBetween(String value1, String value2) {
            addCriterion("kqxh2 not between", value1, value2, "kqxh2");
            return (Criteria) this;
        }

        public Criteria andKqxd2IsNull() {
            addCriterion("kqxd2 is null");
            return (Criteria) this;
        }

        public Criteria andKqxd2IsNotNull() {
            addCriterion("kqxd2 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxd2EqualTo(String value) {
            addCriterion("kqxd2 =", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2NotEqualTo(String value) {
            addCriterion("kqxd2 <>", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2GreaterThan(String value) {
            addCriterion("kqxd2 >", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2GreaterThanOrEqualTo(String value) {
            addCriterion("kqxd2 >=", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2LessThan(String value) {
            addCriterion("kqxd2 <", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2LessThanOrEqualTo(String value) {
            addCriterion("kqxd2 <=", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2Like(String value) {
            addCriterion("kqxd2 like", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2NotLike(String value) {
            addCriterion("kqxd2 not like", value, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2In(List<String> values) {
            addCriterion("kqxd2 in", values, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2NotIn(List<String> values) {
            addCriterion("kqxd2 not in", values, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2Between(String value1, String value2) {
            addCriterion("kqxd2 between", value1, value2, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andKqxd2NotBetween(String value1, String value2) {
            addCriterion("kqxd2 not between", value1, value2, "kqxd2");
            return (Criteria) this;
        }

        public Criteria andHxf2IsNull() {
            addCriterion("hxf2 is null");
            return (Criteria) this;
        }

        public Criteria andHxf2IsNotNull() {
            addCriterion("hxf2 is not null");
            return (Criteria) this;
        }

        public Criteria andHxf2EqualTo(String value) {
            addCriterion("hxf2 =", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2NotEqualTo(String value) {
            addCriterion("hxf2 <>", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2GreaterThan(String value) {
            addCriterion("hxf2 >", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2GreaterThanOrEqualTo(String value) {
            addCriterion("hxf2 >=", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2LessThan(String value) {
            addCriterion("hxf2 <", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2LessThanOrEqualTo(String value) {
            addCriterion("hxf2 <=", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2Like(String value) {
            addCriterion("hxf2 like", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2NotLike(String value) {
            addCriterion("hxf2 not like", value, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2In(List<String> values) {
            addCriterion("hxf2 in", values, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2NotIn(List<String> values) {
            addCriterion("hxf2 not in", values, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2Between(String value1, String value2) {
            addCriterion("hxf2 between", value1, value2, "hxf2");
            return (Criteria) this;
        }

        public Criteria andHxf2NotBetween(String value1, String value2) {
            addCriterion("hxf2 not between", value1, value2, "hxf2");
            return (Criteria) this;
        }

        public Criteria andSyyy2IsNull() {
            addCriterion("syyy2 is null");
            return (Criteria) this;
        }

        public Criteria andSyyy2IsNotNull() {
            addCriterion("syyy2 is not null");
            return (Criteria) this;
        }

        public Criteria andSyyy2EqualTo(String value) {
            addCriterion("syyy2 =", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2NotEqualTo(String value) {
            addCriterion("syyy2 <>", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2GreaterThan(String value) {
            addCriterion("syyy2 >", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2GreaterThanOrEqualTo(String value) {
            addCriterion("syyy2 >=", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2LessThan(String value) {
            addCriterion("syyy2 <", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2LessThanOrEqualTo(String value) {
            addCriterion("syyy2 <=", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2Like(String value) {
            addCriterion("syyy2 like", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2NotLike(String value) {
            addCriterion("syyy2 not like", value, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2In(List<String> values) {
            addCriterion("syyy2 in", values, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2NotIn(List<String> values) {
            addCriterion("syyy2 not in", values, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2Between(String value1, String value2) {
            addCriterion("syyy2 between", value1, value2, "syyy2");
            return (Criteria) this;
        }

        public Criteria andSyyy2NotBetween(String value1, String value2) {
            addCriterion("syyy2 not between", value1, value2, "syyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2IsNull() {
            addCriterion("pyyy2 is null");
            return (Criteria) this;
        }

        public Criteria andPyyy2IsNotNull() {
            addCriterion("pyyy2 is not null");
            return (Criteria) this;
        }

        public Criteria andPyyy2EqualTo(String value) {
            addCriterion("pyyy2 =", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2NotEqualTo(String value) {
            addCriterion("pyyy2 <>", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2GreaterThan(String value) {
            addCriterion("pyyy2 >", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2GreaterThanOrEqualTo(String value) {
            addCriterion("pyyy2 >=", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2LessThan(String value) {
            addCriterion("pyyy2 <", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2LessThanOrEqualTo(String value) {
            addCriterion("pyyy2 <=", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2Like(String value) {
            addCriterion("pyyy2 like", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2NotLike(String value) {
            addCriterion("pyyy2 not like", value, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2In(List<String> values) {
            addCriterion("pyyy2 in", values, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2NotIn(List<String> values) {
            addCriterion("pyyy2 not in", values, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2Between(String value1, String value2) {
            addCriterion("pyyy2 between", value1, value2, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andPyyy2NotBetween(String value1, String value2) {
            addCriterion("pyyy2 not between", value1, value2, "pyyy2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2IsNull() {
            addCriterion("yyyxd2 is null");
            return (Criteria) this;
        }

        public Criteria andYyyxd2IsNotNull() {
            addCriterion("yyyxd2 is not null");
            return (Criteria) this;
        }

        public Criteria andYyyxd2EqualTo(String value) {
            addCriterion("yyyxd2 =", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2NotEqualTo(String value) {
            addCriterion("yyyxd2 <>", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2GreaterThan(String value) {
            addCriterion("yyyxd2 >", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2GreaterThanOrEqualTo(String value) {
            addCriterion("yyyxd2 >=", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2LessThan(String value) {
            addCriterion("yyyxd2 <", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2LessThanOrEqualTo(String value) {
            addCriterion("yyyxd2 <=", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2Like(String value) {
            addCriterion("yyyxd2 like", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2NotLike(String value) {
            addCriterion("yyyxd2 not like", value, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2In(List<String> values) {
            addCriterion("yyyxd2 in", values, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2NotIn(List<String> values) {
            addCriterion("yyyxd2 not in", values, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2Between(String value1, String value2) {
            addCriterion("yyyxd2 between", value1, value2, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andYyyxd2NotBetween(String value1, String value2) {
            addCriterion("yyyxd2 not between", value1, value2, "yyyxd2");
            return (Criteria) this;
        }

        public Criteria andLed21IsNull() {
            addCriterion("led21 is null");
            return (Criteria) this;
        }

        public Criteria andLed21IsNotNull() {
            addCriterion("led21 is not null");
            return (Criteria) this;
        }

        public Criteria andLed21EqualTo(String value) {
            addCriterion("led21 =", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21NotEqualTo(String value) {
            addCriterion("led21 <>", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21GreaterThan(String value) {
            addCriterion("led21 >", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21GreaterThanOrEqualTo(String value) {
            addCriterion("led21 >=", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21LessThan(String value) {
            addCriterion("led21 <", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21LessThanOrEqualTo(String value) {
            addCriterion("led21 <=", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21Like(String value) {
            addCriterion("led21 like", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21NotLike(String value) {
            addCriterion("led21 not like", value, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21In(List<String> values) {
            addCriterion("led21 in", values, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21NotIn(List<String> values) {
            addCriterion("led21 not in", values, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21Between(String value1, String value2) {
            addCriterion("led21 between", value1, value2, "led21");
            return (Criteria) this;
        }

        public Criteria andLed21NotBetween(String value1, String value2) {
            addCriterion("led21 not between", value1, value2, "led21");
            return (Criteria) this;
        }

        public Criteria andLed22IsNull() {
            addCriterion("led22 is null");
            return (Criteria) this;
        }

        public Criteria andLed22IsNotNull() {
            addCriterion("led22 is not null");
            return (Criteria) this;
        }

        public Criteria andLed22EqualTo(String value) {
            addCriterion("led22 =", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22NotEqualTo(String value) {
            addCriterion("led22 <>", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22GreaterThan(String value) {
            addCriterion("led22 >", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22GreaterThanOrEqualTo(String value) {
            addCriterion("led22 >=", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22LessThan(String value) {
            addCriterion("led22 <", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22LessThanOrEqualTo(String value) {
            addCriterion("led22 <=", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22Like(String value) {
            addCriterion("led22 like", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22NotLike(String value) {
            addCriterion("led22 not like", value, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22In(List<String> values) {
            addCriterion("led22 in", values, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22NotIn(List<String> values) {
            addCriterion("led22 not in", values, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22Between(String value1, String value2) {
            addCriterion("led22 between", value1, value2, "led22");
            return (Criteria) this;
        }

        public Criteria andLed22NotBetween(String value1, String value2) {
            addCriterion("led22 not between", value1, value2, "led22");
            return (Criteria) this;
        }

        public Criteria andLed23IsNull() {
            addCriterion("led23 is null");
            return (Criteria) this;
        }

        public Criteria andLed23IsNotNull() {
            addCriterion("led23 is not null");
            return (Criteria) this;
        }

        public Criteria andLed23EqualTo(String value) {
            addCriterion("led23 =", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23NotEqualTo(String value) {
            addCriterion("led23 <>", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23GreaterThan(String value) {
            addCriterion("led23 >", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23GreaterThanOrEqualTo(String value) {
            addCriterion("led23 >=", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23LessThan(String value) {
            addCriterion("led23 <", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23LessThanOrEqualTo(String value) {
            addCriterion("led23 <=", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23Like(String value) {
            addCriterion("led23 like", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23NotLike(String value) {
            addCriterion("led23 not like", value, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23In(List<String> values) {
            addCriterion("led23 in", values, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23NotIn(List<String> values) {
            addCriterion("led23 not in", values, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23Between(String value1, String value2) {
            addCriterion("led23 between", value1, value2, "led23");
            return (Criteria) this;
        }

        public Criteria andLed23NotBetween(String value1, String value2) {
            addCriterion("led23 not between", value1, value2, "led23");
            return (Criteria) this;
        }

        public Criteria andWd3IsNull() {
            addCriterion("wd3 is null");
            return (Criteria) this;
        }

        public Criteria andWd3IsNotNull() {
            addCriterion("wd3 is not null");
            return (Criteria) this;
        }

        public Criteria andWd3EqualTo(String value) {
            addCriterion("wd3 =", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3NotEqualTo(String value) {
            addCriterion("wd3 <>", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3GreaterThan(String value) {
            addCriterion("wd3 >", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3GreaterThanOrEqualTo(String value) {
            addCriterion("wd3 >=", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3LessThan(String value) {
            addCriterion("wd3 <", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3LessThanOrEqualTo(String value) {
            addCriterion("wd3 <=", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3Like(String value) {
            addCriterion("wd3 like", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3NotLike(String value) {
            addCriterion("wd3 not like", value, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3In(List<String> values) {
            addCriterion("wd3 in", values, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3NotIn(List<String> values) {
            addCriterion("wd3 not in", values, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3Between(String value1, String value2) {
            addCriterion("wd3 between", value1, value2, "wd3");
            return (Criteria) this;
        }

        public Criteria andWd3NotBetween(String value1, String value2) {
            addCriterion("wd3 not between", value1, value2, "wd3");
            return (Criteria) this;
        }

        public Criteria andKqxh3IsNull() {
            addCriterion("kqxh3 is null");
            return (Criteria) this;
        }

        public Criteria andKqxh3IsNotNull() {
            addCriterion("kqxh3 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxh3EqualTo(String value) {
            addCriterion("kqxh3 =", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3NotEqualTo(String value) {
            addCriterion("kqxh3 <>", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3GreaterThan(String value) {
            addCriterion("kqxh3 >", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3GreaterThanOrEqualTo(String value) {
            addCriterion("kqxh3 >=", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3LessThan(String value) {
            addCriterion("kqxh3 <", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3LessThanOrEqualTo(String value) {
            addCriterion("kqxh3 <=", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3Like(String value) {
            addCriterion("kqxh3 like", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3NotLike(String value) {
            addCriterion("kqxh3 not like", value, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3In(List<String> values) {
            addCriterion("kqxh3 in", values, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3NotIn(List<String> values) {
            addCriterion("kqxh3 not in", values, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3Between(String value1, String value2) {
            addCriterion("kqxh3 between", value1, value2, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxh3NotBetween(String value1, String value2) {
            addCriterion("kqxh3 not between", value1, value2, "kqxh3");
            return (Criteria) this;
        }

        public Criteria andKqxd3IsNull() {
            addCriterion("kqxd3 is null");
            return (Criteria) this;
        }

        public Criteria andKqxd3IsNotNull() {
            addCriterion("kqxd3 is not null");
            return (Criteria) this;
        }

        public Criteria andKqxd3EqualTo(String value) {
            addCriterion("kqxd3 =", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3NotEqualTo(String value) {
            addCriterion("kqxd3 <>", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3GreaterThan(String value) {
            addCriterion("kqxd3 >", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3GreaterThanOrEqualTo(String value) {
            addCriterion("kqxd3 >=", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3LessThan(String value) {
            addCriterion("kqxd3 <", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3LessThanOrEqualTo(String value) {
            addCriterion("kqxd3 <=", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3Like(String value) {
            addCriterion("kqxd3 like", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3NotLike(String value) {
            addCriterion("kqxd3 not like", value, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3In(List<String> values) {
            addCriterion("kqxd3 in", values, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3NotIn(List<String> values) {
            addCriterion("kqxd3 not in", values, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3Between(String value1, String value2) {
            addCriterion("kqxd3 between", value1, value2, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andKqxd3NotBetween(String value1, String value2) {
            addCriterion("kqxd3 not between", value1, value2, "kqxd3");
            return (Criteria) this;
        }

        public Criteria andHxf3IsNull() {
            addCriterion("hxf3 is null");
            return (Criteria) this;
        }

        public Criteria andHxf3IsNotNull() {
            addCriterion("hxf3 is not null");
            return (Criteria) this;
        }

        public Criteria andHxf3EqualTo(String value) {
            addCriterion("hxf3 =", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3NotEqualTo(String value) {
            addCriterion("hxf3 <>", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3GreaterThan(String value) {
            addCriterion("hxf3 >", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3GreaterThanOrEqualTo(String value) {
            addCriterion("hxf3 >=", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3LessThan(String value) {
            addCriterion("hxf3 <", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3LessThanOrEqualTo(String value) {
            addCriterion("hxf3 <=", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3Like(String value) {
            addCriterion("hxf3 like", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3NotLike(String value) {
            addCriterion("hxf3 not like", value, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3In(List<String> values) {
            addCriterion("hxf3 in", values, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3NotIn(List<String> values) {
            addCriterion("hxf3 not in", values, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3Between(String value1, String value2) {
            addCriterion("hxf3 between", value1, value2, "hxf3");
            return (Criteria) this;
        }

        public Criteria andHxf3NotBetween(String value1, String value2) {
            addCriterion("hxf3 not between", value1, value2, "hxf3");
            return (Criteria) this;
        }

        public Criteria andSyyy3IsNull() {
            addCriterion("syyy3 is null");
            return (Criteria) this;
        }

        public Criteria andSyyy3IsNotNull() {
            addCriterion("syyy3 is not null");
            return (Criteria) this;
        }

        public Criteria andSyyy3EqualTo(String value) {
            addCriterion("syyy3 =", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3NotEqualTo(String value) {
            addCriterion("syyy3 <>", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3GreaterThan(String value) {
            addCriterion("syyy3 >", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3GreaterThanOrEqualTo(String value) {
            addCriterion("syyy3 >=", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3LessThan(String value) {
            addCriterion("syyy3 <", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3LessThanOrEqualTo(String value) {
            addCriterion("syyy3 <=", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3Like(String value) {
            addCriterion("syyy3 like", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3NotLike(String value) {
            addCriterion("syyy3 not like", value, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3In(List<String> values) {
            addCriterion("syyy3 in", values, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3NotIn(List<String> values) {
            addCriterion("syyy3 not in", values, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3Between(String value1, String value2) {
            addCriterion("syyy3 between", value1, value2, "syyy3");
            return (Criteria) this;
        }

        public Criteria andSyyy3NotBetween(String value1, String value2) {
            addCriterion("syyy3 not between", value1, value2, "syyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3IsNull() {
            addCriterion("pyyy3 is null");
            return (Criteria) this;
        }

        public Criteria andPyyy3IsNotNull() {
            addCriterion("pyyy3 is not null");
            return (Criteria) this;
        }

        public Criteria andPyyy3EqualTo(String value) {
            addCriterion("pyyy3 =", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3NotEqualTo(String value) {
            addCriterion("pyyy3 <>", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3GreaterThan(String value) {
            addCriterion("pyyy3 >", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3GreaterThanOrEqualTo(String value) {
            addCriterion("pyyy3 >=", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3LessThan(String value) {
            addCriterion("pyyy3 <", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3LessThanOrEqualTo(String value) {
            addCriterion("pyyy3 <=", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3Like(String value) {
            addCriterion("pyyy3 like", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3NotLike(String value) {
            addCriterion("pyyy3 not like", value, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3In(List<String> values) {
            addCriterion("pyyy3 in", values, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3NotIn(List<String> values) {
            addCriterion("pyyy3 not in", values, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3Between(String value1, String value2) {
            addCriterion("pyyy3 between", value1, value2, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andPyyy3NotBetween(String value1, String value2) {
            addCriterion("pyyy3 not between", value1, value2, "pyyy3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3IsNull() {
            addCriterion("yyyxd3 is null");
            return (Criteria) this;
        }

        public Criteria andYyyxd3IsNotNull() {
            addCriterion("yyyxd3 is not null");
            return (Criteria) this;
        }

        public Criteria andYyyxd3EqualTo(String value) {
            addCriterion("yyyxd3 =", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3NotEqualTo(String value) {
            addCriterion("yyyxd3 <>", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3GreaterThan(String value) {
            addCriterion("yyyxd3 >", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3GreaterThanOrEqualTo(String value) {
            addCriterion("yyyxd3 >=", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3LessThan(String value) {
            addCriterion("yyyxd3 <", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3LessThanOrEqualTo(String value) {
            addCriterion("yyyxd3 <=", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3Like(String value) {
            addCriterion("yyyxd3 like", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3NotLike(String value) {
            addCriterion("yyyxd3 not like", value, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3In(List<String> values) {
            addCriterion("yyyxd3 in", values, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3NotIn(List<String> values) {
            addCriterion("yyyxd3 not in", values, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3Between(String value1, String value2) {
            addCriterion("yyyxd3 between", value1, value2, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andYyyxd3NotBetween(String value1, String value2) {
            addCriterion("yyyxd3 not between", value1, value2, "yyyxd3");
            return (Criteria) this;
        }

        public Criteria andLed31IsNull() {
            addCriterion("led31 is null");
            return (Criteria) this;
        }

        public Criteria andLed31IsNotNull() {
            addCriterion("led31 is not null");
            return (Criteria) this;
        }

        public Criteria andLed31EqualTo(String value) {
            addCriterion("led31 =", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31NotEqualTo(String value) {
            addCriterion("led31 <>", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31GreaterThan(String value) {
            addCriterion("led31 >", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31GreaterThanOrEqualTo(String value) {
            addCriterion("led31 >=", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31LessThan(String value) {
            addCriterion("led31 <", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31LessThanOrEqualTo(String value) {
            addCriterion("led31 <=", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31Like(String value) {
            addCriterion("led31 like", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31NotLike(String value) {
            addCriterion("led31 not like", value, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31In(List<String> values) {
            addCriterion("led31 in", values, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31NotIn(List<String> values) {
            addCriterion("led31 not in", values, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31Between(String value1, String value2) {
            addCriterion("led31 between", value1, value2, "led31");
            return (Criteria) this;
        }

        public Criteria andLed31NotBetween(String value1, String value2) {
            addCriterion("led31 not between", value1, value2, "led31");
            return (Criteria) this;
        }

        public Criteria andLed32IsNull() {
            addCriterion("led32 is null");
            return (Criteria) this;
        }

        public Criteria andLed32IsNotNull() {
            addCriterion("led32 is not null");
            return (Criteria) this;
        }

        public Criteria andLed32EqualTo(String value) {
            addCriterion("led32 =", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32NotEqualTo(String value) {
            addCriterion("led32 <>", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32GreaterThan(String value) {
            addCriterion("led32 >", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32GreaterThanOrEqualTo(String value) {
            addCriterion("led32 >=", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32LessThan(String value) {
            addCriterion("led32 <", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32LessThanOrEqualTo(String value) {
            addCriterion("led32 <=", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32Like(String value) {
            addCriterion("led32 like", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32NotLike(String value) {
            addCriterion("led32 not like", value, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32In(List<String> values) {
            addCriterion("led32 in", values, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32NotIn(List<String> values) {
            addCriterion("led32 not in", values, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32Between(String value1, String value2) {
            addCriterion("led32 between", value1, value2, "led32");
            return (Criteria) this;
        }

        public Criteria andLed32NotBetween(String value1, String value2) {
            addCriterion("led32 not between", value1, value2, "led32");
            return (Criteria) this;
        }

        public Criteria andLed33IsNull() {
            addCriterion("led33 is null");
            return (Criteria) this;
        }

        public Criteria andLed33IsNotNull() {
            addCriterion("led33 is not null");
            return (Criteria) this;
        }

        public Criteria andLed33EqualTo(String value) {
            addCriterion("led33 =", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33NotEqualTo(String value) {
            addCriterion("led33 <>", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33GreaterThan(String value) {
            addCriterion("led33 >", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33GreaterThanOrEqualTo(String value) {
            addCriterion("led33 >=", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33LessThan(String value) {
            addCriterion("led33 <", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33LessThanOrEqualTo(String value) {
            addCriterion("led33 <=", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33Like(String value) {
            addCriterion("led33 like", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33NotLike(String value) {
            addCriterion("led33 not like", value, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33In(List<String> values) {
            addCriterion("led33 in", values, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33NotIn(List<String> values) {
            addCriterion("led33 not in", values, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33Between(String value1, String value2) {
            addCriterion("led33 between", value1, value2, "led33");
            return (Criteria) this;
        }

        public Criteria andLed33NotBetween(String value1, String value2) {
            addCriterion("led33 not between", value1, value2, "led33");
            return (Criteria) this;
        }

        public Criteria andYmbgIsNull() {
            addCriterion("ymbg is null");
            return (Criteria) this;
        }

        public Criteria andYmbgIsNotNull() {
            addCriterion("ymbg is not null");
            return (Criteria) this;
        }

        public Criteria andYmbgEqualTo(String value) {
            addCriterion("ymbg =", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgNotEqualTo(String value) {
            addCriterion("ymbg <>", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgGreaterThan(String value) {
            addCriterion("ymbg >", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgGreaterThanOrEqualTo(String value) {
            addCriterion("ymbg >=", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgLessThan(String value) {
            addCriterion("ymbg <", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgLessThanOrEqualTo(String value) {
            addCriterion("ymbg <=", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgLike(String value) {
            addCriterion("ymbg like", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgNotLike(String value) {
            addCriterion("ymbg not like", value, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgIn(List<String> values) {
            addCriterion("ymbg in", values, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgNotIn(List<String> values) {
            addCriterion("ymbg not in", values, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgBetween(String value1, String value2) {
            addCriterion("ymbg between", value1, value2, "ymbg");
            return (Criteria) this;
        }

        public Criteria andYmbgNotBetween(String value1, String value2) {
            addCriterion("ymbg not between", value1, value2, "ymbg");
            return (Criteria) this;
        }

        public Criteria andMpjsIsNull() {
            addCriterion("mpjs is null");
            return (Criteria) this;
        }

        public Criteria andMpjsIsNotNull() {
            addCriterion("mpjs is not null");
            return (Criteria) this;
        }

        public Criteria andMpjsEqualTo(String value) {
            addCriterion("mpjs =", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsNotEqualTo(String value) {
            addCriterion("mpjs <>", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsGreaterThan(String value) {
            addCriterion("mpjs >", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsGreaterThanOrEqualTo(String value) {
            addCriterion("mpjs >=", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsLessThan(String value) {
            addCriterion("mpjs <", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsLessThanOrEqualTo(String value) {
            addCriterion("mpjs <=", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsLike(String value) {
            addCriterion("mpjs like", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsNotLike(String value) {
            addCriterion("mpjs not like", value, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsIn(List<String> values) {
            addCriterion("mpjs in", values, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsNotIn(List<String> values) {
            addCriterion("mpjs not in", values, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsBetween(String value1, String value2) {
            addCriterion("mpjs between", value1, value2, "mpjs");
            return (Criteria) this;
        }

        public Criteria andMpjsNotBetween(String value1, String value2) {
            addCriterion("mpjs not between", value1, value2, "mpjs");
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
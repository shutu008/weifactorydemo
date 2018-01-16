package com.vastsum.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIsNull() {
            addCriterion("order_body is null");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIsNotNull() {
            addCriterion("order_body is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBodyEqualTo(String value) {
            addCriterion("order_body =", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotEqualTo(String value) {
            addCriterion("order_body <>", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyGreaterThan(String value) {
            addCriterion("order_body >", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyGreaterThanOrEqualTo(String value) {
            addCriterion("order_body >=", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLessThan(String value) {
            addCriterion("order_body <", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLessThanOrEqualTo(String value) {
            addCriterion("order_body <=", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyLike(String value) {
            addCriterion("order_body like", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotLike(String value) {
            addCriterion("order_body not like", value, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyIn(List<String> values) {
            addCriterion("order_body in", values, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotIn(List<String> values) {
            addCriterion("order_body not in", values, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyBetween(String value1, String value2) {
            addCriterion("order_body between", value1, value2, "orderBody");
            return (Criteria) this;
        }

        public Criteria andOrderBodyNotBetween(String value1, String value2) {
            addCriterion("order_body not between", value1, value2, "orderBody");
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

        public Criteria andModeOneIsNull() {
            addCriterion("mode_one is null");
            return (Criteria) this;
        }

        public Criteria andModeOneIsNotNull() {
            addCriterion("mode_one is not null");
            return (Criteria) this;
        }

        public Criteria andModeOneEqualTo(Integer value) {
            addCriterion("mode_one =", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneNotEqualTo(Integer value) {
            addCriterion("mode_one <>", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneGreaterThan(Integer value) {
            addCriterion("mode_one >", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneGreaterThanOrEqualTo(Integer value) {
            addCriterion("mode_one >=", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneLessThan(Integer value) {
            addCriterion("mode_one <", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneLessThanOrEqualTo(Integer value) {
            addCriterion("mode_one <=", value, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneIn(List<Integer> values) {
            addCriterion("mode_one in", values, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneNotIn(List<Integer> values) {
            addCriterion("mode_one not in", values, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneBetween(Integer value1, Integer value2) {
            addCriterion("mode_one between", value1, value2, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeOneNotBetween(Integer value1, Integer value2) {
            addCriterion("mode_one not between", value1, value2, "modeOne");
            return (Criteria) this;
        }

        public Criteria andModeTwoIsNull() {
            addCriterion("mode_two is null");
            return (Criteria) this;
        }

        public Criteria andModeTwoIsNotNull() {
            addCriterion("mode_two is not null");
            return (Criteria) this;
        }

        public Criteria andModeTwoEqualTo(Integer value) {
            addCriterion("mode_two =", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoNotEqualTo(Integer value) {
            addCriterion("mode_two <>", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoGreaterThan(Integer value) {
            addCriterion("mode_two >", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mode_two >=", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoLessThan(Integer value) {
            addCriterion("mode_two <", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoLessThanOrEqualTo(Integer value) {
            addCriterion("mode_two <=", value, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoIn(List<Integer> values) {
            addCriterion("mode_two in", values, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoNotIn(List<Integer> values) {
            addCriterion("mode_two not in", values, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoBetween(Integer value1, Integer value2) {
            addCriterion("mode_two between", value1, value2, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("mode_two not between", value1, value2, "modeTwo");
            return (Criteria) this;
        }

        public Criteria andModeThreeIsNull() {
            addCriterion("mode_three is null");
            return (Criteria) this;
        }

        public Criteria andModeThreeIsNotNull() {
            addCriterion("mode_three is not null");
            return (Criteria) this;
        }

        public Criteria andModeThreeEqualTo(Integer value) {
            addCriterion("mode_three =", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeNotEqualTo(Integer value) {
            addCriterion("mode_three <>", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeGreaterThan(Integer value) {
            addCriterion("mode_three >", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mode_three >=", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeLessThan(Integer value) {
            addCriterion("mode_three <", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeLessThanOrEqualTo(Integer value) {
            addCriterion("mode_three <=", value, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeIn(List<Integer> values) {
            addCriterion("mode_three in", values, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeNotIn(List<Integer> values) {
            addCriterion("mode_three not in", values, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeBetween(Integer value1, Integer value2) {
            addCriterion("mode_three between", value1, value2, "modeThree");
            return (Criteria) this;
        }

        public Criteria andModeThreeNotBetween(Integer value1, Integer value2) {
            addCriterion("mode_three not between", value1, value2, "modeThree");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(String value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(String value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(String value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(String value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(String value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(String value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLike(String value) {
            addCriterion("pay_channel like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotLike(String value) {
            addCriterion("pay_channel not like", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<String> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<String> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(String value1, String value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(String value1, String value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(String value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(String value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(String value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(String value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(String value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(String value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLike(String value) {
            addCriterion("deposit like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotLike(String value) {
            addCriterion("deposit not like", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<String> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<String> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(String value1, String value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(String value1, String value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andExpertIdIsNull() {
            addCriterion("expert_id is null");
            return (Criteria) this;
        }

        public Criteria andExpertIdIsNotNull() {
            addCriterion("expert_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpertIdEqualTo(Integer value) {
            addCriterion("expert_id =", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdNotEqualTo(Integer value) {
            addCriterion("expert_id <>", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdGreaterThan(Integer value) {
            addCriterion("expert_id >", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("expert_id >=", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdLessThan(Integer value) {
            addCriterion("expert_id <", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdLessThanOrEqualTo(Integer value) {
            addCriterion("expert_id <=", value, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdIn(List<Integer> values) {
            addCriterion("expert_id in", values, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdNotIn(List<Integer> values) {
            addCriterion("expert_id not in", values, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdBetween(Integer value1, Integer value2) {
            addCriterion("expert_id between", value1, value2, "expertId");
            return (Criteria) this;
        }

        public Criteria andExpertIdNotBetween(Integer value1, Integer value2) {
            addCriterion("expert_id not between", value1, value2, "expertId");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Byte value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Byte value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Byte value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Byte value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Byte value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Byte> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Byte> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Byte value1, Byte value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Byte value1, Byte value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStartIsNull() {
            addCriterion("order_start is null");
            return (Criteria) this;
        }

        public Criteria andOrderStartIsNotNull() {
            addCriterion("order_start is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStartEqualTo(Date value) {
            addCriterion("order_start =", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotEqualTo(Date value) {
            addCriterion("order_start <>", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartGreaterThan(Date value) {
            addCriterion("order_start >", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartGreaterThanOrEqualTo(Date value) {
            addCriterion("order_start >=", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartLessThan(Date value) {
            addCriterion("order_start <", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartLessThanOrEqualTo(Date value) {
            addCriterion("order_start <=", value, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartIn(List<Date> values) {
            addCriterion("order_start in", values, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotIn(List<Date> values) {
            addCriterion("order_start not in", values, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartBetween(Date value1, Date value2) {
            addCriterion("order_start between", value1, value2, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderStartNotBetween(Date value1, Date value2) {
            addCriterion("order_start not between", value1, value2, "orderStart");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNull() {
            addCriterion("order_end is null");
            return (Criteria) this;
        }

        public Criteria andOrderEndIsNotNull() {
            addCriterion("order_end is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEndEqualTo(Date value) {
            addCriterion("order_end =", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotEqualTo(Date value) {
            addCriterion("order_end <>", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThan(Date value) {
            addCriterion("order_end >", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndGreaterThanOrEqualTo(Date value) {
            addCriterion("order_end >=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThan(Date value) {
            addCriterion("order_end <", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndLessThanOrEqualTo(Date value) {
            addCriterion("order_end <=", value, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndIn(List<Date> values) {
            addCriterion("order_end in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotIn(List<Date> values) {
            addCriterion("order_end not in", values, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndBetween(Date value1, Date value2) {
            addCriterion("order_end between", value1, value2, "orderEnd");
            return (Criteria) this;
        }

        public Criteria andOrderEndNotBetween(Date value1, Date value2) {
            addCriterion("order_end not between", value1, value2, "orderEnd");
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
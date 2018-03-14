package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlantInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlantInfoExample() {
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

        public Criteria andPlantInfoIdIsNull() {
            addCriterion("plant_info_id is null");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdIsNotNull() {
            addCriterion("plant_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdEqualTo(Long value) {
            addCriterion("plant_info_id =", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdNotEqualTo(Long value) {
            addCriterion("plant_info_id <>", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdGreaterThan(Long value) {
            addCriterion("plant_info_id >", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plant_info_id >=", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdLessThan(Long value) {
            addCriterion("plant_info_id <", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdLessThanOrEqualTo(Long value) {
            addCriterion("plant_info_id <=", value, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdIn(List<Long> values) {
            addCriterion("plant_info_id in", values, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdNotIn(List<Long> values) {
            addCriterion("plant_info_id not in", values, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdBetween(Long value1, Long value2) {
            addCriterion("plant_info_id between", value1, value2, "plantInfoId");
            return (Criteria) this;
        }

        public Criteria andPlantInfoIdNotBetween(Long value1, Long value2) {
            addCriterion("plant_info_id not between", value1, value2, "plantInfoId");
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

        public Criteria andPlantDate1IsNull() {
            addCriterion("plant_date_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantDate1IsNotNull() {
            addCriterion("plant_date_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDate1EqualTo(Date value) {
            addCriterion("plant_date_1 =", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1NotEqualTo(Date value) {
            addCriterion("plant_date_1 <>", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1GreaterThan(Date value) {
            addCriterion("plant_date_1 >", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_date_1 >=", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1LessThan(Date value) {
            addCriterion("plant_date_1 <", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1LessThanOrEqualTo(Date value) {
            addCriterion("plant_date_1 <=", value, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1In(List<Date> values) {
            addCriterion("plant_date_1 in", values, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1NotIn(List<Date> values) {
            addCriterion("plant_date_1 not in", values, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1Between(Date value1, Date value2) {
            addCriterion("plant_date_1 between", value1, value2, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andPlantDate1NotBetween(Date value1, Date value2) {
            addCriterion("plant_date_1 not between", value1, value2, "plantDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1IsNull() {
            addCriterion("recovery_date_1 is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1IsNotNull() {
            addCriterion("recovery_date_1 is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1EqualTo(Date value) {
            addCriterion("recovery_date_1 =", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1NotEqualTo(Date value) {
            addCriterion("recovery_date_1 <>", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1GreaterThan(Date value) {
            addCriterion("recovery_date_1 >", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1GreaterThanOrEqualTo(Date value) {
            addCriterion("recovery_date_1 >=", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1LessThan(Date value) {
            addCriterion("recovery_date_1 <", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1LessThanOrEqualTo(Date value) {
            addCriterion("recovery_date_1 <=", value, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1In(List<Date> values) {
            addCriterion("recovery_date_1 in", values, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1NotIn(List<Date> values) {
            addCriterion("recovery_date_1 not in", values, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1Between(Date value1, Date value2) {
            addCriterion("recovery_date_1 between", value1, value2, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate1NotBetween(Date value1, Date value2) {
            addCriterion("recovery_date_1 not between", value1, value2, "recoveryDate1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1IsNull() {
            addCriterion("plant_num_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNum1IsNotNull() {
            addCriterion("plant_num_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNum1EqualTo(Integer value) {
            addCriterion("plant_num_1 =", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1NotEqualTo(Integer value) {
            addCriterion("plant_num_1 <>", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1GreaterThan(Integer value) {
            addCriterion("plant_num_1 >", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_num_1 >=", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1LessThan(Integer value) {
            addCriterion("plant_num_1 <", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1LessThanOrEqualTo(Integer value) {
            addCriterion("plant_num_1 <=", value, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1In(List<Integer> values) {
            addCriterion("plant_num_1 in", values, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1NotIn(List<Integer> values) {
            addCriterion("plant_num_1 not in", values, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1Between(Integer value1, Integer value2) {
            addCriterion("plant_num_1 between", value1, value2, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_num_1 not between", value1, value2, "plantNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1IsNull() {
            addCriterion("plant_leaf_num_1 is null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1IsNotNull() {
            addCriterion("plant_leaf_num_1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1EqualTo(Integer value) {
            addCriterion("plant_leaf_num_1 =", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1NotEqualTo(Integer value) {
            addCriterion("plant_leaf_num_1 <>", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1GreaterThan(Integer value) {
            addCriterion("plant_leaf_num_1 >", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_1 >=", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1LessThan(Integer value) {
            addCriterion("plant_leaf_num_1 <", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1LessThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_1 <=", value, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1In(List<Integer> values) {
            addCriterion("plant_leaf_num_1 in", values, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1NotIn(List<Integer> values) {
            addCriterion("plant_leaf_num_1 not in", values, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1Between(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_1 between", value1, value2, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum1NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_1 not between", value1, value2, "plantLeafNum1");
            return (Criteria) this;
        }

        public Criteria andControlMod1IsNull() {
            addCriterion("control_mod_1 is null");
            return (Criteria) this;
        }

        public Criteria andControlMod1IsNotNull() {
            addCriterion("control_mod_1 is not null");
            return (Criteria) this;
        }

        public Criteria andControlMod1EqualTo(Integer value) {
            addCriterion("control_mod_1 =", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1NotEqualTo(Integer value) {
            addCriterion("control_mod_1 <>", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1GreaterThan(Integer value) {
            addCriterion("control_mod_1 >", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_mod_1 >=", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1LessThan(Integer value) {
            addCriterion("control_mod_1 <", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1LessThanOrEqualTo(Integer value) {
            addCriterion("control_mod_1 <=", value, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1In(List<Integer> values) {
            addCriterion("control_mod_1 in", values, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1NotIn(List<Integer> values) {
            addCriterion("control_mod_1 not in", values, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1Between(Integer value1, Integer value2) {
            addCriterion("control_mod_1 between", value1, value2, "controlMod1");
            return (Criteria) this;
        }

        public Criteria andControlMod1NotBetween(Integer value1, Integer value2) {
            addCriterion("control_mod_1 not between", value1, value2, "controlMod1");
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

        public Criteria andPlantDate2IsNull() {
            addCriterion("plant_date_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantDate2IsNotNull() {
            addCriterion("plant_date_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDate2EqualTo(Date value) {
            addCriterion("plant_date_2 =", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2NotEqualTo(Date value) {
            addCriterion("plant_date_2 <>", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2GreaterThan(Date value) {
            addCriterion("plant_date_2 >", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_date_2 >=", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2LessThan(Date value) {
            addCriterion("plant_date_2 <", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2LessThanOrEqualTo(Date value) {
            addCriterion("plant_date_2 <=", value, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2In(List<Date> values) {
            addCriterion("plant_date_2 in", values, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2NotIn(List<Date> values) {
            addCriterion("plant_date_2 not in", values, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2Between(Date value1, Date value2) {
            addCriterion("plant_date_2 between", value1, value2, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andPlantDate2NotBetween(Date value1, Date value2) {
            addCriterion("plant_date_2 not between", value1, value2, "plantDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2IsNull() {
            addCriterion("recovery_date_2 is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2IsNotNull() {
            addCriterion("recovery_date_2 is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2EqualTo(Date value) {
            addCriterion("recovery_date_2 =", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2NotEqualTo(Date value) {
            addCriterion("recovery_date_2 <>", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2GreaterThan(Date value) {
            addCriterion("recovery_date_2 >", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2GreaterThanOrEqualTo(Date value) {
            addCriterion("recovery_date_2 >=", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2LessThan(Date value) {
            addCriterion("recovery_date_2 <", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2LessThanOrEqualTo(Date value) {
            addCriterion("recovery_date_2 <=", value, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2In(List<Date> values) {
            addCriterion("recovery_date_2 in", values, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2NotIn(List<Date> values) {
            addCriterion("recovery_date_2 not in", values, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2Between(Date value1, Date value2) {
            addCriterion("recovery_date_2 between", value1, value2, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate2NotBetween(Date value1, Date value2) {
            addCriterion("recovery_date_2 not between", value1, value2, "recoveryDate2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2IsNull() {
            addCriterion("plant_num_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNum2IsNotNull() {
            addCriterion("plant_num_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNum2EqualTo(Integer value) {
            addCriterion("plant_num_2 =", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2NotEqualTo(Integer value) {
            addCriterion("plant_num_2 <>", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2GreaterThan(Integer value) {
            addCriterion("plant_num_2 >", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_num_2 >=", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2LessThan(Integer value) {
            addCriterion("plant_num_2 <", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2LessThanOrEqualTo(Integer value) {
            addCriterion("plant_num_2 <=", value, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2In(List<Integer> values) {
            addCriterion("plant_num_2 in", values, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2NotIn(List<Integer> values) {
            addCriterion("plant_num_2 not in", values, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2Between(Integer value1, Integer value2) {
            addCriterion("plant_num_2 between", value1, value2, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_num_2 not between", value1, value2, "plantNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2IsNull() {
            addCriterion("plant_leaf_num_2 is null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2IsNotNull() {
            addCriterion("plant_leaf_num_2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2EqualTo(Integer value) {
            addCriterion("plant_leaf_num_2 =", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2NotEqualTo(Integer value) {
            addCriterion("plant_leaf_num_2 <>", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2GreaterThan(Integer value) {
            addCriterion("plant_leaf_num_2 >", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_2 >=", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2LessThan(Integer value) {
            addCriterion("plant_leaf_num_2 <", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2LessThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_2 <=", value, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2In(List<Integer> values) {
            addCriterion("plant_leaf_num_2 in", values, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2NotIn(List<Integer> values) {
            addCriterion("plant_leaf_num_2 not in", values, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2Between(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_2 between", value1, value2, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum2NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_2 not between", value1, value2, "plantLeafNum2");
            return (Criteria) this;
        }

        public Criteria andControlMod2IsNull() {
            addCriterion("control_mod_2 is null");
            return (Criteria) this;
        }

        public Criteria andControlMod2IsNotNull() {
            addCriterion("control_mod_2 is not null");
            return (Criteria) this;
        }

        public Criteria andControlMod2EqualTo(Integer value) {
            addCriterion("control_mod_2 =", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2NotEqualTo(Integer value) {
            addCriterion("control_mod_2 <>", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2GreaterThan(Integer value) {
            addCriterion("control_mod_2 >", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_mod_2 >=", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2LessThan(Integer value) {
            addCriterion("control_mod_2 <", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2LessThanOrEqualTo(Integer value) {
            addCriterion("control_mod_2 <=", value, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2In(List<Integer> values) {
            addCriterion("control_mod_2 in", values, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2NotIn(List<Integer> values) {
            addCriterion("control_mod_2 not in", values, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2Between(Integer value1, Integer value2) {
            addCriterion("control_mod_2 between", value1, value2, "controlMod2");
            return (Criteria) this;
        }

        public Criteria andControlMod2NotBetween(Integer value1, Integer value2) {
            addCriterion("control_mod_2 not between", value1, value2, "controlMod2");
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

        public Criteria andPlantDate3IsNull() {
            addCriterion("plant_date_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantDate3IsNotNull() {
            addCriterion("plant_date_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantDate3EqualTo(Date value) {
            addCriterion("plant_date_3 =", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3NotEqualTo(Date value) {
            addCriterion("plant_date_3 <>", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3GreaterThan(Date value) {
            addCriterion("plant_date_3 >", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3GreaterThanOrEqualTo(Date value) {
            addCriterion("plant_date_3 >=", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3LessThan(Date value) {
            addCriterion("plant_date_3 <", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3LessThanOrEqualTo(Date value) {
            addCriterion("plant_date_3 <=", value, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3In(List<Date> values) {
            addCriterion("plant_date_3 in", values, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3NotIn(List<Date> values) {
            addCriterion("plant_date_3 not in", values, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3Between(Date value1, Date value2) {
            addCriterion("plant_date_3 between", value1, value2, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andPlantDate3NotBetween(Date value1, Date value2) {
            addCriterion("plant_date_3 not between", value1, value2, "plantDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3IsNull() {
            addCriterion("recovery_date_3 is null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3IsNotNull() {
            addCriterion("recovery_date_3 is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3EqualTo(Date value) {
            addCriterion("recovery_date_3 =", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3NotEqualTo(Date value) {
            addCriterion("recovery_date_3 <>", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3GreaterThan(Date value) {
            addCriterion("recovery_date_3 >", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3GreaterThanOrEqualTo(Date value) {
            addCriterion("recovery_date_3 >=", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3LessThan(Date value) {
            addCriterion("recovery_date_3 <", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3LessThanOrEqualTo(Date value) {
            addCriterion("recovery_date_3 <=", value, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3In(List<Date> values) {
            addCriterion("recovery_date_3 in", values, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3NotIn(List<Date> values) {
            addCriterion("recovery_date_3 not in", values, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3Between(Date value1, Date value2) {
            addCriterion("recovery_date_3 between", value1, value2, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andRecoveryDate3NotBetween(Date value1, Date value2) {
            addCriterion("recovery_date_3 not between", value1, value2, "recoveryDate3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3IsNull() {
            addCriterion("plant_num_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantNum3IsNotNull() {
            addCriterion("plant_num_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantNum3EqualTo(Integer value) {
            addCriterion("plant_num_3 =", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3NotEqualTo(Integer value) {
            addCriterion("plant_num_3 <>", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3GreaterThan(Integer value) {
            addCriterion("plant_num_3 >", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_num_3 >=", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3LessThan(Integer value) {
            addCriterion("plant_num_3 <", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3LessThanOrEqualTo(Integer value) {
            addCriterion("plant_num_3 <=", value, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3In(List<Integer> values) {
            addCriterion("plant_num_3 in", values, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3NotIn(List<Integer> values) {
            addCriterion("plant_num_3 not in", values, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3Between(Integer value1, Integer value2) {
            addCriterion("plant_num_3 between", value1, value2, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantNum3NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_num_3 not between", value1, value2, "plantNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3IsNull() {
            addCriterion("plant_leaf_num_3 is null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3IsNotNull() {
            addCriterion("plant_leaf_num_3 is not null");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3EqualTo(Integer value) {
            addCriterion("plant_leaf_num_3 =", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3NotEqualTo(Integer value) {
            addCriterion("plant_leaf_num_3 <>", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3GreaterThan(Integer value) {
            addCriterion("plant_leaf_num_3 >", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3GreaterThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_3 >=", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3LessThan(Integer value) {
            addCriterion("plant_leaf_num_3 <", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3LessThanOrEqualTo(Integer value) {
            addCriterion("plant_leaf_num_3 <=", value, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3In(List<Integer> values) {
            addCriterion("plant_leaf_num_3 in", values, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3NotIn(List<Integer> values) {
            addCriterion("plant_leaf_num_3 not in", values, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3Between(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_3 between", value1, value2, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andPlantLeafNum3NotBetween(Integer value1, Integer value2) {
            addCriterion("plant_leaf_num_3 not between", value1, value2, "plantLeafNum3");
            return (Criteria) this;
        }

        public Criteria andControlMod3IsNull() {
            addCriterion("control_mod_3 is null");
            return (Criteria) this;
        }

        public Criteria andControlMod3IsNotNull() {
            addCriterion("control_mod_3 is not null");
            return (Criteria) this;
        }

        public Criteria andControlMod3EqualTo(Integer value) {
            addCriterion("control_mod_3 =", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3NotEqualTo(Integer value) {
            addCriterion("control_mod_3 <>", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3GreaterThan(Integer value) {
            addCriterion("control_mod_3 >", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3GreaterThanOrEqualTo(Integer value) {
            addCriterion("control_mod_3 >=", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3LessThan(Integer value) {
            addCriterion("control_mod_3 <", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3LessThanOrEqualTo(Integer value) {
            addCriterion("control_mod_3 <=", value, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3In(List<Integer> values) {
            addCriterion("control_mod_3 in", values, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3NotIn(List<Integer> values) {
            addCriterion("control_mod_3 not in", values, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3Between(Integer value1, Integer value2) {
            addCriterion("control_mod_3 between", value1, value2, "controlMod3");
            return (Criteria) this;
        }

        public Criteria andControlMod3NotBetween(Integer value1, Integer value2) {
            addCriterion("control_mod_3 not between", value1, value2, "controlMod3");
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

        public Criteria andFeedDateIsNull() {
            addCriterion("feed_date is null");
            return (Criteria) this;
        }

        public Criteria andFeedDateIsNotNull() {
            addCriterion("feed_date is not null");
            return (Criteria) this;
        }

        public Criteria andFeedDateEqualTo(Date value) {
            addCriterion("feed_date =", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateNotEqualTo(Date value) {
            addCriterion("feed_date <>", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateGreaterThan(Date value) {
            addCriterion("feed_date >", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("feed_date >=", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateLessThan(Date value) {
            addCriterion("feed_date <", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateLessThanOrEqualTo(Date value) {
            addCriterion("feed_date <=", value, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateIn(List<Date> values) {
            addCriterion("feed_date in", values, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateNotIn(List<Date> values) {
            addCriterion("feed_date not in", values, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateBetween(Date value1, Date value2) {
            addCriterion("feed_date between", value1, value2, "feedDate");
            return (Criteria) this;
        }

        public Criteria andFeedDateNotBetween(Date value1, Date value2) {
            addCriterion("feed_date not between", value1, value2, "feedDate");
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
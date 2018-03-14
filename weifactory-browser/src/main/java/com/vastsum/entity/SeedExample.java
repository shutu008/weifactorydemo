package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SeedExample() {
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

        public Criteria andSeedIdIsNull() {
            addCriterion("seed_id is null");
            return (Criteria) this;
        }

        public Criteria andSeedIdIsNotNull() {
            addCriterion("seed_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeedIdEqualTo(Long value) {
            addCriterion("seed_id =", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdNotEqualTo(Long value) {
            addCriterion("seed_id <>", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdGreaterThan(Long value) {
            addCriterion("seed_id >", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seed_id >=", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdLessThan(Long value) {
            addCriterion("seed_id <", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdLessThanOrEqualTo(Long value) {
            addCriterion("seed_id <=", value, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdIn(List<Long> values) {
            addCriterion("seed_id in", values, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdNotIn(List<Long> values) {
            addCriterion("seed_id not in", values, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdBetween(Long value1, Long value2) {
            addCriterion("seed_id between", value1, value2, "seedId");
            return (Criteria) this;
        }

        public Criteria andSeedIdNotBetween(Long value1, Long value2) {
            addCriterion("seed_id not between", value1, value2, "seedId");
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

        public Criteria andSeedRoomPlantIsNull() {
            addCriterion("seed_room_plant is null");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantIsNotNull() {
            addCriterion("seed_room_plant is not null");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantEqualTo(String value) {
            addCriterion("seed_room_plant =", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantNotEqualTo(String value) {
            addCriterion("seed_room_plant <>", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantGreaterThan(String value) {
            addCriterion("seed_room_plant >", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantGreaterThanOrEqualTo(String value) {
            addCriterion("seed_room_plant >=", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantLessThan(String value) {
            addCriterion("seed_room_plant <", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantLessThanOrEqualTo(String value) {
            addCriterion("seed_room_plant <=", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantLike(String value) {
            addCriterion("seed_room_plant like", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantNotLike(String value) {
            addCriterion("seed_room_plant not like", value, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantIn(List<String> values) {
            addCriterion("seed_room_plant in", values, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantNotIn(List<String> values) {
            addCriterion("seed_room_plant not in", values, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantBetween(String value1, String value2) {
            addCriterion("seed_room_plant between", value1, value2, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedRoomPlantNotBetween(String value1, String value2) {
            addCriterion("seed_room_plant not between", value1, value2, "seedRoomPlant");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeIsNull() {
            addCriterion("seed_planting_time is null");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeIsNotNull() {
            addCriterion("seed_planting_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeEqualTo(Date value) {
            addCriterion("seed_planting_time =", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeNotEqualTo(Date value) {
            addCriterion("seed_planting_time <>", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeGreaterThan(Date value) {
            addCriterion("seed_planting_time >", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seed_planting_time >=", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeLessThan(Date value) {
            addCriterion("seed_planting_time <", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeLessThanOrEqualTo(Date value) {
            addCriterion("seed_planting_time <=", value, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeIn(List<Date> values) {
            addCriterion("seed_planting_time in", values, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeNotIn(List<Date> values) {
            addCriterion("seed_planting_time not in", values, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeBetween(Date value1, Date value2) {
            addCriterion("seed_planting_time between", value1, value2, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedPlantingTimeNotBetween(Date value1, Date value2) {
            addCriterion("seed_planting_time not between", value1, value2, "seedPlantingTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeIsNull() {
            addCriterion("seed_recovery_time is null");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeIsNotNull() {
            addCriterion("seed_recovery_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeEqualTo(Date value) {
            addCriterion("seed_recovery_time =", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeNotEqualTo(Date value) {
            addCriterion("seed_recovery_time <>", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeGreaterThan(Date value) {
            addCriterion("seed_recovery_time >", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seed_recovery_time >=", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeLessThan(Date value) {
            addCriterion("seed_recovery_time <", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("seed_recovery_time <=", value, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeIn(List<Date> values) {
            addCriterion("seed_recovery_time in", values, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeNotIn(List<Date> values) {
            addCriterion("seed_recovery_time not in", values, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeBetween(Date value1, Date value2) {
            addCriterion("seed_recovery_time between", value1, value2, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedRecoveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("seed_recovery_time not between", value1, value2, "seedRecoveryTime");
            return (Criteria) this;
        }

        public Criteria andSeedLedIsNull() {
            addCriterion("seed_led is null");
            return (Criteria) this;
        }

        public Criteria andSeedLedIsNotNull() {
            addCriterion("seed_led is not null");
            return (Criteria) this;
        }

        public Criteria andSeedLedEqualTo(String value) {
            addCriterion("seed_led =", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedNotEqualTo(String value) {
            addCriterion("seed_led <>", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedGreaterThan(String value) {
            addCriterion("seed_led >", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedGreaterThanOrEqualTo(String value) {
            addCriterion("seed_led >=", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedLessThan(String value) {
            addCriterion("seed_led <", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedLessThanOrEqualTo(String value) {
            addCriterion("seed_led <=", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedLike(String value) {
            addCriterion("seed_led like", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedNotLike(String value) {
            addCriterion("seed_led not like", value, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedIn(List<String> values) {
            addCriterion("seed_led in", values, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedNotIn(List<String> values) {
            addCriterion("seed_led not in", values, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedBetween(String value1, String value2) {
            addCriterion("seed_led between", value1, value2, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedLedNotBetween(String value1, String value2) {
            addCriterion("seed_led not between", value1, value2, "seedLed");
            return (Criteria) this;
        }

        public Criteria andSeedSprayIsNull() {
            addCriterion("seed_spray is null");
            return (Criteria) this;
        }

        public Criteria andSeedSprayIsNotNull() {
            addCriterion("seed_spray is not null");
            return (Criteria) this;
        }

        public Criteria andSeedSprayEqualTo(String value) {
            addCriterion("seed_spray =", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayNotEqualTo(String value) {
            addCriterion("seed_spray <>", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayGreaterThan(String value) {
            addCriterion("seed_spray >", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayGreaterThanOrEqualTo(String value) {
            addCriterion("seed_spray >=", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayLessThan(String value) {
            addCriterion("seed_spray <", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayLessThanOrEqualTo(String value) {
            addCriterion("seed_spray <=", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayLike(String value) {
            addCriterion("seed_spray like", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayNotLike(String value) {
            addCriterion("seed_spray not like", value, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayIn(List<String> values) {
            addCriterion("seed_spray in", values, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayNotIn(List<String> values) {
            addCriterion("seed_spray not in", values, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayBetween(String value1, String value2) {
            addCriterion("seed_spray between", value1, value2, "seedSpray");
            return (Criteria) this;
        }

        public Criteria andSeedSprayNotBetween(String value1, String value2) {
            addCriterion("seed_spray not between", value1, value2, "seedSpray");
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
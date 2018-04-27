package com.vastsum.entity;

import java.util.ArrayList;
import java.util.List;

public class MechanismExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MechanismExample() {
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

        public Criteria andMechanismIdIsNull() {
            addCriterion("mechanism_id is null");
            return (Criteria) this;
        }

        public Criteria andMechanismIdIsNotNull() {
            addCriterion("mechanism_id is not null");
            return (Criteria) this;
        }

        public Criteria andMechanismIdEqualTo(Integer value) {
            addCriterion("mechanism_id =", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdNotEqualTo(Integer value) {
            addCriterion("mechanism_id <>", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdGreaterThan(Integer value) {
            addCriterion("mechanism_id >", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mechanism_id >=", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdLessThan(Integer value) {
            addCriterion("mechanism_id <", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdLessThanOrEqualTo(Integer value) {
            addCriterion("mechanism_id <=", value, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdIn(List<Integer> values) {
            addCriterion("mechanism_id in", values, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdNotIn(List<Integer> values) {
            addCriterion("mechanism_id not in", values, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdBetween(Integer value1, Integer value2) {
            addCriterion("mechanism_id between", value1, value2, "mechanismId");
            return (Criteria) this;
        }

        public Criteria andMechanismIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mechanism_id not between", value1, value2, "mechanismId");
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

        public Criteria andTimelyInterventionIsNull() {
            addCriterion("timely_intervention is null");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionIsNotNull() {
            addCriterion("timely_intervention is not null");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionEqualTo(Boolean value) {
            addCriterion("timely_intervention =", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionNotEqualTo(Boolean value) {
            addCriterion("timely_intervention <>", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionGreaterThan(Boolean value) {
            addCriterion("timely_intervention >", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("timely_intervention >=", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionLessThan(Boolean value) {
            addCriterion("timely_intervention <", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionLessThanOrEqualTo(Boolean value) {
            addCriterion("timely_intervention <=", value, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionIn(List<Boolean> values) {
            addCriterion("timely_intervention in", values, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionNotIn(List<Boolean> values) {
            addCriterion("timely_intervention not in", values, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionBetween(Boolean value1, Boolean value2) {
            addCriterion("timely_intervention between", value1, value2, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andTimelyInterventionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("timely_intervention not between", value1, value2, "timelyIntervention");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionIsNull() {
            addCriterion("air_disinfection is null");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionIsNotNull() {
            addCriterion("air_disinfection is not null");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionEqualTo(Boolean value) {
            addCriterion("air_disinfection =", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotEqualTo(Boolean value) {
            addCriterion("air_disinfection <>", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionGreaterThan(Boolean value) {
            addCriterion("air_disinfection >", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("air_disinfection >=", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionLessThan(Boolean value) {
            addCriterion("air_disinfection <", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionLessThanOrEqualTo(Boolean value) {
            addCriterion("air_disinfection <=", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionIn(List<Boolean> values) {
            addCriterion("air_disinfection in", values, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotIn(List<Boolean> values) {
            addCriterion("air_disinfection not in", values, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionBetween(Boolean value1, Boolean value2) {
            addCriterion("air_disinfection between", value1, value2, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("air_disinfection not between", value1, value2, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionIsNull() {
            addCriterion("liquid_disinfection is null");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionIsNotNull() {
            addCriterion("liquid_disinfection is not null");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionEqualTo(Boolean value) {
            addCriterion("liquid_disinfection =", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionNotEqualTo(Boolean value) {
            addCriterion("liquid_disinfection <>", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionGreaterThan(Boolean value) {
            addCriterion("liquid_disinfection >", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionGreaterThanOrEqualTo(Boolean value) {
            addCriterion("liquid_disinfection >=", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionLessThan(Boolean value) {
            addCriterion("liquid_disinfection <", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionLessThanOrEqualTo(Boolean value) {
            addCriterion("liquid_disinfection <=", value, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionIn(List<Boolean> values) {
            addCriterion("liquid_disinfection in", values, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionNotIn(List<Boolean> values) {
            addCriterion("liquid_disinfection not in", values, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionBetween(Boolean value1, Boolean value2) {
            addCriterion("liquid_disinfection between", value1, value2, "liquidDisinfection");
            return (Criteria) this;
        }

        public Criteria andLiquidDisinfectionNotBetween(Boolean value1, Boolean value2) {
            addCriterion("liquid_disinfection not between", value1, value2, "liquidDisinfection");
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

        public Criteria andWindEqualTo(Boolean value) {
            addCriterion("wind =", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotEqualTo(Boolean value) {
            addCriterion("wind <>", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThan(Boolean value) {
            addCriterion("wind >", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wind >=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThan(Boolean value) {
            addCriterion("wind <", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindLessThanOrEqualTo(Boolean value) {
            addCriterion("wind <=", value, "wind");
            return (Criteria) this;
        }

        public Criteria andWindIn(List<Boolean> values) {
            addCriterion("wind in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotIn(List<Boolean> values) {
            addCriterion("wind not in", values, "wind");
            return (Criteria) this;
        }

        public Criteria andWindBetween(Boolean value1, Boolean value2) {
            addCriterion("wind between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andWindNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wind not between", value1, value2, "wind");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNull() {
            addCriterion("compressor is null");
            return (Criteria) this;
        }

        public Criteria andCompressorIsNotNull() {
            addCriterion("compressor is not null");
            return (Criteria) this;
        }

        public Criteria andCompressorEqualTo(Boolean value) {
            addCriterion("compressor =", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotEqualTo(Boolean value) {
            addCriterion("compressor <>", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThan(Boolean value) {
            addCriterion("compressor >", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("compressor >=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThan(Boolean value) {
            addCriterion("compressor <", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThanOrEqualTo(Boolean value) {
            addCriterion("compressor <=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorIn(List<Boolean> values) {
            addCriterion("compressor in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotIn(List<Boolean> values) {
            addCriterion("compressor not in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorBetween(Boolean value1, Boolean value2) {
            addCriterion("compressor between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("compressor not between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andSprayIsNull() {
            addCriterion("spray is null");
            return (Criteria) this;
        }

        public Criteria andSprayIsNotNull() {
            addCriterion("spray is not null");
            return (Criteria) this;
        }

        public Criteria andSprayEqualTo(Boolean value) {
            addCriterion("spray =", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotEqualTo(Boolean value) {
            addCriterion("spray <>", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayGreaterThan(Boolean value) {
            addCriterion("spray >", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("spray >=", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayLessThan(Boolean value) {
            addCriterion("spray <", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayLessThanOrEqualTo(Boolean value) {
            addCriterion("spray <=", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayIn(List<Boolean> values) {
            addCriterion("spray in", values, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotIn(List<Boolean> values) {
            addCriterion("spray not in", values, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayBetween(Boolean value1, Boolean value2) {
            addCriterion("spray between", value1, value2, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("spray not between", value1, value2, "spray");
            return (Criteria) this;
        }

        public Criteria andLedTop1IsNull() {
            addCriterion("led_top_1 is null");
            return (Criteria) this;
        }

        public Criteria andLedTop1IsNotNull() {
            addCriterion("led_top_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLedTop1EqualTo(Boolean value) {
            addCriterion("led_top_1 =", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1NotEqualTo(Boolean value) {
            addCriterion("led_top_1 <>", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1GreaterThan(Boolean value) {
            addCriterion("led_top_1 >", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_top_1 >=", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1LessThan(Boolean value) {
            addCriterion("led_top_1 <", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1LessThanOrEqualTo(Boolean value) {
            addCriterion("led_top_1 <=", value, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1In(List<Boolean> values) {
            addCriterion("led_top_1 in", values, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1NotIn(List<Boolean> values) {
            addCriterion("led_top_1 not in", values, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1Between(Boolean value1, Boolean value2) {
            addCriterion("led_top_1 between", value1, value2, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_top_1 not between", value1, value2, "ledTop1");
            return (Criteria) this;
        }

        public Criteria andLedTop2IsNull() {
            addCriterion("led_top_2 is null");
            return (Criteria) this;
        }

        public Criteria andLedTop2IsNotNull() {
            addCriterion("led_top_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLedTop2EqualTo(Boolean value) {
            addCriterion("led_top_2 =", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2NotEqualTo(Boolean value) {
            addCriterion("led_top_2 <>", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2GreaterThan(Boolean value) {
            addCriterion("led_top_2 >", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_top_2 >=", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2LessThan(Boolean value) {
            addCriterion("led_top_2 <", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2LessThanOrEqualTo(Boolean value) {
            addCriterion("led_top_2 <=", value, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2In(List<Boolean> values) {
            addCriterion("led_top_2 in", values, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2NotIn(List<Boolean> values) {
            addCriterion("led_top_2 not in", values, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2Between(Boolean value1, Boolean value2) {
            addCriterion("led_top_2 between", value1, value2, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_top_2 not between", value1, value2, "ledTop2");
            return (Criteria) this;
        }

        public Criteria andLedTop3IsNull() {
            addCriterion("led_top_3 is null");
            return (Criteria) this;
        }

        public Criteria andLedTop3IsNotNull() {
            addCriterion("led_top_3 is not null");
            return (Criteria) this;
        }

        public Criteria andLedTop3EqualTo(Boolean value) {
            addCriterion("led_top_3 =", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3NotEqualTo(Boolean value) {
            addCriterion("led_top_3 <>", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3GreaterThan(Boolean value) {
            addCriterion("led_top_3 >", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_top_3 >=", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3LessThan(Boolean value) {
            addCriterion("led_top_3 <", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3LessThanOrEqualTo(Boolean value) {
            addCriterion("led_top_3 <=", value, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3In(List<Boolean> values) {
            addCriterion("led_top_3 in", values, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3NotIn(List<Boolean> values) {
            addCriterion("led_top_3 not in", values, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3Between(Boolean value1, Boolean value2) {
            addCriterion("led_top_3 between", value1, value2, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedTop3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_top_3 not between", value1, value2, "ledTop3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1IsNull() {
            addCriterion("led_middle_1 is null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1IsNotNull() {
            addCriterion("led_middle_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1EqualTo(Boolean value) {
            addCriterion("led_middle_1 =", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1NotEqualTo(Boolean value) {
            addCriterion("led_middle_1 <>", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1GreaterThan(Boolean value) {
            addCriterion("led_middle_1 >", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_1 >=", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1LessThan(Boolean value) {
            addCriterion("led_middle_1 <", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1LessThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_1 <=", value, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1In(List<Boolean> values) {
            addCriterion("led_middle_1 in", values, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1NotIn(List<Boolean> values) {
            addCriterion("led_middle_1 not in", values, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1Between(Boolean value1, Boolean value2) {
            addCriterion("led_middle_1 between", value1, value2, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_middle_1 not between", value1, value2, "ledMiddle1");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2IsNull() {
            addCriterion("led_middle_2 is null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2IsNotNull() {
            addCriterion("led_middle_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2EqualTo(Boolean value) {
            addCriterion("led_middle_2 =", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2NotEqualTo(Boolean value) {
            addCriterion("led_middle_2 <>", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2GreaterThan(Boolean value) {
            addCriterion("led_middle_2 >", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_2 >=", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2LessThan(Boolean value) {
            addCriterion("led_middle_2 <", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2LessThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_2 <=", value, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2In(List<Boolean> values) {
            addCriterion("led_middle_2 in", values, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2NotIn(List<Boolean> values) {
            addCriterion("led_middle_2 not in", values, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2Between(Boolean value1, Boolean value2) {
            addCriterion("led_middle_2 between", value1, value2, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_middle_2 not between", value1, value2, "ledMiddle2");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3IsNull() {
            addCriterion("led_middle_3 is null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3IsNotNull() {
            addCriterion("led_middle_3 is not null");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3EqualTo(Boolean value) {
            addCriterion("led_middle_3 =", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3NotEqualTo(Boolean value) {
            addCriterion("led_middle_3 <>", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3GreaterThan(Boolean value) {
            addCriterion("led_middle_3 >", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_3 >=", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3LessThan(Boolean value) {
            addCriterion("led_middle_3 <", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3LessThanOrEqualTo(Boolean value) {
            addCriterion("led_middle_3 <=", value, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3In(List<Boolean> values) {
            addCriterion("led_middle_3 in", values, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3NotIn(List<Boolean> values) {
            addCriterion("led_middle_3 not in", values, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3Between(Boolean value1, Boolean value2) {
            addCriterion("led_middle_3 between", value1, value2, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedMiddle3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_middle_3 not between", value1, value2, "ledMiddle3");
            return (Criteria) this;
        }

        public Criteria andLedBottom1IsNull() {
            addCriterion("led_bottom_1 is null");
            return (Criteria) this;
        }

        public Criteria andLedBottom1IsNotNull() {
            addCriterion("led_bottom_1 is not null");
            return (Criteria) this;
        }

        public Criteria andLedBottom1EqualTo(Boolean value) {
            addCriterion("led_bottom_1 =", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1NotEqualTo(Boolean value) {
            addCriterion("led_bottom_1 <>", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1GreaterThan(Boolean value) {
            addCriterion("led_bottom_1 >", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_1 >=", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1LessThan(Boolean value) {
            addCriterion("led_bottom_1 <", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1LessThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_1 <=", value, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1In(List<Boolean> values) {
            addCriterion("led_bottom_1 in", values, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1NotIn(List<Boolean> values) {
            addCriterion("led_bottom_1 not in", values, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1Between(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_1 between", value1, value2, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_1 not between", value1, value2, "ledBottom1");
            return (Criteria) this;
        }

        public Criteria andLedBottom2IsNull() {
            addCriterion("led_bottom_2 is null");
            return (Criteria) this;
        }

        public Criteria andLedBottom2IsNotNull() {
            addCriterion("led_bottom_2 is not null");
            return (Criteria) this;
        }

        public Criteria andLedBottom2EqualTo(Boolean value) {
            addCriterion("led_bottom_2 =", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2NotEqualTo(Boolean value) {
            addCriterion("led_bottom_2 <>", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2GreaterThan(Boolean value) {
            addCriterion("led_bottom_2 >", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_2 >=", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2LessThan(Boolean value) {
            addCriterion("led_bottom_2 <", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2LessThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_2 <=", value, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2In(List<Boolean> values) {
            addCriterion("led_bottom_2 in", values, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2NotIn(List<Boolean> values) {
            addCriterion("led_bottom_2 not in", values, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2Between(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_2 between", value1, value2, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_2 not between", value1, value2, "ledBottom2");
            return (Criteria) this;
        }

        public Criteria andLedBottom3IsNull() {
            addCriterion("led_bottom_3 is null");
            return (Criteria) this;
        }

        public Criteria andLedBottom3IsNotNull() {
            addCriterion("led_bottom_3 is not null");
            return (Criteria) this;
        }

        public Criteria andLedBottom3EqualTo(Boolean value) {
            addCriterion("led_bottom_3 =", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3NotEqualTo(Boolean value) {
            addCriterion("led_bottom_3 <>", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3GreaterThan(Boolean value) {
            addCriterion("led_bottom_3 >", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_3 >=", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3LessThan(Boolean value) {
            addCriterion("led_bottom_3 <", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3LessThanOrEqualTo(Boolean value) {
            addCriterion("led_bottom_3 <=", value, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3In(List<Boolean> values) {
            addCriterion("led_bottom_3 in", values, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3NotIn(List<Boolean> values) {
            addCriterion("led_bottom_3 not in", values, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3Between(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_3 between", value1, value2, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andLedBottom3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("led_bottom_3 not between", value1, value2, "ledBottom3");
            return (Criteria) this;
        }

        public Criteria andHeat1IsNull() {
            addCriterion("heat_1 is null");
            return (Criteria) this;
        }

        public Criteria andHeat1IsNotNull() {
            addCriterion("heat_1 is not null");
            return (Criteria) this;
        }

        public Criteria andHeat1EqualTo(Boolean value) {
            addCriterion("heat_1 =", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1NotEqualTo(Boolean value) {
            addCriterion("heat_1 <>", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1GreaterThan(Boolean value) {
            addCriterion("heat_1 >", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("heat_1 >=", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1LessThan(Boolean value) {
            addCriterion("heat_1 <", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1LessThanOrEqualTo(Boolean value) {
            addCriterion("heat_1 <=", value, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1In(List<Boolean> values) {
            addCriterion("heat_1 in", values, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1NotIn(List<Boolean> values) {
            addCriterion("heat_1 not in", values, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1Between(Boolean value1, Boolean value2) {
            addCriterion("heat_1 between", value1, value2, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("heat_1 not between", value1, value2, "heat1");
            return (Criteria) this;
        }

        public Criteria andHeat2IsNull() {
            addCriterion("heat_2 is null");
            return (Criteria) this;
        }

        public Criteria andHeat2IsNotNull() {
            addCriterion("heat_2 is not null");
            return (Criteria) this;
        }

        public Criteria andHeat2EqualTo(Boolean value) {
            addCriterion("heat_2 =", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2NotEqualTo(Boolean value) {
            addCriterion("heat_2 <>", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2GreaterThan(Boolean value) {
            addCriterion("heat_2 >", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("heat_2 >=", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2LessThan(Boolean value) {
            addCriterion("heat_2 <", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2LessThanOrEqualTo(Boolean value) {
            addCriterion("heat_2 <=", value, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2In(List<Boolean> values) {
            addCriterion("heat_2 in", values, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2NotIn(List<Boolean> values) {
            addCriterion("heat_2 not in", values, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2Between(Boolean value1, Boolean value2) {
            addCriterion("heat_2 between", value1, value2, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("heat_2 not between", value1, value2, "heat2");
            return (Criteria) this;
        }

        public Criteria andHeat3IsNull() {
            addCriterion("heat_3 is null");
            return (Criteria) this;
        }

        public Criteria andHeat3IsNotNull() {
            addCriterion("heat_3 is not null");
            return (Criteria) this;
        }

        public Criteria andHeat3EqualTo(Boolean value) {
            addCriterion("heat_3 =", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3NotEqualTo(Boolean value) {
            addCriterion("heat_3 <>", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3GreaterThan(Boolean value) {
            addCriterion("heat_3 >", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("heat_3 >=", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3LessThan(Boolean value) {
            addCriterion("heat_3 <", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3LessThanOrEqualTo(Boolean value) {
            addCriterion("heat_3 <=", value, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3In(List<Boolean> values) {
            addCriterion("heat_3 in", values, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3NotIn(List<Boolean> values) {
            addCriterion("heat_3 not in", values, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3Between(Boolean value1, Boolean value2) {
            addCriterion("heat_3 between", value1, value2, "heat3");
            return (Criteria) this;
        }

        public Criteria andHeat3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("heat_3 not between", value1, value2, "heat3");
            return (Criteria) this;
        }

        public Criteria andWaterin1IsNull() {
            addCriterion("waterin_1 is null");
            return (Criteria) this;
        }

        public Criteria andWaterin1IsNotNull() {
            addCriterion("waterin_1 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterin1EqualTo(Boolean value) {
            addCriterion("waterin_1 =", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1NotEqualTo(Boolean value) {
            addCriterion("waterin_1 <>", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1GreaterThan(Boolean value) {
            addCriterion("waterin_1 >", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterin_1 >=", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1LessThan(Boolean value) {
            addCriterion("waterin_1 <", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1LessThanOrEqualTo(Boolean value) {
            addCriterion("waterin_1 <=", value, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1In(List<Boolean> values) {
            addCriterion("waterin_1 in", values, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1NotIn(List<Boolean> values) {
            addCriterion("waterin_1 not in", values, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1Between(Boolean value1, Boolean value2) {
            addCriterion("waterin_1 between", value1, value2, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterin_1 not between", value1, value2, "waterin1");
            return (Criteria) this;
        }

        public Criteria andWaterin2IsNull() {
            addCriterion("waterin_2 is null");
            return (Criteria) this;
        }

        public Criteria andWaterin2IsNotNull() {
            addCriterion("waterin_2 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterin2EqualTo(Boolean value) {
            addCriterion("waterin_2 =", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2NotEqualTo(Boolean value) {
            addCriterion("waterin_2 <>", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2GreaterThan(Boolean value) {
            addCriterion("waterin_2 >", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterin_2 >=", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2LessThan(Boolean value) {
            addCriterion("waterin_2 <", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2LessThanOrEqualTo(Boolean value) {
            addCriterion("waterin_2 <=", value, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2In(List<Boolean> values) {
            addCriterion("waterin_2 in", values, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2NotIn(List<Boolean> values) {
            addCriterion("waterin_2 not in", values, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2Between(Boolean value1, Boolean value2) {
            addCriterion("waterin_2 between", value1, value2, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterin_2 not between", value1, value2, "waterin2");
            return (Criteria) this;
        }

        public Criteria andWaterin3IsNull() {
            addCriterion("waterin_3 is null");
            return (Criteria) this;
        }

        public Criteria andWaterin3IsNotNull() {
            addCriterion("waterin_3 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterin3EqualTo(Boolean value) {
            addCriterion("waterin_3 =", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3NotEqualTo(Boolean value) {
            addCriterion("waterin_3 <>", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3GreaterThan(Boolean value) {
            addCriterion("waterin_3 >", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterin_3 >=", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3LessThan(Boolean value) {
            addCriterion("waterin_3 <", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3LessThanOrEqualTo(Boolean value) {
            addCriterion("waterin_3 <=", value, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3In(List<Boolean> values) {
            addCriterion("waterin_3 in", values, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3NotIn(List<Boolean> values) {
            addCriterion("waterin_3 not in", values, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3Between(Boolean value1, Boolean value2) {
            addCriterion("waterin_3 between", value1, value2, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterin3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterin_3 not between", value1, value2, "waterin3");
            return (Criteria) this;
        }

        public Criteria andWaterout1IsNull() {
            addCriterion("waterout_1 is null");
            return (Criteria) this;
        }

        public Criteria andWaterout1IsNotNull() {
            addCriterion("waterout_1 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterout1EqualTo(Boolean value) {
            addCriterion("waterout_1 =", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1NotEqualTo(Boolean value) {
            addCriterion("waterout_1 <>", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1GreaterThan(Boolean value) {
            addCriterion("waterout_1 >", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterout_1 >=", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1LessThan(Boolean value) {
            addCriterion("waterout_1 <", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1LessThanOrEqualTo(Boolean value) {
            addCriterion("waterout_1 <=", value, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1In(List<Boolean> values) {
            addCriterion("waterout_1 in", values, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1NotIn(List<Boolean> values) {
            addCriterion("waterout_1 not in", values, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1Between(Boolean value1, Boolean value2) {
            addCriterion("waterout_1 between", value1, value2, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterout_1 not between", value1, value2, "waterout1");
            return (Criteria) this;
        }

        public Criteria andWaterout2IsNull() {
            addCriterion("waterout_2 is null");
            return (Criteria) this;
        }

        public Criteria andWaterout2IsNotNull() {
            addCriterion("waterout_2 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterout2EqualTo(Boolean value) {
            addCriterion("waterout_2 =", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2NotEqualTo(Boolean value) {
            addCriterion("waterout_2 <>", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2GreaterThan(Boolean value) {
            addCriterion("waterout_2 >", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterout_2 >=", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2LessThan(Boolean value) {
            addCriterion("waterout_2 <", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2LessThanOrEqualTo(Boolean value) {
            addCriterion("waterout_2 <=", value, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2In(List<Boolean> values) {
            addCriterion("waterout_2 in", values, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2NotIn(List<Boolean> values) {
            addCriterion("waterout_2 not in", values, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2Between(Boolean value1, Boolean value2) {
            addCriterion("waterout_2 between", value1, value2, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterout_2 not between", value1, value2, "waterout2");
            return (Criteria) this;
        }

        public Criteria andWaterout3IsNull() {
            addCriterion("waterout_3 is null");
            return (Criteria) this;
        }

        public Criteria andWaterout3IsNotNull() {
            addCriterion("waterout_3 is not null");
            return (Criteria) this;
        }

        public Criteria andWaterout3EqualTo(Boolean value) {
            addCriterion("waterout_3 =", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3NotEqualTo(Boolean value) {
            addCriterion("waterout_3 <>", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3GreaterThan(Boolean value) {
            addCriterion("waterout_3 >", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("waterout_3 >=", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3LessThan(Boolean value) {
            addCriterion("waterout_3 <", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3LessThanOrEqualTo(Boolean value) {
            addCriterion("waterout_3 <=", value, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3In(List<Boolean> values) {
            addCriterion("waterout_3 in", values, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3NotIn(List<Boolean> values) {
            addCriterion("waterout_3 not in", values, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3Between(Boolean value1, Boolean value2) {
            addCriterion("waterout_3 between", value1, value2, "waterout3");
            return (Criteria) this;
        }

        public Criteria andWaterout3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("waterout_3 not between", value1, value2, "waterout3");
            return (Criteria) this;
        }

        public Criteria andSeedledIsNull() {
            addCriterion("seedled is null");
            return (Criteria) this;
        }

        public Criteria andSeedledIsNotNull() {
            addCriterion("seedled is not null");
            return (Criteria) this;
        }

        public Criteria andSeedledEqualTo(Boolean value) {
            addCriterion("seedled =", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledNotEqualTo(Boolean value) {
            addCriterion("seedled <>", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledGreaterThan(Boolean value) {
            addCriterion("seedled >", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seedled >=", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledLessThan(Boolean value) {
            addCriterion("seedled <", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledLessThanOrEqualTo(Boolean value) {
            addCriterion("seedled <=", value, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledIn(List<Boolean> values) {
            addCriterion("seedled in", values, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledNotIn(List<Boolean> values) {
            addCriterion("seedled not in", values, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledBetween(Boolean value1, Boolean value2) {
            addCriterion("seedled between", value1, value2, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedledNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seedled not between", value1, value2, "seedled");
            return (Criteria) this;
        }

        public Criteria andSeedsprayIsNull() {
            addCriterion("seedspray is null");
            return (Criteria) this;
        }

        public Criteria andSeedsprayIsNotNull() {
            addCriterion("seedspray is not null");
            return (Criteria) this;
        }

        public Criteria andSeedsprayEqualTo(Boolean value) {
            addCriterion("seedspray =", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayNotEqualTo(Boolean value) {
            addCriterion("seedspray <>", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayGreaterThan(Boolean value) {
            addCriterion("seedspray >", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seedspray >=", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayLessThan(Boolean value) {
            addCriterion("seedspray <", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayLessThanOrEqualTo(Boolean value) {
            addCriterion("seedspray <=", value, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayIn(List<Boolean> values) {
            addCriterion("seedspray in", values, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayNotIn(List<Boolean> values) {
            addCriterion("seedspray not in", values, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayBetween(Boolean value1, Boolean value2) {
            addCriterion("seedspray between", value1, value2, "seedspray");
            return (Criteria) this;
        }

        public Criteria andSeedsprayNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seedspray not between", value1, value2, "seedspray");
            return (Criteria) this;
        }

        public Criteria andPumpIsNull() {
            addCriterion("pump is null");
            return (Criteria) this;
        }

        public Criteria andPumpIsNotNull() {
            addCriterion("pump is not null");
            return (Criteria) this;
        }

        public Criteria andPumpEqualTo(Boolean value) {
            addCriterion("pump =", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotEqualTo(Boolean value) {
            addCriterion("pump <>", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpGreaterThan(Boolean value) {
            addCriterion("pump >", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("pump >=", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpLessThan(Boolean value) {
            addCriterion("pump <", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpLessThanOrEqualTo(Boolean value) {
            addCriterion("pump <=", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpIn(List<Boolean> values) {
            addCriterion("pump in", values, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotIn(List<Boolean> values) {
            addCriterion("pump not in", values, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpBetween(Boolean value1, Boolean value2) {
            addCriterion("pump between", value1, value2, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("pump not between", value1, value2, "pump");
            return (Criteria) this;
        }

        public Criteria andFan1IsNull() {
            addCriterion("fan_1 is null");
            return (Criteria) this;
        }

        public Criteria andFan1IsNotNull() {
            addCriterion("fan_1 is not null");
            return (Criteria) this;
        }

        public Criteria andFan1EqualTo(Boolean value) {
            addCriterion("fan_1 =", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1NotEqualTo(Boolean value) {
            addCriterion("fan_1 <>", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1GreaterThan(Boolean value) {
            addCriterion("fan_1 >", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("fan_1 >=", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1LessThan(Boolean value) {
            addCriterion("fan_1 <", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1LessThanOrEqualTo(Boolean value) {
            addCriterion("fan_1 <=", value, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1In(List<Boolean> values) {
            addCriterion("fan_1 in", values, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1NotIn(List<Boolean> values) {
            addCriterion("fan_1 not in", values, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1Between(Boolean value1, Boolean value2) {
            addCriterion("fan_1 between", value1, value2, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("fan_1 not between", value1, value2, "fan1");
            return (Criteria) this;
        }

        public Criteria andFan2IsNull() {
            addCriterion("fan_2 is null");
            return (Criteria) this;
        }

        public Criteria andFan2IsNotNull() {
            addCriterion("fan_2 is not null");
            return (Criteria) this;
        }

        public Criteria andFan2EqualTo(Boolean value) {
            addCriterion("fan_2 =", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2NotEqualTo(Boolean value) {
            addCriterion("fan_2 <>", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2GreaterThan(Boolean value) {
            addCriterion("fan_2 >", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("fan_2 >=", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2LessThan(Boolean value) {
            addCriterion("fan_2 <", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2LessThanOrEqualTo(Boolean value) {
            addCriterion("fan_2 <=", value, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2In(List<Boolean> values) {
            addCriterion("fan_2 in", values, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2NotIn(List<Boolean> values) {
            addCriterion("fan_2 not in", values, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2Between(Boolean value1, Boolean value2) {
            addCriterion("fan_2 between", value1, value2, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("fan_2 not between", value1, value2, "fan2");
            return (Criteria) this;
        }

        public Criteria andFan3IsNull() {
            addCriterion("fan_3 is null");
            return (Criteria) this;
        }

        public Criteria andFan3IsNotNull() {
            addCriterion("fan_3 is not null");
            return (Criteria) this;
        }

        public Criteria andFan3EqualTo(Boolean value) {
            addCriterion("fan_3 =", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3NotEqualTo(Boolean value) {
            addCriterion("fan_3 <>", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3GreaterThan(Boolean value) {
            addCriterion("fan_3 >", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("fan_3 >=", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3LessThan(Boolean value) {
            addCriterion("fan_3 <", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3LessThanOrEqualTo(Boolean value) {
            addCriterion("fan_3 <=", value, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3In(List<Boolean> values) {
            addCriterion("fan_3 in", values, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3NotIn(List<Boolean> values) {
            addCriterion("fan_3 not in", values, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3Between(Boolean value1, Boolean value2) {
            addCriterion("fan_3 between", value1, value2, "fan3");
            return (Criteria) this;
        }

        public Criteria andFan3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("fan_3 not between", value1, value2, "fan3");
            return (Criteria) this;
        }

        public Criteria andAddwaterIsNull() {
            addCriterion("addwater is null");
            return (Criteria) this;
        }

        public Criteria andAddwaterIsNotNull() {
            addCriterion("addwater is not null");
            return (Criteria) this;
        }

        public Criteria andAddwaterEqualTo(Boolean value) {
            addCriterion("addwater =", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterNotEqualTo(Boolean value) {
            addCriterion("addwater <>", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterGreaterThan(Boolean value) {
            addCriterion("addwater >", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("addwater >=", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterLessThan(Boolean value) {
            addCriterion("addwater <", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterLessThanOrEqualTo(Boolean value) {
            addCriterion("addwater <=", value, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterIn(List<Boolean> values) {
            addCriterion("addwater in", values, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterNotIn(List<Boolean> values) {
            addCriterion("addwater not in", values, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterBetween(Boolean value1, Boolean value2) {
            addCriterion("addwater between", value1, value2, "addwater");
            return (Criteria) this;
        }

        public Criteria andAddwaterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("addwater not between", value1, value2, "addwater");
            return (Criteria) this;
        }

        public Criteria andDrainageIsNull() {
            addCriterion("drainage is null");
            return (Criteria) this;
        }

        public Criteria andDrainageIsNotNull() {
            addCriterion("drainage is not null");
            return (Criteria) this;
        }

        public Criteria andDrainageEqualTo(Boolean value) {
            addCriterion("drainage =", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageNotEqualTo(Boolean value) {
            addCriterion("drainage <>", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageGreaterThan(Boolean value) {
            addCriterion("drainage >", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageGreaterThanOrEqualTo(Boolean value) {
            addCriterion("drainage >=", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageLessThan(Boolean value) {
            addCriterion("drainage <", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageLessThanOrEqualTo(Boolean value) {
            addCriterion("drainage <=", value, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageIn(List<Boolean> values) {
            addCriterion("drainage in", values, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageNotIn(List<Boolean> values) {
            addCriterion("drainage not in", values, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageBetween(Boolean value1, Boolean value2) {
            addCriterion("drainage between", value1, value2, "drainage");
            return (Criteria) this;
        }

        public Criteria andDrainageNotBetween(Boolean value1, Boolean value2) {
            addCriterion("drainage not between", value1, value2, "drainage");
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
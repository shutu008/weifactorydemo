package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrganizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrganizationExample() {
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

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
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

        public Criteria andAirDisinfectionEqualTo(String value) {
            addCriterion("air_disinfection =", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotEqualTo(String value) {
            addCriterion("air_disinfection <>", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionGreaterThan(String value) {
            addCriterion("air_disinfection >", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionGreaterThanOrEqualTo(String value) {
            addCriterion("air_disinfection >=", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionLessThan(String value) {
            addCriterion("air_disinfection <", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionLessThanOrEqualTo(String value) {
            addCriterion("air_disinfection <=", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionLike(String value) {
            addCriterion("air_disinfection like", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotLike(String value) {
            addCriterion("air_disinfection not like", value, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionIn(List<String> values) {
            addCriterion("air_disinfection in", values, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotIn(List<String> values) {
            addCriterion("air_disinfection not in", values, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionBetween(String value1, String value2) {
            addCriterion("air_disinfection between", value1, value2, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andAirDisinfectionNotBetween(String value1, String value2) {
            addCriterion("air_disinfection not between", value1, value2, "airDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionIsNull() {
            addCriterion("solution_disinfection is null");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionIsNotNull() {
            addCriterion("solution_disinfection is not null");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionEqualTo(String value) {
            addCriterion("solution_disinfection =", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionNotEqualTo(String value) {
            addCriterion("solution_disinfection <>", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionGreaterThan(String value) {
            addCriterion("solution_disinfection >", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionGreaterThanOrEqualTo(String value) {
            addCriterion("solution_disinfection >=", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionLessThan(String value) {
            addCriterion("solution_disinfection <", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionLessThanOrEqualTo(String value) {
            addCriterion("solution_disinfection <=", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionLike(String value) {
            addCriterion("solution_disinfection like", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionNotLike(String value) {
            addCriterion("solution_disinfection not like", value, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionIn(List<String> values) {
            addCriterion("solution_disinfection in", values, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionNotIn(List<String> values) {
            addCriterion("solution_disinfection not in", values, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionBetween(String value1, String value2) {
            addCriterion("solution_disinfection between", value1, value2, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andSolutionDisinfectionNotBetween(String value1, String value2) {
            addCriterion("solution_disinfection not between", value1, value2, "solutionDisinfection");
            return (Criteria) this;
        }

        public Criteria andNewWindIsNull() {
            addCriterion("new_wind is null");
            return (Criteria) this;
        }

        public Criteria andNewWindIsNotNull() {
            addCriterion("new_wind is not null");
            return (Criteria) this;
        }

        public Criteria andNewWindEqualTo(String value) {
            addCriterion("new_wind =", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindNotEqualTo(String value) {
            addCriterion("new_wind <>", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindGreaterThan(String value) {
            addCriterion("new_wind >", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindGreaterThanOrEqualTo(String value) {
            addCriterion("new_wind >=", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindLessThan(String value) {
            addCriterion("new_wind <", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindLessThanOrEqualTo(String value) {
            addCriterion("new_wind <=", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindLike(String value) {
            addCriterion("new_wind like", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindNotLike(String value) {
            addCriterion("new_wind not like", value, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindIn(List<String> values) {
            addCriterion("new_wind in", values, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindNotIn(List<String> values) {
            addCriterion("new_wind not in", values, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindBetween(String value1, String value2) {
            addCriterion("new_wind between", value1, value2, "newWind");
            return (Criteria) this;
        }

        public Criteria andNewWindNotBetween(String value1, String value2) {
            addCriterion("new_wind not between", value1, value2, "newWind");
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

        public Criteria andCompressorEqualTo(String value) {
            addCriterion("compressor =", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotEqualTo(String value) {
            addCriterion("compressor <>", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThan(String value) {
            addCriterion("compressor >", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorGreaterThanOrEqualTo(String value) {
            addCriterion("compressor >=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThan(String value) {
            addCriterion("compressor <", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLessThanOrEqualTo(String value) {
            addCriterion("compressor <=", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorLike(String value) {
            addCriterion("compressor like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotLike(String value) {
            addCriterion("compressor not like", value, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorIn(List<String> values) {
            addCriterion("compressor in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotIn(List<String> values) {
            addCriterion("compressor not in", values, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorBetween(String value1, String value2) {
            addCriterion("compressor between", value1, value2, "compressor");
            return (Criteria) this;
        }

        public Criteria andCompressorNotBetween(String value1, String value2) {
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

        public Criteria andSprayEqualTo(String value) {
            addCriterion("spray =", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotEqualTo(String value) {
            addCriterion("spray <>", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayGreaterThan(String value) {
            addCriterion("spray >", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayGreaterThanOrEqualTo(String value) {
            addCriterion("spray >=", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayLessThan(String value) {
            addCriterion("spray <", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayLessThanOrEqualTo(String value) {
            addCriterion("spray <=", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayLike(String value) {
            addCriterion("spray like", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotLike(String value) {
            addCriterion("spray not like", value, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayIn(List<String> values) {
            addCriterion("spray in", values, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotIn(List<String> values) {
            addCriterion("spray not in", values, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayBetween(String value1, String value2) {
            addCriterion("spray between", value1, value2, "spray");
            return (Criteria) this;
        }

        public Criteria andSprayNotBetween(String value1, String value2) {
            addCriterion("spray not between", value1, value2, "spray");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerIsNull() {
            addCriterion("grow_one_inner is null");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerIsNotNull() {
            addCriterion("grow_one_inner is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerEqualTo(String value) {
            addCriterion("grow_one_inner =", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerNotEqualTo(String value) {
            addCriterion("grow_one_inner <>", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerGreaterThan(String value) {
            addCriterion("grow_one_inner >", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerGreaterThanOrEqualTo(String value) {
            addCriterion("grow_one_inner >=", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerLessThan(String value) {
            addCriterion("grow_one_inner <", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerLessThanOrEqualTo(String value) {
            addCriterion("grow_one_inner <=", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerLike(String value) {
            addCriterion("grow_one_inner like", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerNotLike(String value) {
            addCriterion("grow_one_inner not like", value, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerIn(List<String> values) {
            addCriterion("grow_one_inner in", values, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerNotIn(List<String> values) {
            addCriterion("grow_one_inner not in", values, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerBetween(String value1, String value2) {
            addCriterion("grow_one_inner between", value1, value2, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneInnerNotBetween(String value1, String value2) {
            addCriterion("grow_one_inner not between", value1, value2, "growOneInner");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleIsNull() {
            addCriterion("grow_one_middle is null");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleIsNotNull() {
            addCriterion("grow_one_middle is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleEqualTo(String value) {
            addCriterion("grow_one_middle =", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleNotEqualTo(String value) {
            addCriterion("grow_one_middle <>", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleGreaterThan(String value) {
            addCriterion("grow_one_middle >", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("grow_one_middle >=", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleLessThan(String value) {
            addCriterion("grow_one_middle <", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleLessThanOrEqualTo(String value) {
            addCriterion("grow_one_middle <=", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleLike(String value) {
            addCriterion("grow_one_middle like", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleNotLike(String value) {
            addCriterion("grow_one_middle not like", value, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleIn(List<String> values) {
            addCriterion("grow_one_middle in", values, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleNotIn(List<String> values) {
            addCriterion("grow_one_middle not in", values, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleBetween(String value1, String value2) {
            addCriterion("grow_one_middle between", value1, value2, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneMiddleNotBetween(String value1, String value2) {
            addCriterion("grow_one_middle not between", value1, value2, "growOneMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutIsNull() {
            addCriterion("grow_one_out is null");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutIsNotNull() {
            addCriterion("grow_one_out is not null");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutEqualTo(String value) {
            addCriterion("grow_one_out =", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutNotEqualTo(String value) {
            addCriterion("grow_one_out <>", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutGreaterThan(String value) {
            addCriterion("grow_one_out >", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutGreaterThanOrEqualTo(String value) {
            addCriterion("grow_one_out >=", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutLessThan(String value) {
            addCriterion("grow_one_out <", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutLessThanOrEqualTo(String value) {
            addCriterion("grow_one_out <=", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutLike(String value) {
            addCriterion("grow_one_out like", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutNotLike(String value) {
            addCriterion("grow_one_out not like", value, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutIn(List<String> values) {
            addCriterion("grow_one_out in", values, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutNotIn(List<String> values) {
            addCriterion("grow_one_out not in", values, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutBetween(String value1, String value2) {
            addCriterion("grow_one_out between", value1, value2, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowOneOutNotBetween(String value1, String value2) {
            addCriterion("grow_one_out not between", value1, value2, "growOneOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerIsNull() {
            addCriterion("grow_two_inner is null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerIsNotNull() {
            addCriterion("grow_two_inner is not null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerEqualTo(String value) {
            addCriterion("grow_two_inner =", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerNotEqualTo(String value) {
            addCriterion("grow_two_inner <>", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerGreaterThan(String value) {
            addCriterion("grow_two_inner >", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerGreaterThanOrEqualTo(String value) {
            addCriterion("grow_two_inner >=", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerLessThan(String value) {
            addCriterion("grow_two_inner <", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerLessThanOrEqualTo(String value) {
            addCriterion("grow_two_inner <=", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerLike(String value) {
            addCriterion("grow_two_inner like", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerNotLike(String value) {
            addCriterion("grow_two_inner not like", value, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerIn(List<String> values) {
            addCriterion("grow_two_inner in", values, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerNotIn(List<String> values) {
            addCriterion("grow_two_inner not in", values, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerBetween(String value1, String value2) {
            addCriterion("grow_two_inner between", value1, value2, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoInnerNotBetween(String value1, String value2) {
            addCriterion("grow_two_inner not between", value1, value2, "growTwoInner");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleIsNull() {
            addCriterion("grow_two_middle is null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleIsNotNull() {
            addCriterion("grow_two_middle is not null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleEqualTo(String value) {
            addCriterion("grow_two_middle =", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleNotEqualTo(String value) {
            addCriterion("grow_two_middle <>", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleGreaterThan(String value) {
            addCriterion("grow_two_middle >", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("grow_two_middle >=", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleLessThan(String value) {
            addCriterion("grow_two_middle <", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleLessThanOrEqualTo(String value) {
            addCriterion("grow_two_middle <=", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleLike(String value) {
            addCriterion("grow_two_middle like", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleNotLike(String value) {
            addCriterion("grow_two_middle not like", value, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleIn(List<String> values) {
            addCriterion("grow_two_middle in", values, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleNotIn(List<String> values) {
            addCriterion("grow_two_middle not in", values, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleBetween(String value1, String value2) {
            addCriterion("grow_two_middle between", value1, value2, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoMiddleNotBetween(String value1, String value2) {
            addCriterion("grow_two_middle not between", value1, value2, "growTwoMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutIsNull() {
            addCriterion("grow_two_out is null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutIsNotNull() {
            addCriterion("grow_two_out is not null");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutEqualTo(String value) {
            addCriterion("grow_two_out =", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutNotEqualTo(String value) {
            addCriterion("grow_two_out <>", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutGreaterThan(String value) {
            addCriterion("grow_two_out >", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutGreaterThanOrEqualTo(String value) {
            addCriterion("grow_two_out >=", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutLessThan(String value) {
            addCriterion("grow_two_out <", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutLessThanOrEqualTo(String value) {
            addCriterion("grow_two_out <=", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutLike(String value) {
            addCriterion("grow_two_out like", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutNotLike(String value) {
            addCriterion("grow_two_out not like", value, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutIn(List<String> values) {
            addCriterion("grow_two_out in", values, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutNotIn(List<String> values) {
            addCriterion("grow_two_out not in", values, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutBetween(String value1, String value2) {
            addCriterion("grow_two_out between", value1, value2, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowTwoOutNotBetween(String value1, String value2) {
            addCriterion("grow_two_out not between", value1, value2, "growTwoOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerIsNull() {
            addCriterion("grow_three_inner is null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerIsNotNull() {
            addCriterion("grow_three_inner is not null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerEqualTo(String value) {
            addCriterion("grow_three_inner =", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerNotEqualTo(String value) {
            addCriterion("grow_three_inner <>", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerGreaterThan(String value) {
            addCriterion("grow_three_inner >", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerGreaterThanOrEqualTo(String value) {
            addCriterion("grow_three_inner >=", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerLessThan(String value) {
            addCriterion("grow_three_inner <", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerLessThanOrEqualTo(String value) {
            addCriterion("grow_three_inner <=", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerLike(String value) {
            addCriterion("grow_three_inner like", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerNotLike(String value) {
            addCriterion("grow_three_inner not like", value, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerIn(List<String> values) {
            addCriterion("grow_three_inner in", values, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerNotIn(List<String> values) {
            addCriterion("grow_three_inner not in", values, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerBetween(String value1, String value2) {
            addCriterion("grow_three_inner between", value1, value2, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeInnerNotBetween(String value1, String value2) {
            addCriterion("grow_three_inner not between", value1, value2, "growThreeInner");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleIsNull() {
            addCriterion("grow_three_middle is null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleIsNotNull() {
            addCriterion("grow_three_middle is not null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleEqualTo(String value) {
            addCriterion("grow_three_middle =", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleNotEqualTo(String value) {
            addCriterion("grow_three_middle <>", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleGreaterThan(String value) {
            addCriterion("grow_three_middle >", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("grow_three_middle >=", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleLessThan(String value) {
            addCriterion("grow_three_middle <", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleLessThanOrEqualTo(String value) {
            addCriterion("grow_three_middle <=", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleLike(String value) {
            addCriterion("grow_three_middle like", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleNotLike(String value) {
            addCriterion("grow_three_middle not like", value, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleIn(List<String> values) {
            addCriterion("grow_three_middle in", values, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleNotIn(List<String> values) {
            addCriterion("grow_three_middle not in", values, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleBetween(String value1, String value2) {
            addCriterion("grow_three_middle between", value1, value2, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeMiddleNotBetween(String value1, String value2) {
            addCriterion("grow_three_middle not between", value1, value2, "growThreeMiddle");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutIsNull() {
            addCriterion("grow_three_out is null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutIsNotNull() {
            addCriterion("grow_three_out is not null");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutEqualTo(String value) {
            addCriterion("grow_three_out =", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutNotEqualTo(String value) {
            addCriterion("grow_three_out <>", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutGreaterThan(String value) {
            addCriterion("grow_three_out >", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutGreaterThanOrEqualTo(String value) {
            addCriterion("grow_three_out >=", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutLessThan(String value) {
            addCriterion("grow_three_out <", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutLessThanOrEqualTo(String value) {
            addCriterion("grow_three_out <=", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutLike(String value) {
            addCriterion("grow_three_out like", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutNotLike(String value) {
            addCriterion("grow_three_out not like", value, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutIn(List<String> values) {
            addCriterion("grow_three_out in", values, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutNotIn(List<String> values) {
            addCriterion("grow_three_out not in", values, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutBetween(String value1, String value2) {
            addCriterion("grow_three_out between", value1, value2, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andGrowThreeOutNotBetween(String value1, String value2) {
            addCriterion("grow_three_out not between", value1, value2, "growThreeOut");
            return (Criteria) this;
        }

        public Criteria andAddOneIsNull() {
            addCriterion("add_one is null");
            return (Criteria) this;
        }

        public Criteria andAddOneIsNotNull() {
            addCriterion("add_one is not null");
            return (Criteria) this;
        }

        public Criteria andAddOneEqualTo(String value) {
            addCriterion("add_one =", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneNotEqualTo(String value) {
            addCriterion("add_one <>", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneGreaterThan(String value) {
            addCriterion("add_one >", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneGreaterThanOrEqualTo(String value) {
            addCriterion("add_one >=", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneLessThan(String value) {
            addCriterion("add_one <", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneLessThanOrEqualTo(String value) {
            addCriterion("add_one <=", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneLike(String value) {
            addCriterion("add_one like", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneNotLike(String value) {
            addCriterion("add_one not like", value, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneIn(List<String> values) {
            addCriterion("add_one in", values, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneNotIn(List<String> values) {
            addCriterion("add_one not in", values, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneBetween(String value1, String value2) {
            addCriterion("add_one between", value1, value2, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddOneNotBetween(String value1, String value2) {
            addCriterion("add_one not between", value1, value2, "addOne");
            return (Criteria) this;
        }

        public Criteria andAddTwoIsNull() {
            addCriterion("add_two is null");
            return (Criteria) this;
        }

        public Criteria andAddTwoIsNotNull() {
            addCriterion("add_two is not null");
            return (Criteria) this;
        }

        public Criteria andAddTwoEqualTo(String value) {
            addCriterion("add_two =", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoNotEqualTo(String value) {
            addCriterion("add_two <>", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoGreaterThan(String value) {
            addCriterion("add_two >", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoGreaterThanOrEqualTo(String value) {
            addCriterion("add_two >=", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoLessThan(String value) {
            addCriterion("add_two <", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoLessThanOrEqualTo(String value) {
            addCriterion("add_two <=", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoLike(String value) {
            addCriterion("add_two like", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoNotLike(String value) {
            addCriterion("add_two not like", value, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoIn(List<String> values) {
            addCriterion("add_two in", values, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoNotIn(List<String> values) {
            addCriterion("add_two not in", values, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoBetween(String value1, String value2) {
            addCriterion("add_two between", value1, value2, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddTwoNotBetween(String value1, String value2) {
            addCriterion("add_two not between", value1, value2, "addTwo");
            return (Criteria) this;
        }

        public Criteria andAddThreeIsNull() {
            addCriterion("add_three is null");
            return (Criteria) this;
        }

        public Criteria andAddThreeIsNotNull() {
            addCriterion("add_three is not null");
            return (Criteria) this;
        }

        public Criteria andAddThreeEqualTo(String value) {
            addCriterion("add_three =", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeNotEqualTo(String value) {
            addCriterion("add_three <>", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeGreaterThan(String value) {
            addCriterion("add_three >", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeGreaterThanOrEqualTo(String value) {
            addCriterion("add_three >=", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeLessThan(String value) {
            addCriterion("add_three <", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeLessThanOrEqualTo(String value) {
            addCriterion("add_three <=", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeLike(String value) {
            addCriterion("add_three like", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeNotLike(String value) {
            addCriterion("add_three not like", value, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeIn(List<String> values) {
            addCriterion("add_three in", values, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeNotIn(List<String> values) {
            addCriterion("add_three not in", values, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeBetween(String value1, String value2) {
            addCriterion("add_three between", value1, value2, "addThree");
            return (Criteria) this;
        }

        public Criteria andAddThreeNotBetween(String value1, String value2) {
            addCriterion("add_three not between", value1, value2, "addThree");
            return (Criteria) this;
        }

        public Criteria andInletOneIsNull() {
            addCriterion("inlet_one is null");
            return (Criteria) this;
        }

        public Criteria andInletOneIsNotNull() {
            addCriterion("inlet_one is not null");
            return (Criteria) this;
        }

        public Criteria andInletOneEqualTo(String value) {
            addCriterion("inlet_one =", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneNotEqualTo(String value) {
            addCriterion("inlet_one <>", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneGreaterThan(String value) {
            addCriterion("inlet_one >", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneGreaterThanOrEqualTo(String value) {
            addCriterion("inlet_one >=", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneLessThan(String value) {
            addCriterion("inlet_one <", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneLessThanOrEqualTo(String value) {
            addCriterion("inlet_one <=", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneLike(String value) {
            addCriterion("inlet_one like", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneNotLike(String value) {
            addCriterion("inlet_one not like", value, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneIn(List<String> values) {
            addCriterion("inlet_one in", values, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneNotIn(List<String> values) {
            addCriterion("inlet_one not in", values, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneBetween(String value1, String value2) {
            addCriterion("inlet_one between", value1, value2, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletOneNotBetween(String value1, String value2) {
            addCriterion("inlet_one not between", value1, value2, "inletOne");
            return (Criteria) this;
        }

        public Criteria andInletTwoIsNull() {
            addCriterion("inlet_two is null");
            return (Criteria) this;
        }

        public Criteria andInletTwoIsNotNull() {
            addCriterion("inlet_two is not null");
            return (Criteria) this;
        }

        public Criteria andInletTwoEqualTo(String value) {
            addCriterion("inlet_two =", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoNotEqualTo(String value) {
            addCriterion("inlet_two <>", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoGreaterThan(String value) {
            addCriterion("inlet_two >", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoGreaterThanOrEqualTo(String value) {
            addCriterion("inlet_two >=", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoLessThan(String value) {
            addCriterion("inlet_two <", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoLessThanOrEqualTo(String value) {
            addCriterion("inlet_two <=", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoLike(String value) {
            addCriterion("inlet_two like", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoNotLike(String value) {
            addCriterion("inlet_two not like", value, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoIn(List<String> values) {
            addCriterion("inlet_two in", values, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoNotIn(List<String> values) {
            addCriterion("inlet_two not in", values, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoBetween(String value1, String value2) {
            addCriterion("inlet_two between", value1, value2, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletTwoNotBetween(String value1, String value2) {
            addCriterion("inlet_two not between", value1, value2, "inletTwo");
            return (Criteria) this;
        }

        public Criteria andInletThreeIsNull() {
            addCriterion("inlet_three is null");
            return (Criteria) this;
        }

        public Criteria andInletThreeIsNotNull() {
            addCriterion("inlet_three is not null");
            return (Criteria) this;
        }

        public Criteria andInletThreeEqualTo(String value) {
            addCriterion("inlet_three =", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeNotEqualTo(String value) {
            addCriterion("inlet_three <>", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeGreaterThan(String value) {
            addCriterion("inlet_three >", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeGreaterThanOrEqualTo(String value) {
            addCriterion("inlet_three >=", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeLessThan(String value) {
            addCriterion("inlet_three <", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeLessThanOrEqualTo(String value) {
            addCriterion("inlet_three <=", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeLike(String value) {
            addCriterion("inlet_three like", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeNotLike(String value) {
            addCriterion("inlet_three not like", value, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeIn(List<String> values) {
            addCriterion("inlet_three in", values, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeNotIn(List<String> values) {
            addCriterion("inlet_three not in", values, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeBetween(String value1, String value2) {
            addCriterion("inlet_three between", value1, value2, "inletThree");
            return (Criteria) this;
        }

        public Criteria andInletThreeNotBetween(String value1, String value2) {
            addCriterion("inlet_three not between", value1, value2, "inletThree");
            return (Criteria) this;
        }

        public Criteria andEffluentOneIsNull() {
            addCriterion("effluent_one is null");
            return (Criteria) this;
        }

        public Criteria andEffluentOneIsNotNull() {
            addCriterion("effluent_one is not null");
            return (Criteria) this;
        }

        public Criteria andEffluentOneEqualTo(String value) {
            addCriterion("effluent_one =", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneNotEqualTo(String value) {
            addCriterion("effluent_one <>", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneGreaterThan(String value) {
            addCriterion("effluent_one >", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneGreaterThanOrEqualTo(String value) {
            addCriterion("effluent_one >=", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneLessThan(String value) {
            addCriterion("effluent_one <", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneLessThanOrEqualTo(String value) {
            addCriterion("effluent_one <=", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneLike(String value) {
            addCriterion("effluent_one like", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneNotLike(String value) {
            addCriterion("effluent_one not like", value, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneIn(List<String> values) {
            addCriterion("effluent_one in", values, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneNotIn(List<String> values) {
            addCriterion("effluent_one not in", values, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneBetween(String value1, String value2) {
            addCriterion("effluent_one between", value1, value2, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentOneNotBetween(String value1, String value2) {
            addCriterion("effluent_one not between", value1, value2, "effluentOne");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoIsNull() {
            addCriterion("effluent_two is null");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoIsNotNull() {
            addCriterion("effluent_two is not null");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoEqualTo(String value) {
            addCriterion("effluent_two =", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoNotEqualTo(String value) {
            addCriterion("effluent_two <>", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoGreaterThan(String value) {
            addCriterion("effluent_two >", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoGreaterThanOrEqualTo(String value) {
            addCriterion("effluent_two >=", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoLessThan(String value) {
            addCriterion("effluent_two <", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoLessThanOrEqualTo(String value) {
            addCriterion("effluent_two <=", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoLike(String value) {
            addCriterion("effluent_two like", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoNotLike(String value) {
            addCriterion("effluent_two not like", value, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoIn(List<String> values) {
            addCriterion("effluent_two in", values, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoNotIn(List<String> values) {
            addCriterion("effluent_two not in", values, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoBetween(String value1, String value2) {
            addCriterion("effluent_two between", value1, value2, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentTwoNotBetween(String value1, String value2) {
            addCriterion("effluent_two not between", value1, value2, "effluentTwo");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeIsNull() {
            addCriterion("effluent_three is null");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeIsNotNull() {
            addCriterion("effluent_three is not null");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeEqualTo(String value) {
            addCriterion("effluent_three =", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeNotEqualTo(String value) {
            addCriterion("effluent_three <>", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeGreaterThan(String value) {
            addCriterion("effluent_three >", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeGreaterThanOrEqualTo(String value) {
            addCriterion("effluent_three >=", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeLessThan(String value) {
            addCriterion("effluent_three <", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeLessThanOrEqualTo(String value) {
            addCriterion("effluent_three <=", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeLike(String value) {
            addCriterion("effluent_three like", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeNotLike(String value) {
            addCriterion("effluent_three not like", value, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeIn(List<String> values) {
            addCriterion("effluent_three in", values, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeNotIn(List<String> values) {
            addCriterion("effluent_three not in", values, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeBetween(String value1, String value2) {
            addCriterion("effluent_three between", value1, value2, "effluentThree");
            return (Criteria) this;
        }

        public Criteria andEffluentThreeNotBetween(String value1, String value2) {
            addCriterion("effluent_three not between", value1, value2, "effluentThree");
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

        public Criteria andFeedSprayIsNull() {
            addCriterion("feed_spray is null");
            return (Criteria) this;
        }

        public Criteria andFeedSprayIsNotNull() {
            addCriterion("feed_spray is not null");
            return (Criteria) this;
        }

        public Criteria andFeedSprayEqualTo(String value) {
            addCriterion("feed_spray =", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayNotEqualTo(String value) {
            addCriterion("feed_spray <>", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayGreaterThan(String value) {
            addCriterion("feed_spray >", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayGreaterThanOrEqualTo(String value) {
            addCriterion("feed_spray >=", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayLessThan(String value) {
            addCriterion("feed_spray <", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayLessThanOrEqualTo(String value) {
            addCriterion("feed_spray <=", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayLike(String value) {
            addCriterion("feed_spray like", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayNotLike(String value) {
            addCriterion("feed_spray not like", value, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayIn(List<String> values) {
            addCriterion("feed_spray in", values, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayNotIn(List<String> values) {
            addCriterion("feed_spray not in", values, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayBetween(String value1, String value2) {
            addCriterion("feed_spray between", value1, value2, "feedSpray");
            return (Criteria) this;
        }

        public Criteria andFeedSprayNotBetween(String value1, String value2) {
            addCriterion("feed_spray not between", value1, value2, "feedSpray");
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

        public Criteria andPumpEqualTo(String value) {
            addCriterion("pump =", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotEqualTo(String value) {
            addCriterion("pump <>", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpGreaterThan(String value) {
            addCriterion("pump >", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpGreaterThanOrEqualTo(String value) {
            addCriterion("pump >=", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpLessThan(String value) {
            addCriterion("pump <", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpLessThanOrEqualTo(String value) {
            addCriterion("pump <=", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpLike(String value) {
            addCriterion("pump like", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotLike(String value) {
            addCriterion("pump not like", value, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpIn(List<String> values) {
            addCriterion("pump in", values, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotIn(List<String> values) {
            addCriterion("pump not in", values, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpBetween(String value1, String value2) {
            addCriterion("pump between", value1, value2, "pump");
            return (Criteria) this;
        }

        public Criteria andPumpNotBetween(String value1, String value2) {
            addCriterion("pump not between", value1, value2, "pump");
            return (Criteria) this;
        }

        public Criteria andFanOneIsNull() {
            addCriterion("fan_one is null");
            return (Criteria) this;
        }

        public Criteria andFanOneIsNotNull() {
            addCriterion("fan_one is not null");
            return (Criteria) this;
        }

        public Criteria andFanOneEqualTo(String value) {
            addCriterion("fan_one =", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneNotEqualTo(String value) {
            addCriterion("fan_one <>", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneGreaterThan(String value) {
            addCriterion("fan_one >", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneGreaterThanOrEqualTo(String value) {
            addCriterion("fan_one >=", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneLessThan(String value) {
            addCriterion("fan_one <", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneLessThanOrEqualTo(String value) {
            addCriterion("fan_one <=", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneLike(String value) {
            addCriterion("fan_one like", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneNotLike(String value) {
            addCriterion("fan_one not like", value, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneIn(List<String> values) {
            addCriterion("fan_one in", values, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneNotIn(List<String> values) {
            addCriterion("fan_one not in", values, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneBetween(String value1, String value2) {
            addCriterion("fan_one between", value1, value2, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanOneNotBetween(String value1, String value2) {
            addCriterion("fan_one not between", value1, value2, "fanOne");
            return (Criteria) this;
        }

        public Criteria andFanTwoIsNull() {
            addCriterion("fan_two is null");
            return (Criteria) this;
        }

        public Criteria andFanTwoIsNotNull() {
            addCriterion("fan_two is not null");
            return (Criteria) this;
        }

        public Criteria andFanTwoEqualTo(String value) {
            addCriterion("fan_two =", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoNotEqualTo(String value) {
            addCriterion("fan_two <>", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoGreaterThan(String value) {
            addCriterion("fan_two >", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoGreaterThanOrEqualTo(String value) {
            addCriterion("fan_two >=", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoLessThan(String value) {
            addCriterion("fan_two <", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoLessThanOrEqualTo(String value) {
            addCriterion("fan_two <=", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoLike(String value) {
            addCriterion("fan_two like", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoNotLike(String value) {
            addCriterion("fan_two not like", value, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoIn(List<String> values) {
            addCriterion("fan_two in", values, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoNotIn(List<String> values) {
            addCriterion("fan_two not in", values, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoBetween(String value1, String value2) {
            addCriterion("fan_two between", value1, value2, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanTwoNotBetween(String value1, String value2) {
            addCriterion("fan_two not between", value1, value2, "fanTwo");
            return (Criteria) this;
        }

        public Criteria andFanThreeIsNull() {
            addCriterion("fan_three is null");
            return (Criteria) this;
        }

        public Criteria andFanThreeIsNotNull() {
            addCriterion("fan_three is not null");
            return (Criteria) this;
        }

        public Criteria andFanThreeEqualTo(String value) {
            addCriterion("fan_three =", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeNotEqualTo(String value) {
            addCriterion("fan_three <>", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeGreaterThan(String value) {
            addCriterion("fan_three >", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeGreaterThanOrEqualTo(String value) {
            addCriterion("fan_three >=", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeLessThan(String value) {
            addCriterion("fan_three <", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeLessThanOrEqualTo(String value) {
            addCriterion("fan_three <=", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeLike(String value) {
            addCriterion("fan_three like", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeNotLike(String value) {
            addCriterion("fan_three not like", value, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeIn(List<String> values) {
            addCriterion("fan_three in", values, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeNotIn(List<String> values) {
            addCriterion("fan_three not in", values, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeBetween(String value1, String value2) {
            addCriterion("fan_three between", value1, value2, "fanThree");
            return (Criteria) this;
        }

        public Criteria andFanThreeNotBetween(String value1, String value2) {
            addCriterion("fan_three not between", value1, value2, "fanThree");
            return (Criteria) this;
        }

        public Criteria andBWaterIsNull() {
            addCriterion("b_water is null");
            return (Criteria) this;
        }

        public Criteria andBWaterIsNotNull() {
            addCriterion("b_water is not null");
            return (Criteria) this;
        }

        public Criteria andBWaterEqualTo(String value) {
            addCriterion("b_water =", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterNotEqualTo(String value) {
            addCriterion("b_water <>", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterGreaterThan(String value) {
            addCriterion("b_water >", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterGreaterThanOrEqualTo(String value) {
            addCriterion("b_water >=", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterLessThan(String value) {
            addCriterion("b_water <", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterLessThanOrEqualTo(String value) {
            addCriterion("b_water <=", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterLike(String value) {
            addCriterion("b_water like", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterNotLike(String value) {
            addCriterion("b_water not like", value, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterIn(List<String> values) {
            addCriterion("b_water in", values, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterNotIn(List<String> values) {
            addCriterion("b_water not in", values, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterBetween(String value1, String value2) {
            addCriterion("b_water between", value1, value2, "bWater");
            return (Criteria) this;
        }

        public Criteria andBWaterNotBetween(String value1, String value2) {
            addCriterion("b_water not between", value1, value2, "bWater");
            return (Criteria) this;
        }

        public Criteria andPWaterIsNull() {
            addCriterion("p_water is null");
            return (Criteria) this;
        }

        public Criteria andPWaterIsNotNull() {
            addCriterion("p_water is not null");
            return (Criteria) this;
        }

        public Criteria andPWaterEqualTo(String value) {
            addCriterion("p_water =", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterNotEqualTo(String value) {
            addCriterion("p_water <>", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterGreaterThan(String value) {
            addCriterion("p_water >", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterGreaterThanOrEqualTo(String value) {
            addCriterion("p_water >=", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterLessThan(String value) {
            addCriterion("p_water <", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterLessThanOrEqualTo(String value) {
            addCriterion("p_water <=", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterLike(String value) {
            addCriterion("p_water like", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterNotLike(String value) {
            addCriterion("p_water not like", value, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterIn(List<String> values) {
            addCriterion("p_water in", values, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterNotIn(List<String> values) {
            addCriterion("p_water not in", values, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterBetween(String value1, String value2) {
            addCriterion("p_water between", value1, value2, "pWater");
            return (Criteria) this;
        }

        public Criteria andPWaterNotBetween(String value1, String value2) {
            addCriterion("p_water not between", value1, value2, "pWater");
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
package com.vastsum.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommunicationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommunicationLogExample() {
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

        public Criteria andClientConnectionIdIsNull() {
            addCriterion("client_connection_id is null");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdIsNotNull() {
            addCriterion("client_connection_id is not null");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdEqualTo(Long value) {
            addCriterion("client_connection_id =", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdNotEqualTo(Long value) {
            addCriterion("client_connection_id <>", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdGreaterThan(Long value) {
            addCriterion("client_connection_id >", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("client_connection_id >=", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdLessThan(Long value) {
            addCriterion("client_connection_id <", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdLessThanOrEqualTo(Long value) {
            addCriterion("client_connection_id <=", value, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdIn(List<Long> values) {
            addCriterion("client_connection_id in", values, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdNotIn(List<Long> values) {
            addCriterion("client_connection_id not in", values, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdBetween(Long value1, Long value2) {
            addCriterion("client_connection_id between", value1, value2, "clientConnectionId");
            return (Criteria) this;
        }

        public Criteria andClientConnectionIdNotBetween(Long value1, Long value2) {
            addCriterion("client_connection_id not between", value1, value2, "clientConnectionId");
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

        public Criteria andClientIpAddressIsNull() {
            addCriterion("client_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressIsNotNull() {
            addCriterion("client_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressEqualTo(String value) {
            addCriterion("client_ip_address =", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressNotEqualTo(String value) {
            addCriterion("client_ip_address <>", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressGreaterThan(String value) {
            addCriterion("client_ip_address >", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("client_ip_address >=", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressLessThan(String value) {
            addCriterion("client_ip_address <", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressLessThanOrEqualTo(String value) {
            addCriterion("client_ip_address <=", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressLike(String value) {
            addCriterion("client_ip_address like", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressNotLike(String value) {
            addCriterion("client_ip_address not like", value, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressIn(List<String> values) {
            addCriterion("client_ip_address in", values, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressNotIn(List<String> values) {
            addCriterion("client_ip_address not in", values, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressBetween(String value1, String value2) {
            addCriterion("client_ip_address between", value1, value2, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientIpAddressNotBetween(String value1, String value2) {
            addCriterion("client_ip_address not between", value1, value2, "clientIpAddress");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNull() {
            addCriterion("client_port is null");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNotNull() {
            addCriterion("client_port is not null");
            return (Criteria) this;
        }

        public Criteria andClientPortEqualTo(Integer value) {
            addCriterion("client_port =", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotEqualTo(Integer value) {
            addCriterion("client_port <>", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThan(Integer value) {
            addCriterion("client_port >", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("client_port >=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThan(Integer value) {
            addCriterion("client_port <", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThanOrEqualTo(Integer value) {
            addCriterion("client_port <=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortIn(List<Integer> values) {
            addCriterion("client_port in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotIn(List<Integer> values) {
            addCriterion("client_port not in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortBetween(Integer value1, Integer value2) {
            addCriterion("client_port between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotBetween(Integer value1, Integer value2) {
            addCriterion("client_port not between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressIsNull() {
            addCriterion("server_ip_address is null");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressIsNotNull() {
            addCriterion("server_ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressEqualTo(String value) {
            addCriterion("server_ip_address =", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressNotEqualTo(String value) {
            addCriterion("server_ip_address <>", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressGreaterThan(String value) {
            addCriterion("server_ip_address >", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("server_ip_address >=", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressLessThan(String value) {
            addCriterion("server_ip_address <", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressLessThanOrEqualTo(String value) {
            addCriterion("server_ip_address <=", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressLike(String value) {
            addCriterion("server_ip_address like", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressNotLike(String value) {
            addCriterion("server_ip_address not like", value, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressIn(List<String> values) {
            addCriterion("server_ip_address in", values, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressNotIn(List<String> values) {
            addCriterion("server_ip_address not in", values, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressBetween(String value1, String value2) {
            addCriterion("server_ip_address between", value1, value2, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerIpAddressNotBetween(String value1, String value2) {
            addCriterion("server_ip_address not between", value1, value2, "serverIpAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressIsNull() {
            addCriterion("server_net_address is null");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressIsNotNull() {
            addCriterion("server_net_address is not null");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressEqualTo(String value) {
            addCriterion("server_net_address =", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressNotEqualTo(String value) {
            addCriterion("server_net_address <>", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressGreaterThan(String value) {
            addCriterion("server_net_address >", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("server_net_address >=", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressLessThan(String value) {
            addCriterion("server_net_address <", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressLessThanOrEqualTo(String value) {
            addCriterion("server_net_address <=", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressLike(String value) {
            addCriterion("server_net_address like", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressNotLike(String value) {
            addCriterion("server_net_address not like", value, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressIn(List<String> values) {
            addCriterion("server_net_address in", values, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressNotIn(List<String> values) {
            addCriterion("server_net_address not in", values, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressBetween(String value1, String value2) {
            addCriterion("server_net_address between", value1, value2, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerNetAddressNotBetween(String value1, String value2) {
            addCriterion("server_net_address not between", value1, value2, "serverNetAddress");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("server_port is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("server_port is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(Integer value) {
            addCriterion("server_port =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(Integer value) {
            addCriterion("server_port <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(Integer value) {
            addCriterion("server_port >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("server_port >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(Integer value) {
            addCriterion("server_port <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(Integer value) {
            addCriterion("server_port <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<Integer> values) {
            addCriterion("server_port in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<Integer> values) {
            addCriterion("server_port not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(Integer value1, Integer value2) {
            addCriterion("server_port between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(Integer value1, Integer value2) {
            addCriterion("server_port not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andOptionTypeIsNull() {
            addCriterion("option_type is null");
            return (Criteria) this;
        }

        public Criteria andOptionTypeIsNotNull() {
            addCriterion("option_type is not null");
            return (Criteria) this;
        }

        public Criteria andOptionTypeEqualTo(Integer value) {
            addCriterion("option_type =", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeNotEqualTo(Integer value) {
            addCriterion("option_type <>", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeGreaterThan(Integer value) {
            addCriterion("option_type >", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("option_type >=", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeLessThan(Integer value) {
            addCriterion("option_type <", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("option_type <=", value, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeIn(List<Integer> values) {
            addCriterion("option_type in", values, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeNotIn(List<Integer> values) {
            addCriterion("option_type not in", values, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeBetween(Integer value1, Integer value2) {
            addCriterion("option_type between", value1, value2, "optionType");
            return (Criteria) this;
        }

        public Criteria andOptionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("option_type not between", value1, value2, "optionType");
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
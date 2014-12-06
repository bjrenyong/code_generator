package ihandy.generator.mybatis.model;

import com.zyt.mybatis.plugin.Page;
import java.util.ArrayList;
import java.util.List;

public class TlServerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TlServerInfoExample() {
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

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
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

        public Criteria andServerIdIsNull() {
            addCriterion("SERVER_ID is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("SERVER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Integer value) {
            addCriterion("SERVER_ID =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Integer value) {
            addCriterion("SERVER_ID <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Integer value) {
            addCriterion("SERVER_ID >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVER_ID >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Integer value) {
            addCriterion("SERVER_ID <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Integer value) {
            addCriterion("SERVER_ID <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Integer> values) {
            addCriterion("SERVER_ID in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Integer> values) {
            addCriterion("SERVER_ID not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_ID between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVER_ID not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("PROJECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("PROJECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("PROJECT_ID =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("PROJECT_ID <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("PROJECT_ID >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("PROJECT_ID <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_ID <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("PROJECT_ID in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("PROJECT_ID not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_ID not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andServerAddrIsNull() {
            addCriterion("SERVER_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andServerAddrIsNotNull() {
            addCriterion("SERVER_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andServerAddrEqualTo(String value) {
            addCriterion("SERVER_ADDR =", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotEqualTo(String value) {
            addCriterion("SERVER_ADDR <>", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrGreaterThan(String value) {
            addCriterion("SERVER_ADDR >", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_ADDR >=", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLessThan(String value) {
            addCriterion("SERVER_ADDR <", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLessThanOrEqualTo(String value) {
            addCriterion("SERVER_ADDR <=", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrLike(String value) {
            addCriterion("SERVER_ADDR like", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotLike(String value) {
            addCriterion("SERVER_ADDR not like", value, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrIn(List<String> values) {
            addCriterion("SERVER_ADDR in", values, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotIn(List<String> values) {
            addCriterion("SERVER_ADDR not in", values, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrBetween(String value1, String value2) {
            addCriterion("SERVER_ADDR between", value1, value2, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerAddrNotBetween(String value1, String value2) {
            addCriterion("SERVER_ADDR not between", value1, value2, "serverAddr");
            return (Criteria) this;
        }

        public Criteria andServerDescIsNull() {
            addCriterion("SERVER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andServerDescIsNotNull() {
            addCriterion("SERVER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andServerDescEqualTo(String value) {
            addCriterion("SERVER_DESC =", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotEqualTo(String value) {
            addCriterion("SERVER_DESC <>", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescGreaterThan(String value) {
            addCriterion("SERVER_DESC >", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_DESC >=", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLessThan(String value) {
            addCriterion("SERVER_DESC <", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLessThanOrEqualTo(String value) {
            addCriterion("SERVER_DESC <=", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescLike(String value) {
            addCriterion("SERVER_DESC like", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotLike(String value) {
            addCriterion("SERVER_DESC not like", value, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescIn(List<String> values) {
            addCriterion("SERVER_DESC in", values, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotIn(List<String> values) {
            addCriterion("SERVER_DESC not in", values, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescBetween(String value1, String value2) {
            addCriterion("SERVER_DESC between", value1, value2, "serverDesc");
            return (Criteria) this;
        }

        public Criteria andServerDescNotBetween(String value1, String value2) {
            addCriterion("SERVER_DESC not between", value1, value2, "serverDesc");
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
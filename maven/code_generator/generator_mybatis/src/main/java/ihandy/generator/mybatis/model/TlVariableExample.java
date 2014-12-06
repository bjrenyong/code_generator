package ihandy.generator.mybatis.model;

import com.zyt.mybatis.plugin.Page;
import java.util.ArrayList;
import java.util.List;

public class TlVariableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TlVariableExample() {
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

        public Criteria andVariableIdIsNull() {
            addCriterion("VARIABLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andVariableIdIsNotNull() {
            addCriterion("VARIABLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVariableIdEqualTo(Integer value) {
            addCriterion("VARIABLE_ID =", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotEqualTo(Integer value) {
            addCriterion("VARIABLE_ID <>", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThan(Integer value) {
            addCriterion("VARIABLE_ID >", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_ID >=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThan(Integer value) {
            addCriterion("VARIABLE_ID <", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdLessThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_ID <=", value, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdIn(List<Integer> values) {
            addCriterion("VARIABLE_ID in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotIn(List<Integer> values) {
            addCriterion("VARIABLE_ID not in", values, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_ID between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_ID not between", value1, value2, "variableId");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNull() {
            addCriterion("VARIABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVariableNameIsNotNull() {
            addCriterion("VARIABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVariableNameEqualTo(String value) {
            addCriterion("VARIABLE_NAME =", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotEqualTo(String value) {
            addCriterion("VARIABLE_NAME <>", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThan(String value) {
            addCriterion("VARIABLE_NAME >", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME >=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThan(String value) {
            addCriterion("VARIABLE_NAME <", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_NAME <=", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameLike(String value) {
            addCriterion("VARIABLE_NAME like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotLike(String value) {
            addCriterion("VARIABLE_NAME not like", value, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameIn(List<String> values) {
            addCriterion("VARIABLE_NAME in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotIn(List<String> values) {
            addCriterion("VARIABLE_NAME not in", values, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableNameNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_NAME not between", value1, value2, "variableName");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameIsNull() {
            addCriterion("VARIABLE_CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameIsNotNull() {
            addCriterion("VARIABLE_CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameEqualTo(String value) {
            addCriterion("VARIABLE_CLASSNAME =", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameNotEqualTo(String value) {
            addCriterion("VARIABLE_CLASSNAME <>", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameGreaterThan(String value) {
            addCriterion("VARIABLE_CLASSNAME >", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_CLASSNAME >=", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameLessThan(String value) {
            addCriterion("VARIABLE_CLASSNAME <", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_CLASSNAME <=", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameLike(String value) {
            addCriterion("VARIABLE_CLASSNAME like", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameNotLike(String value) {
            addCriterion("VARIABLE_CLASSNAME not like", value, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameIn(List<String> values) {
            addCriterion("VARIABLE_CLASSNAME in", values, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameNotIn(List<String> values) {
            addCriterion("VARIABLE_CLASSNAME not in", values, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameBetween(String value1, String value2) {
            addCriterion("VARIABLE_CLASSNAME between", value1, value2, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassnameNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_CLASSNAME not between", value1, value2, "variableClassname");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationIsNull() {
            addCriterion("VARIABLE_CLASSRELATION is null");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationIsNotNull() {
            addCriterion("VARIABLE_CLASSRELATION is not null");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationEqualTo(String value) {
            addCriterion("VARIABLE_CLASSRELATION =", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationNotEqualTo(String value) {
            addCriterion("VARIABLE_CLASSRELATION <>", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationGreaterThan(String value) {
            addCriterion("VARIABLE_CLASSRELATION >", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_CLASSRELATION >=", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationLessThan(String value) {
            addCriterion("VARIABLE_CLASSRELATION <", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_CLASSRELATION <=", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationLike(String value) {
            addCriterion("VARIABLE_CLASSRELATION like", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationNotLike(String value) {
            addCriterion("VARIABLE_CLASSRELATION not like", value, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationIn(List<String> values) {
            addCriterion("VARIABLE_CLASSRELATION in", values, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationNotIn(List<String> values) {
            addCriterion("VARIABLE_CLASSRELATION not in", values, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationBetween(String value1, String value2) {
            addCriterion("VARIABLE_CLASSRELATION between", value1, value2, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableClassrelationNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_CLASSRELATION not between", value1, value2, "variableClassrelation");
            return (Criteria) this;
        }

        public Criteria andVariableDescIsNull() {
            addCriterion("VARIABLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVariableDescIsNotNull() {
            addCriterion("VARIABLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVariableDescEqualTo(String value) {
            addCriterion("VARIABLE_DESC =", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescNotEqualTo(String value) {
            addCriterion("VARIABLE_DESC <>", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescGreaterThan(String value) {
            addCriterion("VARIABLE_DESC >", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_DESC >=", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescLessThan(String value) {
            addCriterion("VARIABLE_DESC <", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_DESC <=", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescLike(String value) {
            addCriterion("VARIABLE_DESC like", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescNotLike(String value) {
            addCriterion("VARIABLE_DESC not like", value, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescIn(List<String> values) {
            addCriterion("VARIABLE_DESC in", values, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescNotIn(List<String> values) {
            addCriterion("VARIABLE_DESC not in", values, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescBetween(String value1, String value2) {
            addCriterion("VARIABLE_DESC between", value1, value2, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableDescNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_DESC not between", value1, value2, "variableDesc");
            return (Criteria) this;
        }

        public Criteria andVariableMustIsNull() {
            addCriterion("VARIABLE_MUST is null");
            return (Criteria) this;
        }

        public Criteria andVariableMustIsNotNull() {
            addCriterion("VARIABLE_MUST is not null");
            return (Criteria) this;
        }

        public Criteria andVariableMustEqualTo(Integer value) {
            addCriterion("VARIABLE_MUST =", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustNotEqualTo(Integer value) {
            addCriterion("VARIABLE_MUST <>", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustGreaterThan(Integer value) {
            addCriterion("VARIABLE_MUST >", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustGreaterThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_MUST >=", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustLessThan(Integer value) {
            addCriterion("VARIABLE_MUST <", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustLessThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_MUST <=", value, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustIn(List<Integer> values) {
            addCriterion("VARIABLE_MUST in", values, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustNotIn(List<Integer> values) {
            addCriterion("VARIABLE_MUST not in", values, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_MUST between", value1, value2, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableMustNotBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_MUST not between", value1, value2, "variableMust");
            return (Criteria) this;
        }

        public Criteria andVariableStatusIsNull() {
            addCriterion("VARIABLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVariableStatusIsNotNull() {
            addCriterion("VARIABLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVariableStatusEqualTo(Integer value) {
            addCriterion("VARIABLE_STATUS =", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusNotEqualTo(Integer value) {
            addCriterion("VARIABLE_STATUS <>", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusGreaterThan(Integer value) {
            addCriterion("VARIABLE_STATUS >", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_STATUS >=", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusLessThan(Integer value) {
            addCriterion("VARIABLE_STATUS <", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusLessThanOrEqualTo(Integer value) {
            addCriterion("VARIABLE_STATUS <=", value, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusIn(List<Integer> values) {
            addCriterion("VARIABLE_STATUS in", values, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusNotIn(List<Integer> values) {
            addCriterion("VARIABLE_STATUS not in", values, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_STATUS between", value1, value2, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("VARIABLE_STATUS not between", value1, value2, "variableStatus");
            return (Criteria) this;
        }

        public Criteria andVariableMemoIsNull() {
            addCriterion("VARIABLE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andVariableMemoIsNotNull() {
            addCriterion("VARIABLE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andVariableMemoEqualTo(String value) {
            addCriterion("VARIABLE_MEMO =", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoNotEqualTo(String value) {
            addCriterion("VARIABLE_MEMO <>", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoGreaterThan(String value) {
            addCriterion("VARIABLE_MEMO >", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoGreaterThanOrEqualTo(String value) {
            addCriterion("VARIABLE_MEMO >=", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoLessThan(String value) {
            addCriterion("VARIABLE_MEMO <", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoLessThanOrEqualTo(String value) {
            addCriterion("VARIABLE_MEMO <=", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoLike(String value) {
            addCriterion("VARIABLE_MEMO like", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoNotLike(String value) {
            addCriterion("VARIABLE_MEMO not like", value, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoIn(List<String> values) {
            addCriterion("VARIABLE_MEMO in", values, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoNotIn(List<String> values) {
            addCriterion("VARIABLE_MEMO not in", values, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoBetween(String value1, String value2) {
            addCriterion("VARIABLE_MEMO between", value1, value2, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andVariableMemoNotBetween(String value1, String value2) {
            addCriterion("VARIABLE_MEMO not between", value1, value2, "variableMemo");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdIsNull() {
            addCriterion("RELATION_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdIsNotNull() {
            addCriterion("RELATION_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdEqualTo(Integer value) {
            addCriterion("RELATION_CLASS_ID =", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdNotEqualTo(Integer value) {
            addCriterion("RELATION_CLASS_ID <>", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdGreaterThan(Integer value) {
            addCriterion("RELATION_CLASS_ID >", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RELATION_CLASS_ID >=", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdLessThan(Integer value) {
            addCriterion("RELATION_CLASS_ID <", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("RELATION_CLASS_ID <=", value, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdIn(List<Integer> values) {
            addCriterion("RELATION_CLASS_ID in", values, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdNotIn(List<Integer> values) {
            addCriterion("RELATION_CLASS_ID not in", values, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdBetween(Integer value1, Integer value2) {
            addCriterion("RELATION_CLASS_ID between", value1, value2, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andRelationClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RELATION_CLASS_ID not between", value1, value2, "relationClassId");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNull() {
            addCriterion("ORDER_BY is null");
            return (Criteria) this;
        }

        public Criteria andOrderByIsNotNull() {
            addCriterion("ORDER_BY is not null");
            return (Criteria) this;
        }

        public Criteria andOrderByEqualTo(Integer value) {
            addCriterion("ORDER_BY =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(Integer value) {
            addCriterion("ORDER_BY <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(Integer value) {
            addCriterion("ORDER_BY >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(Integer value) {
            addCriterion("ORDER_BY <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_BY <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<Integer> values) {
            addCriterion("ORDER_BY in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<Integer> values) {
            addCriterion("ORDER_BY not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_BY not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("TEST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("TEST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(Integer value) {
            addCriterion("TEST_TYPE =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(Integer value) {
            addCriterion("TEST_TYPE <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(Integer value) {
            addCriterion("TEST_TYPE >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEST_TYPE >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(Integer value) {
            addCriterion("TEST_TYPE <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(Integer value) {
            addCriterion("TEST_TYPE <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<Integer> values) {
            addCriterion("TEST_TYPE in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<Integer> values) {
            addCriterion("TEST_TYPE not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(Integer value1, Integer value2) {
            addCriterion("TEST_TYPE between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("TEST_TYPE not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestDatasetIsNull() {
            addCriterion("TEST_DATASET is null");
            return (Criteria) this;
        }

        public Criteria andTestDatasetIsNotNull() {
            addCriterion("TEST_DATASET is not null");
            return (Criteria) this;
        }

        public Criteria andTestDatasetEqualTo(String value) {
            addCriterion("TEST_DATASET =", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetNotEqualTo(String value) {
            addCriterion("TEST_DATASET <>", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetGreaterThan(String value) {
            addCriterion("TEST_DATASET >", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DATASET >=", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetLessThan(String value) {
            addCriterion("TEST_DATASET <", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetLessThanOrEqualTo(String value) {
            addCriterion("TEST_DATASET <=", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetLike(String value) {
            addCriterion("TEST_DATASET like", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetNotLike(String value) {
            addCriterion("TEST_DATASET not like", value, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetIn(List<String> values) {
            addCriterion("TEST_DATASET in", values, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetNotIn(List<String> values) {
            addCriterion("TEST_DATASET not in", values, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetBetween(String value1, String value2) {
            addCriterion("TEST_DATASET between", value1, value2, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDatasetNotBetween(String value1, String value2) {
            addCriterion("TEST_DATASET not between", value1, value2, "testDataset");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNull() {
            addCriterion("TEST_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTestDescIsNotNull() {
            addCriterion("TEST_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTestDescEqualTo(String value) {
            addCriterion("TEST_DESC =", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotEqualTo(String value) {
            addCriterion("TEST_DESC <>", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThan(String value) {
            addCriterion("TEST_DESC >", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DESC >=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThan(String value) {
            addCriterion("TEST_DESC <", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLessThanOrEqualTo(String value) {
            addCriterion("TEST_DESC <=", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescLike(String value) {
            addCriterion("TEST_DESC like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotLike(String value) {
            addCriterion("TEST_DESC not like", value, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescIn(List<String> values) {
            addCriterion("TEST_DESC in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotIn(List<String> values) {
            addCriterion("TEST_DESC not in", values, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescBetween(String value1, String value2) {
            addCriterion("TEST_DESC between", value1, value2, "testDesc");
            return (Criteria) this;
        }

        public Criteria andTestDescNotBetween(String value1, String value2) {
            addCriterion("TEST_DESC not between", value1, value2, "testDesc");
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
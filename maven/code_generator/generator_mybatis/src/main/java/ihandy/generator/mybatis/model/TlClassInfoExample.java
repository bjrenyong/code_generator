package ihandy.generator.mybatis.model;

import com.zyt.mybatis.plugin.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TlClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public TlClassInfoExample() {
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

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
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

        public Criteria andPackageNameIsNull() {
            addCriterion("PACKAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("PACKAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("PACKAGE_NAME =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("PACKAGE_NAME <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("PACKAGE_NAME >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("PACKAGE_NAME <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("PACKAGE_NAME like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("PACKAGE_NAME not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("PACKAGE_NAME in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("PACKAGE_NAME not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("CLASS_NAME =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("CLASS_NAME <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("CLASS_NAME >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("CLASS_NAME <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("CLASS_NAME <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("CLASS_NAME like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("CLASS_NAME not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("CLASS_NAME in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("CLASS_NAME not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("CLASS_NAME between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("CLASS_NAME not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassCnIsNull() {
            addCriterion("CLASS_CN is null");
            return (Criteria) this;
        }

        public Criteria andClassCnIsNotNull() {
            addCriterion("CLASS_CN is not null");
            return (Criteria) this;
        }

        public Criteria andClassCnEqualTo(String value) {
            addCriterion("CLASS_CN =", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnNotEqualTo(String value) {
            addCriterion("CLASS_CN <>", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnGreaterThan(String value) {
            addCriterion("CLASS_CN >", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_CN >=", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnLessThan(String value) {
            addCriterion("CLASS_CN <", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnLessThanOrEqualTo(String value) {
            addCriterion("CLASS_CN <=", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnLike(String value) {
            addCriterion("CLASS_CN like", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnNotLike(String value) {
            addCriterion("CLASS_CN not like", value, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnIn(List<String> values) {
            addCriterion("CLASS_CN in", values, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnNotIn(List<String> values) {
            addCriterion("CLASS_CN not in", values, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnBetween(String value1, String value2) {
            addCriterion("CLASS_CN between", value1, value2, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassCnNotBetween(String value1, String value2) {
            addCriterion("CLASS_CN not between", value1, value2, "classCn");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("CLASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("CLASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(Integer value) {
            addCriterion("CLASS_TYPE =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(Integer value) {
            addCriterion("CLASS_TYPE <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(Integer value) {
            addCriterion("CLASS_TYPE >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_TYPE >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(Integer value) {
            addCriterion("CLASS_TYPE <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_TYPE <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<Integer> values) {
            addCriterion("CLASS_TYPE in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<Integer> values) {
            addCriterion("CLASS_TYPE not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_TYPE between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_TYPE not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andClassBelongIsNull() {
            addCriterion("CLASS_BELONG is null");
            return (Criteria) this;
        }

        public Criteria andClassBelongIsNotNull() {
            addCriterion("CLASS_BELONG is not null");
            return (Criteria) this;
        }

        public Criteria andClassBelongEqualTo(Integer value) {
            addCriterion("CLASS_BELONG =", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongNotEqualTo(Integer value) {
            addCriterion("CLASS_BELONG <>", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongGreaterThan(Integer value) {
            addCriterion("CLASS_BELONG >", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_BELONG >=", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongLessThan(Integer value) {
            addCriterion("CLASS_BELONG <", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_BELONG <=", value, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongIn(List<Integer> values) {
            addCriterion("CLASS_BELONG in", values, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongNotIn(List<Integer> values) {
            addCriterion("CLASS_BELONG not in", values, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_BELONG between", value1, value2, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassBelongNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_BELONG not between", value1, value2, "classBelong");
            return (Criteria) this;
        }

        public Criteria andClassMemoIsNull() {
            addCriterion("CLASS_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andClassMemoIsNotNull() {
            addCriterion("CLASS_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andClassMemoEqualTo(String value) {
            addCriterion("CLASS_MEMO =", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoNotEqualTo(String value) {
            addCriterion("CLASS_MEMO <>", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoGreaterThan(String value) {
            addCriterion("CLASS_MEMO >", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_MEMO >=", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoLessThan(String value) {
            addCriterion("CLASS_MEMO <", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoLessThanOrEqualTo(String value) {
            addCriterion("CLASS_MEMO <=", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoLike(String value) {
            addCriterion("CLASS_MEMO like", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoNotLike(String value) {
            addCriterion("CLASS_MEMO not like", value, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoIn(List<String> values) {
            addCriterion("CLASS_MEMO in", values, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoNotIn(List<String> values) {
            addCriterion("CLASS_MEMO not in", values, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoBetween(String value1, String value2) {
            addCriterion("CLASS_MEMO between", value1, value2, "classMemo");
            return (Criteria) this;
        }

        public Criteria andClassMemoNotBetween(String value1, String value2) {
            addCriterion("CLASS_MEMO not between", value1, value2, "classMemo");
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

        public Criteria andOrderByEqualTo(Float value) {
            addCriterion("ORDER_BY =", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotEqualTo(Float value) {
            addCriterion("ORDER_BY <>", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThan(Float value) {
            addCriterion("ORDER_BY >", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByGreaterThanOrEqualTo(Float value) {
            addCriterion("ORDER_BY >=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThan(Float value) {
            addCriterion("ORDER_BY <", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByLessThanOrEqualTo(Float value) {
            addCriterion("ORDER_BY <=", value, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByIn(List<Float> values) {
            addCriterion("ORDER_BY in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotIn(List<Float> values) {
            addCriterion("ORDER_BY not in", values, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByBetween(Float value1, Float value2) {
            addCriterion("ORDER_BY between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andOrderByNotBetween(Float value1, Float value2) {
            addCriterion("ORDER_BY not between", value1, value2, "orderBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andTestUrlIsNull() {
            addCriterion("TEST_URL is null");
            return (Criteria) this;
        }

        public Criteria andTestUrlIsNotNull() {
            addCriterion("TEST_URL is not null");
            return (Criteria) this;
        }

        public Criteria andTestUrlEqualTo(String value) {
            addCriterion("TEST_URL =", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotEqualTo(String value) {
            addCriterion("TEST_URL <>", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThan(String value) {
            addCriterion("TEST_URL >", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_URL >=", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThan(String value) {
            addCriterion("TEST_URL <", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlLessThanOrEqualTo(String value) {
            addCriterion("TEST_URL <=", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlLike(String value) {
            addCriterion("TEST_URL like", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotLike(String value) {
            addCriterion("TEST_URL not like", value, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlIn(List<String> values) {
            addCriterion("TEST_URL in", values, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotIn(List<String> values) {
            addCriterion("TEST_URL not in", values, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlBetween(String value1, String value2) {
            addCriterion("TEST_URL between", value1, value2, "testUrl");
            return (Criteria) this;
        }

        public Criteria andTestUrlNotBetween(String value1, String value2) {
            addCriterion("TEST_URL not between", value1, value2, "testUrl");
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

        public Criteria andTestDemoIsNull() {
            addCriterion("TEST_DEMO is null");
            return (Criteria) this;
        }

        public Criteria andTestDemoIsNotNull() {
            addCriterion("TEST_DEMO is not null");
            return (Criteria) this;
        }

        public Criteria andTestDemoEqualTo(String value) {
            addCriterion("TEST_DEMO =", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoNotEqualTo(String value) {
            addCriterion("TEST_DEMO <>", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoGreaterThan(String value) {
            addCriterion("TEST_DEMO >", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DEMO >=", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoLessThan(String value) {
            addCriterion("TEST_DEMO <", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoLessThanOrEqualTo(String value) {
            addCriterion("TEST_DEMO <=", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoLike(String value) {
            addCriterion("TEST_DEMO like", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoNotLike(String value) {
            addCriterion("TEST_DEMO not like", value, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoIn(List<String> values) {
            addCriterion("TEST_DEMO in", values, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoNotIn(List<String> values) {
            addCriterion("TEST_DEMO not in", values, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoBetween(String value1, String value2) {
            addCriterion("TEST_DEMO between", value1, value2, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoNotBetween(String value1, String value2) {
            addCriterion("TEST_DEMO not between", value1, value2, "testDemo");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescIsNull() {
            addCriterion("TEST_DEMO_DESC is null");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescIsNotNull() {
            addCriterion("TEST_DEMO_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescEqualTo(String value) {
            addCriterion("TEST_DEMO_DESC =", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescNotEqualTo(String value) {
            addCriterion("TEST_DEMO_DESC <>", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescGreaterThan(String value) {
            addCriterion("TEST_DEMO_DESC >", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescGreaterThanOrEqualTo(String value) {
            addCriterion("TEST_DEMO_DESC >=", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescLessThan(String value) {
            addCriterion("TEST_DEMO_DESC <", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescLessThanOrEqualTo(String value) {
            addCriterion("TEST_DEMO_DESC <=", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescLike(String value) {
            addCriterion("TEST_DEMO_DESC like", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescNotLike(String value) {
            addCriterion("TEST_DEMO_DESC not like", value, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescIn(List<String> values) {
            addCriterion("TEST_DEMO_DESC in", values, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescNotIn(List<String> values) {
            addCriterion("TEST_DEMO_DESC not in", values, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescBetween(String value1, String value2) {
            addCriterion("TEST_DEMO_DESC between", value1, value2, "testDemoDesc");
            return (Criteria) this;
        }

        public Criteria andTestDemoDescNotBetween(String value1, String value2) {
            addCriterion("TEST_DEMO_DESC not between", value1, value2, "testDemoDesc");
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
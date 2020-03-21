package com.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigFileFirstKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigFileFirstKindExample() {
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

        public Criteria andFirstKindIdIsNull() {
            addCriterion("first_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIsNotNull() {
            addCriterion("first_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdEqualTo(Integer value) {
            addCriterion("first_kind_id =", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotEqualTo(Integer value) {
            addCriterion("first_kind_id <>", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThan(Integer value) {
            addCriterion("first_kind_id >", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_kind_id >=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThan(Integer value) {
            addCriterion("first_kind_id <", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_kind_id <=", value, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdIn(List<Integer> values) {
            addCriterion("first_kind_id in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotIn(List<Integer> values) {
            addCriterion("first_kind_id not in", values, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdBetween(Integer value1, Integer value2) {
            addCriterion("first_kind_id between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_kind_id not between", value1, value2, "firstKindId");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNull() {
            addCriterion("first_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIsNotNull() {
            addCriterion("first_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameEqualTo(String value) {
            addCriterion("first_kind_name =", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotEqualTo(String value) {
            addCriterion("first_kind_name <>", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThan(String value) {
            addCriterion("first_kind_name >", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_name >=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThan(String value) {
            addCriterion("first_kind_name <", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLessThanOrEqualTo(String value) {
            addCriterion("first_kind_name <=", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameLike(String value) {
            addCriterion("first_kind_name like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotLike(String value) {
            addCriterion("first_kind_name not like", value, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameIn(List<String> values) {
            addCriterion("first_kind_name in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotIn(List<String> values) {
            addCriterion("first_kind_name not in", values, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameBetween(String value1, String value2) {
            addCriterion("first_kind_name between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindNameNotBetween(String value1, String value2) {
            addCriterion("first_kind_name not between", value1, value2, "firstKindName");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdIsNull() {
            addCriterion("first_kind_salary_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdIsNotNull() {
            addCriterion("first_kind_salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdEqualTo(String value) {
            addCriterion("first_kind_salary_id =", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdNotEqualTo(String value) {
            addCriterion("first_kind_salary_id <>", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdGreaterThan(String value) {
            addCriterion("first_kind_salary_id >", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_salary_id >=", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdLessThan(String value) {
            addCriterion("first_kind_salary_id <", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_salary_id <=", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdLike(String value) {
            addCriterion("first_kind_salary_id like", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdNotLike(String value) {
            addCriterion("first_kind_salary_id not like", value, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdIn(List<String> values) {
            addCriterion("first_kind_salary_id in", values, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdNotIn(List<String> values) {
            addCriterion("first_kind_salary_id not in", values, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdBetween(String value1, String value2) {
            addCriterion("first_kind_salary_id between", value1, value2, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSalaryIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_salary_id not between", value1, value2, "firstKindSalaryId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdIsNull() {
            addCriterion("first_kind_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdIsNotNull() {
            addCriterion("first_kind_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdEqualTo(String value) {
            addCriterion("first_kind_sale_id =", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdNotEqualTo(String value) {
            addCriterion("first_kind_sale_id <>", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdGreaterThan(String value) {
            addCriterion("first_kind_sale_id >", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_kind_sale_id >=", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdLessThan(String value) {
            addCriterion("first_kind_sale_id <", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdLessThanOrEqualTo(String value) {
            addCriterion("first_kind_sale_id <=", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdLike(String value) {
            addCriterion("first_kind_sale_id like", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdNotLike(String value) {
            addCriterion("first_kind_sale_id not like", value, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdIn(List<String> values) {
            addCriterion("first_kind_sale_id in", values, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdNotIn(List<String> values) {
            addCriterion("first_kind_sale_id not in", values, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdBetween(String value1, String value2) {
            addCriterion("first_kind_sale_id between", value1, value2, "firstKindSaleId");
            return (Criteria) this;
        }

        public Criteria andFirstKindSaleIdNotBetween(String value1, String value2) {
            addCriterion("first_kind_sale_id not between", value1, value2, "firstKindSaleId");
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
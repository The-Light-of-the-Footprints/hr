package com.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigFileSecondKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigFileSecondKindExample() {
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

        public Criteria andSecondKindIdIsNull() {
            addCriterion("second_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIsNotNull() {
            addCriterion("second_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdEqualTo(Integer value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(Integer value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(Integer value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(Integer value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<Integer> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<Integer> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(Integer value1, Integer value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNull() {
            addCriterion("second_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIsNotNull() {
            addCriterion("second_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameEqualTo(String value) {
            addCriterion("second_kind_name =", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotEqualTo(String value) {
            addCriterion("second_kind_name <>", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThan(String value) {
            addCriterion("second_kind_name >", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_name >=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThan(String value) {
            addCriterion("second_kind_name <", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLessThanOrEqualTo(String value) {
            addCriterion("second_kind_name <=", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameLike(String value) {
            addCriterion("second_kind_name like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotLike(String value) {
            addCriterion("second_kind_name not like", value, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameIn(List<String> values) {
            addCriterion("second_kind_name in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotIn(List<String> values) {
            addCriterion("second_kind_name not in", values, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameBetween(String value1, String value2) {
            addCriterion("second_kind_name between", value1, value2, "secondKindName");
            return (Criteria) this;
        }

        public Criteria andSecondKindNameNotBetween(String value1, String value2) {
            addCriterion("second_kind_name not between", value1, value2, "secondKindName");
            return (Criteria) this;
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

        public Criteria andSecondSalaryIdIsNull() {
            addCriterion("second_salary_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdIsNotNull() {
            addCriterion("second_salary_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdEqualTo(String value) {
            addCriterion("second_salary_id =", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdNotEqualTo(String value) {
            addCriterion("second_salary_id <>", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdGreaterThan(String value) {
            addCriterion("second_salary_id >", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_salary_id >=", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdLessThan(String value) {
            addCriterion("second_salary_id <", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdLessThanOrEqualTo(String value) {
            addCriterion("second_salary_id <=", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdLike(String value) {
            addCriterion("second_salary_id like", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdNotLike(String value) {
            addCriterion("second_salary_id not like", value, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdIn(List<String> values) {
            addCriterion("second_salary_id in", values, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdNotIn(List<String> values) {
            addCriterion("second_salary_id not in", values, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdBetween(String value1, String value2) {
            addCriterion("second_salary_id between", value1, value2, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSalaryIdNotBetween(String value1, String value2) {
            addCriterion("second_salary_id not between", value1, value2, "secondSalaryId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdIsNull() {
            addCriterion("second_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdIsNotNull() {
            addCriterion("second_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdEqualTo(String value) {
            addCriterion("second_sale_id =", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdNotEqualTo(String value) {
            addCriterion("second_sale_id <>", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdGreaterThan(String value) {
            addCriterion("second_sale_id >", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_sale_id >=", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdLessThan(String value) {
            addCriterion("second_sale_id <", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdLessThanOrEqualTo(String value) {
            addCriterion("second_sale_id <=", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdLike(String value) {
            addCriterion("second_sale_id like", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdNotLike(String value) {
            addCriterion("second_sale_id not like", value, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdIn(List<String> values) {
            addCriterion("second_sale_id in", values, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdNotIn(List<String> values) {
            addCriterion("second_sale_id not in", values, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdBetween(String value1, String value2) {
            addCriterion("second_sale_id between", value1, value2, "secondSaleId");
            return (Criteria) this;
        }

        public Criteria andSecondSaleIdNotBetween(String value1, String value2) {
            addCriterion("second_sale_id not between", value1, value2, "secondSaleId");
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
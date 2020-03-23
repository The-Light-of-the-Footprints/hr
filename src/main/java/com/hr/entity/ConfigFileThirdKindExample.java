package com.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class ConfigFileThirdKindExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigFileThirdKindExample() {
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

        public Criteria andThirdKindIdIsNull() {
            addCriterion("third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(Integer value) {
            addCriterion("third_kind_id =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(Integer value) {
            addCriterion("third_kind_id <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(Integer value) {
            addCriterion("third_kind_id >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_kind_id >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(Integer value) {
            addCriterion("third_kind_id <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_kind_id <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<Integer> values) {
            addCriterion("third_kind_id in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<Integer> values) {
            addCriterion("third_kind_id not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(Integer value1, Integer value2) {
            addCriterion("third_kind_id between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_kind_id not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNull() {
            addCriterion("third_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIsNotNull() {
            addCriterion("third_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameEqualTo(String value) {
            addCriterion("third_kind_name =", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotEqualTo(String value) {
            addCriterion("third_kind_name <>", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThan(String value) {
            addCriterion("third_kind_name >", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_name >=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThan(String value) {
            addCriterion("third_kind_name <", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLessThanOrEqualTo(String value) {
            addCriterion("third_kind_name <=", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameLike(String value) {
            addCriterion("third_kind_name like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotLike(String value) {
            addCriterion("third_kind_name not like", value, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameIn(List<String> values) {
            addCriterion("third_kind_name in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotIn(List<String> values) {
            addCriterion("third_kind_name not in", values, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameBetween(String value1, String value2) {
            addCriterion("third_kind_name between", value1, value2, "thirdKindName");
            return (Criteria) this;
        }

        public Criteria andThirdKindNameNotBetween(String value1, String value2) {
            addCriterion("third_kind_name not between", value1, value2, "thirdKindName");
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

        public Criteria andThirdKindSaleIdIsNull() {
            addCriterion("third_kind_sale_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdIsNotNull() {
            addCriterion("third_kind_sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdEqualTo(String value) {
            addCriterion("third_kind_sale_id =", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotEqualTo(String value) {
            addCriterion("third_kind_sale_id <>", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdGreaterThan(String value) {
            addCriterion("third_kind_sale_id >", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_sale_id >=", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLessThan(String value) {
            addCriterion("third_kind_sale_id <", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLessThanOrEqualTo(String value) {
            addCriterion("third_kind_sale_id <=", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdLike(String value) {
            addCriterion("third_kind_sale_id like", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotLike(String value) {
            addCriterion("third_kind_sale_id not like", value, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdIn(List<String> values) {
            addCriterion("third_kind_sale_id in", values, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotIn(List<String> values) {
            addCriterion("third_kind_sale_id not in", values, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdBetween(String value1, String value2) {
            addCriterion("third_kind_sale_id between", value1, value2, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindSaleIdNotBetween(String value1, String value2) {
            addCriterion("third_kind_sale_id not between", value1, value2, "thirdKindSaleId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIsNull() {
            addCriterion("third_kind_is_retail is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIsNotNull() {
            addCriterion("third_kind_is_retail is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailEqualTo(String value) {
            addCriterion("third_kind_is_retail =", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotEqualTo(String value) {
            addCriterion("third_kind_is_retail <>", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailGreaterThan(String value) {
            addCriterion("third_kind_is_retail >", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailGreaterThanOrEqualTo(String value) {
            addCriterion("third_kind_is_retail >=", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLessThan(String value) {
            addCriterion("third_kind_is_retail <", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLessThanOrEqualTo(String value) {
            addCriterion("third_kind_is_retail <=", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailLike(String value) {
            addCriterion("third_kind_is_retail like", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotLike(String value) {
            addCriterion("third_kind_is_retail not like", value, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailIn(List<String> values) {
            addCriterion("third_kind_is_retail in", values, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotIn(List<String> values) {
            addCriterion("third_kind_is_retail not in", values, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailBetween(String value1, String value2) {
            addCriterion("third_kind_is_retail between", value1, value2, "thirdKindIsRetail");
            return (Criteria) this;
        }

        public Criteria andThirdKindIsRetailNotBetween(String value1, String value2) {
            addCriterion("third_kind_is_retail not between", value1, value2, "thirdKindIsRetail");
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
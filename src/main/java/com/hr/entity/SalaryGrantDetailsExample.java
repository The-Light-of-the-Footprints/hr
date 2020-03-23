package com.hr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryGrantDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryGrantDetailsExample() {
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

        public Criteria andGrdIdIsNull() {
            addCriterion("grd_id is null");
            return (Criteria) this;
        }

        public Criteria andGrdIdIsNotNull() {
            addCriterion("grd_id is not null");
            return (Criteria) this;
        }

        public Criteria andGrdIdEqualTo(Short value) {
            addCriterion("grd_id =", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotEqualTo(Short value) {
            addCriterion("grd_id <>", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdGreaterThan(Short value) {
            addCriterion("grd_id >", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdGreaterThanOrEqualTo(Short value) {
            addCriterion("grd_id >=", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdLessThan(Short value) {
            addCriterion("grd_id <", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdLessThanOrEqualTo(Short value) {
            addCriterion("grd_id <=", value, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdIn(List<Short> values) {
            addCriterion("grd_id in", values, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotIn(List<Short> values) {
            addCriterion("grd_id not in", values, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdBetween(Short value1, Short value2) {
            addCriterion("grd_id between", value1, value2, "grdId");
            return (Criteria) this;
        }

        public Criteria andGrdIdNotBetween(Short value1, Short value2) {
            addCriterion("grd_id not between", value1, value2, "grdId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIsNull() {
            addCriterion("salary_grant_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIsNotNull() {
            addCriterion("salary_grant_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdEqualTo(String value) {
            addCriterion("salary_grant_id =", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotEqualTo(String value) {
            addCriterion("salary_grant_id <>", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThan(String value) {
            addCriterion("salary_grant_id >", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_grant_id >=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThan(String value) {
            addCriterion("salary_grant_id <", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLessThanOrEqualTo(String value) {
            addCriterion("salary_grant_id <=", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdLike(String value) {
            addCriterion("salary_grant_id like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotLike(String value) {
            addCriterion("salary_grant_id not like", value, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdIn(List<String> values) {
            addCriterion("salary_grant_id in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotIn(List<String> values) {
            addCriterion("salary_grant_id not in", values, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdBetween(String value1, String value2) {
            addCriterion("salary_grant_id between", value1, value2, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andSalaryGrantIdNotBetween(String value1, String value2) {
            addCriterion("salary_grant_id not between", value1, value2, "salaryGrantId");
            return (Criteria) this;
        }

        public Criteria andHumanIdIsNull() {
            addCriterion("human_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdIsNotNull() {
            addCriterion("human_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdEqualTo(String value) {
            addCriterion("human_id =", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotEqualTo(String value) {
            addCriterion("human_id <>", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThan(String value) {
            addCriterion("human_id >", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdGreaterThanOrEqualTo(String value) {
            addCriterion("human_id >=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThan(String value) {
            addCriterion("human_id <", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLessThanOrEqualTo(String value) {
            addCriterion("human_id <=", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdLike(String value) {
            addCriterion("human_id like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotLike(String value) {
            addCriterion("human_id not like", value, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdIn(List<String> values) {
            addCriterion("human_id in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotIn(List<String> values) {
            addCriterion("human_id not in", values, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdBetween(String value1, String value2) {
            addCriterion("human_id between", value1, value2, "humanId");
            return (Criteria) this;
        }

        public Criteria andHumanIdNotBetween(String value1, String value2) {
            addCriterion("human_id not between", value1, value2, "humanId");
            return (Criteria) this;
        }

        public Criteria andBounsSumIsNull() {
            addCriterion("bouns_sum is null");
            return (Criteria) this;
        }

        public Criteria andBounsSumIsNotNull() {
            addCriterion("bouns_sum is not null");
            return (Criteria) this;
        }

        public Criteria andBounsSumEqualTo(BigDecimal value) {
            addCriterion("bouns_sum =", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotEqualTo(BigDecimal value) {
            addCriterion("bouns_sum <>", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThan(BigDecimal value) {
            addCriterion("bouns_sum >", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bouns_sum >=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThan(BigDecimal value) {
            addCriterion("bouns_sum <", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bouns_sum <=", value, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumIn(List<BigDecimal> values) {
            addCriterion("bouns_sum in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotIn(List<BigDecimal> values) {
            addCriterion("bouns_sum not in", values, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bouns_sum between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andBounsSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bouns_sum not between", value1, value2, "bounsSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNull() {
            addCriterion("sale_sum is null");
            return (Criteria) this;
        }

        public Criteria andSaleSumIsNotNull() {
            addCriterion("sale_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSaleSumEqualTo(BigDecimal value) {
            addCriterion("sale_sum =", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotEqualTo(BigDecimal value) {
            addCriterion("sale_sum <>", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThan(BigDecimal value) {
            addCriterion("sale_sum >", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_sum >=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThan(BigDecimal value) {
            addCriterion("sale_sum <", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sale_sum <=", value, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumIn(List<BigDecimal> values) {
            addCriterion("sale_sum in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotIn(List<BigDecimal> values) {
            addCriterion("sale_sum not in", values, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_sum between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andSaleSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sale_sum not between", value1, value2, "saleSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNull() {
            addCriterion("deduct_sum is null");
            return (Criteria) this;
        }

        public Criteria andDeductSumIsNotNull() {
            addCriterion("deduct_sum is not null");
            return (Criteria) this;
        }

        public Criteria andDeductSumEqualTo(BigDecimal value) {
            addCriterion("deduct_sum =", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotEqualTo(BigDecimal value) {
            addCriterion("deduct_sum <>", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThan(BigDecimal value) {
            addCriterion("deduct_sum >", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deduct_sum >=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThan(BigDecimal value) {
            addCriterion("deduct_sum <", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deduct_sum <=", value, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumIn(List<BigDecimal> values) {
            addCriterion("deduct_sum in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotIn(List<BigDecimal> values) {
            addCriterion("deduct_sum not in", values, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduct_sum between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andDeductSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deduct_sum not between", value1, value2, "deductSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNull() {
            addCriterion("salary_standard_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIsNotNull() {
            addCriterion("salary_standard_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumEqualTo(BigDecimal value) {
            addCriterion("salary_standard_sum =", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotEqualTo(BigDecimal value) {
            addCriterion("salary_standard_sum <>", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThan(BigDecimal value) {
            addCriterion("salary_standard_sum >", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_standard_sum >=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThan(BigDecimal value) {
            addCriterion("salary_standard_sum <", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_standard_sum <=", value, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumIn(List<BigDecimal> values) {
            addCriterion("salary_standard_sum in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotIn(List<BigDecimal> values) {
            addCriterion("salary_standard_sum not in", values, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_standard_sum between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_standard_sum not between", value1, value2, "salaryStandardSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIsNull() {
            addCriterion("salary_paid_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIsNotNull() {
            addCriterion("salary_paid_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumEqualTo(BigDecimal value) {
            addCriterion("salary_paid_sum =", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotEqualTo(BigDecimal value) {
            addCriterion("salary_paid_sum <>", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumGreaterThan(BigDecimal value) {
            addCriterion("salary_paid_sum >", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_paid_sum >=", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumLessThan(BigDecimal value) {
            addCriterion("salary_paid_sum <", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_paid_sum <=", value, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumIn(List<BigDecimal> values) {
            addCriterion("salary_paid_sum in", values, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotIn(List<BigDecimal> values) {
            addCriterion("salary_paid_sum not in", values, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_paid_sum between", value1, value2, "salaryPaidSum");
            return (Criteria) this;
        }

        public Criteria andSalaryPaidSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_paid_sum not between", value1, value2, "salaryPaidSum");
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
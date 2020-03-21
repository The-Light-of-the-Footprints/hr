package com.hr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SalaryGrantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SalaryGrantExample() {
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

        public Criteria andSalaryStandardIdIsNull() {
            addCriterion("salary_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIsNotNull() {
            addCriterion("salary_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdEqualTo(String value) {
            addCriterion("salary_standard_id =", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotEqualTo(String value) {
            addCriterion("salary_standard_id <>", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThan(String value) {
            addCriterion("salary_standard_id >", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("salary_standard_id >=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThan(String value) {
            addCriterion("salary_standard_id <", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLessThanOrEqualTo(String value) {
            addCriterion("salary_standard_id <=", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdLike(String value) {
            addCriterion("salary_standard_id like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotLike(String value) {
            addCriterion("salary_standard_id not like", value, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdIn(List<String> values) {
            addCriterion("salary_standard_id in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotIn(List<String> values) {
            addCriterion("salary_standard_id not in", values, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdBetween(String value1, String value2) {
            addCriterion("salary_standard_id between", value1, value2, "salaryStandardId");
            return (Criteria) this;
        }

        public Criteria andSalaryStandardIdNotBetween(String value1, String value2) {
            addCriterion("salary_standard_id not between", value1, value2, "salaryStandardId");
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

        public Criteria andSecondKindIdEqualTo(String value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(String value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(String value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(String value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(String value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLike(String value) {
            addCriterion("second_kind_id like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotLike(String value) {
            addCriterion("second_kind_id not like", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<String> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<String> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(String value1, String value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(String value1, String value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIsNull() {
            addCriterion("human_amount is null");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIsNotNull() {
            addCriterion("human_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAmountEqualTo(Short value) {
            addCriterion("human_amount =", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotEqualTo(Short value) {
            addCriterion("human_amount <>", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountGreaterThan(Short value) {
            addCriterion("human_amount >", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("human_amount >=", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountLessThan(Short value) {
            addCriterion("human_amount <", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountLessThanOrEqualTo(Short value) {
            addCriterion("human_amount <=", value, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountIn(List<Short> values) {
            addCriterion("human_amount in", values, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotIn(List<Short> values) {
            addCriterion("human_amount not in", values, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountBetween(Short value1, Short value2) {
            addCriterion("human_amount between", value1, value2, "humanAmount");
            return (Criteria) this;
        }

        public Criteria andHumanAmountNotBetween(Short value1, Short value2) {
            addCriterion("human_amount not between", value1, value2, "humanAmount");
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

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNull() {
            addCriterion("regist_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIsNotNull() {
            addCriterion("regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistTimeEqualTo(Date value) {
            addCriterion("regist_time =", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotEqualTo(Date value) {
            addCriterion("regist_time <>", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThan(Date value) {
            addCriterion("regist_time >", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("regist_time >=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThan(Date value) {
            addCriterion("regist_time <", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("regist_time <=", value, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeIn(List<Date> values) {
            addCriterion("regist_time in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotIn(List<Date> values) {
            addCriterion("regist_time not in", values, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeBetween(Date value1, Date value2) {
            addCriterion("regist_time between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("regist_time not between", value1, value2, "registTime");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Short value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Short value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Short value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Short value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Short> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Short> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Short value1, Short value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
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
package com.hr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MajorChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorChangeExample() {
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

        public Criteria andMchIdIsNull() {
            addCriterion("mch_id is null");
            return (Criteria) this;
        }

        public Criteria andMchIdIsNotNull() {
            addCriterion("mch_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchIdEqualTo(Short value) {
            addCriterion("mch_id =", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotEqualTo(Short value) {
            addCriterion("mch_id <>", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThan(Short value) {
            addCriterion("mch_id >", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdGreaterThanOrEqualTo(Short value) {
            addCriterion("mch_id >=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThan(Short value) {
            addCriterion("mch_id <", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdLessThanOrEqualTo(Short value) {
            addCriterion("mch_id <=", value, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdIn(List<Short> values) {
            addCriterion("mch_id in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotIn(List<Short> values) {
            addCriterion("mch_id not in", values, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdBetween(Short value1, Short value2) {
            addCriterion("mch_id between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andMchIdNotBetween(Short value1, Short value2) {
            addCriterion("mch_id not between", value1, value2, "mchId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNull() {
            addCriterion("third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIsNotNull() {
            addCriterion("third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdEqualTo(Short value) {
            addCriterion("third_kind_id =", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotEqualTo(Short value) {
            addCriterion("third_kind_id <>", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThan(Short value) {
            addCriterion("third_kind_id >", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdGreaterThanOrEqualTo(Short value) {
            addCriterion("third_kind_id >=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThan(Short value) {
            addCriterion("third_kind_id <", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdLessThanOrEqualTo(Short value) {
            addCriterion("third_kind_id <=", value, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdIn(List<Short> values) {
            addCriterion("third_kind_id in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotIn(List<Short> values) {
            addCriterion("third_kind_id not in", values, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdBetween(Short value1, Short value2) {
            addCriterion("third_kind_id between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andThirdKindIdNotBetween(Short value1, Short value2) {
            addCriterion("third_kind_id not between", value1, value2, "thirdKindId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNull() {
            addCriterion("major_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorIdIsNotNull() {
            addCriterion("major_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorIdEqualTo(Short value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(Short value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(Short value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(Short value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(Short value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(Short value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<Short> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<Short> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(Short value1, Short value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(Short value1, Short value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIsNull() {
            addCriterion("new_third_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIsNotNull() {
            addCriterion("new_third_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdEqualTo(Short value) {
            addCriterion("new_third_kind_id =", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotEqualTo(Short value) {
            addCriterion("new_third_kind_id <>", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdGreaterThan(Short value) {
            addCriterion("new_third_kind_id >", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdGreaterThanOrEqualTo(Short value) {
            addCriterion("new_third_kind_id >=", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdLessThan(Short value) {
            addCriterion("new_third_kind_id <", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdLessThanOrEqualTo(Short value) {
            addCriterion("new_third_kind_id <=", value, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdIn(List<Short> values) {
            addCriterion("new_third_kind_id in", values, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotIn(List<Short> values) {
            addCriterion("new_third_kind_id not in", values, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdBetween(Short value1, Short value2) {
            addCriterion("new_third_kind_id between", value1, value2, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewThirdKindIdNotBetween(Short value1, Short value2) {
            addCriterion("new_third_kind_id not between", value1, value2, "newThirdKindId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIsNull() {
            addCriterion("new_major_id is null");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIsNotNull() {
            addCriterion("new_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdEqualTo(Short value) {
            addCriterion("new_major_id =", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotEqualTo(Short value) {
            addCriterion("new_major_id <>", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdGreaterThan(Short value) {
            addCriterion("new_major_id >", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdGreaterThanOrEqualTo(Short value) {
            addCriterion("new_major_id >=", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdLessThan(Short value) {
            addCriterion("new_major_id <", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdLessThanOrEqualTo(Short value) {
            addCriterion("new_major_id <=", value, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdIn(List<Short> values) {
            addCriterion("new_major_id in", values, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotIn(List<Short> values) {
            addCriterion("new_major_id not in", values, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdBetween(Short value1, Short value2) {
            addCriterion("new_major_id between", value1, value2, "newMajorId");
            return (Criteria) this;
        }

        public Criteria andNewMajorIdNotBetween(Short value1, Short value2) {
            addCriterion("new_major_id not between", value1, value2, "newMajorId");
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

        public Criteria andSalarySumIsNull() {
            addCriterion("salary_sum is null");
            return (Criteria) this;
        }

        public Criteria andSalarySumIsNotNull() {
            addCriterion("salary_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSalarySumEqualTo(BigDecimal value) {
            addCriterion("salary_sum =", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotEqualTo(BigDecimal value) {
            addCriterion("salary_sum <>", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumGreaterThan(BigDecimal value) {
            addCriterion("salary_sum >", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_sum >=", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumLessThan(BigDecimal value) {
            addCriterion("salary_sum <", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("salary_sum <=", value, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumIn(List<BigDecimal> values) {
            addCriterion("salary_sum in", values, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotIn(List<BigDecimal> values) {
            addCriterion("salary_sum not in", values, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_sum between", value1, value2, "salarySum");
            return (Criteria) this;
        }

        public Criteria andSalarySumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("salary_sum not between", value1, value2, "salarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdIsNull() {
            addCriterion("new_salary_standard_id is null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdIsNotNull() {
            addCriterion("new_salary_standard_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdEqualTo(String value) {
            addCriterion("new_salary_standard_id =", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotEqualTo(String value) {
            addCriterion("new_salary_standard_id <>", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdGreaterThan(String value) {
            addCriterion("new_salary_standard_id >", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdGreaterThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_id >=", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLessThan(String value) {
            addCriterion("new_salary_standard_id <", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLessThanOrEqualTo(String value) {
            addCriterion("new_salary_standard_id <=", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdLike(String value) {
            addCriterion("new_salary_standard_id like", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotLike(String value) {
            addCriterion("new_salary_standard_id not like", value, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdIn(List<String> values) {
            addCriterion("new_salary_standard_id in", values, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotIn(List<String> values) {
            addCriterion("new_salary_standard_id not in", values, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdBetween(String value1, String value2) {
            addCriterion("new_salary_standard_id between", value1, value2, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalaryStandardIdNotBetween(String value1, String value2) {
            addCriterion("new_salary_standard_id not between", value1, value2, "newSalaryStandardId");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIsNull() {
            addCriterion("new_salary_sum is null");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIsNotNull() {
            addCriterion("new_salary_sum is not null");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumEqualTo(BigDecimal value) {
            addCriterion("new_salary_sum =", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotEqualTo(BigDecimal value) {
            addCriterion("new_salary_sum <>", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumGreaterThan(BigDecimal value) {
            addCriterion("new_salary_sum >", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_salary_sum >=", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumLessThan(BigDecimal value) {
            addCriterion("new_salary_sum <", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_salary_sum <=", value, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumIn(List<BigDecimal> values) {
            addCriterion("new_salary_sum in", values, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotIn(List<BigDecimal> values) {
            addCriterion("new_salary_sum not in", values, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_salary_sum between", value1, value2, "newSalarySum");
            return (Criteria) this;
        }

        public Criteria andNewSalarySumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_salary_sum not between", value1, value2, "newSalarySum");
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
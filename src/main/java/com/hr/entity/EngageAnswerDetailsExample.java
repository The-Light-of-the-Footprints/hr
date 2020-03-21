package com.hr.entity;

import java.util.ArrayList;
import java.util.List;

public class EngageAnswerDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngageAnswerDetailsExample() {
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

        public Criteria andAndIdIsNull() {
            addCriterion("and_id is null");
            return (Criteria) this;
        }

        public Criteria andAndIdIsNotNull() {
            addCriterion("and_id is not null");
            return (Criteria) this;
        }

        public Criteria andAndIdEqualTo(Short value) {
            addCriterion("and_id =", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdNotEqualTo(Short value) {
            addCriterion("and_id <>", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdGreaterThan(Short value) {
            addCriterion("and_id >", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdGreaterThanOrEqualTo(Short value) {
            addCriterion("and_id >=", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdLessThan(Short value) {
            addCriterion("and_id <", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdLessThanOrEqualTo(Short value) {
            addCriterion("and_id <=", value, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdIn(List<Short> values) {
            addCriterion("and_id in", values, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdNotIn(List<Short> values) {
            addCriterion("and_id not in", values, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdBetween(Short value1, Short value2) {
            addCriterion("and_id between", value1, value2, "andId");
            return (Criteria) this;
        }

        public Criteria andAndIdNotBetween(Short value1, Short value2) {
            addCriterion("and_id not between", value1, value2, "andId");
            return (Criteria) this;
        }

        public Criteria andAnsIdIsNull() {
            addCriterion("ans_id is null");
            return (Criteria) this;
        }

        public Criteria andAnsIdIsNotNull() {
            addCriterion("ans_id is not null");
            return (Criteria) this;
        }

        public Criteria andAnsIdEqualTo(Short value) {
            addCriterion("ans_id =", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotEqualTo(Short value) {
            addCriterion("ans_id <>", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdGreaterThan(Short value) {
            addCriterion("ans_id >", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ans_id >=", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdLessThan(Short value) {
            addCriterion("ans_id <", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdLessThanOrEqualTo(Short value) {
            addCriterion("ans_id <=", value, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdIn(List<Short> values) {
            addCriterion("ans_id in", values, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotIn(List<Short> values) {
            addCriterion("ans_id not in", values, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdBetween(Short value1, Short value2) {
            addCriterion("ans_id between", value1, value2, "ansId");
            return (Criteria) this;
        }

        public Criteria andAnsIdNotBetween(Short value1, Short value2) {
            addCriterion("ans_id not between", value1, value2, "ansId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Short value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Short value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Short value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Short value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Short value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Short value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Short> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Short> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Short value1, Short value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Short value1, Short value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNull() {
            addCriterion("answer is null");
            return (Criteria) this;
        }

        public Criteria andAnswerIsNotNull() {
            addCriterion("answer is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerEqualTo(String value) {
            addCriterion("answer =", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotEqualTo(String value) {
            addCriterion("answer <>", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThan(String value) {
            addCriterion("answer >", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("answer >=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThan(String value) {
            addCriterion("answer <", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLessThanOrEqualTo(String value) {
            addCriterion("answer <=", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerLike(String value) {
            addCriterion("answer like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotLike(String value) {
            addCriterion("answer not like", value, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerIn(List<String> values) {
            addCriterion("answer in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotIn(List<String> values) {
            addCriterion("answer not in", values, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerBetween(String value1, String value2) {
            addCriterion("answer between", value1, value2, "answer");
            return (Criteria) this;
        }

        public Criteria andAnswerNotBetween(String value1, String value2) {
            addCriterion("answer not between", value1, value2, "answer");
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
package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EngageSubjectsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngageSubjectsExample() {
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

        public Criteria andSubIdIsNull() {
            addCriterion("sub_id is null");
            return (Criteria) this;
        }

        public Criteria andSubIdIsNotNull() {
            addCriterion("sub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubIdEqualTo(Short value) {
            addCriterion("sub_id =", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotEqualTo(Short value) {
            addCriterion("sub_id <>", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThan(Short value) {
            addCriterion("sub_id >", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdGreaterThanOrEqualTo(Short value) {
            addCriterion("sub_id >=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThan(Short value) {
            addCriterion("sub_id <", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdLessThanOrEqualTo(Short value) {
            addCriterion("sub_id <=", value, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdIn(List<Short> values) {
            addCriterion("sub_id in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotIn(List<Short> values) {
            addCriterion("sub_id not in", values, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdBetween(Short value1, Short value2) {
            addCriterion("sub_id between", value1, value2, "subId");
            return (Criteria) this;
        }

        public Criteria andSubIdNotBetween(Short value1, Short value2) {
            addCriterion("sub_id not between", value1, value2, "subId");
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

        public Criteria andSecondKindIdEqualTo(Short value) {
            addCriterion("second_kind_id =", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotEqualTo(Short value) {
            addCriterion("second_kind_id <>", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThan(Short value) {
            addCriterion("second_kind_id >", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdGreaterThanOrEqualTo(Short value) {
            addCriterion("second_kind_id >=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThan(Short value) {
            addCriterion("second_kind_id <", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdLessThanOrEqualTo(Short value) {
            addCriterion("second_kind_id <=", value, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdIn(List<Short> values) {
            addCriterion("second_kind_id in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotIn(List<Short> values) {
            addCriterion("second_kind_id not in", values, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdBetween(Short value1, Short value2) {
            addCriterion("second_kind_id between", value1, value2, "secondKindId");
            return (Criteria) this;
        }

        public Criteria andSecondKindIdNotBetween(Short value1, Short value2) {
            addCriterion("second_kind_id not between", value1, value2, "secondKindId");
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

        public Criteria andDerivationIsNull() {
            addCriterion("derivation is null");
            return (Criteria) this;
        }

        public Criteria andDerivationIsNotNull() {
            addCriterion("derivation is not null");
            return (Criteria) this;
        }

        public Criteria andDerivationEqualTo(String value) {
            addCriterion("derivation =", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotEqualTo(String value) {
            addCriterion("derivation <>", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationGreaterThan(String value) {
            addCriterion("derivation >", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationGreaterThanOrEqualTo(String value) {
            addCriterion("derivation >=", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLessThan(String value) {
            addCriterion("derivation <", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLessThanOrEqualTo(String value) {
            addCriterion("derivation <=", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationLike(String value) {
            addCriterion("derivation like", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotLike(String value) {
            addCriterion("derivation not like", value, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationIn(List<String> values) {
            addCriterion("derivation in", values, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotIn(List<String> values) {
            addCriterion("derivation not in", values, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationBetween(String value1, String value2) {
            addCriterion("derivation between", value1, value2, "derivation");
            return (Criteria) this;
        }

        public Criteria andDerivationNotBetween(String value1, String value2) {
            addCriterion("derivation not between", value1, value2, "derivation");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIsNull() {
            addCriterion("correct_key is null");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIsNotNull() {
            addCriterion("correct_key is not null");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyEqualTo(String value) {
            addCriterion("correct_key =", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotEqualTo(String value) {
            addCriterion("correct_key <>", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyGreaterThan(String value) {
            addCriterion("correct_key >", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyGreaterThanOrEqualTo(String value) {
            addCriterion("correct_key >=", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLessThan(String value) {
            addCriterion("correct_key <", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLessThanOrEqualTo(String value) {
            addCriterion("correct_key <=", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyLike(String value) {
            addCriterion("correct_key like", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotLike(String value) {
            addCriterion("correct_key not like", value, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyIn(List<String> values) {
            addCriterion("correct_key in", values, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotIn(List<String> values) {
            addCriterion("correct_key not in", values, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyBetween(String value1, String value2) {
            addCriterion("correct_key between", value1, value2, "correctKey");
            return (Criteria) this;
        }

        public Criteria andCorrectKeyNotBetween(String value1, String value2) {
            addCriterion("correct_key not between", value1, value2, "correctKey");
            return (Criteria) this;
        }

        public Criteria andChangerIsNull() {
            addCriterion("changer is null");
            return (Criteria) this;
        }

        public Criteria andChangerIsNotNull() {
            addCriterion("changer is not null");
            return (Criteria) this;
        }

        public Criteria andChangerEqualTo(String value) {
            addCriterion("changer =", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotEqualTo(String value) {
            addCriterion("changer <>", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThan(String value) {
            addCriterion("changer >", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerGreaterThanOrEqualTo(String value) {
            addCriterion("changer >=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThan(String value) {
            addCriterion("changer <", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLessThanOrEqualTo(String value) {
            addCriterion("changer <=", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerLike(String value) {
            addCriterion("changer like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotLike(String value) {
            addCriterion("changer not like", value, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerIn(List<String> values) {
            addCriterion("changer in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotIn(List<String> values) {
            addCriterion("changer not in", values, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerBetween(String value1, String value2) {
            addCriterion("changer between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangerNotBetween(String value1, String value2) {
            addCriterion("changer not between", value1, value2, "changer");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
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
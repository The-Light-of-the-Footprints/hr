package com.hr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BonusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BonusExample() {
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

        public Criteria andBonIdIsNull() {
            addCriterion("bon_id is null");
            return (Criteria) this;
        }

        public Criteria andBonIdIsNotNull() {
            addCriterion("bon_id is not null");
            return (Criteria) this;
        }

        public Criteria andBonIdEqualTo(Short value) {
            addCriterion("bon_id =", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdNotEqualTo(Short value) {
            addCriterion("bon_id <>", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdGreaterThan(Short value) {
            addCriterion("bon_id >", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdGreaterThanOrEqualTo(Short value) {
            addCriterion("bon_id >=", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdLessThan(Short value) {
            addCriterion("bon_id <", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdLessThanOrEqualTo(Short value) {
            addCriterion("bon_id <=", value, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdIn(List<Short> values) {
            addCriterion("bon_id in", values, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdNotIn(List<Short> values) {
            addCriterion("bon_id not in", values, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdBetween(Short value1, Short value2) {
            addCriterion("bon_id between", value1, value2, "bonId");
            return (Criteria) this;
        }

        public Criteria andBonIdNotBetween(Short value1, Short value2) {
            addCriterion("bon_id not between", value1, value2, "bonId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIsNull() {
            addCriterion("major_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIsNotNull() {
            addCriterion("major_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdEqualTo(String value) {
            addCriterion("major_kind_id =", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotEqualTo(String value) {
            addCriterion("major_kind_id <>", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThan(String value) {
            addCriterion("major_kind_id >", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_id >=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThan(String value) {
            addCriterion("major_kind_id <", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLessThanOrEqualTo(String value) {
            addCriterion("major_kind_id <=", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdLike(String value) {
            addCriterion("major_kind_id like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotLike(String value) {
            addCriterion("major_kind_id not like", value, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdIn(List<String> values) {
            addCriterion("major_kind_id in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotIn(List<String> values) {
            addCriterion("major_kind_id not in", values, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdBetween(String value1, String value2) {
            addCriterion("major_kind_id between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindIdNotBetween(String value1, String value2) {
            addCriterion("major_kind_id not between", value1, value2, "majorKindId");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNull() {
            addCriterion("major_kind_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIsNotNull() {
            addCriterion("major_kind_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameEqualTo(String value) {
            addCriterion("major_kind_name =", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotEqualTo(String value) {
            addCriterion("major_kind_name <>", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThan(String value) {
            addCriterion("major_kind_name >", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_kind_name >=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThan(String value) {
            addCriterion("major_kind_name <", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLessThanOrEqualTo(String value) {
            addCriterion("major_kind_name <=", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameLike(String value) {
            addCriterion("major_kind_name like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotLike(String value) {
            addCriterion("major_kind_name not like", value, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameIn(List<String> values) {
            addCriterion("major_kind_name in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotIn(List<String> values) {
            addCriterion("major_kind_name not in", values, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameBetween(String value1, String value2) {
            addCriterion("major_kind_name between", value1, value2, "majorKindName");
            return (Criteria) this;
        }

        public Criteria andMajorKindNameNotBetween(String value1, String value2) {
            addCriterion("major_kind_name not between", value1, value2, "majorKindName");
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

        public Criteria andMajorIdEqualTo(String value) {
            addCriterion("major_id =", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotEqualTo(String value) {
            addCriterion("major_id <>", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThan(String value) {
            addCriterion("major_id >", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdGreaterThanOrEqualTo(String value) {
            addCriterion("major_id >=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThan(String value) {
            addCriterion("major_id <", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLessThanOrEqualTo(String value) {
            addCriterion("major_id <=", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdLike(String value) {
            addCriterion("major_id like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotLike(String value) {
            addCriterion("major_id not like", value, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdIn(List<String> values) {
            addCriterion("major_id in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotIn(List<String> values) {
            addCriterion("major_id not in", values, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdBetween(String value1, String value2) {
            addCriterion("major_id between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorIdNotBetween(String value1, String value2) {
            addCriterion("major_id not between", value1, value2, "majorId");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNull() {
            addCriterion("major_name is null");
            return (Criteria) this;
        }

        public Criteria andMajorNameIsNotNull() {
            addCriterion("major_name is not null");
            return (Criteria) this;
        }

        public Criteria andMajorNameEqualTo(String value) {
            addCriterion("major_name =", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotEqualTo(String value) {
            addCriterion("major_name <>", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThan(String value) {
            addCriterion("major_name >", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameGreaterThanOrEqualTo(String value) {
            addCriterion("major_name >=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThan(String value) {
            addCriterion("major_name <", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLessThanOrEqualTo(String value) {
            addCriterion("major_name <=", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameLike(String value) {
            addCriterion("major_name like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotLike(String value) {
            addCriterion("major_name not like", value, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameIn(List<String> values) {
            addCriterion("major_name in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotIn(List<String> values) {
            addCriterion("major_name not in", values, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameBetween(String value1, String value2) {
            addCriterion("major_name between", value1, value2, "majorName");
            return (Criteria) this;
        }

        public Criteria andMajorNameNotBetween(String value1, String value2) {
            addCriterion("major_name not between", value1, value2, "majorName");
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

        public Criteria andHumanNameIsNull() {
            addCriterion("human_name is null");
            return (Criteria) this;
        }

        public Criteria andHumanNameIsNotNull() {
            addCriterion("human_name is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNameEqualTo(String value) {
            addCriterion("human_name =", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotEqualTo(String value) {
            addCriterion("human_name <>", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThan(String value) {
            addCriterion("human_name >", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameGreaterThanOrEqualTo(String value) {
            addCriterion("human_name >=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThan(String value) {
            addCriterion("human_name <", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLessThanOrEqualTo(String value) {
            addCriterion("human_name <=", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameLike(String value) {
            addCriterion("human_name like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotLike(String value) {
            addCriterion("human_name not like", value, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameIn(List<String> values) {
            addCriterion("human_name in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotIn(List<String> values) {
            addCriterion("human_name not in", values, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameBetween(String value1, String value2) {
            addCriterion("human_name between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andHumanNameNotBetween(String value1, String value2) {
            addCriterion("human_name not between", value1, value2, "humanName");
            return (Criteria) this;
        }

        public Criteria andBonusItemIsNull() {
            addCriterion("bonus_item is null");
            return (Criteria) this;
        }

        public Criteria andBonusItemIsNotNull() {
            addCriterion("bonus_item is not null");
            return (Criteria) this;
        }

        public Criteria andBonusItemEqualTo(String value) {
            addCriterion("bonus_item =", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemNotEqualTo(String value) {
            addCriterion("bonus_item <>", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemGreaterThan(String value) {
            addCriterion("bonus_item >", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemGreaterThanOrEqualTo(String value) {
            addCriterion("bonus_item >=", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemLessThan(String value) {
            addCriterion("bonus_item <", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemLessThanOrEqualTo(String value) {
            addCriterion("bonus_item <=", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemLike(String value) {
            addCriterion("bonus_item like", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemNotLike(String value) {
            addCriterion("bonus_item not like", value, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemIn(List<String> values) {
            addCriterion("bonus_item in", values, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemNotIn(List<String> values) {
            addCriterion("bonus_item not in", values, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemBetween(String value1, String value2) {
            addCriterion("bonus_item between", value1, value2, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusItemNotBetween(String value1, String value2) {
            addCriterion("bonus_item not between", value1, value2, "bonusItem");
            return (Criteria) this;
        }

        public Criteria andBonusWorthIsNull() {
            addCriterion("bonus_worth is null");
            return (Criteria) this;
        }

        public Criteria andBonusWorthIsNotNull() {
            addCriterion("bonus_worth is not null");
            return (Criteria) this;
        }

        public Criteria andBonusWorthEqualTo(BigDecimal value) {
            addCriterion("bonus_worth =", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthNotEqualTo(BigDecimal value) {
            addCriterion("bonus_worth <>", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthGreaterThan(BigDecimal value) {
            addCriterion("bonus_worth >", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus_worth >=", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthLessThan(BigDecimal value) {
            addCriterion("bonus_worth <", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus_worth <=", value, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthIn(List<BigDecimal> values) {
            addCriterion("bonus_worth in", values, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthNotIn(List<BigDecimal> values) {
            addCriterion("bonus_worth not in", values, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus_worth between", value1, value2, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusWorthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus_worth not between", value1, value2, "bonusWorth");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeIsNull() {
            addCriterion("bonus_degree is null");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeIsNotNull() {
            addCriterion("bonus_degree is not null");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeEqualTo(String value) {
            addCriterion("bonus_degree =", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeNotEqualTo(String value) {
            addCriterion("bonus_degree <>", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeGreaterThan(String value) {
            addCriterion("bonus_degree >", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("bonus_degree >=", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeLessThan(String value) {
            addCriterion("bonus_degree <", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeLessThanOrEqualTo(String value) {
            addCriterion("bonus_degree <=", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeLike(String value) {
            addCriterion("bonus_degree like", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeNotLike(String value) {
            addCriterion("bonus_degree not like", value, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeIn(List<String> values) {
            addCriterion("bonus_degree in", values, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeNotIn(List<String> values) {
            addCriterion("bonus_degree not in", values, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeBetween(String value1, String value2) {
            addCriterion("bonus_degree between", value1, value2, "bonusDegree");
            return (Criteria) this;
        }

        public Criteria andBonusDegreeNotBetween(String value1, String value2) {
            addCriterion("bonus_degree not between", value1, value2, "bonusDegree");
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
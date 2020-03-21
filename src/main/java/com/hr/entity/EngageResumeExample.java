package com.hr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EngageResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngageResumeExample() {
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

        public Criteria andResIdIsNull() {
            addCriterion("res_id is null");
            return (Criteria) this;
        }

        public Criteria andResIdIsNotNull() {
            addCriterion("res_id is not null");
            return (Criteria) this;
        }

        public Criteria andResIdEqualTo(Short value) {
            addCriterion("res_id =", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotEqualTo(Short value) {
            addCriterion("res_id <>", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThan(Short value) {
            addCriterion("res_id >", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdGreaterThanOrEqualTo(Short value) {
            addCriterion("res_id >=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThan(Short value) {
            addCriterion("res_id <", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdLessThanOrEqualTo(Short value) {
            addCriterion("res_id <=", value, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdIn(List<Short> values) {
            addCriterion("res_id in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotIn(List<Short> values) {
            addCriterion("res_id not in", values, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdBetween(Short value1, Short value2) {
            addCriterion("res_id between", value1, value2, "resId");
            return (Criteria) this;
        }

        public Criteria andResIdNotBetween(Short value1, Short value2) {
            addCriterion("res_id not between", value1, value2, "resId");
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

        public Criteria andEngageTypeIsNull() {
            addCriterion("engage_type is null");
            return (Criteria) this;
        }

        public Criteria andEngageTypeIsNotNull() {
            addCriterion("engage_type is not null");
            return (Criteria) this;
        }

        public Criteria andEngageTypeEqualTo(String value) {
            addCriterion("engage_type =", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotEqualTo(String value) {
            addCriterion("engage_type <>", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeGreaterThan(String value) {
            addCriterion("engage_type >", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("engage_type >=", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLessThan(String value) {
            addCriterion("engage_type <", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLessThanOrEqualTo(String value) {
            addCriterion("engage_type <=", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeLike(String value) {
            addCriterion("engage_type like", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotLike(String value) {
            addCriterion("engage_type not like", value, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeIn(List<String> values) {
            addCriterion("engage_type in", values, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotIn(List<String> values) {
            addCriterion("engage_type not in", values, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeBetween(String value1, String value2) {
            addCriterion("engage_type between", value1, value2, "engageType");
            return (Criteria) this;
        }

        public Criteria andEngageTypeNotBetween(String value1, String value2) {
            addCriterion("engage_type not between", value1, value2, "engageType");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIsNull() {
            addCriterion("human_address is null");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIsNotNull() {
            addCriterion("human_address is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAddressEqualTo(String value) {
            addCriterion("human_address =", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotEqualTo(String value) {
            addCriterion("human_address <>", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressGreaterThan(String value) {
            addCriterion("human_address >", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressGreaterThanOrEqualTo(String value) {
            addCriterion("human_address >=", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLessThan(String value) {
            addCriterion("human_address <", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLessThanOrEqualTo(String value) {
            addCriterion("human_address <=", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressLike(String value) {
            addCriterion("human_address like", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotLike(String value) {
            addCriterion("human_address not like", value, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressIn(List<String> values) {
            addCriterion("human_address in", values, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotIn(List<String> values) {
            addCriterion("human_address not in", values, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressBetween(String value1, String value2) {
            addCriterion("human_address between", value1, value2, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanAddressNotBetween(String value1, String value2) {
            addCriterion("human_address not between", value1, value2, "humanAddress");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIsNull() {
            addCriterion("human_postcode is null");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIsNotNull() {
            addCriterion("human_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeEqualTo(String value) {
            addCriterion("human_postcode =", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotEqualTo(String value) {
            addCriterion("human_postcode <>", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeGreaterThan(String value) {
            addCriterion("human_postcode >", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("human_postcode >=", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLessThan(String value) {
            addCriterion("human_postcode <", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLessThanOrEqualTo(String value) {
            addCriterion("human_postcode <=", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeLike(String value) {
            addCriterion("human_postcode like", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotLike(String value) {
            addCriterion("human_postcode not like", value, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeIn(List<String> values) {
            addCriterion("human_postcode in", values, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotIn(List<String> values) {
            addCriterion("human_postcode not in", values, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeBetween(String value1, String value2) {
            addCriterion("human_postcode between", value1, value2, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanPostcodeNotBetween(String value1, String value2) {
            addCriterion("human_postcode not between", value1, value2, "humanPostcode");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIsNull() {
            addCriterion("human_major_id is null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIsNotNull() {
            addCriterion("human_major_id is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdEqualTo(Short value) {
            addCriterion("human_major_id =", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotEqualTo(Short value) {
            addCriterion("human_major_id <>", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdGreaterThan(Short value) {
            addCriterion("human_major_id >", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdGreaterThanOrEqualTo(Short value) {
            addCriterion("human_major_id >=", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdLessThan(Short value) {
            addCriterion("human_major_id <", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdLessThanOrEqualTo(Short value) {
            addCriterion("human_major_id <=", value, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdIn(List<Short> values) {
            addCriterion("human_major_id in", values, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotIn(List<Short> values) {
            addCriterion("human_major_id not in", values, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdBetween(Short value1, Short value2) {
            addCriterion("human_major_id between", value1, value2, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanMajorIdNotBetween(Short value1, Short value2) {
            addCriterion("human_major_id not between", value1, value2, "humanMajorId");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIsNull() {
            addCriterion("human_telephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIsNotNull() {
            addCriterion("human_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneEqualTo(String value) {
            addCriterion("human_telephone =", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotEqualTo(String value) {
            addCriterion("human_telephone <>", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneGreaterThan(String value) {
            addCriterion("human_telephone >", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_telephone >=", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLessThan(String value) {
            addCriterion("human_telephone <", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLessThanOrEqualTo(String value) {
            addCriterion("human_telephone <=", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneLike(String value) {
            addCriterion("human_telephone like", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotLike(String value) {
            addCriterion("human_telephone not like", value, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneIn(List<String> values) {
            addCriterion("human_telephone in", values, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotIn(List<String> values) {
            addCriterion("human_telephone not in", values, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneBetween(String value1, String value2) {
            addCriterion("human_telephone between", value1, value2, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanTelephoneNotBetween(String value1, String value2) {
            addCriterion("human_telephone not between", value1, value2, "humanTelephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneIsNull() {
            addCriterion("human_homephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneIsNotNull() {
            addCriterion("human_homephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneEqualTo(String value) {
            addCriterion("human_homephone =", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotEqualTo(String value) {
            addCriterion("human_homephone <>", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneGreaterThan(String value) {
            addCriterion("human_homephone >", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_homephone >=", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLessThan(String value) {
            addCriterion("human_homephone <", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLessThanOrEqualTo(String value) {
            addCriterion("human_homephone <=", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneLike(String value) {
            addCriterion("human_homephone like", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotLike(String value) {
            addCriterion("human_homephone not like", value, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneIn(List<String> values) {
            addCriterion("human_homephone in", values, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotIn(List<String> values) {
            addCriterion("human_homephone not in", values, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneBetween(String value1, String value2) {
            addCriterion("human_homephone between", value1, value2, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanHomephoneNotBetween(String value1, String value2) {
            addCriterion("human_homephone not between", value1, value2, "humanHomephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIsNull() {
            addCriterion("human_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIsNotNull() {
            addCriterion("human_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneEqualTo(String value) {
            addCriterion("human_mobilephone =", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotEqualTo(String value) {
            addCriterion("human_mobilephone <>", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneGreaterThan(String value) {
            addCriterion("human_mobilephone >", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("human_mobilephone >=", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLessThan(String value) {
            addCriterion("human_mobilephone <", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("human_mobilephone <=", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneLike(String value) {
            addCriterion("human_mobilephone like", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotLike(String value) {
            addCriterion("human_mobilephone not like", value, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneIn(List<String> values) {
            addCriterion("human_mobilephone in", values, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotIn(List<String> values) {
            addCriterion("human_mobilephone not in", values, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneBetween(String value1, String value2) {
            addCriterion("human_mobilephone between", value1, value2, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanMobilephoneNotBetween(String value1, String value2) {
            addCriterion("human_mobilephone not between", value1, value2, "humanMobilephone");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIsNull() {
            addCriterion("human_email is null");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIsNotNull() {
            addCriterion("human_email is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEmailEqualTo(String value) {
            addCriterion("human_email =", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotEqualTo(String value) {
            addCriterion("human_email <>", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailGreaterThan(String value) {
            addCriterion("human_email >", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("human_email >=", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLessThan(String value) {
            addCriterion("human_email <", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLessThanOrEqualTo(String value) {
            addCriterion("human_email <=", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailLike(String value) {
            addCriterion("human_email like", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotLike(String value) {
            addCriterion("human_email not like", value, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailIn(List<String> values) {
            addCriterion("human_email in", values, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotIn(List<String> values) {
            addCriterion("human_email not in", values, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailBetween(String value1, String value2) {
            addCriterion("human_email between", value1, value2, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanEmailNotBetween(String value1, String value2) {
            addCriterion("human_email not between", value1, value2, "humanEmail");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIsNull() {
            addCriterion("human_hobby is null");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIsNotNull() {
            addCriterion("human_hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyEqualTo(String value) {
            addCriterion("human_hobby =", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotEqualTo(String value) {
            addCriterion("human_hobby <>", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyGreaterThan(String value) {
            addCriterion("human_hobby >", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("human_hobby >=", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLessThan(String value) {
            addCriterion("human_hobby <", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLessThanOrEqualTo(String value) {
            addCriterion("human_hobby <=", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyLike(String value) {
            addCriterion("human_hobby like", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotLike(String value) {
            addCriterion("human_hobby not like", value, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyIn(List<String> values) {
            addCriterion("human_hobby in", values, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotIn(List<String> values) {
            addCriterion("human_hobby not in", values, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyBetween(String value1, String value2) {
            addCriterion("human_hobby between", value1, value2, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanHobbyNotBetween(String value1, String value2) {
            addCriterion("human_hobby not between", value1, value2, "humanHobby");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityIsNull() {
            addCriterion("human_specility is null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityIsNotNull() {
            addCriterion("human_specility is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityEqualTo(String value) {
            addCriterion("human_specility =", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotEqualTo(String value) {
            addCriterion("human_specility <>", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityGreaterThan(String value) {
            addCriterion("human_specility >", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityGreaterThanOrEqualTo(String value) {
            addCriterion("human_specility >=", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLessThan(String value) {
            addCriterion("human_specility <", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLessThanOrEqualTo(String value) {
            addCriterion("human_specility <=", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityLike(String value) {
            addCriterion("human_specility like", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotLike(String value) {
            addCriterion("human_specility not like", value, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityIn(List<String> values) {
            addCriterion("human_specility in", values, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotIn(List<String> values) {
            addCriterion("human_specility not in", values, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityBetween(String value1, String value2) {
            addCriterion("human_specility between", value1, value2, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSpecilityNotBetween(String value1, String value2) {
            addCriterion("human_specility not between", value1, value2, "humanSpecility");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNull() {
            addCriterion("human_sex is null");
            return (Criteria) this;
        }

        public Criteria andHumanSexIsNotNull() {
            addCriterion("human_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHumanSexEqualTo(String value) {
            addCriterion("human_sex =", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotEqualTo(String value) {
            addCriterion("human_sex <>", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThan(String value) {
            addCriterion("human_sex >", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexGreaterThanOrEqualTo(String value) {
            addCriterion("human_sex >=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThan(String value) {
            addCriterion("human_sex <", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLessThanOrEqualTo(String value) {
            addCriterion("human_sex <=", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexLike(String value) {
            addCriterion("human_sex like", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotLike(String value) {
            addCriterion("human_sex not like", value, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexIn(List<String> values) {
            addCriterion("human_sex in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotIn(List<String> values) {
            addCriterion("human_sex not in", values, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexBetween(String value1, String value2) {
            addCriterion("human_sex between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanSexNotBetween(String value1, String value2) {
            addCriterion("human_sex not between", value1, value2, "humanSex");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIsNull() {
            addCriterion("human_religion is null");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIsNotNull() {
            addCriterion("human_religion is not null");
            return (Criteria) this;
        }

        public Criteria andHumanReligionEqualTo(String value) {
            addCriterion("human_religion =", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotEqualTo(String value) {
            addCriterion("human_religion <>", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionGreaterThan(String value) {
            addCriterion("human_religion >", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionGreaterThanOrEqualTo(String value) {
            addCriterion("human_religion >=", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLessThan(String value) {
            addCriterion("human_religion <", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLessThanOrEqualTo(String value) {
            addCriterion("human_religion <=", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionLike(String value) {
            addCriterion("human_religion like", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotLike(String value) {
            addCriterion("human_religion not like", value, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionIn(List<String> values) {
            addCriterion("human_religion in", values, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotIn(List<String> values) {
            addCriterion("human_religion not in", values, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionBetween(String value1, String value2) {
            addCriterion("human_religion between", value1, value2, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanReligionNotBetween(String value1, String value2) {
            addCriterion("human_religion not between", value1, value2, "humanReligion");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIsNull() {
            addCriterion("human_party is null");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIsNotNull() {
            addCriterion("human_party is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPartyEqualTo(String value) {
            addCriterion("human_party =", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotEqualTo(String value) {
            addCriterion("human_party <>", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyGreaterThan(String value) {
            addCriterion("human_party >", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyGreaterThanOrEqualTo(String value) {
            addCriterion("human_party >=", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLessThan(String value) {
            addCriterion("human_party <", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLessThanOrEqualTo(String value) {
            addCriterion("human_party <=", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyLike(String value) {
            addCriterion("human_party like", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotLike(String value) {
            addCriterion("human_party not like", value, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyIn(List<String> values) {
            addCriterion("human_party in", values, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotIn(List<String> values) {
            addCriterion("human_party not in", values, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyBetween(String value1, String value2) {
            addCriterion("human_party between", value1, value2, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanPartyNotBetween(String value1, String value2) {
            addCriterion("human_party not between", value1, value2, "humanParty");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIsNull() {
            addCriterion("human_nationality is null");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIsNotNull() {
            addCriterion("human_nationality is not null");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityEqualTo(String value) {
            addCriterion("human_nationality =", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotEqualTo(String value) {
            addCriterion("human_nationality <>", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityGreaterThan(String value) {
            addCriterion("human_nationality >", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityGreaterThanOrEqualTo(String value) {
            addCriterion("human_nationality >=", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLessThan(String value) {
            addCriterion("human_nationality <", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLessThanOrEqualTo(String value) {
            addCriterion("human_nationality <=", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityLike(String value) {
            addCriterion("human_nationality like", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotLike(String value) {
            addCriterion("human_nationality not like", value, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityIn(List<String> values) {
            addCriterion("human_nationality in", values, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotIn(List<String> values) {
            addCriterion("human_nationality not in", values, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityBetween(String value1, String value2) {
            addCriterion("human_nationality between", value1, value2, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanNationalityNotBetween(String value1, String value2) {
            addCriterion("human_nationality not between", value1, value2, "humanNationality");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIsNull() {
            addCriterion("human_race is null");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIsNotNull() {
            addCriterion("human_race is not null");
            return (Criteria) this;
        }

        public Criteria andHumanRaceEqualTo(String value) {
            addCriterion("human_race =", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotEqualTo(String value) {
            addCriterion("human_race <>", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceGreaterThan(String value) {
            addCriterion("human_race >", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceGreaterThanOrEqualTo(String value) {
            addCriterion("human_race >=", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLessThan(String value) {
            addCriterion("human_race <", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLessThanOrEqualTo(String value) {
            addCriterion("human_race <=", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceLike(String value) {
            addCriterion("human_race like", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotLike(String value) {
            addCriterion("human_race not like", value, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceIn(List<String> values) {
            addCriterion("human_race in", values, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotIn(List<String> values) {
            addCriterion("human_race not in", values, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceBetween(String value1, String value2) {
            addCriterion("human_race between", value1, value2, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanRaceNotBetween(String value1, String value2) {
            addCriterion("human_race not between", value1, value2, "humanRace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIsNull() {
            addCriterion("human_birthday is null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIsNotNull() {
            addCriterion("human_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayEqualTo(Date value) {
            addCriterion("human_birthday =", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotEqualTo(Date value) {
            addCriterion("human_birthday <>", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThan(Date value) {
            addCriterion("human_birthday >", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("human_birthday >=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThan(Date value) {
            addCriterion("human_birthday <", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("human_birthday <=", value, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayIn(List<Date> values) {
            addCriterion("human_birthday in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotIn(List<Date> values) {
            addCriterion("human_birthday not in", values, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayBetween(Date value1, Date value2) {
            addCriterion("human_birthday between", value1, value2, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("human_birthday not between", value1, value2, "humanBirthday");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNull() {
            addCriterion("human_age is null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIsNotNull() {
            addCriterion("human_age is not null");
            return (Criteria) this;
        }

        public Criteria andHumanAgeEqualTo(Short value) {
            addCriterion("human_age =", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotEqualTo(Short value) {
            addCriterion("human_age <>", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThan(Short value) {
            addCriterion("human_age >", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeGreaterThanOrEqualTo(Short value) {
            addCriterion("human_age >=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThan(Short value) {
            addCriterion("human_age <", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeLessThanOrEqualTo(Short value) {
            addCriterion("human_age <=", value, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeIn(List<Short> values) {
            addCriterion("human_age in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotIn(List<Short> values) {
            addCriterion("human_age not in", values, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeBetween(Short value1, Short value2) {
            addCriterion("human_age between", value1, value2, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanAgeNotBetween(Short value1, Short value2) {
            addCriterion("human_age not between", value1, value2, "humanAge");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIsNull() {
            addCriterion("human_educated_degree is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIsNotNull() {
            addCriterion("human_educated_degree is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeEqualTo(String value) {
            addCriterion("human_educated_degree =", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotEqualTo(String value) {
            addCriterion("human_educated_degree <>", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeGreaterThan(String value) {
            addCriterion("human_educated_degree >", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("human_educated_degree >=", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLessThan(String value) {
            addCriterion("human_educated_degree <", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLessThanOrEqualTo(String value) {
            addCriterion("human_educated_degree <=", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeLike(String value) {
            addCriterion("human_educated_degree like", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotLike(String value) {
            addCriterion("human_educated_degree not like", value, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeIn(List<String> values) {
            addCriterion("human_educated_degree in", values, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotIn(List<String> values) {
            addCriterion("human_educated_degree not in", values, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeBetween(String value1, String value2) {
            addCriterion("human_educated_degree between", value1, value2, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedDegreeNotBetween(String value1, String value2) {
            addCriterion("human_educated_degree not between", value1, value2, "humanEducatedDegree");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIsNull() {
            addCriterion("human_educated_years is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIsNotNull() {
            addCriterion("human_educated_years is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsEqualTo(Short value) {
            addCriterion("human_educated_years =", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotEqualTo(Short value) {
            addCriterion("human_educated_years <>", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsGreaterThan(Short value) {
            addCriterion("human_educated_years >", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsGreaterThanOrEqualTo(Short value) {
            addCriterion("human_educated_years >=", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsLessThan(Short value) {
            addCriterion("human_educated_years <", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsLessThanOrEqualTo(Short value) {
            addCriterion("human_educated_years <=", value, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsIn(List<Short> values) {
            addCriterion("human_educated_years in", values, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotIn(List<Short> values) {
            addCriterion("human_educated_years not in", values, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsBetween(Short value1, Short value2) {
            addCriterion("human_educated_years between", value1, value2, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedYearsNotBetween(Short value1, Short value2) {
            addCriterion("human_educated_years not between", value1, value2, "humanEducatedYears");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIsNull() {
            addCriterion("human_educated_major is null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIsNotNull() {
            addCriterion("human_educated_major is not null");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorEqualTo(String value) {
            addCriterion("human_educated_major =", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotEqualTo(String value) {
            addCriterion("human_educated_major <>", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorGreaterThan(String value) {
            addCriterion("human_educated_major >", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorGreaterThanOrEqualTo(String value) {
            addCriterion("human_educated_major >=", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLessThan(String value) {
            addCriterion("human_educated_major <", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLessThanOrEqualTo(String value) {
            addCriterion("human_educated_major <=", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorLike(String value) {
            addCriterion("human_educated_major like", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotLike(String value) {
            addCriterion("human_educated_major not like", value, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorIn(List<String> values) {
            addCriterion("human_educated_major in", values, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotIn(List<String> values) {
            addCriterion("human_educated_major not in", values, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorBetween(String value1, String value2) {
            addCriterion("human_educated_major between", value1, value2, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanEducatedMajorNotBetween(String value1, String value2) {
            addCriterion("human_educated_major not between", value1, value2, "humanEducatedMajor");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeIsNull() {
            addCriterion("human_college is null");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeIsNotNull() {
            addCriterion("human_college is not null");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeEqualTo(String value) {
            addCriterion("human_college =", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotEqualTo(String value) {
            addCriterion("human_college <>", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeGreaterThan(String value) {
            addCriterion("human_college >", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("human_college >=", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLessThan(String value) {
            addCriterion("human_college <", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLessThanOrEqualTo(String value) {
            addCriterion("human_college <=", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeLike(String value) {
            addCriterion("human_college like", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotLike(String value) {
            addCriterion("human_college not like", value, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeIn(List<String> values) {
            addCriterion("human_college in", values, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotIn(List<String> values) {
            addCriterion("human_college not in", values, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeBetween(String value1, String value2) {
            addCriterion("human_college between", value1, value2, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanCollegeNotBetween(String value1, String value2) {
            addCriterion("human_college not between", value1, value2, "humanCollege");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIsNull() {
            addCriterion("human_idcard is null");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIsNotNull() {
            addCriterion("human_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardEqualTo(String value) {
            addCriterion("human_idcard =", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotEqualTo(String value) {
            addCriterion("human_idcard <>", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardGreaterThan(String value) {
            addCriterion("human_idcard >", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("human_idcard >=", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLessThan(String value) {
            addCriterion("human_idcard <", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLessThanOrEqualTo(String value) {
            addCriterion("human_idcard <=", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardLike(String value) {
            addCriterion("human_idcard like", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotLike(String value) {
            addCriterion("human_idcard not like", value, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardIn(List<String> values) {
            addCriterion("human_idcard in", values, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotIn(List<String> values) {
            addCriterion("human_idcard not in", values, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardBetween(String value1, String value2) {
            addCriterion("human_idcard between", value1, value2, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanIdcardNotBetween(String value1, String value2) {
            addCriterion("human_idcard not between", value1, value2, "humanIdcard");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIsNull() {
            addCriterion("human_birthplace is null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIsNotNull() {
            addCriterion("human_birthplace is not null");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceEqualTo(String value) {
            addCriterion("human_birthplace =", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotEqualTo(String value) {
            addCriterion("human_birthplace <>", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceGreaterThan(String value) {
            addCriterion("human_birthplace >", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceGreaterThanOrEqualTo(String value) {
            addCriterion("human_birthplace >=", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLessThan(String value) {
            addCriterion("human_birthplace <", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLessThanOrEqualTo(String value) {
            addCriterion("human_birthplace <=", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceLike(String value) {
            addCriterion("human_birthplace like", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotLike(String value) {
            addCriterion("human_birthplace not like", value, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceIn(List<String> values) {
            addCriterion("human_birthplace in", values, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotIn(List<String> values) {
            addCriterion("human_birthplace not in", values, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceBetween(String value1, String value2) {
            addCriterion("human_birthplace between", value1, value2, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andHumanBirthplaceNotBetween(String value1, String value2) {
            addCriterion("human_birthplace not between", value1, value2, "humanBirthplace");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardIsNull() {
            addCriterion("demand_salary_standard is null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardIsNotNull() {
            addCriterion("demand_salary_standard is not null");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardEqualTo(BigDecimal value) {
            addCriterion("demand_salary_standard =", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotEqualTo(BigDecimal value) {
            addCriterion("demand_salary_standard <>", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardGreaterThan(BigDecimal value) {
            addCriterion("demand_salary_standard >", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_salary_standard >=", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardLessThan(BigDecimal value) {
            addCriterion("demand_salary_standard <", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("demand_salary_standard <=", value, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardIn(List<BigDecimal> values) {
            addCriterion("demand_salary_standard in", values, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotIn(List<BigDecimal> values) {
            addCriterion("demand_salary_standard not in", values, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_salary_standard between", value1, value2, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andDemandSalaryStandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("demand_salary_standard not between", value1, value2, "demandSalaryStandard");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIsNull() {
            addCriterion("human_picture is null");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIsNotNull() {
            addCriterion("human_picture is not null");
            return (Criteria) this;
        }

        public Criteria andHumanPictureEqualTo(String value) {
            addCriterion("human_picture =", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotEqualTo(String value) {
            addCriterion("human_picture <>", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureGreaterThan(String value) {
            addCriterion("human_picture >", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureGreaterThanOrEqualTo(String value) {
            addCriterion("human_picture >=", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLessThan(String value) {
            addCriterion("human_picture <", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLessThanOrEqualTo(String value) {
            addCriterion("human_picture <=", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureLike(String value) {
            addCriterion("human_picture like", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotLike(String value) {
            addCriterion("human_picture not like", value, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureIn(List<String> values) {
            addCriterion("human_picture in", values, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotIn(List<String> values) {
            addCriterion("human_picture not in", values, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureBetween(String value1, String value2) {
            addCriterion("human_picture between", value1, value2, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andHumanPictureNotBetween(String value1, String value2) {
            addCriterion("human_picture not between", value1, value2, "humanPicture");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNull() {
            addCriterion("attachment_name is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIsNotNull() {
            addCriterion("attachment_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameEqualTo(String value) {
            addCriterion("attachment_name =", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotEqualTo(String value) {
            addCriterion("attachment_name <>", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThan(String value) {
            addCriterion("attachment_name >", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_name >=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThan(String value) {
            addCriterion("attachment_name <", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLessThanOrEqualTo(String value) {
            addCriterion("attachment_name <=", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameLike(String value) {
            addCriterion("attachment_name like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotLike(String value) {
            addCriterion("attachment_name not like", value, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameIn(List<String> values) {
            addCriterion("attachment_name in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotIn(List<String> values) {
            addCriterion("attachment_name not in", values, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameBetween(String value1, String value2) {
            addCriterion("attachment_name between", value1, value2, "attachmentName");
            return (Criteria) this;
        }

        public Criteria andAttachmentNameNotBetween(String value1, String value2) {
            addCriterion("attachment_name not between", value1, value2, "attachmentName");
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

        public Criteria andInterviewStatusIsNull() {
            addCriterion("interview_status is null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIsNotNull() {
            addCriterion("interview_status is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusEqualTo(Short value) {
            addCriterion("interview_status =", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotEqualTo(Short value) {
            addCriterion("interview_status <>", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThan(Short value) {
            addCriterion("interview_status >", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("interview_status >=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThan(Short value) {
            addCriterion("interview_status <", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusLessThanOrEqualTo(Short value) {
            addCriterion("interview_status <=", value, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusIn(List<Short> values) {
            addCriterion("interview_status in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotIn(List<Short> values) {
            addCriterion("interview_status not in", values, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusBetween(Short value1, Short value2) {
            addCriterion("interview_status between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewStatusNotBetween(Short value1, Short value2) {
            addCriterion("interview_status not between", value1, value2, "interviewStatus");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountIsNull() {
            addCriterion("interview_amount is null");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountIsNotNull() {
            addCriterion("interview_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountEqualTo(Short value) {
            addCriterion("interview_amount =", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotEqualTo(Short value) {
            addCriterion("interview_amount <>", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountGreaterThan(Short value) {
            addCriterion("interview_amount >", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("interview_amount >=", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountLessThan(Short value) {
            addCriterion("interview_amount <", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountLessThanOrEqualTo(Short value) {
            addCriterion("interview_amount <=", value, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountIn(List<Short> values) {
            addCriterion("interview_amount in", values, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotIn(List<Short> values) {
            addCriterion("interview_amount not in", values, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountBetween(Short value1, Short value2) {
            addCriterion("interview_amount between", value1, value2, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andInterviewAmountNotBetween(Short value1, Short value2) {
            addCriterion("interview_amount not between", value1, value2, "interviewAmount");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIsNull() {
            addCriterion("total_points is null");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIsNotNull() {
            addCriterion("total_points is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPointsEqualTo(Double value) {
            addCriterion("total_points =", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotEqualTo(Double value) {
            addCriterion("total_points <>", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsGreaterThan(Double value) {
            addCriterion("total_points >", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsGreaterThanOrEqualTo(Double value) {
            addCriterion("total_points >=", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsLessThan(Double value) {
            addCriterion("total_points <", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsLessThanOrEqualTo(Double value) {
            addCriterion("total_points <=", value, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsIn(List<Double> values) {
            addCriterion("total_points in", values, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotIn(List<Double> values) {
            addCriterion("total_points not in", values, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsBetween(Double value1, Double value2) {
            addCriterion("total_points between", value1, value2, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTotalPointsNotBetween(Double value1, Double value2) {
            addCriterion("total_points not between", value1, value2, "totalPoints");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNull() {
            addCriterion("test_amount is null");
            return (Criteria) this;
        }

        public Criteria andTestAmountIsNotNull() {
            addCriterion("test_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTestAmountEqualTo(Short value) {
            addCriterion("test_amount =", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotEqualTo(Short value) {
            addCriterion("test_amount <>", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThan(Short value) {
            addCriterion("test_amount >", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountGreaterThanOrEqualTo(Short value) {
            addCriterion("test_amount >=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThan(Short value) {
            addCriterion("test_amount <", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountLessThanOrEqualTo(Short value) {
            addCriterion("test_amount <=", value, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountIn(List<Short> values) {
            addCriterion("test_amount in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotIn(List<Short> values) {
            addCriterion("test_amount not in", values, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountBetween(Short value1, Short value2) {
            addCriterion("test_amount between", value1, value2, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestAmountNotBetween(Short value1, Short value2) {
            addCriterion("test_amount not between", value1, value2, "testAmount");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIsNull() {
            addCriterion("test_checker is null");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIsNotNull() {
            addCriterion("test_checker is not null");
            return (Criteria) this;
        }

        public Criteria andTestCheckerEqualTo(String value) {
            addCriterion("test_checker =", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotEqualTo(String value) {
            addCriterion("test_checker <>", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerGreaterThan(String value) {
            addCriterion("test_checker >", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("test_checker >=", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLessThan(String value) {
            addCriterion("test_checker <", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLessThanOrEqualTo(String value) {
            addCriterion("test_checker <=", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerLike(String value) {
            addCriterion("test_checker like", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotLike(String value) {
            addCriterion("test_checker not like", value, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerIn(List<String> values) {
            addCriterion("test_checker in", values, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotIn(List<String> values) {
            addCriterion("test_checker not in", values, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerBetween(String value1, String value2) {
            addCriterion("test_checker between", value1, value2, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckerNotBetween(String value1, String value2) {
            addCriterion("test_checker not between", value1, value2, "testChecker");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIsNull() {
            addCriterion("test_check_time is null");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIsNotNull() {
            addCriterion("test_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeEqualTo(Date value) {
            addCriterion("test_check_time =", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotEqualTo(Date value) {
            addCriterion("test_check_time <>", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeGreaterThan(Date value) {
            addCriterion("test_check_time >", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("test_check_time >=", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeLessThan(Date value) {
            addCriterion("test_check_time <", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("test_check_time <=", value, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeIn(List<Date> values) {
            addCriterion("test_check_time in", values, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotIn(List<Date> values) {
            addCriterion("test_check_time not in", values, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeBetween(Date value1, Date value2) {
            addCriterion("test_check_time between", value1, value2, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andTestCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("test_check_time not between", value1, value2, "testCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIsNull() {
            addCriterion("pass_register is null");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIsNotNull() {
            addCriterion("pass_register is not null");
            return (Criteria) this;
        }

        public Criteria andPassRegisterEqualTo(String value) {
            addCriterion("pass_register =", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotEqualTo(String value) {
            addCriterion("pass_register <>", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterGreaterThan(String value) {
            addCriterion("pass_register >", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("pass_register >=", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLessThan(String value) {
            addCriterion("pass_register <", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLessThanOrEqualTo(String value) {
            addCriterion("pass_register <=", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterLike(String value) {
            addCriterion("pass_register like", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotLike(String value) {
            addCriterion("pass_register not like", value, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterIn(List<String> values) {
            addCriterion("pass_register in", values, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotIn(List<String> values) {
            addCriterion("pass_register not in", values, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterBetween(String value1, String value2) {
            addCriterion("pass_register between", value1, value2, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegisterNotBetween(String value1, String value2) {
            addCriterion("pass_register not between", value1, value2, "passRegister");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIsNull() {
            addCriterion("pass_regist_time is null");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIsNotNull() {
            addCriterion("pass_regist_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeEqualTo(Date value) {
            addCriterion("pass_regist_time =", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotEqualTo(Date value) {
            addCriterion("pass_regist_time <>", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeGreaterThan(Date value) {
            addCriterion("pass_regist_time >", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pass_regist_time >=", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeLessThan(Date value) {
            addCriterion("pass_regist_time <", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeLessThanOrEqualTo(Date value) {
            addCriterion("pass_regist_time <=", value, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeIn(List<Date> values) {
            addCriterion("pass_regist_time in", values, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotIn(List<Date> values) {
            addCriterion("pass_regist_time not in", values, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeBetween(Date value1, Date value2) {
            addCriterion("pass_regist_time between", value1, value2, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassRegistTimeNotBetween(Date value1, Date value2) {
            addCriterion("pass_regist_time not between", value1, value2, "passRegistTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIsNull() {
            addCriterion("pass_checker is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIsNotNull() {
            addCriterion("pass_checker is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckerEqualTo(String value) {
            addCriterion("pass_checker =", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotEqualTo(String value) {
            addCriterion("pass_checker <>", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerGreaterThan(String value) {
            addCriterion("pass_checker >", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("pass_checker >=", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLessThan(String value) {
            addCriterion("pass_checker <", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLessThanOrEqualTo(String value) {
            addCriterion("pass_checker <=", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerLike(String value) {
            addCriterion("pass_checker like", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotLike(String value) {
            addCriterion("pass_checker not like", value, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerIn(List<String> values) {
            addCriterion("pass_checker in", values, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotIn(List<String> values) {
            addCriterion("pass_checker not in", values, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerBetween(String value1, String value2) {
            addCriterion("pass_checker between", value1, value2, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckerNotBetween(String value1, String value2) {
            addCriterion("pass_checker not between", value1, value2, "passChecker");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIsNull() {
            addCriterion("pass_check_time is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIsNotNull() {
            addCriterion("pass_check_time is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeEqualTo(Date value) {
            addCriterion("pass_check_time =", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotEqualTo(Date value) {
            addCriterion("pass_check_time <>", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeGreaterThan(Date value) {
            addCriterion("pass_check_time >", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pass_check_time >=", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeLessThan(Date value) {
            addCriterion("pass_check_time <", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeLessThanOrEqualTo(Date value) {
            addCriterion("pass_check_time <=", value, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeIn(List<Date> values) {
            addCriterion("pass_check_time in", values, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotIn(List<Date> values) {
            addCriterion("pass_check_time not in", values, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeBetween(Date value1, Date value2) {
            addCriterion("pass_check_time between", value1, value2, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckTimeNotBetween(Date value1, Date value2) {
            addCriterion("pass_check_time not between", value1, value2, "passCheckTime");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIsNull() {
            addCriterion("pass_check_status is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIsNotNull() {
            addCriterion("pass_check_status is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusEqualTo(Short value) {
            addCriterion("pass_check_status =", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotEqualTo(Short value) {
            addCriterion("pass_check_status <>", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusGreaterThan(Short value) {
            addCriterion("pass_check_status >", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pass_check_status >=", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusLessThan(Short value) {
            addCriterion("pass_check_status <", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusLessThanOrEqualTo(Short value) {
            addCriterion("pass_check_status <=", value, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusIn(List<Short> values) {
            addCriterion("pass_check_status in", values, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotIn(List<Short> values) {
            addCriterion("pass_check_status not in", values, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusBetween(Short value1, Short value2) {
            addCriterion("pass_check_status between", value1, value2, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckStatusNotBetween(Short value1, Short value2) {
            addCriterion("pass_check_status not between", value1, value2, "passCheckStatus");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIsNull() {
            addCriterion("pass_checkComment is null");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIsNotNull() {
            addCriterion("pass_checkComment is not null");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentEqualTo(String value) {
            addCriterion("pass_checkComment =", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotEqualTo(String value) {
            addCriterion("pass_checkComment <>", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentGreaterThan(String value) {
            addCriterion("pass_checkComment >", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentGreaterThanOrEqualTo(String value) {
            addCriterion("pass_checkComment >=", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLessThan(String value) {
            addCriterion("pass_checkComment <", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLessThanOrEqualTo(String value) {
            addCriterion("pass_checkComment <=", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentLike(String value) {
            addCriterion("pass_checkComment like", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotLike(String value) {
            addCriterion("pass_checkComment not like", value, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentIn(List<String> values) {
            addCriterion("pass_checkComment in", values, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotIn(List<String> values) {
            addCriterion("pass_checkComment not in", values, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentBetween(String value1, String value2) {
            addCriterion("pass_checkComment between", value1, value2, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassCheckcommentNotBetween(String value1, String value2) {
            addCriterion("pass_checkComment not between", value1, value2, "passCheckcomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIsNull() {
            addCriterion("pass_passComment is null");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIsNotNull() {
            addCriterion("pass_passComment is not null");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentEqualTo(String value) {
            addCriterion("pass_passComment =", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotEqualTo(String value) {
            addCriterion("pass_passComment <>", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentGreaterThan(String value) {
            addCriterion("pass_passComment >", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentGreaterThanOrEqualTo(String value) {
            addCriterion("pass_passComment >=", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLessThan(String value) {
            addCriterion("pass_passComment <", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLessThanOrEqualTo(String value) {
            addCriterion("pass_passComment <=", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentLike(String value) {
            addCriterion("pass_passComment like", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotLike(String value) {
            addCriterion("pass_passComment not like", value, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentIn(List<String> values) {
            addCriterion("pass_passComment in", values, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotIn(List<String> values) {
            addCriterion("pass_passComment not in", values, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentBetween(String value1, String value2) {
            addCriterion("pass_passComment between", value1, value2, "passPasscomment");
            return (Criteria) this;
        }

        public Criteria andPassPasscommentNotBetween(String value1, String value2) {
            addCriterion("pass_passComment not between", value1, value2, "passPasscomment");
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
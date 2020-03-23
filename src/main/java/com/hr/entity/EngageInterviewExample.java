package com.hr.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EngageInterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EngageInterviewExample() {
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

        public Criteria andEinIdIsNull() {
            addCriterion("ein_id is null");
            return (Criteria) this;
        }

        public Criteria andEinIdIsNotNull() {
            addCriterion("ein_id is not null");
            return (Criteria) this;
        }

        public Criteria andEinIdEqualTo(Short value) {
            addCriterion("ein_id =", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdNotEqualTo(Short value) {
            addCriterion("ein_id <>", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdGreaterThan(Short value) {
            addCriterion("ein_id >", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdGreaterThanOrEqualTo(Short value) {
            addCriterion("ein_id >=", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdLessThan(Short value) {
            addCriterion("ein_id <", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdLessThanOrEqualTo(Short value) {
            addCriterion("ein_id <=", value, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdIn(List<Short> values) {
            addCriterion("ein_id in", values, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdNotIn(List<Short> values) {
            addCriterion("ein_id not in", values, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdBetween(Short value1, Short value2) {
            addCriterion("ein_id between", value1, value2, "einId");
            return (Criteria) this;
        }

        public Criteria andEinIdNotBetween(Short value1, Short value2) {
            addCriterion("ein_id not between", value1, value2, "einId");
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

        public Criteria andImageDegreeIsNull() {
            addCriterion("image_degree is null");
            return (Criteria) this;
        }

        public Criteria andImageDegreeIsNotNull() {
            addCriterion("image_degree is not null");
            return (Criteria) this;
        }

        public Criteria andImageDegreeEqualTo(String value) {
            addCriterion("image_degree =", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotEqualTo(String value) {
            addCriterion("image_degree <>", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeGreaterThan(String value) {
            addCriterion("image_degree >", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("image_degree >=", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLessThan(String value) {
            addCriterion("image_degree <", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLessThanOrEqualTo(String value) {
            addCriterion("image_degree <=", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeLike(String value) {
            addCriterion("image_degree like", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotLike(String value) {
            addCriterion("image_degree not like", value, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeIn(List<String> values) {
            addCriterion("image_degree in", values, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotIn(List<String> values) {
            addCriterion("image_degree not in", values, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeBetween(String value1, String value2) {
            addCriterion("image_degree between", value1, value2, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andImageDegreeNotBetween(String value1, String value2) {
            addCriterion("image_degree not between", value1, value2, "imageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIsNull() {
            addCriterion("native_language_degree is null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIsNotNull() {
            addCriterion("native_language_degree is not null");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeEqualTo(String value) {
            addCriterion("native_language_degree =", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotEqualTo(String value) {
            addCriterion("native_language_degree <>", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeGreaterThan(String value) {
            addCriterion("native_language_degree >", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("native_language_degree >=", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLessThan(String value) {
            addCriterion("native_language_degree <", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLessThanOrEqualTo(String value) {
            addCriterion("native_language_degree <=", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeLike(String value) {
            addCriterion("native_language_degree like", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotLike(String value) {
            addCriterion("native_language_degree not like", value, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeIn(List<String> values) {
            addCriterion("native_language_degree in", values, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotIn(List<String> values) {
            addCriterion("native_language_degree not in", values, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeBetween(String value1, String value2) {
            addCriterion("native_language_degree between", value1, value2, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andNativeLanguageDegreeNotBetween(String value1, String value2) {
            addCriterion("native_language_degree not between", value1, value2, "nativeLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIsNull() {
            addCriterion("foreign_language_degree is null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIsNotNull() {
            addCriterion("foreign_language_degree is not null");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeEqualTo(String value) {
            addCriterion("foreign_language_degree =", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotEqualTo(String value) {
            addCriterion("foreign_language_degree <>", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeGreaterThan(String value) {
            addCriterion("foreign_language_degree >", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("foreign_language_degree >=", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLessThan(String value) {
            addCriterion("foreign_language_degree <", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLessThanOrEqualTo(String value) {
            addCriterion("foreign_language_degree <=", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeLike(String value) {
            addCriterion("foreign_language_degree like", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotLike(String value) {
            addCriterion("foreign_language_degree not like", value, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeIn(List<String> values) {
            addCriterion("foreign_language_degree in", values, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotIn(List<String> values) {
            addCriterion("foreign_language_degree not in", values, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeBetween(String value1, String value2) {
            addCriterion("foreign_language_degree between", value1, value2, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andForeignLanguageDegreeNotBetween(String value1, String value2) {
            addCriterion("foreign_language_degree not between", value1, value2, "foreignLanguageDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIsNull() {
            addCriterion("response_speed_degree is null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIsNotNull() {
            addCriterion("response_speed_degree is not null");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeEqualTo(String value) {
            addCriterion("response_speed_degree =", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotEqualTo(String value) {
            addCriterion("response_speed_degree <>", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeGreaterThan(String value) {
            addCriterion("response_speed_degree >", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("response_speed_degree >=", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLessThan(String value) {
            addCriterion("response_speed_degree <", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLessThanOrEqualTo(String value) {
            addCriterion("response_speed_degree <=", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeLike(String value) {
            addCriterion("response_speed_degree like", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotLike(String value) {
            addCriterion("response_speed_degree not like", value, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeIn(List<String> values) {
            addCriterion("response_speed_degree in", values, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotIn(List<String> values) {
            addCriterion("response_speed_degree not in", values, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeBetween(String value1, String value2) {
            addCriterion("response_speed_degree between", value1, value2, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andResponseSpeedDegreeNotBetween(String value1, String value2) {
            addCriterion("response_speed_degree not between", value1, value2, "responseSpeedDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIsNull() {
            addCriterion("EQ_degree is null");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIsNotNull() {
            addCriterion("EQ_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEqDegreeEqualTo(String value) {
            addCriterion("EQ_degree =", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotEqualTo(String value) {
            addCriterion("EQ_degree <>", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeGreaterThan(String value) {
            addCriterion("EQ_degree >", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("EQ_degree >=", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLessThan(String value) {
            addCriterion("EQ_degree <", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLessThanOrEqualTo(String value) {
            addCriterion("EQ_degree <=", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeLike(String value) {
            addCriterion("EQ_degree like", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotLike(String value) {
            addCriterion("EQ_degree not like", value, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeIn(List<String> values) {
            addCriterion("EQ_degree in", values, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotIn(List<String> values) {
            addCriterion("EQ_degree not in", values, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeBetween(String value1, String value2) {
            addCriterion("EQ_degree between", value1, value2, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andEqDegreeNotBetween(String value1, String value2) {
            addCriterion("EQ_degree not between", value1, value2, "eqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIsNull() {
            addCriterion("IQ_degree is null");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIsNotNull() {
            addCriterion("IQ_degree is not null");
            return (Criteria) this;
        }

        public Criteria andIqDegreeEqualTo(String value) {
            addCriterion("IQ_degree =", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotEqualTo(String value) {
            addCriterion("IQ_degree <>", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeGreaterThan(String value) {
            addCriterion("IQ_degree >", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("IQ_degree >=", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLessThan(String value) {
            addCriterion("IQ_degree <", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLessThanOrEqualTo(String value) {
            addCriterion("IQ_degree <=", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeLike(String value) {
            addCriterion("IQ_degree like", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotLike(String value) {
            addCriterion("IQ_degree not like", value, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeIn(List<String> values) {
            addCriterion("IQ_degree in", values, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotIn(List<String> values) {
            addCriterion("IQ_degree not in", values, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeBetween(String value1, String value2) {
            addCriterion("IQ_degree between", value1, value2, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andIqDegreeNotBetween(String value1, String value2) {
            addCriterion("IQ_degree not between", value1, value2, "iqDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIsNull() {
            addCriterion("multi_quality_degree is null");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIsNotNull() {
            addCriterion("multi_quality_degree is not null");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeEqualTo(String value) {
            addCriterion("multi_quality_degree =", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotEqualTo(String value) {
            addCriterion("multi_quality_degree <>", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeGreaterThan(String value) {
            addCriterion("multi_quality_degree >", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("multi_quality_degree >=", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLessThan(String value) {
            addCriterion("multi_quality_degree <", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLessThanOrEqualTo(String value) {
            addCriterion("multi_quality_degree <=", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeLike(String value) {
            addCriterion("multi_quality_degree like", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotLike(String value) {
            addCriterion("multi_quality_degree not like", value, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeIn(List<String> values) {
            addCriterion("multi_quality_degree in", values, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotIn(List<String> values) {
            addCriterion("multi_quality_degree not in", values, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeBetween(String value1, String value2) {
            addCriterion("multi_quality_degree between", value1, value2, "multiQualityDegree");
            return (Criteria) this;
        }

        public Criteria andMultiQualityDegreeNotBetween(String value1, String value2) {
            addCriterion("multi_quality_degree not between", value1, value2, "multiQualityDegree");
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

        public Criteria andRegisteTimeIsNull() {
            addCriterion("registe_time is null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIsNotNull() {
            addCriterion("registe_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeEqualTo(Date value) {
            addCriterion("registe_time =", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotEqualTo(Date value) {
            addCriterion("registe_time <>", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThan(Date value) {
            addCriterion("registe_time >", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registe_time >=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThan(Date value) {
            addCriterion("registe_time <", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeLessThanOrEqualTo(Date value) {
            addCriterion("registe_time <=", value, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeIn(List<Date> values) {
            addCriterion("registe_time in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotIn(List<Date> values) {
            addCriterion("registe_time not in", values, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeBetween(Date value1, Date value2) {
            addCriterion("registe_time between", value1, value2, "registeTime");
            return (Criteria) this;
        }

        public Criteria andRegisteTimeNotBetween(Date value1, Date value2) {
            addCriterion("registe_time not between", value1, value2, "registeTime");
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

        public Criteria andResumeIdIsNull() {
            addCriterion("resume_id is null");
            return (Criteria) this;
        }

        public Criteria andResumeIdIsNotNull() {
            addCriterion("resume_id is not null");
            return (Criteria) this;
        }

        public Criteria andResumeIdEqualTo(Short value) {
            addCriterion("resume_id =", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotEqualTo(Short value) {
            addCriterion("resume_id <>", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThan(Short value) {
            addCriterion("resume_id >", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdGreaterThanOrEqualTo(Short value) {
            addCriterion("resume_id >=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThan(Short value) {
            addCriterion("resume_id <", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdLessThanOrEqualTo(Short value) {
            addCriterion("resume_id <=", value, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdIn(List<Short> values) {
            addCriterion("resume_id in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotIn(List<Short> values) {
            addCriterion("resume_id not in", values, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdBetween(Short value1, Short value2) {
            addCriterion("resume_id between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResumeIdNotBetween(Short value1, Short value2) {
            addCriterion("resume_id not between", value1, value2, "resumeId");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
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
package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChapterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChapterExample() {
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

        public Criteria andChapter_idIsNull() {
            addCriterion("chapter_id is null");
            return (Criteria) this;
        }

        public Criteria andChapter_idIsNotNull() {
            addCriterion("chapter_id is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_idEqualTo(Integer value) {
            addCriterion("chapter_id =", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idNotEqualTo(Integer value) {
            addCriterion("chapter_id <>", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idGreaterThan(Integer value) {
            addCriterion("chapter_id >", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_id >=", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idLessThan(Integer value) {
            addCriterion("chapter_id <", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_id <=", value, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idIn(List<Integer> values) {
            addCriterion("chapter_id in", values, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idNotIn(List<Integer> values) {
            addCriterion("chapter_id not in", values, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id between", value1, value2, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andChapter_idNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_id not between", value1, value2, "chapter_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idIsNull() {
            addCriterion("fiction_id is null");
            return (Criteria) this;
        }

        public Criteria andFiction_idIsNotNull() {
            addCriterion("fiction_id is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_idEqualTo(Integer value) {
            addCriterion("fiction_id =", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idNotEqualTo(Integer value) {
            addCriterion("fiction_id <>", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idGreaterThan(Integer value) {
            addCriterion("fiction_id >", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiction_id >=", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idLessThan(Integer value) {
            addCriterion("fiction_id <", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idLessThanOrEqualTo(Integer value) {
            addCriterion("fiction_id <=", value, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idIn(List<Integer> values) {
            addCriterion("fiction_id in", values, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idNotIn(List<Integer> values) {
            addCriterion("fiction_id not in", values, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idBetween(Integer value1, Integer value2) {
            addCriterion("fiction_id between", value1, value2, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andFiction_idNotBetween(Integer value1, Integer value2) {
            addCriterion("fiction_id not between", value1, value2, "fiction_id");
            return (Criteria) this;
        }

        public Criteria andChapter_numberIsNull() {
            addCriterion("chapter_number is null");
            return (Criteria) this;
        }

        public Criteria andChapter_numberIsNotNull() {
            addCriterion("chapter_number is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_numberEqualTo(Integer value) {
            addCriterion("chapter_number =", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberNotEqualTo(Integer value) {
            addCriterion("chapter_number <>", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberGreaterThan(Integer value) {
            addCriterion("chapter_number >", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_number >=", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberLessThan(Integer value) {
            addCriterion("chapter_number <", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_number <=", value, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberIn(List<Integer> values) {
            addCriterion("chapter_number in", values, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberNotIn(List<Integer> values) {
            addCriterion("chapter_number not in", values, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberBetween(Integer value1, Integer value2) {
            addCriterion("chapter_number between", value1, value2, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_number not between", value1, value2, "chapter_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberIsNull() {
            addCriterion("chapter_word_number is null");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberIsNotNull() {
            addCriterion("chapter_word_number is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberEqualTo(Integer value) {
            addCriterion("chapter_word_number =", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberNotEqualTo(Integer value) {
            addCriterion("chapter_word_number <>", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberGreaterThan(Integer value) {
            addCriterion("chapter_word_number >", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_word_number >=", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberLessThan(Integer value) {
            addCriterion("chapter_word_number <", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_word_number <=", value, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberIn(List<Integer> values) {
            addCriterion("chapter_word_number in", values, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberNotIn(List<Integer> values) {
            addCriterion("chapter_word_number not in", values, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberBetween(Integer value1, Integer value2) {
            addCriterion("chapter_word_number between", value1, value2, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_word_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_word_number not between", value1, value2, "chapter_word_number");
            return (Criteria) this;
        }

        public Criteria andChapter_titleIsNull() {
            addCriterion("chapter_title is null");
            return (Criteria) this;
        }

        public Criteria andChapter_titleIsNotNull() {
            addCriterion("chapter_title is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_titleEqualTo(String value) {
            addCriterion("chapter_title =", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleNotEqualTo(String value) {
            addCriterion("chapter_title <>", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleGreaterThan(String value) {
            addCriterion("chapter_title >", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleGreaterThanOrEqualTo(String value) {
            addCriterion("chapter_title >=", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleLessThan(String value) {
            addCriterion("chapter_title <", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleLessThanOrEqualTo(String value) {
            addCriterion("chapter_title <=", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleLike(String value) {
            addCriterion("chapter_title like", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleNotLike(String value) {
            addCriterion("chapter_title not like", value, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleIn(List<String> values) {
            addCriterion("chapter_title in", values, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleNotIn(List<String> values) {
            addCriterion("chapter_title not in", values, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleBetween(String value1, String value2) {
            addCriterion("chapter_title between", value1, value2, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_titleNotBetween(String value1, String value2) {
            addCriterion("chapter_title not between", value1, value2, "chapter_title");
            return (Criteria) this;
        }

        public Criteria andChapter_stateIsNull() {
            addCriterion("chapter_state is null");
            return (Criteria) this;
        }

        public Criteria andChapter_stateIsNotNull() {
            addCriterion("chapter_state is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_stateEqualTo(Integer value) {
            addCriterion("chapter_state =", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateNotEqualTo(Integer value) {
            addCriterion("chapter_state <>", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateGreaterThan(Integer value) {
            addCriterion("chapter_state >", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("chapter_state >=", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateLessThan(Integer value) {
            addCriterion("chapter_state <", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateLessThanOrEqualTo(Integer value) {
            addCriterion("chapter_state <=", value, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateIn(List<Integer> values) {
            addCriterion("chapter_state in", values, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateNotIn(List<Integer> values) {
            addCriterion("chapter_state not in", values, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateBetween(Integer value1, Integer value2) {
            addCriterion("chapter_state between", value1, value2, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("chapter_state not between", value1, value2, "chapter_state");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeIsNull() {
            addCriterion("chapter_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeIsNotNull() {
            addCriterion("chapter_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeEqualTo(Date value) {
            addCriterion("chapter_edit_time =", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeNotEqualTo(Date value) {
            addCriterion("chapter_edit_time <>", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeGreaterThan(Date value) {
            addCriterion("chapter_edit_time >", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("chapter_edit_time >=", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeLessThan(Date value) {
            addCriterion("chapter_edit_time <", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeLessThanOrEqualTo(Date value) {
            addCriterion("chapter_edit_time <=", value, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeIn(List<Date> values) {
            addCriterion("chapter_edit_time in", values, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeNotIn(List<Date> values) {
            addCriterion("chapter_edit_time not in", values, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeBetween(Date value1, Date value2) {
            addCriterion("chapter_edit_time between", value1, value2, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_edit_timeNotBetween(Date value1, Date value2) {
            addCriterion("chapter_edit_time not between", value1, value2, "chapter_edit_time");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateIsNull() {
            addCriterion("chapter_pay_state is null");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateIsNotNull() {
            addCriterion("chapter_pay_state is not null");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateEqualTo(Byte value) {
            addCriterion("chapter_pay_state =", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateNotEqualTo(Byte value) {
            addCriterion("chapter_pay_state <>", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateGreaterThan(Byte value) {
            addCriterion("chapter_pay_state >", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateGreaterThanOrEqualTo(Byte value) {
            addCriterion("chapter_pay_state >=", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateLessThan(Byte value) {
            addCriterion("chapter_pay_state <", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateLessThanOrEqualTo(Byte value) {
            addCriterion("chapter_pay_state <=", value, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateIn(List<Byte> values) {
            addCriterion("chapter_pay_state in", values, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateNotIn(List<Byte> values) {
            addCriterion("chapter_pay_state not in", values, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateBetween(Byte value1, Byte value2) {
            addCriterion("chapter_pay_state between", value1, value2, "chapter_pay_state");
            return (Criteria) this;
        }

        public Criteria andChapter_pay_stateNotBetween(Byte value1, Byte value2) {
            addCriterion("chapter_pay_state not between", value1, value2, "chapter_pay_state");
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
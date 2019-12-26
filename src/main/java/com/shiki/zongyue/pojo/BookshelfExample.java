package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookshelfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookshelfExample() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
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

        public Criteria andUser_last_read_timeIsNull() {
            addCriterion("user_last_read_time is null");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeIsNotNull() {
            addCriterion("user_last_read_time is not null");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeEqualTo(Date value) {
            addCriterion("user_last_read_time =", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeNotEqualTo(Date value) {
            addCriterion("user_last_read_time <>", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeGreaterThan(Date value) {
            addCriterion("user_last_read_time >", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_read_time >=", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeLessThan(Date value) {
            addCriterion("user_last_read_time <", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_read_time <=", value, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeIn(List<Date> values) {
            addCriterion("user_last_read_time in", values, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeNotIn(List<Date> values) {
            addCriterion("user_last_read_time not in", values, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeBetween(Date value1, Date value2) {
            addCriterion("user_last_read_time between", value1, value2, "user_last_read_time");
            return (Criteria) this;
        }

        public Criteria andUser_last_read_timeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_read_time not between", value1, value2, "user_last_read_time");
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
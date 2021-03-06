package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.List;

public class GenreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GenreExample() {
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

        public Criteria andGenre_idIsNull() {
            addCriterion("genre_id is null");
            return (Criteria) this;
        }

        public Criteria andGenre_idIsNotNull() {
            addCriterion("genre_id is not null");
            return (Criteria) this;
        }

        public Criteria andGenre_idEqualTo(Integer value) {
            addCriterion("genre_id =", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idNotEqualTo(Integer value) {
            addCriterion("genre_id <>", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idGreaterThan(Integer value) {
            addCriterion("genre_id >", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("genre_id >=", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idLessThan(Integer value) {
            addCriterion("genre_id <", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idLessThanOrEqualTo(Integer value) {
            addCriterion("genre_id <=", value, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idIn(List<Integer> values) {
            addCriterion("genre_id in", values, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idNotIn(List<Integer> values) {
            addCriterion("genre_id not in", values, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idBetween(Integer value1, Integer value2) {
            addCriterion("genre_id between", value1, value2, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_idNotBetween(Integer value1, Integer value2) {
            addCriterion("genre_id not between", value1, value2, "genre_id");
            return (Criteria) this;
        }

        public Criteria andGenre_nameIsNull() {
            addCriterion("genre_name is null");
            return (Criteria) this;
        }

        public Criteria andGenre_nameIsNotNull() {
            addCriterion("genre_name is not null");
            return (Criteria) this;
        }

        public Criteria andGenre_nameEqualTo(String value) {
            addCriterion("genre_name =", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameNotEqualTo(String value) {
            addCriterion("genre_name <>", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameGreaterThan(String value) {
            addCriterion("genre_name >", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameGreaterThanOrEqualTo(String value) {
            addCriterion("genre_name >=", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameLessThan(String value) {
            addCriterion("genre_name <", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameLessThanOrEqualTo(String value) {
            addCriterion("genre_name <=", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameLike(String value) {
            addCriterion("genre_name like", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameNotLike(String value) {
            addCriterion("genre_name not like", value, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameIn(List<String> values) {
            addCriterion("genre_name in", values, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameNotIn(List<String> values) {
            addCriterion("genre_name not in", values, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameBetween(String value1, String value2) {
            addCriterion("genre_name between", value1, value2, "genre_name");
            return (Criteria) this;
        }

        public Criteria andGenre_nameNotBetween(String value1, String value2) {
            addCriterion("genre_name not between", value1, value2, "genre_name");
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
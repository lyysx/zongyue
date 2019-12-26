package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.List;

public class FictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FictionExample() {
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

        public Criteria andFiction_imageIsNull() {
            addCriterion("fiction_image is null");
            return (Criteria) this;
        }

        public Criteria andFiction_imageIsNotNull() {
            addCriterion("fiction_image is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_imageEqualTo(String value) {
            addCriterion("fiction_image =", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageNotEqualTo(String value) {
            addCriterion("fiction_image <>", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageGreaterThan(String value) {
            addCriterion("fiction_image >", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageGreaterThanOrEqualTo(String value) {
            addCriterion("fiction_image >=", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageLessThan(String value) {
            addCriterion("fiction_image <", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageLessThanOrEqualTo(String value) {
            addCriterion("fiction_image <=", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageLike(String value) {
            addCriterion("fiction_image like", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageNotLike(String value) {
            addCriterion("fiction_image not like", value, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageIn(List<String> values) {
            addCriterion("fiction_image in", values, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageNotIn(List<String> values) {
            addCriterion("fiction_image not in", values, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageBetween(String value1, String value2) {
            addCriterion("fiction_image between", value1, value2, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_imageNotBetween(String value1, String value2) {
            addCriterion("fiction_image not between", value1, value2, "fiction_image");
            return (Criteria) this;
        }

        public Criteria andFiction_nameIsNull() {
            addCriterion("fiction_name is null");
            return (Criteria) this;
        }

        public Criteria andFiction_nameIsNotNull() {
            addCriterion("fiction_name is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_nameEqualTo(String value) {
            addCriterion("fiction_name =", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameNotEqualTo(String value) {
            addCriterion("fiction_name <>", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameGreaterThan(String value) {
            addCriterion("fiction_name >", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameGreaterThanOrEqualTo(String value) {
            addCriterion("fiction_name >=", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameLessThan(String value) {
            addCriterion("fiction_name <", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameLessThanOrEqualTo(String value) {
            addCriterion("fiction_name <=", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameLike(String value) {
            addCriterion("fiction_name like", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameNotLike(String value) {
            addCriterion("fiction_name not like", value, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameIn(List<String> values) {
            addCriterion("fiction_name in", values, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameNotIn(List<String> values) {
            addCriterion("fiction_name not in", values, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameBetween(String value1, String value2) {
            addCriterion("fiction_name between", value1, value2, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_nameNotBetween(String value1, String value2) {
            addCriterion("fiction_name not between", value1, value2, "fiction_name");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisIsNull() {
            addCriterion("fiction_synopsis is null");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisIsNotNull() {
            addCriterion("fiction_synopsis is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisEqualTo(String value) {
            addCriterion("fiction_synopsis =", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisNotEqualTo(String value) {
            addCriterion("fiction_synopsis <>", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisGreaterThan(String value) {
            addCriterion("fiction_synopsis >", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisGreaterThanOrEqualTo(String value) {
            addCriterion("fiction_synopsis >=", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisLessThan(String value) {
            addCriterion("fiction_synopsis <", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisLessThanOrEqualTo(String value) {
            addCriterion("fiction_synopsis <=", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisLike(String value) {
            addCriterion("fiction_synopsis like", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisNotLike(String value) {
            addCriterion("fiction_synopsis not like", value, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisIn(List<String> values) {
            addCriterion("fiction_synopsis in", values, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisNotIn(List<String> values) {
            addCriterion("fiction_synopsis not in", values, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisBetween(String value1, String value2) {
            addCriterion("fiction_synopsis between", value1, value2, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_synopsisNotBetween(String value1, String value2) {
            addCriterion("fiction_synopsis not between", value1, value2, "fiction_synopsis");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendIsNull() {
            addCriterion("fiction_recommend is null");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendIsNotNull() {
            addCriterion("fiction_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendEqualTo(Integer value) {
            addCriterion("fiction_recommend =", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendNotEqualTo(Integer value) {
            addCriterion("fiction_recommend <>", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendGreaterThan(Integer value) {
            addCriterion("fiction_recommend >", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiction_recommend >=", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendLessThan(Integer value) {
            addCriterion("fiction_recommend <", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendLessThanOrEqualTo(Integer value) {
            addCriterion("fiction_recommend <=", value, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendIn(List<Integer> values) {
            addCriterion("fiction_recommend in", values, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendNotIn(List<Integer> values) {
            addCriterion("fiction_recommend not in", values, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendBetween(Integer value1, Integer value2) {
            addCriterion("fiction_recommend between", value1, value2, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_recommendNotBetween(Integer value1, Integer value2) {
            addCriterion("fiction_recommend not between", value1, value2, "fiction_recommend");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberIsNull() {
            addCriterion("fiction_word_number is null");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberIsNotNull() {
            addCriterion("fiction_word_number is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberEqualTo(Integer value) {
            addCriterion("fiction_word_number =", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberNotEqualTo(Integer value) {
            addCriterion("fiction_word_number <>", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberGreaterThan(Integer value) {
            addCriterion("fiction_word_number >", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiction_word_number >=", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberLessThan(Integer value) {
            addCriterion("fiction_word_number <", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberLessThanOrEqualTo(Integer value) {
            addCriterion("fiction_word_number <=", value, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberIn(List<Integer> values) {
            addCriterion("fiction_word_number in", values, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberNotIn(List<Integer> values) {
            addCriterion("fiction_word_number not in", values, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberBetween(Integer value1, Integer value2) {
            addCriterion("fiction_word_number between", value1, value2, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andFiction_word_numberNotBetween(Integer value1, Integer value2) {
            addCriterion("fiction_word_number not between", value1, value2, "fiction_word_number");
            return (Criteria) this;
        }

        public Criteria andAuthor_idIsNull() {
            addCriterion("author_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_idIsNotNull() {
            addCriterion("author_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_idEqualTo(Integer value) {
            addCriterion("author_id =", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idNotEqualTo(Integer value) {
            addCriterion("author_id <>", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idGreaterThan(Integer value) {
            addCriterion("author_id >", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("author_id >=", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idLessThan(Integer value) {
            addCriterion("author_id <", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idLessThanOrEqualTo(Integer value) {
            addCriterion("author_id <=", value, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idIn(List<Integer> values) {
            addCriterion("author_id in", values, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idNotIn(List<Integer> values) {
            addCriterion("author_id not in", values, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idBetween(Integer value1, Integer value2) {
            addCriterion("author_id between", value1, value2, "author_id");
            return (Criteria) this;
        }

        public Criteria andAuthor_idNotBetween(Integer value1, Integer value2) {
            addCriterion("author_id not between", value1, value2, "author_id");
            return (Criteria) this;
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

        public Criteria andFiction_stateIsNull() {
            addCriterion("fiction_state is null");
            return (Criteria) this;
        }

        public Criteria andFiction_stateIsNotNull() {
            addCriterion("fiction_state is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_stateEqualTo(Integer value) {
            addCriterion("fiction_state =", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateNotEqualTo(Integer value) {
            addCriterion("fiction_state <>", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateGreaterThan(Integer value) {
            addCriterion("fiction_state >", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiction_state >=", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateLessThan(Integer value) {
            addCriterion("fiction_state <", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateLessThanOrEqualTo(Integer value) {
            addCriterion("fiction_state <=", value, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateIn(List<Integer> values) {
            addCriterion("fiction_state in", values, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateNotIn(List<Integer> values) {
            addCriterion("fiction_state not in", values, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateBetween(Integer value1, Integer value2) {
            addCriterion("fiction_state between", value1, value2, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("fiction_state not between", value1, value2, "fiction_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateIsNull() {
            addCriterion("fiction_writing_state is null");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateIsNotNull() {
            addCriterion("fiction_writing_state is not null");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateEqualTo(Integer value) {
            addCriterion("fiction_writing_state =", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateNotEqualTo(Integer value) {
            addCriterion("fiction_writing_state <>", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateGreaterThan(Integer value) {
            addCriterion("fiction_writing_state >", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("fiction_writing_state >=", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateLessThan(Integer value) {
            addCriterion("fiction_writing_state <", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateLessThanOrEqualTo(Integer value) {
            addCriterion("fiction_writing_state <=", value, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateIn(List<Integer> values) {
            addCriterion("fiction_writing_state in", values, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateNotIn(List<Integer> values) {
            addCriterion("fiction_writing_state not in", values, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateBetween(Integer value1, Integer value2) {
            addCriterion("fiction_writing_state between", value1, value2, "fiction_writing_state");
            return (Criteria) this;
        }

        public Criteria andFiction_writing_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("fiction_writing_state not between", value1, value2, "fiction_writing_state");
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
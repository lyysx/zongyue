package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(Integer value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(Integer value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(Integer value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(Integer value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(Integer value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<Integer> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<Integer> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(Integer value1, Integer value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
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

        public Criteria andComment_titleIsNull() {
            addCriterion("comment_title is null");
            return (Criteria) this;
        }

        public Criteria andComment_titleIsNotNull() {
            addCriterion("comment_title is not null");
            return (Criteria) this;
        }

        public Criteria andComment_titleEqualTo(String value) {
            addCriterion("comment_title =", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleNotEqualTo(String value) {
            addCriterion("comment_title <>", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleGreaterThan(String value) {
            addCriterion("comment_title >", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleGreaterThanOrEqualTo(String value) {
            addCriterion("comment_title >=", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleLessThan(String value) {
            addCriterion("comment_title <", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleLessThanOrEqualTo(String value) {
            addCriterion("comment_title <=", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleLike(String value) {
            addCriterion("comment_title like", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleNotLike(String value) {
            addCriterion("comment_title not like", value, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleIn(List<String> values) {
            addCriterion("comment_title in", values, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleNotIn(List<String> values) {
            addCriterion("comment_title not in", values, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleBetween(String value1, String value2) {
            addCriterion("comment_title between", value1, value2, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_titleNotBetween(String value1, String value2) {
            addCriterion("comment_title not between", value1, value2, "comment_title");
            return (Criteria) this;
        }

        public Criteria andComment_contextIsNull() {
            addCriterion("comment_context is null");
            return (Criteria) this;
        }

        public Criteria andComment_contextIsNotNull() {
            addCriterion("comment_context is not null");
            return (Criteria) this;
        }

        public Criteria andComment_contextEqualTo(String value) {
            addCriterion("comment_context =", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextNotEqualTo(String value) {
            addCriterion("comment_context <>", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextGreaterThan(String value) {
            addCriterion("comment_context >", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextGreaterThanOrEqualTo(String value) {
            addCriterion("comment_context >=", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextLessThan(String value) {
            addCriterion("comment_context <", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextLessThanOrEqualTo(String value) {
            addCriterion("comment_context <=", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextLike(String value) {
            addCriterion("comment_context like", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextNotLike(String value) {
            addCriterion("comment_context not like", value, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextIn(List<String> values) {
            addCriterion("comment_context in", values, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextNotIn(List<String> values) {
            addCriterion("comment_context not in", values, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextBetween(String value1, String value2) {
            addCriterion("comment_context between", value1, value2, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_contextNotBetween(String value1, String value2) {
            addCriterion("comment_context not between", value1, value2, "comment_context");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataIsNull() {
            addCriterion("comment_create_data is null");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataIsNotNull() {
            addCriterion("comment_create_data is not null");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataEqualTo(Date value) {
            addCriterion("comment_create_data =", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataNotEqualTo(Date value) {
            addCriterion("comment_create_data <>", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataGreaterThan(Date value) {
            addCriterion("comment_create_data >", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_create_data >=", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataLessThan(Date value) {
            addCriterion("comment_create_data <", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataLessThanOrEqualTo(Date value) {
            addCriterion("comment_create_data <=", value, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataIn(List<Date> values) {
            addCriterion("comment_create_data in", values, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataNotIn(List<Date> values) {
            addCriterion("comment_create_data not in", values, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataBetween(Date value1, Date value2) {
            addCriterion("comment_create_data between", value1, value2, "comment_create_data");
            return (Criteria) this;
        }

        public Criteria andComment_create_dataNotBetween(Date value1, Date value2) {
            addCriterion("comment_create_data not between", value1, value2, "comment_create_data");
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
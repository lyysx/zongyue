package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.List;

public class AuthorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorExample() {
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

        public Criteria andAuthor_login_nameIsNull() {
            addCriterion("author_login_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameIsNotNull() {
            addCriterion("author_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameEqualTo(String value) {
            addCriterion("author_login_name =", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameNotEqualTo(String value) {
            addCriterion("author_login_name <>", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameGreaterThan(String value) {
            addCriterion("author_login_name >", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameGreaterThanOrEqualTo(String value) {
            addCriterion("author_login_name >=", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameLessThan(String value) {
            addCriterion("author_login_name <", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameLessThanOrEqualTo(String value) {
            addCriterion("author_login_name <=", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameLike(String value) {
            addCriterion("author_login_name like", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameNotLike(String value) {
            addCriterion("author_login_name not like", value, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameIn(List<String> values) {
            addCriterion("author_login_name in", values, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameNotIn(List<String> values) {
            addCriterion("author_login_name not in", values, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameBetween(String value1, String value2) {
            addCriterion("author_login_name between", value1, value2, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_login_nameNotBetween(String value1, String value2) {
            addCriterion("author_login_name not between", value1, value2, "author_login_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordIsNull() {
            addCriterion("author_password is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordIsNotNull() {
            addCriterion("author_password is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordEqualTo(String value) {
            addCriterion("author_password =", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordNotEqualTo(String value) {
            addCriterion("author_password <>", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordGreaterThan(String value) {
            addCriterion("author_password >", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("author_password >=", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordLessThan(String value) {
            addCriterion("author_password <", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordLessThanOrEqualTo(String value) {
            addCriterion("author_password <=", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordLike(String value) {
            addCriterion("author_password like", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordNotLike(String value) {
            addCriterion("author_password not like", value, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordIn(List<String> values) {
            addCriterion("author_password in", values, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordNotIn(List<String> values) {
            addCriterion("author_password not in", values, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordBetween(String value1, String value2) {
            addCriterion("author_password between", value1, value2, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_passwordNotBetween(String value1, String value2) {
            addCriterion("author_password not between", value1, value2, "author_password");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameIsNull() {
            addCriterion("author_name is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameIsNotNull() {
            addCriterion("author_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameEqualTo(String value) {
            addCriterion("author_name =", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameNotEqualTo(String value) {
            addCriterion("author_name <>", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameGreaterThan(String value) {
            addCriterion("author_name >", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameGreaterThanOrEqualTo(String value) {
            addCriterion("author_name >=", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameLessThan(String value) {
            addCriterion("author_name <", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameLessThanOrEqualTo(String value) {
            addCriterion("author_name <=", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameLike(String value) {
            addCriterion("author_name like", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameNotLike(String value) {
            addCriterion("author_name not like", value, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameIn(List<String> values) {
            addCriterion("author_name in", values, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameNotIn(List<String> values) {
            addCriterion("author_name not in", values, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameBetween(String value1, String value2) {
            addCriterion("author_name between", value1, value2, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_nameNotBetween(String value1, String value2) {
            addCriterion("author_name not between", value1, value2, "author_name");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageIsNull() {
            addCriterion("author_image is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageIsNotNull() {
            addCriterion("author_image is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageEqualTo(String value) {
            addCriterion("author_image =", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageNotEqualTo(String value) {
            addCriterion("author_image <>", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageGreaterThan(String value) {
            addCriterion("author_image >", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageGreaterThanOrEqualTo(String value) {
            addCriterion("author_image >=", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageLessThan(String value) {
            addCriterion("author_image <", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageLessThanOrEqualTo(String value) {
            addCriterion("author_image <=", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageLike(String value) {
            addCriterion("author_image like", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageNotLike(String value) {
            addCriterion("author_image not like", value, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageIn(List<String> values) {
            addCriterion("author_image in", values, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageNotIn(List<String> values) {
            addCriterion("author_image not in", values, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageBetween(String value1, String value2) {
            addCriterion("author_image between", value1, value2, "author_image");
            return (Criteria) this;
        }

        public Criteria andAuthor_imageNotBetween(String value1, String value2) {
            addCriterion("author_image not between", value1, value2, "author_image");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationIsNull() {
            addCriterion("author_information is null");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationIsNotNull() {
            addCriterion("author_information is not null");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationEqualTo(String value) {
            addCriterion("author_information =", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationNotEqualTo(String value) {
            addCriterion("author_information <>", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationGreaterThan(String value) {
            addCriterion("author_information >", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationGreaterThanOrEqualTo(String value) {
            addCriterion("author_information >=", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationLessThan(String value) {
            addCriterion("author_information <", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationLessThanOrEqualTo(String value) {
            addCriterion("author_information <=", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationLike(String value) {
            addCriterion("author_information like", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationNotLike(String value) {
            addCriterion("author_information not like", value, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationIn(List<String> values) {
            addCriterion("author_information in", values, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationNotIn(List<String> values) {
            addCriterion("author_information not in", values, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationBetween(String value1, String value2) {
            addCriterion("author_information between", value1, value2, "author_information");
            return (Criteria) this;
        }

        public Criteria andAuthor_informationNotBetween(String value1, String value2) {
            addCriterion("author_information not between", value1, value2, "author_information");
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
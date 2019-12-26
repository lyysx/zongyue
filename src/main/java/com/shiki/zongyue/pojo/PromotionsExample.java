package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.List;

public class PromotionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionsExample() {
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

        public Criteria andPromotions_idIsNull() {
            addCriterion("promotions_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotions_idIsNotNull() {
            addCriterion("promotions_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotions_idEqualTo(Integer value) {
            addCriterion("promotions_id =", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idNotEqualTo(Integer value) {
            addCriterion("promotions_id <>", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idGreaterThan(Integer value) {
            addCriterion("promotions_id >", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotions_id >=", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idLessThan(Integer value) {
            addCriterion("promotions_id <", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idLessThanOrEqualTo(Integer value) {
            addCriterion("promotions_id <=", value, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idIn(List<Integer> values) {
            addCriterion("promotions_id in", values, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idNotIn(List<Integer> values) {
            addCriterion("promotions_id not in", values, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idBetween(Integer value1, Integer value2) {
            addCriterion("promotions_id between", value1, value2, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_idNotBetween(Integer value1, Integer value2) {
            addCriterion("promotions_id not between", value1, value2, "promotions_id");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleIsNull() {
            addCriterion("promotions_title is null");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleIsNotNull() {
            addCriterion("promotions_title is not null");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleEqualTo(String value) {
            addCriterion("promotions_title =", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleNotEqualTo(String value) {
            addCriterion("promotions_title <>", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleGreaterThan(String value) {
            addCriterion("promotions_title >", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleGreaterThanOrEqualTo(String value) {
            addCriterion("promotions_title >=", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleLessThan(String value) {
            addCriterion("promotions_title <", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleLessThanOrEqualTo(String value) {
            addCriterion("promotions_title <=", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleLike(String value) {
            addCriterion("promotions_title like", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleNotLike(String value) {
            addCriterion("promotions_title not like", value, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleIn(List<String> values) {
            addCriterion("promotions_title in", values, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleNotIn(List<String> values) {
            addCriterion("promotions_title not in", values, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleBetween(String value1, String value2) {
            addCriterion("promotions_title between", value1, value2, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_titleNotBetween(String value1, String value2) {
            addCriterion("promotions_title not between", value1, value2, "promotions_title");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionIsNull() {
            addCriterion("promotions_description is null");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionIsNotNull() {
            addCriterion("promotions_description is not null");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionEqualTo(String value) {
            addCriterion("promotions_description =", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionNotEqualTo(String value) {
            addCriterion("promotions_description <>", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionGreaterThan(String value) {
            addCriterion("promotions_description >", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("promotions_description >=", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionLessThan(String value) {
            addCriterion("promotions_description <", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionLessThanOrEqualTo(String value) {
            addCriterion("promotions_description <=", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionLike(String value) {
            addCriterion("promotions_description like", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionNotLike(String value) {
            addCriterion("promotions_description not like", value, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionIn(List<String> values) {
            addCriterion("promotions_description in", values, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionNotIn(List<String> values) {
            addCriterion("promotions_description not in", values, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionBetween(String value1, String value2) {
            addCriterion("promotions_description between", value1, value2, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andPromotions_descriptionNotBetween(String value1, String value2) {
            addCriterion("promotions_description not between", value1, value2, "promotions_description");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Byte value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Byte value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Byte value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Byte value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Byte> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Byte> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Byte value1, Byte value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("online not between", value1, value2, "online");
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
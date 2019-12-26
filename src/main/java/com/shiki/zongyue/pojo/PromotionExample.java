package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.List;

public class PromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PromotionExample() {
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

        public Criteria andPromotion_idIsNull() {
            addCriterion("promotion_id is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_idIsNotNull() {
            addCriterion("promotion_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_idEqualTo(Integer value) {
            addCriterion("promotion_id =", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idNotEqualTo(Integer value) {
            addCriterion("promotion_id <>", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idGreaterThan(Integer value) {
            addCriterion("promotion_id >", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("promotion_id >=", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idLessThan(Integer value) {
            addCriterion("promotion_id <", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idLessThanOrEqualTo(Integer value) {
            addCriterion("promotion_id <=", value, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idIn(List<Integer> values) {
            addCriterion("promotion_id in", values, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idNotIn(List<Integer> values) {
            addCriterion("promotion_id not in", values, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id between", value1, value2, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_idNotBetween(Integer value1, Integer value2) {
            addCriterion("promotion_id not between", value1, value2, "promotion_id");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageIsNull() {
            addCriterion("promotion_image is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageIsNotNull() {
            addCriterion("promotion_image is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageEqualTo(String value) {
            addCriterion("promotion_image =", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageNotEqualTo(String value) {
            addCriterion("promotion_image <>", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageGreaterThan(String value) {
            addCriterion("promotion_image >", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_image >=", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageLessThan(String value) {
            addCriterion("promotion_image <", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageLessThanOrEqualTo(String value) {
            addCriterion("promotion_image <=", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageLike(String value) {
            addCriterion("promotion_image like", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageNotLike(String value) {
            addCriterion("promotion_image not like", value, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageIn(List<String> values) {
            addCriterion("promotion_image in", values, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageNotIn(List<String> values) {
            addCriterion("promotion_image not in", values, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageBetween(String value1, String value2) {
            addCriterion("promotion_image between", value1, value2, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_imageNotBetween(String value1, String value2) {
            addCriterion("promotion_image not between", value1, value2, "promotion_image");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlIsNull() {
            addCriterion("promotion_url is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlIsNotNull() {
            addCriterion("promotion_url is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlEqualTo(String value) {
            addCriterion("promotion_url =", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlNotEqualTo(String value) {
            addCriterion("promotion_url <>", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlGreaterThan(String value) {
            addCriterion("promotion_url >", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_url >=", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlLessThan(String value) {
            addCriterion("promotion_url <", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlLessThanOrEqualTo(String value) {
            addCriterion("promotion_url <=", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlLike(String value) {
            addCriterion("promotion_url like", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlNotLike(String value) {
            addCriterion("promotion_url not like", value, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlIn(List<String> values) {
            addCriterion("promotion_url in", values, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlNotIn(List<String> values) {
            addCriterion("promotion_url not in", values, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlBetween(String value1, String value2) {
            addCriterion("promotion_url between", value1, value2, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_urlNotBetween(String value1, String value2) {
            addCriterion("promotion_url not between", value1, value2, "promotion_url");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionIsNull() {
            addCriterion("promotion_description is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionIsNotNull() {
            addCriterion("promotion_description is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionEqualTo(String value) {
            addCriterion("promotion_description =", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionNotEqualTo(String value) {
            addCriterion("promotion_description <>", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionGreaterThan(String value) {
            addCriterion("promotion_description >", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_description >=", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionLessThan(String value) {
            addCriterion("promotion_description <", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionLessThanOrEqualTo(String value) {
            addCriterion("promotion_description <=", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionLike(String value) {
            addCriterion("promotion_description like", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionNotLike(String value) {
            addCriterion("promotion_description not like", value, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionIn(List<String> values) {
            addCriterion("promotion_description in", values, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionNotIn(List<String> values) {
            addCriterion("promotion_description not in", values, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionBetween(String value1, String value2) {
            addCriterion("promotion_description between", value1, value2, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_descriptionNotBetween(String value1, String value2) {
            addCriterion("promotion_description not between", value1, value2, "promotion_description");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleIsNull() {
            addCriterion("promotion_title is null");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleIsNotNull() {
            addCriterion("promotion_title is not null");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleEqualTo(String value) {
            addCriterion("promotion_title =", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleNotEqualTo(String value) {
            addCriterion("promotion_title <>", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleGreaterThan(String value) {
            addCriterion("promotion_title >", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleGreaterThanOrEqualTo(String value) {
            addCriterion("promotion_title >=", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleLessThan(String value) {
            addCriterion("promotion_title <", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleLessThanOrEqualTo(String value) {
            addCriterion("promotion_title <=", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleLike(String value) {
            addCriterion("promotion_title like", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleNotLike(String value) {
            addCriterion("promotion_title not like", value, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleIn(List<String> values) {
            addCriterion("promotion_title in", values, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleNotIn(List<String> values) {
            addCriterion("promotion_title not in", values, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleBetween(String value1, String value2) {
            addCriterion("promotion_title between", value1, value2, "promotion_title");
            return (Criteria) this;
        }

        public Criteria andPromotion_titleNotBetween(String value1, String value2) {
            addCriterion("promotion_title not between", value1, value2, "promotion_title");
            return (Criteria) this;
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
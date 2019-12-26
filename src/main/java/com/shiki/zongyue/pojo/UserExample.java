package com.shiki.zongyue.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUser_login_nameIsNull() {
            addCriterion("user_login_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameIsNotNull() {
            addCriterion("user_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameEqualTo(String value) {
            addCriterion("user_login_name =", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameNotEqualTo(String value) {
            addCriterion("user_login_name <>", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameGreaterThan(String value) {
            addCriterion("user_login_name >", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_name >=", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameLessThan(String value) {
            addCriterion("user_login_name <", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameLessThanOrEqualTo(String value) {
            addCriterion("user_login_name <=", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameLike(String value) {
            addCriterion("user_login_name like", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameNotLike(String value) {
            addCriterion("user_login_name not like", value, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameIn(List<String> values) {
            addCriterion("user_login_name in", values, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameNotIn(List<String> values) {
            addCriterion("user_login_name not in", values, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameBetween(String value1, String value2) {
            addCriterion("user_login_name between", value1, value2, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_login_nameNotBetween(String value1, String value2) {
            addCriterion("user_login_name not between", value1, value2, "user_login_name");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_passwordEqualTo(String value) {
            addCriterion("user_password =", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThan(String value) {
            addCriterion("user_password >", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThan(String value) {
            addCriterion("user_password <", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordLike(String value) {
            addCriterion("user_password like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotLike(String value) {
            addCriterion("user_password not like", value, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordIn(List<String> values) {
            addCriterion("user_password in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_passwordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "user_password");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameIsNull() {
            addCriterion("user_nickname is null");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameIsNotNull() {
            addCriterion("user_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameEqualTo(String value) {
            addCriterion("user_nickname =", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameNotEqualTo(String value) {
            addCriterion("user_nickname <>", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameGreaterThan(String value) {
            addCriterion("user_nickname >", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nickname >=", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameLessThan(String value) {
            addCriterion("user_nickname <", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameLessThanOrEqualTo(String value) {
            addCriterion("user_nickname <=", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameLike(String value) {
            addCriterion("user_nickname like", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameNotLike(String value) {
            addCriterion("user_nickname not like", value, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameIn(List<String> values) {
            addCriterion("user_nickname in", values, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameNotIn(List<String> values) {
            addCriterion("user_nickname not in", values, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameBetween(String value1, String value2) {
            addCriterion("user_nickname between", value1, value2, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_nicknameNotBetween(String value1, String value2) {
            addCriterion("user_nickname not between", value1, value2, "user_nickname");
            return (Criteria) this;
        }

        public Criteria andUser_genderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUser_genderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUser_genderEqualTo(String value) {
            addCriterion("user_gender =", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderGreaterThan(String value) {
            addCriterion("user_gender >", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderLessThan(String value) {
            addCriterion("user_gender <", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderLike(String value) {
            addCriterion("user_gender like", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderNotLike(String value) {
            addCriterion("user_gender not like", value, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderIn(List<String> values) {
            addCriterion("user_gender in", values, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_genderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "user_gender");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_birthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "user_birthday");
            return (Criteria) this;
        }

        public Criteria andUser_informationIsNull() {
            addCriterion("user_information is null");
            return (Criteria) this;
        }

        public Criteria andUser_informationIsNotNull() {
            addCriterion("user_information is not null");
            return (Criteria) this;
        }

        public Criteria andUser_informationEqualTo(String value) {
            addCriterion("user_information =", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationNotEqualTo(String value) {
            addCriterion("user_information <>", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationGreaterThan(String value) {
            addCriterion("user_information >", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationGreaterThanOrEqualTo(String value) {
            addCriterion("user_information >=", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationLessThan(String value) {
            addCriterion("user_information <", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationLessThanOrEqualTo(String value) {
            addCriterion("user_information <=", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationLike(String value) {
            addCriterion("user_information like", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationNotLike(String value) {
            addCriterion("user_information not like", value, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationIn(List<String> values) {
            addCriterion("user_information in", values, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationNotIn(List<String> values) {
            addCriterion("user_information not in", values, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationBetween(String value1, String value2) {
            addCriterion("user_information between", value1, value2, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_informationNotBetween(String value1, String value2) {
            addCriterion("user_information not between", value1, value2, "user_information");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketIsNull() {
            addCriterion("user_recommend_ticket is null");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketIsNotNull() {
            addCriterion("user_recommend_ticket is not null");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketEqualTo(Integer value) {
            addCriterion("user_recommend_ticket =", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketNotEqualTo(Integer value) {
            addCriterion("user_recommend_ticket <>", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketGreaterThan(Integer value) {
            addCriterion("user_recommend_ticket >", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_recommend_ticket >=", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketLessThan(Integer value) {
            addCriterion("user_recommend_ticket <", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketLessThanOrEqualTo(Integer value) {
            addCriterion("user_recommend_ticket <=", value, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketIn(List<Integer> values) {
            addCriterion("user_recommend_ticket in", values, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketNotIn(List<Integer> values) {
            addCriterion("user_recommend_ticket not in", values, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketBetween(Integer value1, Integer value2) {
            addCriterion("user_recommend_ticket between", value1, value2, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_recommend_ticketNotBetween(Integer value1, Integer value2) {
            addCriterion("user_recommend_ticket not between", value1, value2, "user_recommend_ticket");
            return (Criteria) this;
        }

        public Criteria andUser_depositIsNull() {
            addCriterion("user_deposit is null");
            return (Criteria) this;
        }

        public Criteria andUser_depositIsNotNull() {
            addCriterion("user_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andUser_depositEqualTo(Integer value) {
            addCriterion("user_deposit =", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositNotEqualTo(Integer value) {
            addCriterion("user_deposit <>", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositGreaterThan(Integer value) {
            addCriterion("user_deposit >", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_deposit >=", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositLessThan(Integer value) {
            addCriterion("user_deposit <", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositLessThanOrEqualTo(Integer value) {
            addCriterion("user_deposit <=", value, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositIn(List<Integer> values) {
            addCriterion("user_deposit in", values, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositNotIn(List<Integer> values) {
            addCriterion("user_deposit not in", values, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositBetween(Integer value1, Integer value2) {
            addCriterion("user_deposit between", value1, value2, "user_deposit");
            return (Criteria) this;
        }

        public Criteria andUser_depositNotBetween(Integer value1, Integer value2) {
            addCriterion("user_deposit not between", value1, value2, "user_deposit");
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

        public Criteria andUser_imageIsNull() {
            addCriterion("user_image is null");
            return (Criteria) this;
        }

        public Criteria andUser_imageIsNotNull() {
            addCriterion("user_image is not null");
            return (Criteria) this;
        }

        public Criteria andUser_imageEqualTo(String value) {
            addCriterion("user_image =", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageNotEqualTo(String value) {
            addCriterion("user_image <>", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageGreaterThan(String value) {
            addCriterion("user_image >", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageGreaterThanOrEqualTo(String value) {
            addCriterion("user_image >=", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageLessThan(String value) {
            addCriterion("user_image <", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageLessThanOrEqualTo(String value) {
            addCriterion("user_image <=", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageLike(String value) {
            addCriterion("user_image like", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageNotLike(String value) {
            addCriterion("user_image not like", value, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageIn(List<String> values) {
            addCriterion("user_image in", values, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageNotIn(List<String> values) {
            addCriterion("user_image not in", values, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageBetween(String value1, String value2) {
            addCriterion("user_image between", value1, value2, "user_image");
            return (Criteria) this;
        }

        public Criteria andUser_imageNotBetween(String value1, String value2) {
            addCriterion("user_image not between", value1, value2, "user_image");
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
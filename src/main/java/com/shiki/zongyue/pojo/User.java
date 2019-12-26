package com.shiki.zongyue.pojo;

import java.util.Date;

public class User {
    private Integer user_id;

    private String user_login_name;

    private String user_password;

    private String user_nickname;

    private String user_gender;

    private Date user_birthday;

    private String user_information;

    private Integer user_recommend_ticket;

    private Integer user_deposit;

    private String salt;

    private String user_image;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_login_name() {
        return user_login_name;
    }

    public void setUser_login_name(String user_login_name) {
        this.user_login_name = user_login_name == null ? null : user_login_name.trim();
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password == null ? null : user_password.trim();
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname == null ? null : user_nickname.trim();
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender == null ? null : user_gender.trim();
    }

    public Date getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(Date user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_information() {
        return user_information;
    }

    public void setUser_information(String user_information) {
        this.user_information = user_information == null ? null : user_information.trim();
    }

    public Integer getUser_recommend_ticket() {
        return user_recommend_ticket;
    }

    public void setUser_recommend_ticket(Integer user_recommend_ticket) {
        this.user_recommend_ticket = user_recommend_ticket;
    }

    public Integer getUser_deposit() {
        return user_deposit;
    }

    public void setUser_deposit(Integer user_deposit) {
        this.user_deposit = user_deposit;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image == null ? null : user_image.trim();
    }
}
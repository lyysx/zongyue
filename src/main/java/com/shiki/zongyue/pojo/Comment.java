package com.shiki.zongyue.pojo;

import java.util.Date;

public class Comment {
    private Integer comment_id;

    private Integer fiction_id;

    private Integer user_id;

    private String comment_title;

    private String comment_context;

    private Date comment_create_data;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public Integer getFiction_id() {
        return fiction_id;
    }

    public void setFiction_id(Integer fiction_id) {
        this.fiction_id = fiction_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getComment_title() {
        return comment_title;
    }

    public void setComment_title(String comment_title) {
        this.comment_title = comment_title == null ? null : comment_title.trim();
    }

    public String getComment_context() {
        return comment_context;
    }

    public void setComment_context(String comment_context) {
        this.comment_context = comment_context == null ? null : comment_context.trim();
    }

    public Date getComment_create_data() {
        return comment_create_data;
    }

    public void setComment_create_data(Date comment_create_data) {
        this.comment_create_data = comment_create_data;
    }
}
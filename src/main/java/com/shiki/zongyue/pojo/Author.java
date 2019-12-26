package com.shiki.zongyue.pojo;

public class Author {
    private Integer author_id;

    private String author_login_name;

    private String author_password;

    private String author_name;

    private String author_image;

    private String salt;

    private String author_information;

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_login_name() {
        return author_login_name;
    }

    public void setAuthor_login_name(String author_login_name) {
        this.author_login_name = author_login_name == null ? null : author_login_name.trim();
    }

    public String getAuthor_password() {
        return author_password;
    }

    public void setAuthor_password(String author_password) {
        this.author_password = author_password == null ? null : author_password.trim();
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name == null ? null : author_name.trim();
    }

    public String getAuthor_image() {
        return author_image;
    }

    public void setAuthor_image(String author_image) {
        this.author_image = author_image == null ? null : author_image.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getAuthor_information() {
        return author_information;
    }

    public void setAuthor_information(String author_information) {
        this.author_information = author_information == null ? null : author_information.trim();
    }
}
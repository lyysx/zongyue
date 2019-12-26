package com.shiki.zongyue.pojo;

public class Admin {
    private Integer admin_id;

    private String admin_name;

    private String admin_password;

    private Integer admin_genre;

    private String salt;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password == null ? null : admin_password.trim();
    }

    public Integer getAdmin_genre() {
        return admin_genre;
    }

    public void setAdmin_genre(Integer admin_genre) {
        this.admin_genre = admin_genre;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}
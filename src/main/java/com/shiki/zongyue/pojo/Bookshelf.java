package com.shiki.zongyue.pojo;

import java.util.Date;

public class Bookshelf extends BookshelfKey {
    private Integer chapter_id;

    private Date user_last_read_time;

    private Fiction fiction;

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public Integer getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Integer chapter_id) {
        this.chapter_id = chapter_id;
    }

    public Date getUser_last_read_time() {
        return user_last_read_time;
    }

    public void setUser_last_read_time(Date user_last_read_time) {
        this.user_last_read_time = user_last_read_time;
    }
}
package com.shiki.zongyue.pojo;

import com.shiki.zongyue.util.MyStringUtil;

import java.util.Date;

public class Chapter {
    private Integer chapter_id;

    private Integer fiction_id;

    private Integer chapter_number;

    private Integer chapter_word_number;

    private String chapter_title;

    private Integer chapter_state;

    private Date chapter_edit_time;

    private Byte chapter_pay_state;

    private String chapter_context;

    public Integer getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(Integer chapter_id) {
        this.chapter_id = chapter_id;
    }

    public Integer getFiction_id() {
        return fiction_id;
    }

    public void setFiction_id(Integer fiction_id) {
        this.fiction_id = fiction_id;
    }

    public Integer getChapter_number() {
        return chapter_number;
    }

    public void setChapter_number(Integer chapter_number) {
        this.chapter_number = chapter_number;
    }

    public Integer getChapter_word_number() {
        return chapter_word_number;
    }

    public void setChapter_word_number(Integer chapter_word_number) {
        this.chapter_word_number = chapter_word_number;
    }

    public String getChapter_title() {
        return chapter_title;
    }

    public void setChapter_title(String chapter_title) {
        this.chapter_title = chapter_title == null ? null : chapter_title.trim();
    }

    public Integer getChapter_state() {
        return chapter_state;
    }

    public void setChapter_state(Integer chapter_state) {
        this.chapter_state = chapter_state;
    }

    public Date getChapter_edit_time() {
        return chapter_edit_time;
    }

    public void setChapter_edit_time(Date chapter_edit_time) {
        this.chapter_edit_time = chapter_edit_time;
    }

    public Byte getChapter_pay_state() {
        return chapter_pay_state;
    }

    public void setChapter_pay_state(Byte chapter_pay_state) {
        this.chapter_pay_state = chapter_pay_state;
    }

    public String getChapter_context() {
        return chapter_context;
    }

    public void setChapter_context(String chapter_context) {
        this.chapter_context = chapter_context == null ? null : MyStringUtil.trimEnd(chapter_context);
    }
}
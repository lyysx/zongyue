package com.shiki.zongyue.pojo;

import com.shiki.zongyue.util.MyStringUtil;

public class Fiction {
    private Integer fiction_id;

    private String fiction_image;

    private String fiction_name;

    private String fiction_synopsis;

    private Integer fiction_recommend;

    private Integer fiction_word_number;

    private Integer author_id;

    private Integer genre_id;

    private Integer fiction_state;

    private Integer fiction_writing_state;

    private Author author;

    private Genre genre;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Integer getFiction_id() {
        return fiction_id;
    }

    public void setFiction_id(Integer fiction_id) {
        this.fiction_id = fiction_id;
    }

    public String getFiction_image() {
        return fiction_image;
    }

    public void setFiction_image(String fiction_image) {
        this.fiction_image = fiction_image == null ? null : fiction_image.trim();
    }

    public String getFiction_name() {
        return fiction_name;
    }

    public void setFiction_name(String fiction_name) {
        this.fiction_name = fiction_name == null ? null : fiction_name.trim();
    }

    public String getFiction_synopsis() {
        return fiction_synopsis;
    }

    public void setFiction_synopsis(String fiction_synopsis) {
        this.fiction_synopsis = fiction_synopsis == null ? null : MyStringUtil.trimEnd(fiction_synopsis);
    }

    public Integer getFiction_recommend() {
        return fiction_recommend;
    }

    public void setFiction_recommend(Integer fiction_recommend) {
        this.fiction_recommend = fiction_recommend;
    }

    public Integer getFiction_word_number() {
        return fiction_word_number;
    }

    public void setFiction_word_number(Integer fiction_word_number) {
        this.fiction_word_number = fiction_word_number;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer genre_id) {
        this.genre_id = genre_id;
    }

    public Integer getFiction_state() {
        return fiction_state;
    }

    public void setFiction_state(Integer fiction_state) {
        this.fiction_state = fiction_state;
    }

    public Integer getFiction_writing_state() {
        return fiction_writing_state;
    }

    public void setFiction_writing_state(Integer fiction_writing_state) {
        this.fiction_writing_state = fiction_writing_state;
    }
}
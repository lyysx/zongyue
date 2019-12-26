package com.shiki.zongyue.service;

import com.shiki.zongyue.pojo.Genre;

import java.util.List;

public interface GenreService {
    void add(Genre genre);

    List<Genre> list();


    Genre get(int genre_id);


}

package com.shiki.zongyue.service;

import com.shiki.zongyue.EnumForState.ChapterOrderBy;
import com.shiki.zongyue.EnumForState.ChapterState;
import com.shiki.zongyue.pojo.Chapter;

import java.util.List;

public interface ChapterService {
    Chapter get(int chapter_id);

    List<Chapter> list(int fiction_id, ChapterState state, ChapterOrderBy orderBy);

    void add(int fiction_id);

    int count(int fiction_id, ChapterState state);

    void delete(int chapter_id);

    void update(Chapter chapter);

    Integer getNextChapterID(int fiction_id, int chapter_id);

    Integer getPreviousChapterID(int fiction_id, int chapter_id);

    Integer getStartChapterID(int fiction_id, Integer user_id);

    Integer getFirstChapterID(int fiction_id);
}

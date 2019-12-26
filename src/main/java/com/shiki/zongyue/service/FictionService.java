package com.shiki.zongyue.service;

import com.shiki.zongyue.EnumForState.FictionOrderBy;
import com.shiki.zongyue.EnumForState.FictionState;
import com.shiki.zongyue.pojo.Fiction;

import java.util.List;

public interface FictionService {

    void add(Fiction fiction);

    void update(Fiction fiction);

    void delete(int fiction_id);

    Fiction get(int fiction_id);

    List<Fiction> list();

    List<Fiction> list(FictionState fictionState, FictionOrderBy orderBy);

    List<Fiction> list(int genre_id,FictionState fictionstate);

    List<Fiction> list(FictionState fictionstate);

    List<Fiction> listByAuthor(int author_id);

    List<Fiction> listByGenre(int genre_id);

    List<Fiction> topTenFictions();

    List<Fiction> listAll(boolean isRanked);
}

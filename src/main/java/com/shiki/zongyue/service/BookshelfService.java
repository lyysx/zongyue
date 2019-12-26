package com.shiki.zongyue.service;

import com.shiki.zongyue.pojo.Bookshelf;
import com.shiki.zongyue.pojo.BookshelfKey;

import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/9
 **/
public interface BookshelfService {
    void add(Bookshelf bookshelf);

    Bookshelf get(BookshelfKey bookshelfKey);

    List<Bookshelf> getMyBookshelf(int user_id);
}

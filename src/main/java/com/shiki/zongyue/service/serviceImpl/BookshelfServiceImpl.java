package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.BookshelfMapper;
import com.shiki.zongyue.mapper.FictionMapper;
import com.shiki.zongyue.pojo.Bookshelf;
import com.shiki.zongyue.pojo.BookshelfExample;
import com.shiki.zongyue.pojo.BookshelfKey;
import com.shiki.zongyue.pojo.Fiction;
import com.shiki.zongyue.service.BookshelfService;
import com.shiki.zongyue.service.FictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/9
 **/
@Service
public class BookshelfServiceImpl implements BookshelfService {
    @Autowired
    private BookshelfMapper bookshelfMapper;

    @Autowired
    private FictionService fictionService;

    void setFiction(List<Bookshelf> bookshelves) {
        for (Bookshelf bookshelf : bookshelves) {
            Fiction fiction = fictionService.get(bookshelf.getFiction_id());
            bookshelf.setFiction(fiction);
        }
    }

    @Override
    public void add(Bookshelf bookshelf) {
        bookshelfMapper.insert(bookshelf);
    }

    @Override
    public Bookshelf get(BookshelfKey bookshelfKey) {
        return bookshelfMapper.selectByPrimaryKey(bookshelfKey);
    }

    @Override
    public List<Bookshelf> getMyBookshelf(int user_id) {
        BookshelfExample bookshelfExample = new BookshelfExample();
        bookshelfExample.createCriteria().andUser_idEqualTo(user_id);
        List<Bookshelf> bookshelves = bookshelfMapper.selectByExample(bookshelfExample);
        setFiction(bookshelves);
        return bookshelves;
    }

}

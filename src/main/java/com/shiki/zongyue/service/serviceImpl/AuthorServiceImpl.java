package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.AuthorMapper;
import com.shiki.zongyue.pojo.Author;
import com.shiki.zongyue.pojo.AuthorExample;
import com.shiki.zongyue.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AuthorServiceImpl implements AuthorService {


    @Autowired
    private AuthorMapper authorMapper;

    @Override
    public void add(Author author) {
        authorMapper.insert(author);
    }

    @Override
    public void update(Author author) {
        authorMapper.updateByPrimaryKeySelective(author);
    }

    @Override
    public void delete(int author_id) {

    }

    @Override
    public Author get(String author_login_name, String author_password) {
        AuthorExample authorExample = new AuthorExample();
        authorExample.createCriteria().andAuthor_login_nameEqualTo(author_login_name).andAuthor_passwordEqualTo(author_password);
        List<Author> authorList = authorMapper.selectByExample(authorExample);
        if (authorList.isEmpty()) {
            return null;
        }
        return authorList.get(0);
    }

    @Override
    public List<Author> list() {
        return null;
    }

    @Override
    public boolean isExitLoginName(String author_login_name) {
        AuthorExample authorExample = new AuthorExample();
        authorExample.createCriteria().andAuthor_login_nameEqualTo(author_login_name);
        if (authorMapper.selectByExample(authorExample).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isExitname(String author_name) {
        AuthorExample authorExample = new AuthorExample();
        authorExample.createCriteria().andAuthor_nameEqualTo(author_name);
        if (authorMapper.selectByExample(authorExample).isEmpty()) {
            return true;
        }
        return false;

    }
}

package com.shiki.zongyue.service;


import com.shiki.zongyue.pojo.Author;
import org.springframework.stereotype.Service;

import java.util.List;



public interface AuthorService {

    void add(Author author);

    void update(Author author);

    void delete(int author_id);

    Author get(String author_login_name, String author_password);

    List<Author> list();

    boolean isExitLoginName(String author_login_name);

    boolean isExitname(String author_name);

}

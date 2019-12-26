package com.shiki.zongyue.service;

import com.shiki.zongyue.pojo.User;

public interface UserService {
    void add(User user);

    User get(int uid);

    void update(User user);

    User loginCheck(String username, String password);

    User registerCheck(String username);
}

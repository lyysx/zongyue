package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.UserMapper;
import com.shiki.zongyue.pojo.User;
import com.shiki.zongyue.pojo.UserExample;
import com.shiki.zongyue.service.UserService;
import com.shiki.zongyue.util.PasswordEnctyption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author shiki
 * @version 1.0
 * @date 2019/11/1
 **/

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void add(User user) {
        /*Map<String, String> stringMap = PasswordEnctyption.getPassword(user.getUser_password());
        user.setUser_password(stringMap.get("password"));
        user.setSalt(stringMap.get("salt"));*/
        userMapper.insert(user);
    }

    @Override
    public User get(int uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    @Override
    public User loginCheck(String username, String password) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUser_login_nameEqualTo(username).andUser_passwordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

    @Override
    public User registerCheck(String username) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUser_login_nameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.isEmpty()) {
            return null;
        }
        return users.get(0);
    }

    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }
}

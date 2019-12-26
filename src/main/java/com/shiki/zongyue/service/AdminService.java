package com.shiki.zongyue.service;


import com.shiki.zongyue.pojo.Admin;

import java.util.List;

/**
 *
 */
public interface AdminService {
    void add(Admin admin);

    void delete(int admin_id);

    void update(Admin admin);

    Admin get(String adminName, String password);


}

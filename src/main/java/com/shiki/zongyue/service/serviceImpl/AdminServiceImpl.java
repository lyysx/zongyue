package com.shiki.zongyue.service.serviceImpl;

import com.shiki.zongyue.mapper.AdminMapper;
import com.shiki.zongyue.pojo.Admin;
import com.shiki.zongyue.pojo.AdminExample;
import com.shiki.zongyue.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;


    @Override
    public Admin get(String admin_name, String admin_password) {
        AdminExample example = new AdminExample();
        example.createCriteria().andAdmin_nameEqualTo(admin_name).andAdmin_passwordEqualTo(admin_password);
        List<Admin> result = adminMapper.selectByExample(example);
        if (result.isEmpty()) {
            return null;
        }
        return result.get(0);
    }

    @Override
    public void add(Admin admin) {

    }

    @Override
    public void delete(int admin_id) {

    }

    @Override
    public void update(Admin admin) {

    }
}

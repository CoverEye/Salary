package com.m.service.impl;

import com.m.domain.User;
import com.m.mapper.AdminMapper;
import com.m.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public void regist(User user) {
        adminMapper.insertUserInfo(user);

    }
}

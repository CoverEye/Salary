package com.m.service.impl;

import com.m.domain.User;
import com.m.mapper.UserMapper;
import com.m.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class UserIServiecImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User login(String usernId, String password) {
        try {
            User user = userMapper.findByUserIDAndPassword(usernId, password);
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}

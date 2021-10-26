package com.m.service;

import com.m.domain.User;

public interface UserService {
    User login(String usernId, String password);

    User updateType(String userId,  Integer userType);

    User updateState(String userId,  Integer userState);


}

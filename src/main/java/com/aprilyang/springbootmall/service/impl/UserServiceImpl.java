package com.aprilyang.springbootmall.service.impl;

import com.aprilyang.springbootmall.dao.UserDao;
import com.aprilyang.springbootmall.dto.UserRegisterRequest;
import com.aprilyang.springbootmall.model.User;
import com.aprilyang.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}

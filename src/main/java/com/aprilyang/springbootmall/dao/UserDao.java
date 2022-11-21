package com.aprilyang.springbootmall.dao;

import com.aprilyang.springbootmall.dto.UserRegisterRequest;
import com.aprilyang.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

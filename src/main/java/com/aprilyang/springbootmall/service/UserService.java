package com.aprilyang.springbootmall.service;

import com.aprilyang.springbootmall.dto.UserRegisterRequest;
import com.aprilyang.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}

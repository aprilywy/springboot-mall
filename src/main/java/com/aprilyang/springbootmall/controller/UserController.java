package com.aprilyang.springbootmall.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aprilyang.springbootmall.dto.UserLoginRequest;
import com.aprilyang.springbootmall.dto.UserRegisterRequest;
import com.aprilyang.springbootmall.model.User;
import com.aprilyang.springbootmall.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users/register")
    @ResponseBody
    public ResponseEntity<User> register(@RequestBody @Valid UserRegisterRequest userRegisterRequest){

        Integer userId = userService.register(userRegisterRequest);

        User user = userService.getUserById(userId);

        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @PostMapping("/users/login")
    @ResponseBody
    public ResponseEntity<User> login(@RequestBody @Valid UserLoginRequest userLoginRequest, HttpSession session, Model model) {
        User user = userService.login(userLoginRequest);
	        
	    return ResponseEntity.status(HttpStatus.OK).body(user);
        
    }

}

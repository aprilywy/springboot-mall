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
    
    
    /*
     * 登入頁面、首頁
     */
    @GetMapping(value = {"/", "/index"})
    public String index() {
    	
    	return "index";
    }
    
    /*
     * 判斷是否登入成功
     */
    @PostMapping("/index")
    public String ckLogin(@RequestBody @Valid UserLoginRequest userLoginRequest, HttpSession session, Model model) {
    	
    	User user = userService.login(userLoginRequest);
    	
    	if(user != null) {
    		session.setAttribute("loginUser", user);
    		
    		return "redirect:/product.html";
    	} else {
    		model.addAttribute("msg", "帳號密碼錯誤");
    		
    		return "index";
    	}
    	
    }
    
    /*
     * 登入後進入商品頁，攔截未登入用戶
     */
    @GetMapping("/product.html")
    public String productPage(HttpSession session, Model model) {
    	
    	Object loginUser = session.getAttribute("loginUser");
    	
    	if(loginUser != null) {
    		
    		return "product";
    	} else {
    		model.addAttribute("msg", "尚未登入，請登入會員");
    		
    		return "index";
    	}
    	
    	
    }

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

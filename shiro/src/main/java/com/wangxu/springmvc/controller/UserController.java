package com.wangxu.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangxu.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping("/userlogin")
	public String getsuser(){
		userService.userlogin("lisi","123");
		
		return "list";
		
	}
	
}

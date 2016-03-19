package com.hefeng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.User;
import service.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/toLogin")
	public String toLogin(){
		logger.info(" this is log4j log start");
		
		System.out.println("1");
		User user = userService.getUser("");
		System.out.println(user);
		return "login";
	}
	
}

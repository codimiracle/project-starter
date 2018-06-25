package com.codimiracle.example.spring_boot_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codimiracle.example.spring_boot_demo.model.entity.User;
import com.codimiracle.example.spring_boot_demo.service.UserService;

@RestController
public class HelloController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello() {
		return "Hello World";
	}
	
	@RequestMapping(path = "/user", method = RequestMethod.GET)
	public User user() {
		return userService.getUserById(100);
	}
}

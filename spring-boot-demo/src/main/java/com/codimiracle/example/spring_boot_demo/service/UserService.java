package com.codimiracle.example.spring_boot_demo.service;

import org.springframework.stereotype.Service;

import com.codimiracle.example.spring_boot_demo.model.entity.User;

@Service
public class UserService {
	public User getUserById(int id) {
		User user = new User();
		user.setId(id);
		user.setName("Codimiracle");
		user.setGender(1);
		user.setEmail("Codimiracle@outlook.com");
		return user;
	}
}

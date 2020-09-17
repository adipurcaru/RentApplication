package com.ag.rent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ag.rent.domain.User;
import com.ag.rent.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@GetMapping("/test")
	public List<User> getAllUsers(){
		return service.getAllUsers();
	}
	
}

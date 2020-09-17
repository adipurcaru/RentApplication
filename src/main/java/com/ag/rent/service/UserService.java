package com.ag.rent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ag.rent.domain.User;
import com.ag.rent.repository.UserRepository;

@Service
public class UserService {

	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> getAllUsers(){
		return this.userRepository.findAll();
	}
}

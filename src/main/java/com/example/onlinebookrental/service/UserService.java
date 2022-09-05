package com.example.onlinebookrental.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinebookrental.dao.UserRepository;
import com.example.onlinebookrental.model.User;

@Service
public class UserService {
	
	@Autowired
	private  UserRepository userRepository;
	
	public Optional<User> findById(long id){
		return userRepository.findById(id);
	}

}

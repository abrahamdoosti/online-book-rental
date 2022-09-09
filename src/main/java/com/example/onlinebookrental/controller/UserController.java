package com.example.onlinebookrental.controller;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinebookrental.dto.response.UserResponseDTO;
import com.example.onlinebookrental.model.User;
import com.example.onlinebookrental.service.UserService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	@GetMapping("/test")
	public ResponseEntity<String> test() {
		return new ResponseEntity<>("test", HttpStatus.OK);
	}

	@GetMapping("/findUser/{id}")
	public ResponseEntity<UserResponseDTO> findUser(@PathVariable("id") final Long id) {
		Optional<User> user = userService.findById(id);		
		if (user.isPresent()) {
			UserResponseDTO usrDto=modelMapper.map(user.get(),UserResponseDTO.class);
			return new ResponseEntity<>(usrDto, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	 

}

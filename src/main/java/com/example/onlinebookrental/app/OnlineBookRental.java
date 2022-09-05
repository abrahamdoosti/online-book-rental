package com.example.onlinebookrental.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.onlinebookrental.model.User;
import com.example.onlinebookrental.service.UserService;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OnlineBookRental {
	
	
	@GetMapping("/index")
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<>("Hello you have reached test page",HttpStatus.OK);
	}
	
	
}

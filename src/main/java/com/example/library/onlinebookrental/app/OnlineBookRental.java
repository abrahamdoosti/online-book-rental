package com.example.library.onlinebookrental.app;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class OnlineBookRental {
   
	@GetMapping("/index")
	public ResponseEntity<String> helloWorld(){
		return new ResponseEntity<>("Hello you have reached test page",HttpStatus.OK);
	}
}

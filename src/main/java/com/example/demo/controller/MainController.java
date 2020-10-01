package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/")
@CrossOrigin
public class MainController {

	@PostMapping(value = "/login")
	public String login() {
		
		
		try {
			int a = 3/0;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		return "Hello World";

	}
}

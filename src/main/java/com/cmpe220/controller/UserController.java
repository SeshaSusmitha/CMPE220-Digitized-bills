package com.cmpe220.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmpe220.model.User;
import com.cmpe220.service.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
}

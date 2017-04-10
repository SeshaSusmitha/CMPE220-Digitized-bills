package com.cmpe220.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmpe220.model.User;
import com.cmpe220.service.UserService;



@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	//allUsers - GET get all users 
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//users/{id} GET, gets one user based on id 
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable int id){
		return userService.getUser(id);
	}
	
	//users - POST create new user
	@RequestMapping(method=RequestMethod.POST, value="/users")
	public User addUser(@RequestBody User user){
		return userService.addUser(user);
	}
	
	//users/{id} - PUT, updates the user
	@RequestMapping(method=RequestMethod.PUT, value="/users/{id}")
	public User updateUser(@RequestBody User user, @PathVariable int id ){
		return userService.updateUser(id, user);
	}
	
	//users/{id} - DELETE, deletes the user
	@RequestMapping(method=RequestMethod.DELETE, value="/users/{id}")
	public void deleteUser(@PathVariable int id ){
		userService.deleteUser(id);
	}
	
	
	
}

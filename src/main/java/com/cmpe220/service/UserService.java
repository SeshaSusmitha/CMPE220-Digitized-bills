package com.cmpe220.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmpe220.model.User;
import com.cmpe220.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@ResponseBody
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll()
		.forEach(users::add);
		return users;
	}
	
	public User getCurrentUser(){
		return userRepository.findOne(1); 
	}
	
	public User getUser(int id){
		return userRepository.findOne(id);
	}
	
	public User addUser(User user){
		return userRepository.save(user);
	}
	
	public User updateUser(int id, User user){
		return userRepository.save(user);
	}
	
	public void deleteUser(int id){
		userRepository.delete(id);
	}
}

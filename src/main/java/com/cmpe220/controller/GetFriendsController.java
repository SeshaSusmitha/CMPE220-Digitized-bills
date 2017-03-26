package com.cmpe220.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cmpe220.model.Friends;
import com.cmpe220.service.GetFriendsService;

@RestController
public class GetFriendsController {
	
	//Autowired marks that this needs dependency injection.
	
	@Autowired
	private GetFriendsService getFriendsService;
	
	@RequestMapping("/getFriends")
	public List<Friends> getAllFriends(){
		return getFriendsService.getAllFriends();
	}

}

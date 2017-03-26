package com.cmpe220.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cmpe220.model.Friends;
import com.cmpe220.repository.GetFriendsRepository;

@Service
public class GetFriendsService {
	
	//Service is created to create a instance.
	
	@Autowired
	private GetFriendsRepository getFriendsRepository;
	
//	private List<Friends> friends = Arrays.asList(
//			new Friends(1,"pooja","Prakash"),
//			new Friends(2, "varun", "gore")
//			);
	
	@ResponseBody
	public List<Friends> getAllFriends(){
		//getFriendsRepository.save(friends);
		List<Friends> friends = new ArrayList<>();
		getFriendsRepository.findAll()
		.forEach(friends::add);
		return friends;
		
	}

}

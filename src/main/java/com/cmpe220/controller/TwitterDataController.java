package com.cmpe220.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmpe220.model.TwitterData;
import com.cmpe220.service.TwitterDataService;

@RestController
public class TwitterDataController {
	
	@Autowired
	private TwitterDataService twitterDataService;
	
	//twitterdatausers - GET get all users 
		@RequestMapping("/twitterdatausers")
		public List<TwitterData> getAllTwitterDataUsers(){
			return twitterDataService.getAllTwitterDataUsers();
		}
		
		//twitterdatausers/{id} GET, gets one user based on id 
		@RequestMapping("/twitterdatausers/{twitterId}")
		public TwitterData getTwitterDataUser(@PathVariable long twitterId){
			return twitterDataService.getTwitterDataUser(twitterId);
		}
		
		//twitterdatausers - POST create new user
		@RequestMapping(method=RequestMethod.POST, value="/twitterdatausers")
		public TwitterData addTwitterDataUser(@RequestBody TwitterData user){
			return twitterDataService.addTwitterDataUser(user);
		}
		
		//twitterdatausers/{id} - PUT, updates the user
		@RequestMapping(method=RequestMethod.PUT, value="/twitterdatausers/{twitterId}")
		public TwitterData updateTwitterDataUser(@RequestBody TwitterData user, @PathVariable long twitterId ){
			return twitterDataService.updateTwitterDataUser(twitterId, user);
		}
		
		//twitterdatausers/{id} - DELETE, deletes the user
		@RequestMapping(method=RequestMethod.DELETE, value="/twitterdatausersusers/{twitterId}")
		public void deleteTwitterDataUser(@PathVariable long twitterId ){
			twitterDataService.deleteTwitterDataUser(twitterId);
		}

}

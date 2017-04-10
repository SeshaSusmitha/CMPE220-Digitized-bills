package com.cmpe220.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cmpe220.model.TwitterData;
import com.cmpe220.repository.TwitterDataRepository;

@Service
public class TwitterDataService {
	
	@Autowired
	private TwitterDataRepository twitterDataRepository;
	
	public List<TwitterData> getAllTwitterDataUsers(){
		List<TwitterData> users = new ArrayList<>();
		twitterDataRepository.findAll()
		.forEach(users::add);
		return users;
	}
	
	public TwitterData getTwitterDataUser(long twitterId){
		return twitterDataRepository.findOne(twitterId);
	}
	
	public TwitterData addTwitterDataUser(TwitterData user){
		return twitterDataRepository.save(user);
	}
	
	public TwitterData updateTwitterDataUser(long id, TwitterData user){
		return twitterDataRepository.save(user);
	}
	
	public void deleteTwitterDataUser(long twitterId){
		twitterDataRepository.delete(twitterId);
	}
	

}

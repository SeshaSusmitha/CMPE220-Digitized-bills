package com.cmpe220.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="twitter_data")
public class TwitterData {

	@Id
	@Column(name="twitter_id")
	long twitterId;
	
	@Column(name="twitter_name")
	String twitterName;

	
	@Column(name="user_id")
	int userId;
	
	

	public TwitterData(long twitterId, String twitterName, int userId) {
		super();
		this.twitterId = twitterId;
		this.twitterName = twitterName;
		this.userId = userId;
	}


	public TwitterData() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}


	public long getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(long twitterId) {
		this.twitterId = twitterId;
	}

	public String getTwitterName() {
		return twitterName;
	}

	public void setTwitterName(String twitterName) {
		this.twitterName = twitterName;
	}
}

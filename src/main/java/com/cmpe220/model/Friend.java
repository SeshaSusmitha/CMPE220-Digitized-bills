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
@Table(name = "friend")
public class Friend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User userId;
	
	@Column(name="date_created")
	String dateCreated;
	
	@Column(name="date_updated")
	String dateUpdated;
	
	@OneToOne
	@JoinColumn(name="friend_id")
	User friendId;
	
	
	
	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(String dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public User getFriendId() {
		return friendId;
	}

	public void setFriendId(User friendId) {
		this.friendId = friendId;
	}

	public Friend(int id, User userId, String dateCreated, String dateUpdated, User friendId) {
		super();
		this.id = id;
		this.userId = userId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.friendId = friendId;
	}

	public Friend(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}

package com.cmpe220.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="token")
	String token;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="email_Id")
	String emailId;
	
	@Column(name="date_created")
	String dateCreated;
	
	@Column(name="date_updated")
	String dateUpdated;
	
	public User(){
		
	}

	public User(int id, String token, String firstName, String lastName, String emailId, String dateCreated,
			String dateUpdated) {
		super();
		this.id = id;
		this.token = token;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	public int getUserId() {
		return id;
	}

	public void setUserId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
}

package com.cmpe220.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class UserGroups {
	
	@EmbeddedId
	private UserGroupId id;
	
	public UserGroups() {
		super();
		
	}

	public UserGroups(UserGroupId id) {
		super();
		this.id = id;
	}

	public UserGroupId getUserGroupId() {
		return id;
	}

	public void setUserGroupId(UserGroupId id) {
		this.id = id;
	}
	
	
	

}

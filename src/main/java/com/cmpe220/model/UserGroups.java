package com.cmpe220.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class UserGroups {
	
	@EmbeddedId
	private UserGroupId userGroupId;
	
	public UserGroups() {
		super();
		
	}

	public UserGroups(UserGroupId userGroupId) {
		super();
		this.userGroupId = userGroupId;
	}

	public UserGroupId getUserGroupId() {
		return userGroupId;
	}

	public void setUserGroupId(UserGroupId userGroupId) {
		this.userGroupId = userGroupId;
	}
	
	
	

}

package com.cmpe220.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groups")
public class Groups {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="group_id")
	int groupId;
	
	@Column(name="group_name")
	String groupName;

	@Column(name="date_created")
	String dateCreated;
	
	@Column(name="date_updated")
	String dateUpdated;
	
	public Groups(){
		
	}
	
	public Groups(int groupId, String groupName, String dateCreated, String dateUpdated) {
		super();
		this.groupId = groupId;
		this.groupName = groupName;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
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

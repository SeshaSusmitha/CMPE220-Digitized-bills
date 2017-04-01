package com.cmpe220.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user_bills")
public class UserBills {
	@EmbeddedId
	private UserBillId userBillId;

	public UserBills(UserBillId userBillId) {
		super();
		this.userBillId = userBillId;
	}

	public UserBills() {
		super();
	}

	public UserBillId getUserBillId() {
		return userBillId;
	}

	public void setUserBillId(UserBillId userBillId) {
		this.userBillId = userBillId;
	}
	
	
}

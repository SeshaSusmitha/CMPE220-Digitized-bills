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
@Table(name="split_receipt")
public class SplitReceipt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="receipt_id")
	int receiptId;
	
	@OneToOne
	@JoinColumn(name="user_id")
	User userId;
	
	@OneToOne
	@JoinColumn(name="bill_id")
	Bill billId;
	
	@OneToOne
	@JoinColumn(name="friend_id")
	Friend friendId;
	
	@OneToOne
	@JoinColumn(name="item_id")
	Items itemId;
	
	@Column(name="amount")
	float amount;
	
	
	public SplitReceipt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SplitReceipt(int receiptId, User userId, Bill billId, Friend friendId, Items itemId, float amount) {
		super();
		this.receiptId = receiptId;
		this.userId = userId;
		this.billId = billId;
		this.friendId = friendId;
		this.itemId = itemId;
		this.amount = amount;
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Bill getBillId() {
		return billId;
	}

	public void setBillId(Bill billId) {
		this.billId = billId;
	}

	public Friend getFriendId() {
		return friendId;
	}

	public void setFriendId(Friend friendId) {
		this.friendId = friendId;
	}

	public Items getItemId() {
		return itemId;
	}

	public void setItemId(Items itemId) {
		this.itemId = itemId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	

}

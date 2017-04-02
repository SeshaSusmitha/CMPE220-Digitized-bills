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

}

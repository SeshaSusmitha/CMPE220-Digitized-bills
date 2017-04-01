package com.cmpe220.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="item_id")
	int itemId;
	
	@Column(name="item_description")
	String itemDescription;
	
	@Column(name="item_price")
	float itemPrice;
	
	@ManyToOne
    @JoinColumn(name="bill_id")
    private Bill billId;
	
	public Items(){
		
	}

	public Items(int itemId, String itemDescription, float itemPrice, Bill billId) {
		super();
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.itemPrice = itemPrice;
		this.billId = billId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Bill getBillId() {
		return billId;
	}

	public void setBillId(Bill billId) {
		this.billId = billId;
	}
	
	

}

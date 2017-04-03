package com.cmpe220.object;

import java.util.List;

public class Item {
	String itemCode;
	String itemDescription;
	String itemAmt;
	List<SplitFriendsDetails> splitFriendsDetails;
	
	public Item() {
		super();
	}
	
	
	public Item(String itemCode, String itemDescription, String itemAmt,
			List<SplitFriendsDetails> splitFriendsDetails) {
		super();
		this.itemCode = itemCode;
		this.itemDescription = itemDescription;
		this.itemAmt = itemAmt;
		this.splitFriendsDetails = splitFriendsDetails;
	}


	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemAmt() {
		return itemAmt;
	}
	public void setItemAmt(String itemAmt) {
		this.itemAmt = itemAmt;
	}
	public List<SplitFriendsDetails> getSplitFriendsDetails() {
		return splitFriendsDetails;
	}
	public void setSplitFriendsDetails(List<SplitFriendsDetails> splitFriendsDetails) {
		this.splitFriendsDetails = splitFriendsDetails;
	}
}

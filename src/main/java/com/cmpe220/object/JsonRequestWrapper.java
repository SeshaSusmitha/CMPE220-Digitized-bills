package com.cmpe220.object;

import java.util.List;

public class JsonRequestWrapper {
	
	String billPath;
	int userID;
	String tax;
	String total;
	String billName;
	List<Item> items;

	public String getBillPath() {
		return billPath;
	}
	public void setBillPath(String billPath) {
		this.billPath = billPath;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
}

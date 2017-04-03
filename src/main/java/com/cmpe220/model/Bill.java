package com.cmpe220.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="tax")
	float tax;
	
	@Column(name="total")
	float total;
	
	@Column(name="bill_path")
	String billPath;
	
	public String getBillPath() {
		return billPath;
	}

	public void setBillPath(String billPath) {
		this.billPath = billPath;
	}

	@OneToOne
	@JoinColumn(name="user_id")
	User UserId;
	
	@OneToMany(mappedBy="billId")
	private Set<Items> items;
	
	public Bill(int id, float tax, float total, String billPath, User userId, Set<Items> items) {
		super();
		this.id = id;
		this.tax = tax;
		this.total = total;
		this.billPath = billPath;
		UserId = userId;
		this.items = items;
	}

	public Bill(){
		
	}

	public int getBillId() {
		return id;
	}

	public void setBillId(int id) {
		this.id = id;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	public User getUserId() {
		return UserId;
	}

	public void setUserId(User userId) {
		UserId = userId;
	}

}

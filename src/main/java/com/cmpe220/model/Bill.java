package com.cmpe220.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="bill_id")
	int billId;
	
	@Column(name="tax")
	float tax;
	
	@Column(name="total")
	float total;
	
	@OneToMany(mappedBy="billId")
	private Set<Items> items;
	
	public Bill(int billId, float tax, float total, Set<Items> items) {
		super();
		this.billId = billId;
		this.tax = tax;
		this.total = total;
		this.items = items;
	}
	
	public Bill(){
		
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
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
	
	

}

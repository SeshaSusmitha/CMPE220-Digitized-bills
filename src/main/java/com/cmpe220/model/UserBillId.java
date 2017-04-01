package com.cmpe220.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class UserBillId implements Serializable {

	@Column(name = "user_id")
    private int userId;
 
    @Column(name = "bill_id")
    private int billId;
}

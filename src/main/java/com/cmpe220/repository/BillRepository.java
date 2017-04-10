package com.cmpe220.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmpe220.model.Bill;


public interface BillRepository  extends CrudRepository<Bill, Integer> {

}


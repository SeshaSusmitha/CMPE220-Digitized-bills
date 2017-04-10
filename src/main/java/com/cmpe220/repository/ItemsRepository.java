package com.cmpe220.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmpe220.model.Items;

public interface ItemsRepository extends CrudRepository<Items, Integer> {

}


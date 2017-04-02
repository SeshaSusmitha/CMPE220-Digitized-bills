package com.cmpe220.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmpe220.model.Friend;

//repository is used to fetch data from DB. Using JPA: in the model, specify it at @entity. 
// This enables the model to be a table in the DB.
// features Hibernate

public interface GetFriendsRepository extends CrudRepository<Friend, Integer> {

}

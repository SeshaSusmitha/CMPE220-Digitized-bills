package com.cmpe220.repository;

import org.springframework.data.repository.CrudRepository;

import com.cmpe220.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}

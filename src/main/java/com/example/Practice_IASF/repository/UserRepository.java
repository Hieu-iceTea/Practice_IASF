package com.example.Practice_IASF.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.Practice_IASF.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
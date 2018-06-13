package com.example.his1stapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.his1stapp.models.User;

public interface UserRepository
extends CrudRepository<User, Integer>{

}

package com.example.his1stapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.his1stapp.models.Hello;

public interface HelloRepository 
        extends CrudRepository<Hello, Integer> {

}

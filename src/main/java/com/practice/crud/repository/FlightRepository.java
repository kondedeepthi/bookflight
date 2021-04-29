package com.practice.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practice.crud.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, Integer> {
	
}

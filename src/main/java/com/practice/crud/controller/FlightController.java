package com.practice.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.crud.model.Flight;
import com.practice.crud.repository.FlightRepository;

@RestController
public class FlightController {
	
	@Autowired
	private FlightRepository repository;
	
	@PostMapping("/addFlight")
	public String saveFlight(@RequestBody Flight flight) {
		repository.save(flight);
		return "Added Flight with id: " + flight.getId();
	}

	@GetMapping("/findFlights")
	public List<Flight> findFlight(){
		return repository.findAll();
	}
	
	@GetMapping("/findFlights/{id}")
	public Optional<Flight> getFlight(int id){
		return repository.findById(id);
	}
}

package com.practice.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "Flight")
public class Flight {

	@Id
	private int id;
	private String flightname;
	private String source;
	private String destination;
}

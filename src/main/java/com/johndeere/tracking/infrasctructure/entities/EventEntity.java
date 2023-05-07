package com.johndeere.tracking.infrasctructure.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;

//@Entity  //TO-DO
public class EventEntity {

	private String eventId;
	
	private String sessionId;
	
	private LocalDateTime eventAt;
	
	private String eventType;
	
	private String payload;
	
}

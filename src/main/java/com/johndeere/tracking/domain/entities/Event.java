package com.johndeere.tracking.domain.entities;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Event {

	private String eventId;
	
	private String sessionId;
	
	private LocalDateTime eventAt;
	
	private String eventType;
	
	private String payload;
}

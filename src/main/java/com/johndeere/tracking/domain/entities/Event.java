package com.johndeere.tracking.domain.entities;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Event {

	private String eventId;
	
	private String sessionId;
	
	private Date eventAt;
	
	private String eventType;
	
	private String payload;
}

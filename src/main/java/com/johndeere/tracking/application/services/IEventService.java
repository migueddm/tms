package com.johndeere.tracking.application.services;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventService {
	
	public Event findById(String eventId);
	
	public Event save(Event event);
	
}

package com.johndeere.tracking.application.services;

import java.util.List;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventService {
	
	public Event findById(String eventId);
	
	public Event save(Event event);
	
	public void saveAll(List<Event> events);
	
}

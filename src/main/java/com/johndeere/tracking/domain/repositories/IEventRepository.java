package com.johndeere.tracking.domain.repositories;

import java.util.List;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventRepository {

	Event findById(String eventId);
	
	Event save(Event event);
	
	void saveAll(List<Event> events);
	
	List<Event> findBySessionId(String sessionId);
}

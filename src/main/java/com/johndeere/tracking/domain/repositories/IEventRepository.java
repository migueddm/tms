package com.johndeere.tracking.domain.repositories;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventRepository {

	Event findById(String eventId);
	
	void save(Event event);
}

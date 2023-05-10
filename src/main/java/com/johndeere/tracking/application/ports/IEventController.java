package com.johndeere.tracking.application.ports;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventController {
	
	ResponseEntity<Event> addEvent(Event event);
	
	void addEvents(List<Event> events);

}

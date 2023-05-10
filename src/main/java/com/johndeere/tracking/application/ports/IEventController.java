package com.johndeere.tracking.application.ports;

import java.util.List;

import com.johndeere.tracking.domain.entities.Event;

public interface IEventController {
	
	void addEvents(List<Event> events);

}

package com.johndeere.tracking.application.services;

import java.util.List;
import java.util.UUID;

import com.johndeere.tracking.domain.entities.Event;
import com.johndeere.tracking.domain.repositories.IEventRepository;

import lombok.Builder;

@Builder
public class EventService implements IEventService {

	private IEventRepository eventRepository;
	
	public Event findById(String eventId) {
		// TO-DO error control (not found)
		return eventRepository.findById(eventId);
	}
	
	public Event save(Event event) {
		String eventId = UUID.randomUUID().toString();
		event.setEventId(eventId);
		return eventRepository.save(event);
	}

	@Override
	public void saveAll(List<Event> events) {
		events.forEach(e -> {
			String eventId = UUID.randomUUID().toString();
			e.setEventId(eventId);
		});
		eventRepository.saveAll(events);
	}
	

}

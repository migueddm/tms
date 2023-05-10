package com.johndeere.tracking.infrastructure.mappers;

import com.johndeere.tracking.domain.entities.Event;
import com.johndeere.tracking.infrasctructure.entities.EventEntity;

public class EventMapper implements IEventMapper {

	@Override
	public EventEntity toEventEntity(Event event) {
		return EventEntity.builder()
				.eventId(event.getEventId())
				.sessionId(event.getSessionId())
				.eventAt(event.getEventAt())
				.eventType(event.getEventType())
				.payload(event.getPayload())
				.build();
	}

	@Override
	public Event toEvent(EventEntity eventEntity) {
		return Event.builder()
				.eventId(eventEntity.getEventId())
				.sessionId(eventEntity.getSessionId())
				.eventAt(eventEntity.getEventAt())
				.eventType(eventEntity.getEventType())
				.payload(eventEntity.getPayload())
				.build();
	}

}

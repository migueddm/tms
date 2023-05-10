package com.johndeere.tracking.infrastructure.mappers;

import com.johndeere.tracking.domain.entities.Event;
import com.johndeere.tracking.infrasctructure.entities.EventEntity;

public interface IEventMapper {

	public EventEntity toEventEntity(Event event);
	
	public Event toEvent(EventEntity eventEntity);
	
}

package com.johndeere.tracking.infrasctructure.repositories;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import com.johndeere.tracking.infrasctructure.entities.EventEntity;
import com.johndeere.tracking.infrastructure.mappers.IEventMapper;

import lombok.Builder;

import com.johndeere.tracking.domain.entities.Event;
import com.johndeere.tracking.domain.repositories.IEventRepository;

@Repository
@Builder
public class EventRepository implements IEventRepository{
	
	private final JPAEventRepository jpaEventRepository;
	
	private final IEventMapper eventMapper;

	@Override
	public Event findById(String eventId) {
		// TO-DO Error control & validation
		EventEntity result = jpaEventRepository.findById(eventId)
				.orElse(null); // TO-DO EXCEPTION
		return eventMapper.toEvent(result);
	}

	@Override
	public Event save(Event event) {
		EventEntity sess = eventMapper.toEventEntity(event);
		EventEntity result = jpaEventRepository.save(sess);
		if (result == null) {
			// TO-DO Exception
		}
		return eventMapper.toEvent(result);
	}

	@Override
	public void saveAll(List<Event> events) {
		// TO-DO
	}

	@Override
	public List<Event> findBySessionId(String sessionId) {
		List<Event> events = new ArrayList<>();
		List<EventEntity> eventsEntity = jpaEventRepository.findBySessionId(sessionId);
		eventsEntity.forEach(e -> events.add(eventMapper.toEvent(e)));
		return events;
	}

}

package com.johndeere.tracking.infrasctructure.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.johndeere.tracking.application.services.IEventService;
import com.johndeere.tracking.application.services.EventService;
import com.johndeere.tracking.domain.repositories.IEventRepository;
import com.johndeere.tracking.infrastructure.mappers.IEventMapper;
import com.johndeere.tracking.infrastructure.mappers.EventMapper;

@Configuration
public class EventConfiguration {
	
	@Bean
	IEventService eventService(final IEventRepository eventRepository) {
		return EventService.builder().eventRepository(eventRepository).build();
	}
	
	@Bean IEventMapper eventMapper() {
		return new EventMapper();
	}

}

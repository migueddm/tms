package com.johndeere.tracking.presentation.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johndeere.tracking.application.ports.IEventController;
import com.johndeere.tracking.application.services.IEventService;
import com.johndeere.tracking.application.services.ISessionService;
import com.johndeere.tracking.domain.entities.Event;

import lombok.Builder;

@RestController
@RequestMapping("/events")
@Builder
public class EventController implements IEventController{
	
	private final IEventService eventService;

	@PostMapping("")
	public void addEvents(@RequestBody List<Event> events) {
		eventService.saveAll(events);
	}

}

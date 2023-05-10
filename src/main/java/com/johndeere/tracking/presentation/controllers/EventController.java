package com.johndeere.tracking.presentation.controllers;

import java.util.List;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	@PostMapping("/create")
	public ResponseEntity<Event> addEvent(@RequestBody Event event) {
		Event result = eventService.save(event);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@Override
	public void addEvents(List<Event> events) {
		// TODO Auto-generated method stub
		
	}

}

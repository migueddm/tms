package com.johndeere.tracking.presentation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johndeere.tracking.application.ports.ISessionController;
import com.johndeere.tracking.application.services.ISessionService;
import com.johndeere.tracking.domain.entities.Session;

@RestController
@RequestMapping("/sessions")
public class SessionController implements ISessionController {

	private final ISessionService sessionService;
	
	public SessionController(ISessionService sessionService) {
		this.sessionService = sessionService;
	}	
	
	@PostMapping("/create")
	public ResponseEntity<Session> createSession(@RequestBody Session session) {
		Session result = sessionService.save(session);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@PutMapping("/end")
	public ResponseEntity<Session> endSession(@RequestBody Session session) {
		Session result = sessionService.update(session);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

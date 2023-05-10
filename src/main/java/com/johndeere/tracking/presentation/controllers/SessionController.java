package com.johndeere.tracking.presentation.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.johndeere.tracking.application.ports.ISessionController;
import com.johndeere.tracking.application.services.ISessionService;
import com.johndeere.tracking.domain.entities.Session;

import lombok.Builder;

@RestController
@RequestMapping("/sessions")
@Builder
public class SessionController implements ISessionController {

	private final ISessionService sessionService;
	
	@PostMapping("")
	public ResponseEntity<Session> createSession(@RequestBody Session session) {
		Session result = sessionService.save(session);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	}

	@PutMapping("/{sessionId}")
	public ResponseEntity<Session> endSession(@PathVariable String sessionId, @RequestBody Session session) {
		Session result = sessionService.update(session);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}

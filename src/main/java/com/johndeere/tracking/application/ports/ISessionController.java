package com.johndeere.tracking.application.ports;

import org.springframework.http.ResponseEntity;

import com.johndeere.tracking.domain.entities.Session;

public interface ISessionController {

	ResponseEntity<Session> createSession(Session session);
	
	ResponseEntity<Session> endSession(Session session);
}

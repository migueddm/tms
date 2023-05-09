package com.johndeere.tracking.application.services;

import java.util.UUID;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.domain.repositories.ISessionRepository;

import lombok.Builder;

@Builder
public class SessionService implements ISessionService {

	private ISessionRepository sessionRepository;
	
	public Session findById(String sessionId) {
		// TO-DO error control (not found)
		return sessionRepository.findById(sessionId);
	}
	
	public Session save(Session session) {
		String sessionId = UUID.randomUUID().toString();
		session.setSessionId(sessionId);
		return sessionRepository.save(session);
	}
	
	public Session update(Session session) {
		// TO-DO error control (not found)
		return sessionRepository.update(session);
	}
}

package com.johndeere.tracking.application.services;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.domain.repositories.ISessionRepository;

public class SessionService implements ISessionService {

	private ISessionRepository sessionRepository;
	
	public SessionService(ISessionRepository sessionRepository) {
		this.sessionRepository = sessionRepository;
	}
	
	public Session findById(String sessionId) {
		// TO-DO error control (not found)
		return sessionRepository.findById(sessionId);
	}
	
	public void save(Session session) {
		System.out.println("am i here?????");
		sessionRepository.save(session);
	}
	
	public void update(Session session) {
		// TO-DO error control (not found)
		sessionRepository.update(session);
	}
}
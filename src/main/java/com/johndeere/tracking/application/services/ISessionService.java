package com.johndeere.tracking.application.services;

import com.johndeere.tracking.domain.entities.Session;

public interface ISessionService {
	
	public Session findById(String sessionId);
	
	public Session save(Session session);
	
	public Session update(Session session);
}

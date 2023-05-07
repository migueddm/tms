package com.johndeere.tracking.application.services;

import com.johndeere.tracking.domain.entities.Session;

public interface ISessionService {
	
	public Session findById(String sessionId);
	
	public void save(Session session);
	
	public void update(Session session);
}

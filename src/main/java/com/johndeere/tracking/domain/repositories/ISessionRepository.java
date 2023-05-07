package com.johndeere.tracking.domain.repositories;

import com.johndeere.tracking.domain.entities.Session;

public interface ISessionRepository {
	
	Session findById(String sessionId);
	
	Session save(Session session);
	
	Session update(Session session);

}

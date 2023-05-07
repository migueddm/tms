package com.johndeere.tracking.infrasctructure.repositories;

import org.springframework.stereotype.Repository;
import com.johndeere.tracking.infrasctructure.entities.SessionEntity;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.domain.repositories.ISessionRepository;

@Repository
public class SessionRepository implements ISessionRepository{
	
	private final JPASessionRepository jpaSessionRepository;
	
	public SessionRepository (JPASessionRepository jpaSessionRepository) {
		this.jpaSessionRepository = jpaSessionRepository;
	}

	@Override
	public Session findById(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session save(Session session) {
		SessionEntity sess = new SessionEntity();
		sess.setSessionId("1234451");  // TO-DO Generate random id
		jpaSessionRepository.save(sess);
		return session;
	}

	@Override
	public Session update(Session session) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

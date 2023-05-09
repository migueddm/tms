package com.johndeere.tracking.infrasctructure.repositories;

import org.springframework.stereotype.Repository;
import com.johndeere.tracking.infrasctructure.entities.SessionEntity;
import com.johndeere.tracking.infrastructure.mappers.ISessionMapper;

import lombok.Builder;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.domain.repositories.ISessionRepository;

@Repository
@Builder
public class SessionRepository implements ISessionRepository{
	
	private final JPASessionRepository jpaSessionRepository;
	
	private final ISessionMapper sessionMapper;

	@Override
	public Session findById(String sessionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session save(Session session) {
		SessionEntity sess = sessionMapper.toSessionEntity(session);
		SessionEntity result = jpaSessionRepository.save(sess);
		System.out.println(result);
		if (result == null) {
			// TO-DO Exception
		}
		return sessionMapper.toSession(result);
	}

	@Override
	public Session update(Session session) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

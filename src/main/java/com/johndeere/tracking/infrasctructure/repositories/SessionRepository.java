package com.johndeere.tracking.infrasctructure.repositories;

import java.util.Optional;

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
		// TO-DO Error control & validation
		SessionEntity result = jpaSessionRepository.findById(sessionId)
				.orElse(null); // TO-DO EXCEPTION
		return sessionMapper.toSession(result);
	}

	@Override
	public Session save(Session session) {
		SessionEntity sess = sessionMapper.toSessionEntity(session);
		SessionEntity result = jpaSessionRepository.save(sess);
		if (result == null) {
			// TO-DO Exception
		}
		return sessionMapper.toSession(result);
	}

	@Override
	public Session update(Session session) {
		SessionEntity sessionEntity = jpaSessionRepository.findById(session.getSessionId())
		.orElse(null); // TO-DO EXCEPTION
		SessionEntity result = SessionEntity.builder()
				.sessionId(sessionEntity.getSessionId())
				.userId(sessionEntity.getUserId())
				.machineId(sessionEntity.getMachineId())
				.startAt(sessionEntity.getStartAt())
				.endAt(session.getEndAt())
				.orgId(sessionEntity.getOrgId())
				.build();
		return sessionMapper.toSession(result);
	}
	
	

}

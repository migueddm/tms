package com.johndeere.tracking.infrastructure.mappers;

import java.util.UUID;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.infrasctructure.entities.SessionEntity;

public class SessionMapper implements ISessionMapper {

	@Override
	public SessionEntity toSessionEntity(Session session) {
		return SessionEntity.builder()
				.sessionId(session.getSessionId())
				.userId(session.getUserId())
				.machineId(session.getMachineId())
				.startAt(session.getStartAt())
				.endAt(session.getEndAt())
				.orgId(session.getOrgId())
				.build();
	}

	@Override
	public Session toSession(SessionEntity sessionEntity) {
		return Session.builder()
				.sessionId(sessionEntity.getSessionId())
				.userId(sessionEntity.getUserId())
				.machineId(sessionEntity.getMachineId())
				.startAt(sessionEntity.getStartAt())
				.endAt(sessionEntity.getEndAt())
				.orgId(sessionEntity.getOrgId())
				.build();
	}

}

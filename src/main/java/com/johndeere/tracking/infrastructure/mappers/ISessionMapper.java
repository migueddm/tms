package com.johndeere.tracking.infrastructure.mappers;

import com.johndeere.tracking.domain.entities.Session;
import com.johndeere.tracking.infrasctructure.entities.SessionEntity;

public interface ISessionMapper {

	public SessionEntity toSessionEntity(Session session);
	
	public Session toSession(SessionEntity sessionEntity);
	
}

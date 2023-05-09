package com.johndeere.tracking.infrasctructure.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.johndeere.tracking.application.services.ISessionService;
import com.johndeere.tracking.application.services.SessionService;
import com.johndeere.tracking.domain.repositories.ISessionRepository;

@Configuration
public class SessionConfiguration {
	
	@Bean
	ISessionService sessionService(final ISessionRepository sessionRepository) {
		return SessionService.builder().sessionRepository(sessionRepository).build();
	}
	
	

}

package com.johndeere.tracking.infrasctructure.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.johndeere.tracking.infrasctructure.entities.EventEntity;

@Repository
public interface JPAEventRepository extends JpaRepository<EventEntity, String>{

	List<EventEntity> findBySessionId(String sessionId);
	
}

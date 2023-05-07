package com.johndeere.tracking.infrasctructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johndeere.tracking.infrasctructure.entities.SessionEntity;

public interface JPASessionRepository extends JpaRepository<SessionEntity, Long>{

}

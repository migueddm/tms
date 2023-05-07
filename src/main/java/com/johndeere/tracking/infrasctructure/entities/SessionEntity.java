package com.johndeere.tracking.infrasctructure.entities;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Builder;

@Builder
@Entity
@Table(name = "sessions")
public class SessionEntity {

	@Id
	private String sessionId;
	
	@Column(name = "start_at")
	private LocalDateTime startAt;
	
	@Column(name = "end_at")
	private LocalDateTime endAt;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "machine_id")
	private String machineId;
	
	@Column(name = "org_id")
	private int orgId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public LocalDateTime getStartAt() {
		return startAt;
	}

	public void setStartAt(LocalDateTime startAt) {
		this.startAt = startAt;
	}

	public LocalDateTime getEndAt() {
		return endAt;
	}

	public void setEndAt(LocalDateTime endAt) {
		this.endAt = endAt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public int getOrgId() {
		return orgId;
	}

	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	
	
}

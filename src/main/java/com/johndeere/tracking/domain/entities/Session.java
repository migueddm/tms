package com.johndeere.tracking.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data  // TO-DO Check why lombok is not working correctly
public class Session implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String sessionId;
	
	private Date startAt;
	
	private Date endAt;
	
	private String userId;
	
	private String machineId;
	
	private int orgId;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

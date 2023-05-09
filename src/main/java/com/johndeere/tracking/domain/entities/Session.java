package com.johndeere.tracking.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.Data;

@Data
public class Session implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private String sessionId;
	
	private Date startAt;
	
	private Date endAt;
	
	private String userId;
	
	private String machineId;
	
	private int orgId;

}

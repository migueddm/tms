package com.johndeere.tracking.infrasctructure.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sessions")
@Builder
@Data
@NoArgsConstructor     
@AllArgsConstructor    // Hibernate needs this constructors
public class SessionEntity {

	@Id
	private String sessionId;
	
	@Column(name = "start_at")
	private Date startAt;
	
	@Column(name = "end_at")
	private Date endAt;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "machine_id")
	private String machineId;
	
	@Column(name = "org_id")
	private int orgId;
	
}

package com.johndeere.tracking.infrasctructure.entities;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Builder
@Data
@NoArgsConstructor     
@AllArgsConstructor    // Hibernate needs this constructors
public class EventEntity {

	@Id
	private String eventId;
	
	@Column(name = "session_id")  // Foreign key
	private String sessionId;
	
	@Column(name = "event_at")
	private Date eventAt;
	
	@Column(name = "event_type")
	private String eventType;
	
	@Column(name = "payload")
	private String payload;
	
}

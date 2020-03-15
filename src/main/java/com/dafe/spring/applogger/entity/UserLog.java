package com.dafe.spring.applogger.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="log")
public class UserLog {

	//define field
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_id")
	private String userId;
	
	@Column(name="session_id")
	private String sessionId;
	
	
	//define constructors
	
	public UserLog() {
		
	}


	public UserLog(String userId, String sessionId) {
		this.userId = userId;
		this.sessionId = sessionId;
	}
	//define getters and setters


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getSessionId() {
		return sessionId;
	}


	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}


	@Override
	public String toString() {
		return "Log [id=" + id + ", userId=" + userId + ", sessionId=" + sessionId + "]";
	}

		
	//define toString
	
	
}

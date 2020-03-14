package com.dafe.spring.applogger.entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="log_id")
	private ArrayList<Action>action;
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

	//define toString

	@Override
	public String toString() {
		return "Log [id=" + id + ", userId=" + userId + ", sessionId=" + sessionId + "]";
	}

	public void addAction(Action tempAction) {
	
		if (action == null) {
		action = new ArrayList<>();
		}
		
		action.add(tempAction);
	}
	
	
}

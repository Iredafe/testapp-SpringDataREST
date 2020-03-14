package com.dafe.spring.applogger.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name="action")
public class Action {
	
	//declare & annotate your fields
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
	private int id;

@Column(name="time")
	private Timestamp logTime;
	
@Column(name="type")
	private String logType;
	
@Column(name="log_id")
	private int userLogId;
	
	//create and generate constructor
	public Action() {
		
	}

	public Action(Timestamp logTime, String logType, int logId) {
		this.logTime = logTime;
		this.logType = logType;
		this.userLogId = userLogId;
	}
	
	
	//generate getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Timestamp getLogTime() {
		return logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}

	public int getLogId() {
		return userLogId;
	}

	public void setLogId(int logId) {
		this.userLogId = logId;
	}

	//generate toString 
	
	@Override
	public String toString() {
		return "Action [id=" + id + ", logTime=" + logTime + ", logType=" + logType + ", userLogId=" + userLogId + "]";
	}
	
		
}




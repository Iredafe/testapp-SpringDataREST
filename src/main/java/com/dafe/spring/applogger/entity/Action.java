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
	private int logId;
	
	//create and generate constructor
	public Action() {
		
	}
	
	//generate getters and setters
	
	
	//generate toString 
	
	
}




package com.dafe.spring.applogger.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="action")
public class Action {

    //declare & annotate your fields
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id")
    private int id;

@Column(name="time")
    private Timestamp time;

@Column(name="type")
    private String type;


@ManyToOne
@JoinColumn(name="log_id")
private UserLog userLog;

public Action(int id, Timestamp time, String type, UserLog userLog) {
    this.id = id;
    this.time = time;
    this.type = type;
    this.userLog = userLog;
}

    //create and generate constructor
    public Action() {

    }

    public Action(Timestamp time, String type, UserLog userLog) {
		this.time = time;
		this.type = type;
		this.userLog = userLog;
	}

	//generate getters and setters

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public UserLog getUserLog() {
		return userLog;
	}

	public void setUserLog(UserLog userLog) {
		this.userLog = userLog;
	}

	@Override
	public String toString() {
		return "Action [time=" + time + ", type=" + type + ", userLog=" + userLog + "]";
	}

    //generate toString 



}
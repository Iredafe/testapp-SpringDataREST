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

import com.fasterxml.jackson.annotation.JsonIgnore;


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

@JsonIgnore
@ManyToOne
@JoinColumn(name="log_id")
private UserLog userLog;


    //create and generate constructor
    public Action() {

    }

    public Action(Timestamp time, String type) {
		this.time = time;
		this.type = type;
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

	@Override
	public String toString() {
		return "Action [time=" + time + ", type=" + type  + "]";
	}

    //generate toString 



}
package com.dafe.spring.applogger.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    
    @OneToMany(mappedBy="userLog",cascade=CascadeType.ALL)
        private List<Action>action;
    //define constructors

    public UserLog() {
    	
    }
    
    public UserLog(String userId, String sessionId) {
        this.userId = userId;
        this.sessionId = sessionId;
    }
    //define getters and setters


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

    public List<Action> getAction() {
        return action;
    }


    public void setAction(List<Action> action) {
        this.action = action;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
	}

    @Override
    public String toString() {
        return "Log [userId=" + userId + ", sessionId=" + sessionId + "]";
    }

}
package com.dafe.spring.applogger.dao;

import java.util.List;

import com.dafe.spring.applogger.entity.UserLog;

public interface UserLogDAO {

	//return the list of logs in large volumes
	//inject userLogDao using constructor injection
	public List <UserLog> findAll();

//find the log by id
public UserLog findById(int theId);

//	save the log by id
public void save(UserLog theUserLog);


	//delete a log by id

public void deleteById(int theId);

}

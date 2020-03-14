package com.dafe.spring.applogger.dao;

import java.util.List;

import com.dafe.spring.applogger.entity.UserLog;

public interface UserLogDAO {

	//inject userLogDao using constructor injection
	public List <UserLog> findAll();




}

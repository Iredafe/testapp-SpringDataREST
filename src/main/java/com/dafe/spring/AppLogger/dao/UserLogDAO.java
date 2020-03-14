package com.dafe.spring.AppLogger.dao;

import java.util.List;

import com.dafe.spring.AppLogger.entity.UserLog;

public interface UserLogDAO {

	
	public List <UserLog> findAll();
}

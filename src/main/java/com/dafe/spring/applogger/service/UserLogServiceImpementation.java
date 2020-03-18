package com.dafe.spring.applogger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dafe.spring.applogger.dao.UserLogDAO;
import com.dafe.spring.applogger.entity.UserLog;

@Service
public class UserLogServiceImpementation implements UserLogService {

	
	private UserLogDAO userLogDAO;
	
	@Autowired
	public UserLogServiceImpementation (UserLogDAO theUserLogDao) {
		userLogDAO = theUserLogDao;
		
	}
	
	@Override
	@Transactional
	public List<UserLog> findAll() {

		return userLogDAO.findAll();
	}

	@Override
	@Transactional
	public UserLog findById(String theUserId) {
		
		return userLogDAO.findById(theUserId);
	}

	@Override
	@Transactional
	public void save(UserLog theUserLog) {

		userLogDAO.save(theUserLog);
	}

	@Override
	@Transactional
	public void deleteById(String theUserId) {
		userLogDAO.deleteById(theUserId);
		
	}

		
	}

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
	public UserLog findById(int theId) {
		
		return userLogDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(UserLog theUserLog) {

		userLogDAO.save(theUserLog);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		userLogDAO.deleteById(theId);
		
	}

		
	}

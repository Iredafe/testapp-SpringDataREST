package com.dafe.spring.applogger.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafe.spring.applogger.dao.UserLogDAO;
import com.dafe.spring.applogger.entity.UserLog;

@RestController
@RequestMapping("/api")
public class UserLogRestController {
	
	@Autowired
	private UserLogDAO userLogDao;
	
	//inject logDao using constructor injection
		public UserLogRestController(UserLogDAO theUserLogDao) {
		
	}

	//expose logs and return list of logs
	@GetMapping("/userLog")
	public List<UserLog> findAll(){
		
		return userLogDao.findAll();
		
	}
	
}

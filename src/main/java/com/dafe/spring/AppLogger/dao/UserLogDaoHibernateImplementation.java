package com.dafe.spring.AppLogger.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dafe.spring.AppLogger.entity.UserLog;

@Repository
public class UserLogDaoHibernateImplementation implements UserLogDAO {

	
	//define field for entity manager
	private EntityManager entityManager;
	
	
	
	//set up constructor injection
	@Autowired
	public UserLogDaoHibernateImplementation(EntityManager theManger) {
	
	
	
	}
	
	
	
	@Override
	public List<UserLog> findAll() {

		
		return null;
	}

}

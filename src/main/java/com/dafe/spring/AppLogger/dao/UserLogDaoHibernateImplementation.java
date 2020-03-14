package com.dafe.spring.AppLogger.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dafe.spring.AppLogger.entity.UserLog;

@Repository
public class UserLogDaoHibernateImplementation implements UserLogDAO {

	
	//define field for entity manager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public UserLogDaoHibernateImplementation(EntityManager theEntityManager) {
	
	entityManager= theEntityManager;
	}
	
	@Override
	@Transactional
	public List<UserLog> findAll() {

		//get the current hibernate session from entity manager
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		//create a query
		
		//execute query and get result list
		
		//return the results
		
		
		return null;
	}

}

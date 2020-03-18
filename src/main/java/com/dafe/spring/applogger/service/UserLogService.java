package com.dafe.spring.applogger.service;

import java.util.List;

import com.dafe.spring.applogger.entity.UserLog;

public interface UserLogService {


public List <UserLog> findAll();

public UserLog findById(int theId);

public void save(UserLog theUserLog);

public void deleteById(int theId);


}

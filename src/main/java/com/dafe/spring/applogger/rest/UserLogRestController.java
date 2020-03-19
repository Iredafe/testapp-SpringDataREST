package com.dafe.spring.applogger.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dafe.spring.applogger.entity.UserLog;
import com.dafe.spring.applogger.service.UserLogService;

@RestController
@RequestMapping("/api")
public class UserLogRestController {
	
		private UserLogService userLogService;
	
	//inject logDao using constructor injection
		@Autowired
	public UserLogRestController(UserLogService theUserLogService) {
		
			userLogService = theUserLogService;
	}

	//expose logs and return list of logs
	@GetMapping("/userLog")
	public List<UserLog> findAll(){
		
		return userLogService.findAll();
	}

	
	//add mapping for GET userLog/{UserId}
		
	@GetMapping("/userLog/{theUserId}")
	public UserLog getUserLog(@PathVariable int theUserId) {
		
		UserLog theUserLog = userLogService.findById(theUserId);
		if (theUserLog==null) {
			throw new RuntimeException("User Id not found - " + theUserId);
			}
	return theUserLog;	
	}
	
//add mapping POST for a new user
@PostMapping("/userLog")
public UserLog addUser(@RequestBody UserLog theUserLog)
{
	
	//just in case they pass an id in JSoN...set id to 0
	//this is to force a save of new item instead of update
	theUserLog.setId(0);
	userLogService.save(theUserLog);
	
	return theUserLog;
	}
	
	
//add mapping for PUT/userLog to update existing user

 @PutMapping("/userLog")
public UserLog updateUser(@RequestBody UserLog theUserLog){

	userLogService.save(theUserLog);
	
	return theUserLog;
}

//add mapping for DELETE
 @DeleteMapping("/userLog/{theUserId}")
 public String deleteUser(@PathVariable int theUserId) {
	 
	 UserLog tempUser= userLogService.findById(theUserId);
	 
	 userLogService.deleteById(theUserId);
	 //throw exception if null
	 
	 if (tempUser==null) {
		 throw new RuntimeException("User Id not found - " + theUserId);
	 }
	 
	 userLogService.deleteById(theUserId); 
 
 return "Deleted User Id  - " + theUserId;
}
}

	


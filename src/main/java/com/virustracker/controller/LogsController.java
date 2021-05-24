package com.virustracker.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.Logs;
import com.virustracker.services.LogsService;

@CrossOrigin()
@RestController
@RequestMapping(path = "/logs")
public class LogsController {
	
	@Autowired
	private LogsService logsService;
	
// 	GET REQ for all logs
	@RequestMapping(path = "/all")
	public Iterable<Logs> getAllLogs(){
		return logsService.getAllLogs();
	}
	
//	POST REQ when user scan QR code
	@RequestMapping(method = RequestMethod.POST, path = "/add")
	public void addUserLogs(@RequestBody Logs logs) {
		logsService.addUserLogs(logs);
	}
	
// 	GET REQ for logs of virus positive person
	@RequestMapping(path = "/user/{userId}")
	public Iterable<Logs> getUserLogs(@PathVariable String userId){
		return logsService.getUserLogs(userId);
	}
	
// 	GET REQ for exposed users
	@RequestMapping(path = "/users/exposed/{userId}")
	public Set<Logs> getExposedUsers(@PathVariable String userId){
		return logsService.getExposedUsers(userId);
	}

}

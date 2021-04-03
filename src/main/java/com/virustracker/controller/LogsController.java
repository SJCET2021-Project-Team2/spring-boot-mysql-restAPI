package com.virustracker.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.Logs;
import com.virustracker.services.LogsService;

@RestController
@RequestMapping(path = "/logs")
public class LogsController {
	
	@Autowired
	private LogsService logsService;
	
// 	GET REQ
	@RequestMapping(path = "/all")
	public Iterable<Logs> getAllLogs(){
		return logsService.getAllLogs();
	}
	
//	POST REQ
	@RequestMapping(method = RequestMethod.POST, path = "/add")
	public void addUserLogs(@RequestBody Logs logs) {
		logsService.addUserLogs(logs);
	}

}

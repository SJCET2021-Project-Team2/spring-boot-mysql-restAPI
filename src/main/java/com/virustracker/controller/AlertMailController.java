package com.virustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.services.AlertMailService;

@CrossOrigin()
@RestController()
@RequestMapping(path = "/alert/user/mail/")
public class AlertMailController {
	
	@Autowired
	private AlertMailService alertMailService;
	
//	POST REQ to send alert mail
	@RequestMapping(method = RequestMethod.POST, path = "/{mailId}")
	public void sendAlertMail(@RequestBody String mailId) {
		alertMailService.sendAlertMail(mailId);
	}
}

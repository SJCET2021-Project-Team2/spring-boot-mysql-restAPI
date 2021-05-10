package com.virustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.AlertMail;
import com.virustracker.services.AlertMailService;

@CrossOrigin()
@RestController()
@RequestMapping(path = "/alert/users/mail")
public class AlertMailController {
	
	@Autowired
	private AlertMailService alertMailService;


	@RequestMapping(method = RequestMethod.POST, path = "")
	public void sendAlertMail(@RequestBody AlertMail userMailId) {
//		System.out.println("test.........1");
		alertMailService.sendAlertMail(userMailId);
	}
}

package com.virustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.AlertMail;
import com.virustracker.services.AlertMailService;

@Component
@CrossOrigin()
@RestController()
@RequestMapping(path = "/alert/users/mail")
public class AlertMailController {
	
	@Autowired
	private AlertMailService alertMailService;
	@Autowired
	private Environment env;
		
	
	@RequestMapping(path = "/demo")
	public String demo() {
		return env.getProperty("spring.mail.username");
	}

	@RequestMapping(method = RequestMethod.POST, path = "")
	public void sendAlertMail(@RequestBody AlertMail alertMail) {
		System.out.println("T E S T ...............1");
		alertMailService.sendAlertMail(alertMail);
	}
}

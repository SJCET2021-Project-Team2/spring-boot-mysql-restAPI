package com.virustracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.virustracker.entity.AlertMail;

@Service
public class AlertMailService {

	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendAlertMail(AlertMail userMailId) {
		System.out.println("test.........2" + userMailId.getUserMailId());
		
		SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(userMailId.getUserMailId());
        msg.setSubject("Testing from Spring Boot");
        msg.setText("Hello World \n Spring Boot Email");
        javaMailSender.send(msg);
        
        System.out.println("send mail");
	}

}

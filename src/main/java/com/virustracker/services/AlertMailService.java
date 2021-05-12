package com.virustracker.services;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.virustracker.entity.AlertMail;

@Service
public class AlertMailService {

	@Value("${spring.mail.properties.mail.smtp.starttls.enable}")
	private boolean starttls;
	@Value("${spring.mail.host}")
	private String host;
	@Value("${spring.mail.username}")
	private String username;
	@Value("${spring.mail.password}")
	private String password;
	@Value("${spring.mail.port}")
	private int port;

	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost(this.host);
		mailSender.setPort(this.port);
		mailSender.setUsername(this.username);
		mailSender.setPassword(this.password);
		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");
		return mailSender;
	}

	public void sendAlertMail(AlertMail alertMail) {

		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setFrom(username);
		msg.setTo(alertMail.getUserMailId());
		msg.setSubject("Virus Tracker Alert");
		msg.setText(alertMail.getAlertMsg());
		JavaMailSender javaMailSender = this.getJavaMailSender();
		javaMailSender.send(msg);
		System.out.println("Email sent successfully to " + alertMail.getUserMailId());
	}

}

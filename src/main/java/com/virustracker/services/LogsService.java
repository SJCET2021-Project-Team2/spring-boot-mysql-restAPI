package com.virustracker.services;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virustracker.entity.Logs;
import com.virustracker.repository.LogsRepository;

@Service
public class LogsService {
	
	@Autowired
	private LogsRepository logsRepository;

	public void addUserLogs(Logs logs) {
		logs.setUserEntryDate(LocalDate.now());
		logs.setUserEntryTime(LocalTime.now());
		logsRepository.save(logs);
	}

	public Iterable<Logs> getAllLogs() {
		return logsRepository.findAll();
	}

	public Iterable<Logs> getUserLogs(Integer userId) {
		return logsRepository.findAllByUserId(userId);
	}
	
		
	public Iterable<Logs> getExposedUsers(Integer userId) {
		System.out.println(logsRepository.findAllExposedUsersByUserId(userId));
		return logsRepository.findAllExposedUsersByUserId(userId);
	}
	
}

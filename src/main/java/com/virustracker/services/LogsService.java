package com.virustracker.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

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

	public Iterable<Logs> getUserLogs(String userId) {
		return logsRepository.findAllByUserIdByOrderByUserEntryDateDesc(userId);
//		return logsRepository.findAllByUserId(userId);
	}
	
		
	public Set<Logs> getExposedUsers(String userId) {
		
		Iterable<Logs> userLogs;
		Set<Logs> exposedUserLogs = new LinkedHashSet<Logs>(); 
		userLogs = logsRepository.findAllByUserId(userId);
		
		for( Logs log : userLogs ) {
			exposedUserLogs.addAll(logsRepository.findAllExposedUsersByUserId(log.getUserId(), log.getPremisesId(), log.getUserEntryDate(), log.getUserEntryTime()));
		}
		System.out.println(exposedUserLogs);
		return exposedUserLogs;
	}
}

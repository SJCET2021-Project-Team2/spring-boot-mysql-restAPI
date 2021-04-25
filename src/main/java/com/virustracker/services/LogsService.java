package com.virustracker.services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
		
	public List<Logs> getExposedUsers(Integer userId) {
		
		Iterable<Logs> userLogs;
		List<Integer> premisesId = new ArrayList<>();
		List<LocalDate> date = new ArrayList<>();
		List<LocalTime> time = new ArrayList<>();
		userLogs = logsRepository.findAllByUserId(userId);
		
		for( Logs log : userLogs ) {
			premisesId.add(log.getPremisesId());
			date.add(log.getUserEntryDate());
			time.add(log.getUserEntryTime());
		}
		
		System.out.println(premisesId + "  " + date + " " + time);

//		List<Logs> logs = new ArrayList<>();
//		List<Logs> exposedUser = new ArrayList<>();
//		LocalDate date;
//		LocalTime time;
//		logs = logsRepository.findAllExposedUsersByUserId(userId);
//		for (Logs log : logs) {
//			date = log.getUserEntryDate();
//			time = log.getUserEntryTime();
//		}
		return logsRepository.findAllExposedUsersByUserId(userId);
	}
	
}

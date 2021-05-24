package com.virustracker.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.virustracker.entity.Logs;


public interface LogsRepository extends CrudRepository<Logs, Integer>{
	
	Iterable<Logs> findAllByUserId(String userId);
	
	@Query("from Logs where premises_id = ?2 and user_entry_date = ?3 and user_entry_time >= ?4 and user_id != ?1")
	Set<Logs> findAllExposedUsersByUserId(String userId, String premisesId, LocalDate userEntryDate, LocalTime userEntryTime);

}

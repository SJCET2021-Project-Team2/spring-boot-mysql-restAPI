package com.virustracker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.virustracker.entity.Logs;


public interface LogsRepository extends CrudRepository<Logs, Integer>{
	
	Iterable<Logs> findAllByUserId(Integer userId);

	@Query("from Logs where user_id != ?1")
	Iterable<Logs> findAllExposedUsersByUserId(Integer userId);

//	@Query("from Logs where user_entry_date >= '2021-04-21' and user_entry_time >= '22:' and user_id != :userId")
//	@Query("from Logs where user_entry_date >= '2021-04-21' and user_entry_time >= '22:' and premises_id in(premises_id FROM Logs where user_id = :userId) and user_id != :userId")
//	public Iterable<Logs> findAllById(@Param("userId") Integer userId);
	
}

package com.virustracker.repository;

import org.springframework.data.repository.CrudRepository;
import com.virustracker.entity.Logs;


public interface LogsRepository extends CrudRepository<Logs, Integer>{

}

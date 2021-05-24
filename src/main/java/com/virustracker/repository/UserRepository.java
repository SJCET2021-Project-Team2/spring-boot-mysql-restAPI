package com.virustracker.repository;


import org.springframework.data.repository.CrudRepository;
import com.virustracker.entity.Users;

public interface UserRepository extends CrudRepository<Users, String>{


}

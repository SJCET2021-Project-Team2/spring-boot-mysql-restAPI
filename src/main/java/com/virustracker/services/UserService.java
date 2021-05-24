package com.virustracker.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virustracker.entity.Users;
import com.virustracker.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public Iterable<Users> getAllUser() {
		return userRepository.findAll();
	}

	public void addNewUser(Users user) {
		userRepository.save(user);
	}

	public Users getUser(String id) {
		return userRepository.findById(id).orElseGet(null);
	}

	public void updateUser(String id, Users user) {
		userRepository.save(user);
	}

	public void deleteUser(String id) {
		userRepository.deleteById(id);
	}
	
}

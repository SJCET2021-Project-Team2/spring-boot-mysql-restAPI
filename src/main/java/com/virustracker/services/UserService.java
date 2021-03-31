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

	public Users getUser(Integer id) {
		return userRepository.findById(id).orElseGet(null);
	}

	public void updateUser(Integer id, Users user) {
		userRepository.save(user);
	}

	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
	
}

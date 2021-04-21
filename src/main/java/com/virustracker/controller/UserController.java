package com.virustracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.virustracker.entity.Users;
import com.virustracker.services.UserService;

@CrossOrigin()
@RestController
@RequestMapping(path = "/user")
public class UserController {

	@Autowired
	private UserService userService;
	
//	GET REQUEST
	@RequestMapping(path = "/all")
	public Iterable<Users> getAllUser(){
		return userService.getAllUser();
	}
	
//  GET REQUEST
	@RequestMapping("/{id}")
	public Users getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
//	POST REQUEST
	@RequestMapping(method = RequestMethod.POST, path = "/register")
	public void addNewUser(@RequestBody Users user) {
		userService.addNewUser(user);
	}
	
//	PUT REQUEST
	@RequestMapping(method = RequestMethod.PUT, path = "/update/{id}")
	public void updateUser(@PathVariable Integer id, @RequestBody Users user) {
		userService.updateUser(id, user);
	}
	
//	DELETE REQUEST
	@RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
}

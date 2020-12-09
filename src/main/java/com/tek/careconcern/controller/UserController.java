package com.tek.careconcern.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.careconcern.controller.ui.model.User;
import com.tek.careconcern.controller.ui.model.UserDetailRequestModel;
import com.tek.careconcern.entity.UserEntity;
import com.tek.careconcern.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/getUserDetail")
	public User getUser() {
		User user = new User();
		//DBCALL needed assign the data to the userobject
		return user;
	}
	
	@PutMapping("/newUser")
	public String createUser(@RequestBody UserDetailRequestModel userDetail) {
		UserEntity userEntity = new UserEntity();
		
		BeanUtils.copyProperties(userEntity, userDetail);
		
		userRepository.save(userEntity);
		return "Get User Created";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		return "Get User Created";
	}
	
}

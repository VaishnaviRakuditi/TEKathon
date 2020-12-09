package com.tek.careconcern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.careconcern.controller.ui.model.User;

@RestController
@RequestMapping
public class UserController {

	@GetMapping("/getUserDetail")
	public String getUser() {
		return "Get User Called";
	}
	
	@PutMapping("/newUser")
	public String createUser(@RequestBody User user) {
		return "Get User Created";
	}
	
	@PostMapping("/updateUser")
	public String updateUser(@RequestBody User user) {
		return "Get User Created";
	}
	
}

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
public class ConcernController {

	@GetMapping("/getUserConcern")
	public String getUserConcern() {
		return "Get getUserConcern Called";
	}

	@PutMapping("/createUserConcern")
	public String createUserConcern(@RequestBody User user) {
		return "Get createUserConcern called";
	}

	@PostMapping("/updateUserConcern")
	public String updateUserConcern(@RequestBody User user) {
		return "Get updateUserConcern called";
	}

}

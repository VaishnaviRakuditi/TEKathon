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
public class CommentController {
	
	@GetMapping("/getUserComment")
	public String getUserComment() {
		return "Get User Called";
	}
	
	@PutMapping("/createUserComment")
	public String createUserComment(@RequestBody User user) {
		return "Get User Created";
	}
	
	@PostMapping("/updateUserComment")
	public String updateUserComment(@RequestBody User user) {
		return "Get updateUserComment called";
	}

}

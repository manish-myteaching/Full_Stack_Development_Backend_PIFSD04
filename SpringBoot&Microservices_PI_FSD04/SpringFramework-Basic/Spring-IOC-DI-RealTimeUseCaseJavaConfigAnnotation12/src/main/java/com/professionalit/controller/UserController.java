package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.professionalit.service.UserService;
import com.professionalit.vo.User;

//@Component
@Controller
public class UserController {

	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("UserController");
	}

	public UserController(UserService userService) {
		System.out.println("UserController");
		this.userService = userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void getUserDetail() {
		System.out.println("UserController: get User Detail");
		// Call Service Layer
		User user = userService.getUserDetail();
		System.out.println(user);
	}

	public void createUserDetail(User user) {
		System.out.println("UserController:createUserDetail");
		boolean isUserCreate = userService.createUserDetail(user);
		if (isUserCreate) {
			System.out.println(user.getUserName() + " Created Successfully..!");
		} else {
			System.out.println(user.getUserName() + " is not created");
		}
	}

}

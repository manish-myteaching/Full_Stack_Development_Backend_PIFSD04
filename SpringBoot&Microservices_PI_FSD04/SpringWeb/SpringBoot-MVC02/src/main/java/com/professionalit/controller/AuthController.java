package com.professionalit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.professionalit.constant.ApplicationConstant;
import com.professionalit.domain.Login;
import com.professionalit.domain.User;
import com.professionalit.service.AuthService;

@Controller
public class AuthController {

	@Autowired
	private AuthService authService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/register")
	public String registerUser(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}

	@PostMapping("/register")
	public String registerSubmit(@ModelAttribute("user") User userDetail, Model model) {
		String message = authService.registerUser(userDetail);
		if (ApplicationConstant.USER_REG_SUCESS.equalsIgnoreCase(message)) {
			model.addAttribute("message", message);
			return "redirect:/login";
		}
		model.addAttribute("message", message);
		return "register";
	}

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}

	@PostMapping("/login")
	public String loginSubmit(Model model, @ModelAttribute("login") Login login) {

		boolean isUserExist = authService.isUserExist(login);
		if (isUserExist) {
			return "dashboard";
		}
		model.addAttribute("message", ApplicationConstant.INVALID_LOGIN);
		return "login";
	}
}

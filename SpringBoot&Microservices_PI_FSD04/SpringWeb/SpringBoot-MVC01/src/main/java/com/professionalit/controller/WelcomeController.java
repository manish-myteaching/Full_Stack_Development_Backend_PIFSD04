package com.professionalit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView greet() {
		System.out.println("Enter into WelcomeController::greet");
		ModelAndView mav = new ModelAndView("welcome"); // LVM
		mav.addObject("greet", "Welcome To ProfessionalIT....!"); // Model
		return mav;
	}

	@GetMapping("/welcomeString") // Recommended
	public String greet(Model model) {
		model.addAttribute("greet", "Welcome To ProfessionalIT....!");
		return "welcome";
	}

	@GetMapping("/welcomeMap")
	public String greet(Map<String, String> map) {
		map.put("greet", "Welcome To ProfessionalIT....!");
		return "welcome";
	}

	@GetMapping("/welcomeHttpRequest")
	public String greet(HttpServletRequest httpRequest, Model model) {
		model.addAttribute("greet", httpRequest.getParameter("uname"));
		return "welcome";
	}

	@GetMapping("/welcomeHttpResponse")
	public void greet(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse, Model model)
			throws IOException {
		httpServletResponse.setContentType("text/html");
		// Writing the message on the web page
		PrintWriter out = httpServletResponse.getWriter();
		String name = (String) httpRequest.getParameter("uname");
		out.println("<p>" + "<marquee><h1>WelCome To ProfessionalIT..!" + name + "<h1><marquee>" + "</p>");
	}

}

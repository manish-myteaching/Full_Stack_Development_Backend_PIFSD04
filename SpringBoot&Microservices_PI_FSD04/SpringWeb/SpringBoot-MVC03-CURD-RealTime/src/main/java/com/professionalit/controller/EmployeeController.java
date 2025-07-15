package com.professionalit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.professionalit.entity.Employee;
import com.professionalit.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/add-employee")
	public String addEmployee(Model model) {
		model.addAttribute("employee", new Employee());
		return "add_employee";
	}

	@PostMapping("/add-employee")
	public String addEmployee(Model model, @ModelAttribute("employee") Employee employee, RedirectAttributes attrs) {
		String message = employeeService.addEmployee(employee);
		// model.addAttribute("message", message);
		attrs.addFlashAttribute("message", message);
		return "redirect:get-all-employee";
	}

	@GetMapping("/get-all-employee")
	public String getAllEmployee(Model model) {
		List<Employee> listEmployee = employeeService.getAllEmployee();
		model.addAttribute("employees", listEmployee);
		return "emp_report";// LVN
	}

	@GetMapping("/delete-employee")
	public String deleteEmployee(@RequestParam("employeeId") Long employeeId, RedirectAttributes attrs) {
		String message = employeeService.deleteEmployee(employeeId);
		attrs.addFlashAttribute("message", message);
		return "redirect:get-all-employee";
	}

	@GetMapping("/edit-employee")
	public String editEmployee(Model model, @RequestParam("employeeId") Long employeeId) {
		Employee employee = employeeService.getEmployee(employeeId);
		model.addAttribute("employee", employee);
		return "edit_employee";
	}

	@PostMapping("/edit-employee")
	public String editEmployee(@ModelAttribute("employee") Employee employee, RedirectAttributes attrs) {
		String message = employeeService.updateEmployee(employee);
		attrs.addFlashAttribute("message", message);
		return "redirect:get-all-employee";
	}
}

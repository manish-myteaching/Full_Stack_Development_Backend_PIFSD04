package com.professionalit.service;

import java.util.List;

import com.professionalit.entity.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);

	public List<Employee> getAllEmployee();
	
	public  String deleteEmployee(Long employeeId);
	
	public Employee getEmployee(Long employeeId);
	
	public String updateEmployee(Employee employee);

	

}

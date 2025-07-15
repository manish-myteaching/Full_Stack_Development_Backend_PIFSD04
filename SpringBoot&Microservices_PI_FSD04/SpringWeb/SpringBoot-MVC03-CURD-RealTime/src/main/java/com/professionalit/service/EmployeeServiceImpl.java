package com.professionalit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.professionalit.entity.Employee;
import com.professionalit.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {
		Employee employee1 = employeeRepository.save(employee);
		// Mail - SMTP - External Thread (Executor Framework)
		// Message - Twilio
		// call another websevices
		return employee1.getEmployeeId() + " Employee inserted succcessfully";
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> listEmployee = employeeRepository.findAll();
		return listEmployee;
	}

	@Override
	public String deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
		return employeeId + " deleted successfully";
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		return employee.get();
	}

	@Override
	public String updateEmployee(Employee employee) {
		Long empId = employeeRepository.save(employee).getEmployeeId();
		return empId + "updated successfully";
	}

}

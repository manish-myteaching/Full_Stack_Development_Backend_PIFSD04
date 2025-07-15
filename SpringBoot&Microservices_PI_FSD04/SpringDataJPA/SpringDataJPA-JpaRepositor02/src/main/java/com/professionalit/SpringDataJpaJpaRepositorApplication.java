package com.professionalit;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.professionalit.entity.Employee;
import com.professionalit.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaJpaRepositorApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaJpaRepositorApplication.class, args);
		EmployeeRepository empRepo = ctx.getBean(EmployeeRepository.class);

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Alice Johnson", 75000.0, "Female", "Software Engineer"));
		employees.add(new Employee(102, "Bob Smith", 82000.0, "Male", "Senior Developer"));
		employees.add(new Employee(103, "Charlie Brown", 90000.0, "Male", "Team Lead"));
		employees.add(new Employee(104, "Diana Prince", 95000.0, "Female", "Project Manager"));
		employees.add(new Employee(105, "Ethan Hunt", 88000.0, "Male", "Scrum Master"));
		employees.add(new Employee(106, "Fiona Gallagher", 72000.0, "Female", "QA Engineer"));
		employees.add(new Employee(107, "George Miller", 65000.0, "Male", "Business Analyst"));
		employees.add(new Employee(108, "Hannah Davis", 71000.0, "Female", "Frontend Developer"));
		employees.add(new Employee(109, "Ian Wright", 77000.0, "Male", "Backend Developer"));
		employees.add(new Employee(110, "Julia Roberts", 99000.0, "Female", "Solution Architect"));
		// empRepo.saveAll(employees);

		// List<Employee> listAllEmployee = empRepo.findAll();
		// listAllEmployee.forEach(System.out::println);

		// After Sorting
		// List<Employee> listAllSortedEmployee = empRepo.findAll(Sort.by("empName",
		// "empSalary").descending());
		// listAllSortedEmployee.forEach(System.out::println);

		int pageNo = 2;
		Pageable pageable = PageRequest.of(pageNo - 1, 5, Sort.by("empName").descending());
		Page<Employee> page = empRepo.findAll(pageable);
		List<Employee> pageEmployee = page.getContent();
		pageEmployee.forEach(System.out::println);

	}

}

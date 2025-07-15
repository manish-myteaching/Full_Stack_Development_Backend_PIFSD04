package com.professionalit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.jpa.domain.Specification;

import com.professionalit.entity.Employee;
import com.professionalit.repository.EmployeeRepository;

@SpringBootApplication
public class SpringDataJpaJpaRepositoryQbeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringDataJpaJpaRepositoryQbeApplication.class,
				args);

		EmployeeRepository empRepo = ctx.getBean(EmployeeRepository.class);
		// List<Employee> empList = empRepo.findAll();

		Employee employee = new Employee();
		ExampleMatcher matcher = ExampleMatcher.matching().withIgnorePaths("id").withIgnoreNullValues()
				.withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);

		Example<Employee> example = Example.of(employee, matcher);
		// List<Employee> empList = empRepo.findAll(example);
		List<Employee> empList = empRepo.findAll(designationOrEmpName("Lead", "George"));
		empList.forEach(System.out::println);

	}

	public static Specification<Employee> designationOrEmpName(String designation, String empName) {
		return (root, query, cb) -> cb.or(cb.like(root.get("designation"), "%" + designation + "%"),
				cb.like(root.get("empName"), "%" + empName + "%"));
	}

}

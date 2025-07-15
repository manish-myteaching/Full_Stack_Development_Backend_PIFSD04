package com.professionalit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPLOYEE_JPA_TAB")
public class Employee {

	@Id
	private Integer empId;
	private String empName;
	private Double empSalary;
	private String gender;
	private String designation;

}

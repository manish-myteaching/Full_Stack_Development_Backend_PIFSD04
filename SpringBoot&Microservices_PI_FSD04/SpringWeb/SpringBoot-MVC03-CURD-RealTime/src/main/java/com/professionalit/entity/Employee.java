package com.professionalit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long employeeId;
	private String employeeName;
	private String designation;
	private Double salary;
	private Integer departNumber;

}

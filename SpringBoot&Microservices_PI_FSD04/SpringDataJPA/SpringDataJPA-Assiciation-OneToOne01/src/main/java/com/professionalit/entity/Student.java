package com.professionalit.entity;

import jakarta.persistence.Column;
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
@Table(name = "STUDENT_OTO")
public class Student {
	@Id
	@Column(name = "STUDENT_ID")
	private Integer studentId;
	@Column(name = "STUDENT_NAME")
	private String studentName;
	@Column(name = "STUDENT_LOCATION")
	private String studentLocation;
	@Column(name = "STUDENT_EMAIL")
	private String studentEmail;
	@Column(name = "STUDENT_CONTACTNO")
	private String studentContactNo;


}

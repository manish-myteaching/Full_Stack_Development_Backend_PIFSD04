package com.professionalit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENT_OTO_BI")
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

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "student")
	@ToString.Exclude
	private Login login;

}

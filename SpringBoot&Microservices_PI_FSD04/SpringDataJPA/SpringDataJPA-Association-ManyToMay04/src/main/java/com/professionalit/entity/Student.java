package com.professionalit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENT_MTM")
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

	@Column(name = "CREATED_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	@Column(name = "UPDATE_BY")
	private Date updateBy;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "student_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses = new ArrayList<>();

}

package com.professionalit.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "Course_MTM")
public class Course {

	@Id
	@Column(name = "COURSE_ID")
	private Integer courseId;

	@Column(name = "COURSE_NAME", nullable = false)
	private String courseName;;

	@Column(name = "CREATED_DATE", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date createdDate;

	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "UPDATE_BY")
	private Date updateBy;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private List<Student> students = new ArrayList<>();

}

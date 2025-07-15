package com.professionalit.runner;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Course;
import com.professionalit.entity.Student;
import com.professionalit.repository.StudentRepository;

@Component
public class ManyToManyRunner implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ManyToManyRunner");

		Student student1 = new Student();
		student1.setStudentId(101); // PK
		student1.setStudentName("Rohit");
		student1.setStudentLocation("Pune");
		student1.setStudentEmail("Rohit@gmail.com");
		student1.setStudentContactNo("525254255");
		student1.setCreatedDate(new Date());
		student1.setCreatedBy("Admin");

		Student student2 = new Student();
		student2.setStudentId(102);
		student2.setStudentName("Ramesh");
		student2.setStudentLocation("Mubmai");
		student2.setStudentEmail("Ramesh@gmail.com");
		student2.setStudentContactNo("55254255");
		student2.setCreatedDate(new Date());
		student2.setCreatedBy("Admin");

		Course course1 = new Course();
		course1.setCourseId(201);
		course1.setCourseName("SpringBootMicroServices");
		course1.setCreatedDate(new Date());
		course1.setCreatedBy("Admin");

		Course course2 = new Course();
		course2.setCourseId(202);
		course2.setCourseName("DevOps");
		course2.setCreatedDate(new Date());
		course2.setCreatedBy("Admin");

		Course course3 = new Course();
		course3.setCourseId(203);
		course3.setCourseName("Angular");
		course3.setCreatedDate(new Date());
		course3.setCreatedBy("Admin");

		Course course4 = new Course();
		course4.setCourseId(204);
		course4.setCourseName("Full Stack");
		course4.setCreatedDate(new Date());
		course4.setCreatedBy("Admin");

		List<Course> listSudent1Courcess = List.of(course1, course2);
		List<Course> listSudent2Courcess = List.of(course2, course3, course4);
		
		student1.setCourses(listSudent1Courcess);
		student2.setCourses(listSudent2Courcess);

		List<Student> listSudent = List.of(student1, student2);
		course1.setStudents(listSudent);
		course2.setStudents(listSudent);
		course3.setStudents(listSudent);
		course4.setStudents(listSudent);

		studentRepository.save(student1);
		studentRepository.save(student2);

	}

}

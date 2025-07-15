package com.professionalit.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.professionalit.entity.Login;
import com.professionalit.entity.Student;
import com.professionalit.repository.LoginRepository;
import com.professionalit.repository.StudentRepository;

@Component
public class OneToOneRunner implements CommandLineRunner {

	@Autowired
	LoginRepository loginRepo;

	@Autowired
	StudentRepository studentRepo;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("OneToOneRunner");

		Student student1 = new Student();
		student1.setStudentId(201); // PK
		student1.setStudentName("Rohit");
		student1.setStudentLocation("Pune");
		student1.setStudentEmail("Rohit@gmail.com");
		student1.setStudentContactNo("525254255");

		Login login1 = new Login();
		login1.setLoginId(101);
		login1.setUserName("Alex");
		login1.setPassword("1234");
		login1.setStatus("A");
		login1.setStudent(student1);

		student1.setLogin(login1);

		// loginRepo.save(login1);

		Optional<Login> login2 = loginRepo.findById(101);
		System.out.println(login2.get().getStudent());

		Optional<Student> student = studentRepo.findById(201);
		System.out.println(student.get().getLogin());

		// loginRepo.delete(login1);

	}

}

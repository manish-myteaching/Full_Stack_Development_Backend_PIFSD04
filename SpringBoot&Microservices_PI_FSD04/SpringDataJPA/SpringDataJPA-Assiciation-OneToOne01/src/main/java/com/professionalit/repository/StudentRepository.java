package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professionalit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {

}

package com.professionalit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.professionalit.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>  {

}

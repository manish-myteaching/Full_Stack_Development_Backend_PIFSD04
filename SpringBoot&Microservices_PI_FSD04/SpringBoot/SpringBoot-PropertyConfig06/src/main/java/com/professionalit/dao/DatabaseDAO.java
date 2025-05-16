package com.professionalit.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import com.professionalit.config.DataBaseConfig;

@Repository
public class DatabaseDAO {

	@Autowired
	DataBaseConfig dataBaseConfig;

	@Autowired
	Environment env;

	public void printProperties() {
		System.out.println(dataBaseConfig.getJdbcUrl());
		System.out.println(dataBaseConfig.getJdbcUserName());
		System.out.println(dataBaseConfig.getJdbcPassword());

		System.out.println(dataBaseConfig.getBarProperty());

		System.out.println(dataBaseConfig.getFooProperty());

		System.out.println(env.getProperty("myapp.custom.property"));

		System.out.println(dataBaseConfig.getEnvList());
	}

}

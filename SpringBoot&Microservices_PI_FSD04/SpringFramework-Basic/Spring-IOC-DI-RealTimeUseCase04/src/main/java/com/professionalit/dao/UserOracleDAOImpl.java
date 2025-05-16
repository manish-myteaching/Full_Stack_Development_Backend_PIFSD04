package com.professionalit.dao;

import com.professionalit.vo.User;

public class UserOracleDAOImpl implements UserDAO {

	public UserOracleDAOImpl() {
		System.out.println("UserOracleDAOImpl");
	}

	@Override
	public User getUserDetail() {
		System.out.println("get User Details form Oralce Database");
		User user = new User();
		user.setUserName("Ramesh");
		user.setUserPhoneNo("+91-45457575244");
		user.setEmailID("Ramesh@gmail.com");
		return user;
	}

	@Override
	public boolean createUserDetail(User user) {
		System.out.println("DAO:createUserDetail");
		// DB insertion business logic (JDBC+JPA+SpringJDBC+SpringORM)
		System.out.println(user + " Record insert successfully");
		return true;
	}

}

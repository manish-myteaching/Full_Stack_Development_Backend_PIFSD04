package com.professionalit.dao;

import org.springframework.stereotype.Component;

import com.professionalit.vo.User;

@Component
public class UserMySqlDAOImpl implements UserDAO {

	public UserMySqlDAOImpl() {
		System.out.println("UserMySqlDAOImpl");
	}

	@Override
	public User getUserDetail() {
		System.out.println("get User Details form MYSQL Database");
		User user = new User();
		user.setUserName("Ramesh");
		user.setUserPhoneNo("+91-45457575244");
		user.setEmailID("Ramesh@gmail.com");
		return user;
	}

	@Override
	public boolean createUserDetail(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}

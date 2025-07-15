package com.professionalit.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.professionalit.constant.ApplicationConstant;
import com.professionalit.domain.Login;
import com.professionalit.domain.User;

@Service
public class AuthService {

	Map<String, User> map = new HashMap();

	public boolean isUserExist(Login login) {
		User user = map.get(login.getUserid());
		if (null != user) {
			if (user.getPassword().equals(login.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public String registerUser(User user) {
		if (!map.containsKey(user.getUserid())) {
			map.put(user.getUserid(), user);
		} else {
			return ApplicationConstant.USER_EXIST;
		}
		return ApplicationConstant.USER_REG_SUCESS;
	}
}

package com.professionalit.dao;

import com.professionalit.vo.User;

public interface UserDAO {
	public User getUserDetail();
	public boolean createUserDetail(User user);
}

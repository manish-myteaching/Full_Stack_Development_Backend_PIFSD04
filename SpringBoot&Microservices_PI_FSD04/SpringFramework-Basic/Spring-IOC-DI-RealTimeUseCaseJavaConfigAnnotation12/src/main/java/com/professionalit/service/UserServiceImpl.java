package com.professionalit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.professionalit.dao.UserDAO;
import com.professionalit.util.EmailUtil;
import com.professionalit.util.MessageUtil;
import com.professionalit.util.PasswordUtil;
import com.professionalit.util.RedisCache;
import com.professionalit.vo.User;

//@Component
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	@Qualifier("oracle")
	private UserDAO userDAO;
	@Autowired
	private EmailUtil emailUtil;
	@Autowired
	private MessageUtil messageUtil;
	@Autowired
	private PasswordUtil passwordUtil;
	@Autowired
	private RedisCache redisCache;

	public UserServiceImpl() {
		System.out.println("UserServiceImple");
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public void setEmailUtil(EmailUtil emailUtil) {
		this.emailUtil = emailUtil;
	}

	public void setMessageUtil(MessageUtil messageUtil) {
		this.messageUtil = messageUtil;
	}

	public void setPasswordUtil(PasswordUtil passwordUtil) {
		this.passwordUtil = passwordUtil;
	}

	public void setRedisCache(RedisCache redisCache) {
		this.redisCache = redisCache;
	}

	@Override
	public User getUserDetail() {
		System.out.println("UserServiceImpl: get User Detail");
		// call DAO Layer
		User user = userDAO.getUserDetail();
		user.setUserName(user.getUserName().toUpperCase());
		if (user != null) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					emailUtil.sendEmail();
				}
			};

			Runnable runnable1 = new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					messageUtil.sendMessage();
				}
			};
			new Thread(runnable).start();// Aync call
			new Thread(runnable1).start();// Aync call
		}
		return user;
	}

	@Override
	public boolean createUserDetail(User user) {
		System.out.println("Service:createUserDetail");
		user.setPassword(passwordUtil.encode(user.getPassword()));
		// call DAO Layer
		boolean isUserCreated = userDAO.createUserDetail(user);
		if (isUserCreated) {
			return isUserCreated;
		}
		return false;
	}

}

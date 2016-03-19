package com.hefeng.part.service.impl;

import com.hefeng.part.entity.User;
import com.hefeng.part.service.IUserService;
import org.springframework.stereotype.Service;

@Service("iUserService")
public class UserServiceImpl implements IUserService {

	public User getUser(String userName) {
		System.out.println(userName);
		User user = new User();
		user.setNickName(userName);
		user.setRealName(userName+"1");
		user.setPassWord("password");
		return user;
	}

}

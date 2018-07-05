package ro.sapientia.andras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ro.sapientia.andras.dao.UserDao;

import ro.sapientia.andras.pojo.UserPojo;

import ro.sapientia.andras.service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao usersDao;
	
	@Override
	public List<UserPojo> getStudentByName() {
		List<UserPojo> userList = UserService.findByName();
		return userList;
	}
}

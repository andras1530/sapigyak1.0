package ro.sapientia.andras.service.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ro.sapientia.andras.dao.UserDao;
import ro.sapientia.andras.pojo.UserPojo;
import ro.sapientia.andras.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDao userDao;
	
	
	@Override
	public List<UserPojo> getAll() {
		List<UserPojo> userList = userDao.findAll();
		return userList;
	}

	
	public UserPojo findById(Integer id) {
		Optional<UserPojo> userPojo = userDao.findById(id);
		if (userPojo!=null) {
			return userPojo.get();
		}
		return null;
    }
	
	public UserPojo createUser(UserPojo user) {
		
		return userDao.save(user);
	}
	
	public void deleteUser(@Valid UserPojo user) {
		
		userDao.delete(user);
	}


	public UserPojo updateUser(Integer userId, UserPojo user) {
		return userDao.save(user);
	}
}

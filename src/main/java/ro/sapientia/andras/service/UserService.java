package ro.sapientia.andras.service;

import java.util.List;

import javax.annotation.PostConstruct;


import ro.sapientia.andras.pojo.UserPojo;

public interface UserService {
	@PostConstruct

	public List<UserPojo> getAll();

	public static List<UserPojo> findByName() {
		// TODO Auto-generated method stub
		return null;
	}


	public UserPojo findById(Integer userId);

	public UserPojo createUser(UserPojo user);

	public void deleteUser(UserPojo user);

	public UserPojo updateUser(Integer userId, UserPojo user);
}
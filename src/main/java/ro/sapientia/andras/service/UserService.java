package ro.sapientia.andras.service;

import java.util.List;


import ro.sapientia.andras.pojo.UserPojo;

public interface UserService {
public List<UserPojo> getStudentByName();
	
	public static List<UserPojo> findByName() {
		// TODO Auto-generated method stub
		return null;
	}
}

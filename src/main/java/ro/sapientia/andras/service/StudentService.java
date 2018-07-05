package ro.sapientia.andras.service;

import java.util.List;

import ro.sapientia.andras.pojo.StudentPojo;

public interface StudentService {
	public List<StudentPojo> getStudentByName();
	
	public static List<StudentPojo> findByName() {
		// TODO Auto-generated method stub
		return null;
	}
}

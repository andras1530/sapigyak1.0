package ro.sapientia.andras.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sapientia.andras.dao.StudentDao;
import ro.sapientia.andras.pojo.StudentPojo;
import ro.sapientia.andras.service.StudentService;

public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentsDao;
	
	@Override
	public List<StudentPojo> getStudentByName() {
		List<StudentPojo> studentList = StudentService.findByName();
		return studentList;
	}
}

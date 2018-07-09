package ro.sapientia.andras.service.impl;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ro.sapientia.andras.dao.StudentDao;
import ro.sapientia.andras.pojo.StudentPojo;
import ro.sapientia.andras.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	public StudentDao studentDao;
	
	
	@Override
	public List<StudentPojo> getAll() {
		List<StudentPojo> studentList = studentDao.findAll();
		return studentList;
	}

	
	public StudentPojo findById(Integer id) {
		Optional<StudentPojo> studentPojo = studentDao.findById(id);
		if (studentPojo!=null) {
			return studentPojo.get();
		}
		return null;
    }
	
	public StudentPojo createStudent(StudentPojo student) {
		
		return studentDao.save(student);
	}
	
	public void deleteStudent(@Valid StudentPojo student) {
		
		studentDao.delete(student);
	}


	public StudentPojo updateStudent(Integer studentId, StudentPojo student) {
		return studentDao.save(student);
	}
}

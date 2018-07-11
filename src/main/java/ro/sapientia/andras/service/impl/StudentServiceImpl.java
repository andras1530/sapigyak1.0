package ro.sapientia.andras.service.impl;

import java.security.Timestamp;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import ro.sapientia.andras.dao.StudentDao;
import ro.sapientia.andras.pojo.StudentPojo;
import ro.sapientia.andras.service.StudentService;

@Service("StudentService")
public class StudentServiceImpl implements StudentService {
	/*
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
	*/
	@Autowired
	private StudentDao studentsDao;

	@Override
	public List<StudentPojo> getStudentByName() {
		return null;
	}

	@Override
	public List<StudentPojo> getAllStudents() {
		return studentsDao.findAll();
	}

	@Override
	public StudentPojo createStudent(StudentPojo student) {
		return studentsDao.save(student);
	}


//	@Override
//	public StudentPojo updateStudent(Integer studentId, StudentPojo studentDetails) {
//		// TODO Auto-generated method stub
//		return studentsDao.save(studentDetails);
//	}

	@Override
	public void deleteById(Integer studentId) {
		studentsDao.deleteById(studentId);
		
	}

	@Override
	public void updateStudent(Integer studentId,StudentPojo studentDetails) {
		StudentPojo student = studentsDao.findById(studentId)
	    		.orElseThrow(() -> new ResourceNotFoundException("Student"));
		
		student.setId(studentId);
	    student.setLastName(studentDetails.getLastName());
	    student.setFirstName(studentDetails.getFirstName());
	    student.setDepartment(studentDetails.getDepartment());
	    student.setYear(studentDetails.getYear());
	    
	    Timestamp stamp = new Timestamp(System.currentTimeMillis());
	    Date date = new Date(stamp.getTime());
	    student.setUpdated(date);
		
		studentsDao.save(student);
	}


	@Override
	public StudentPojo findStudentById(Integer studentId) {
		// TODO Auto-generated method stub
		return studentsDao.findById(studentId)
				.orElseThrow(() -> new ResourceNotFoundException("Student"));
	}



//	@Override
//	public StudentPojo updateStudent(Integer studentId, @Valid StudentPojo studentDetails) {
//		return studentsDao.
	
}

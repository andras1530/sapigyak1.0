package ro.sapientia.andras.service;

import java.util.List;

import javax.annotation.PostConstruct;

import ro.sapientia.andras.pojo.StudentPojo;

public interface StudentService {
	@PostConstruct
/*
	public List<StudentPojo> getAll();

	public static List<StudentPojo> findByName() {
		// TODO Auto-generated method stub
		return null;
	}


	public StudentPojo findById(Integer studentId);

	public StudentPojo createStudent(StudentPojo student);

	public void deleteStudent(StudentPojo student);

	public StudentPojo updateStudent(Integer studentId, StudentPojo student);
*/
	public List<StudentPojo> getStudentByName();

	public List<StudentPojo> getAllStudents();

	public StudentPojo createStudent(StudentPojo student);

//	public StudentPojo updateStudent(Integer studentId, StudentPojo studentDetails);

	public void deleteById(Integer studentId);

	public void updateStudent(Integer studentId, StudentPojo studentDetails);

	public StudentPojo findStudentById(Integer studentId);

}

package ro.sapientia.andras.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ro.sapientia.andras.bl.StudentBl;
import ro.sapientia.andras.pojo.StudentPojo;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class StudentController {
	
	/*
	@Autowired
	StudentBl studentBl;
	
	@GetMapping("/student")
	public List<StudentPojo> getAllStudents(){
		return studentBl.getAllStudents();
	}
	
	@PostMapping("/student")
	public StudentPojo createStudent(@Valid @RequestBody StudentPojo student) {
	    return studentBl.createStudent(student);
	}
	
	
	@GetMapping("/student/{id}")
	public StudentPojo getStudentById(@PathVariable(value = "id") Integer studentId) {
		return studentBl.getStudentById(studentId);
	}
	
	@PutMapping("/student/{id}")
	public StudentPojo updateStudent(@PathVariable(value = "id") Integer studentId,
            @Valid @RequestBody StudentPojo studentDetails) throws Exception {

		return studentBl.updateStudent(studentId, studentDetails);
	}
	@DeleteMapping("/student/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Integer studentId) throws Exception {
		return studentBl.deleteStudent(studentId);
	}
	*/
	@Autowired
	public StudentBl studentBl;

	@GetMapping("/students")
	public List<StudentPojo> getAllStudents(){
		return studentBl.getAllStudents();
	}
	
	// Create a new Student
	@PostMapping("/students")
	public StudentPojo createStudent(@RequestBody StudentPojo student) {
		try {
			return studentBl.createStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	 
	//Get a Single Student
//	@GetMapping("/students/{id}")
//	public StudentPojo getStudentById(@PathVariable(value = "id") Integer studentId) {
//	   System.out.println(" ------------------"+studentId);
//		return studentBl.findById(studentId)
//	    		.orElseThrow(() -> new ResourceNotFoundException("Student"));
//	}
//	
	@GetMapping("/students/{id}")
	public StudentPojo getStudentById(@PathVariable(value = "id") Integer studentId) {
			return studentBl.findStudentById(studentId);

	}

	// Update a Student
//	@PutMapping("/students/{id}")
//	public StudentPojo updateStudent(@PathVariable(value = "id") Integer studentId,
//	                                        @Valid @RequestBody StudentPojo studentDetails) {
//
//		StudentPojo student = studentDao.findById(studentId)
//	    		.orElseThrow(() -> new ResourceNotFoundException("Student"));
//
//	    student.setId(studentDetails.getId());
//	    student.setLastName(studentDetails.getLastName());
//	    student.setFirstName(studentDetails.getFirstName());
//	    student.setDepartment(studentDetails.getDepartment());
//	    student.setYear(studentDetails.getYear());
//	    
//	    Date date = new Date();
//	    student.setUpdated(new Timestamp(date.getTime()));
//
//	    StudentPojo updatedStudent = studentDao.save(student);
//	    return updatedStudent;
//	}
	
	@PutMapping("/students/{id}")
	public StudentPojo updateStudent(@PathVariable(value = "id") Integer studentId,
            @Valid @RequestBody StudentPojo studentDetails) {
		try {
			studentBl.updateStudent(studentId,studentDetails);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}
	
//	@DeleteMapping("/students/{id}")
//	public ResponseEntity<?> deleteStudent(@PathVariable(value = "id") Integer studentId) {
//		StudentPojo student = studentDao.findById(studentId)
//				.orElseThrow(() -> new ResourceNotFoundException("Student"));
//
//		studentDao.delete(student);
//
//	    return ResponseEntity.ok().build();
//	}
	
	@DeleteMapping("/students/{id}")
	public StudentPojo deleteStudentById(@PathVariable(value = "id") Integer studentId) {
		try {
				studentBl.deleteById(studentId);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;

		
	}
}

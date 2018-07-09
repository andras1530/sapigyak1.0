package ro.sapientia.andras.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/api")
public class StudentController {
	
	
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
}

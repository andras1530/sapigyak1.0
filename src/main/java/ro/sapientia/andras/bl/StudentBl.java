package ro.sapientia.andras.bl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ro.sapientia.andras.pojo.StudentPojo;
import ro.sapientia.andras.service.StudentService;

@Service
public class StudentBl {
	@Autowired
	private StudentService studentService;

	
	public List<StudentPojo> getStudentByName(){
		return studentService.getAll();
	}
	//GET
	public List<StudentPojo> getAllStudents(){
		return studentService.getAll();
	}
	
	
	
	//POST

	public StudentPojo createStudent(@Valid @RequestBody StudentPojo student) {
	    return studentService.createStudent(student);
	}
	
	//GETbyID
	public StudentPojo getStudentById(Integer studentId) {
	   System.out.println(" ------------------"+studentId);
		return studentService.findById(studentId);
		
//	    		.orElseThrow(() -> new Exception("Student"));
	}
	
	
	//PUTbyID
	public StudentPojo updateStudent(Integer studentId,
	                                        @Valid @RequestBody StudentPojo studentDetails) throws Exception {

		StudentPojo student = studentService.findById(studentId);
//	    		.orElseThrow(() -> new Exception("Student"));

	    student.setId(studentDetails.getId());
	    student.setLastName(studentDetails.getLastName());
	    student.setFirstName(studentDetails.getLastName());
	    student.setDepartment(studentDetails.getDepartment());
	    student.setYear(studentDetails.getYear());
	    

	    StudentPojo updatedStudent = studentService.updateStudent(studentId, student);
	    return updatedStudent;
	}
	
	//DELETEbyID
	public ResponseEntity<?> deleteStudent(Integer studentId) throws Exception {
		StudentPojo student = studentService.findById(studentId);
//				.orElseThrow(() -> Exception("Student"));

		studentService.deleteStudent(student);

	    return ResponseEntity.ok().build();
	}
	
}

package ro.sapientia.andras.bl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import ro.sapientia.andras.pojo.UserPojo;

import ro.sapientia.andras.service.UserService;

@Service
public class UserBl {
	@Autowired
	private UserService userService;

	
	public List<UserPojo> getUserByName(){
		return userService.getAll();
	}
	//GET
	public List<UserPojo> getAllUsers(){
		return userService.getAll();
	}
	
	
	
	//POST

	public UserPojo createUser(@Valid @RequestBody UserPojo user) {
	    return userService.createUser(user);
	}
	
	//GETbyID
	public UserPojo getUserById(Integer userId) {
	   System.out.println(" ------------------"+userId);
		return userService.findById(userId);
		
//	    		.orElseThrow(() -> new Exception("Student"));
	}
	/*
	
	//PUTbyID
	public UserPojo updateUser(Integer studentId,
	                                        @Valid @RequestBody UserPojo studentDetails) throws Exception {

		UserPojo user = userService.findById(userId);
//	    		.orElseThrow(() -> new Exception("Student"));

		//Object userDetails;
		user.setId(userDetails.getId());
		user.setLastName(userDetails.getLastName());
		user.setFirstName(userDetails.getLastName());
		user.setDepartment(userDetails.getDepartment());
		user.setYear(userDetails.getYear());
	    

	    UserPojo updatedUser = userService.updateUser(userId, user);
	    return updatedUser;
	}
	
	//DELETEbyID
	public ResponseEntity<?> deleteUser(Integer studentId) throws Exception {
		UserPojo user = userService.findById(studentId);
//				.orElseThrow(() -> Exception("Student"));

		userService.deleteUser(user);

	    return ResponseEntity.ok().build();
	}*/
}

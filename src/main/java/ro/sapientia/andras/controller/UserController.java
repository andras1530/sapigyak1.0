package ro.sapientia.andras.controller;


//import java.sql.Timestamp;
//import java.util.Date;
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


import ro.sapientia.andras.bl.UserBl;

import ro.sapientia.andras.pojo.UserPojo;



@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	UserBl userBl;
	
	@GetMapping("/user")
	public List<UserPojo> getAllUsers(){
		return userBl.getAllUsers();
	}
	
	@PostMapping("/user")
	public UserPojo createUser(@Valid @RequestBody UserPojo user) {
	    return userBl.createUser(user);
	}
	
	
	@GetMapping("/user/{id}")
	public UserPojo getUserById(@PathVariable(value = "id") Integer userId) {
		return userBl.getUserById(userId);
	}
	
	@PutMapping("/user/{id}")
	public UserPojo updateUser(@PathVariable(value = "id") Integer userId,
            @Valid @RequestBody UserPojo userDetails) throws Exception {

		return userBl.updateUser(userId, userDetails);
	}
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Integer userId) throws Exception {
		return userBl.deleteUser(userId);
	}
}

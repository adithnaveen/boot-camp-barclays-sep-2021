package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// to invoke swagger 
// http://localhost:9090/swagger-ui/index.html


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/user")
	public User getUser() {
		return new User(101, "Harshith");
	}
	

	@PostMapping("/user")
	public User insertUser(@RequestBody User user) {
		return new User(user);
	}
	
	
}

class User {
	private int userId;
	private String userName;
	
	public User() {}
	
	public User(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	public User(User user) {
		this.userId = user.userId; 
		this.userName = user.userName; 
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	} 
	
	
}

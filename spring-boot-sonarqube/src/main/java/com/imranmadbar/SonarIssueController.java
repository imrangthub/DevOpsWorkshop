package com.imranmadbar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; // Unused import

@RestController
public class SonarIssueController {

	Logger logger = LoggerFactory.getLogger(SonarIssueController.class);

	   @GetMapping("/secret")
	    public String getSecret() {
	        String username = "admin"; // Hardcoded username
	        String password = "password123"; // Hardcoded password
	        return "Credentials are: " + username + "/" + password;
	    }
	   
	   
	   
	   @GetMapping("/greet")
	    public String greet(String name) {
	        return "Hello, " + name.toUpperCase(); // Potential NullPointerException
	    }
	   
	   

	    @GetMapping("/process")
	    public String process() {
	        try {
	            int result = 10 / 0; // ArithmeticException
	        } catch (Exception e) {
	            // Empty catch block
	        }
	        return "Processed!";
	    }
	    
	    


	    @GetMapping("/user")
	    public String getUser(String username) {
	        String query = "SELECT * FROM users WHERE username = '" + username + "'"; // SQL Injection risk
	        return query;
	    }

}

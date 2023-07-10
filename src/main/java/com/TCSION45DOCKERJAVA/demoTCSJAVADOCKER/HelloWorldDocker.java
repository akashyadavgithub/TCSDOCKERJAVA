package com.TCSION45DOCKERJAVA.demoTCSJAVADOCKER;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldDocker {
	
	@GetMapping("/hello")
	public String helloWorld() {
		
		return "Hello Docker World";
	}

}

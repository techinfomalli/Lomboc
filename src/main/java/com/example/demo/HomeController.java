package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/ramram")
	public String firstMetod() {
		User user = new User("ram",new Date(),"Male");
		return "ramram"+user+user.getName();
	}

}

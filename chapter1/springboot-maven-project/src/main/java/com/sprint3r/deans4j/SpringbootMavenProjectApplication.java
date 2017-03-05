package com.sprint3r.deans4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootMavenProjectApplication {

	@GetMapping("/")
	public String hello() {
		return "hello";
	}
	
	@PostMapping("/add")
	public String add(String var, String var2) {
		return "add - " + var + " - " + var2;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMavenProjectApplication.class, args);
	}
}

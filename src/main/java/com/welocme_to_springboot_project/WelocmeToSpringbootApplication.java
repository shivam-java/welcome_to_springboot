package com.welocme_to_springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelocmeToSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WelocmeToSpringbootApplication.class, args);
	}



	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "welcome in the world of java and sb";
	}
}

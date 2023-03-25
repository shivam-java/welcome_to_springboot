package com.welocme_to_springboot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.logging.log4j2.SpringBootPropertySource;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelocmeToSpringbootApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(WelocmeToSpringbootApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(WelocmeToSpringbootApplication.class);
	}

	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		return "welcome in the world of java and sb";
	}
}

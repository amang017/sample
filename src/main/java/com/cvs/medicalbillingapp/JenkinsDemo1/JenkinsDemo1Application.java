package com.cvs.medicalbillingapp.JenkinsDemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsDemo1Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDemo1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JenkinsDemo1Application.class);
	}

}

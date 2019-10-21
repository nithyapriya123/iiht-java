package com.cms.coursemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.cms.coursemanagement")
public class CourseManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseManagementApplication.class, args);
	}

}

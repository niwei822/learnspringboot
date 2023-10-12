package com.niwei.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllcourses() {
		return Arrays.asList(new Course(1, "Java", "Bjarne Stroustrup"), new Course(2, "Spring Boot", "Craig Walls"));
	}
}

package com.springsecurity.controller;

// import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.servlet.ModelAndView;
// import jakarta.servlet.http.HttpServletResponse;

@Controller

public class HomeController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	// @GetMapping("/")  
	// public String home() {
	// 	return "index";
	// }

	@GetMapping("/java-course")
	//@PreAuthorize("hasRole('USER')")
	public String course() {
		return "course";
	}

	@GetMapping("/premium-courses")
	@PreAuthorize("hasRole('ADMIN')")  
	public String premiumCourse() {
		return "premium-courses";
	}
}

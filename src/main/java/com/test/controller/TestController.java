package com.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class TestController {

	@GetMapping("/test")
	public String welcome() {
		return "Spring Boot Docker Demo";
	}
}

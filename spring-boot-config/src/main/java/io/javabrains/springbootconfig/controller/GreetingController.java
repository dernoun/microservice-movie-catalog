package io.javabrains.springbootconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting}")
	private String greetingMessage;
	
	@Value("${app.description}")
	private String appInfo;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage;
	}
	
	@GetMapping("/app")
	public String appInfo() {
		return appInfo;
	}
}

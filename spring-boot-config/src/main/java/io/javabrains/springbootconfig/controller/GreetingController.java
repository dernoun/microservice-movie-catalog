package io.javabrains.springbootconfig.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: default value}")
	private String greetingMessage;
	
	@Value("my static text")
	private String appInfo;
	
	@Value("${my.list.values}")
	private List<String> listValues;
	
	@Value("#{${app.dbValues}}")
	private Map<String, String> dbValues;
	
	@GetMapping("/greeting")
	public String greeting() {
		return greetingMessage + appInfo + listValues + dbValues;
	}
	
	@GetMapping("/app")
	public String appInfo() {
		return appInfo;
	}
}

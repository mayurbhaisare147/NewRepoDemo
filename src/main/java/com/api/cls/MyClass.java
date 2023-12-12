package com.api.cls;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

	private static final Logger logger = LoggerFactory.getLogger(MyClass.class);

	@GetMapping(path = "/getData")
	public String doSomething() {
		logger.debug("Debug message");
		logger.info("Info message");
		logger.warn("Warning message");
		logger.error("Error message");
System.out.println("Git Project");
		return "All levvel executed";
	}
}

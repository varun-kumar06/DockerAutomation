package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DocAutomationBuild {
	
	@GetMapping(value="/getAuto")
	public String getDoc() {
		return "Hello Automation";
	}

}

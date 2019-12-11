package com.techteam.dockerSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleMessageController {
	
	@RequestMapping("/message")
	public String getMessage() {
		return "Hello world";
	}

}

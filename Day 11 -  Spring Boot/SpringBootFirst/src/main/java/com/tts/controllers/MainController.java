package com.tts.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}
	
	@RequestMapping("/cjs")
	public String cjs() {
		return "<h1>Hello CJS</h1>";
	}
	
	@RequestMapping("/pi")
	public String pi() {
		return "<h1>I like " + Math.PI + "</h1>" +
				"<br><a href='/fudge'> got to fudge </a>";
	}

	@RequestMapping("/fudge")
	public String fudge() {
		return "<h1>I like fudge</h1>" +
				"<br><a href='/pi'> got to pi </a>";		
	}
}

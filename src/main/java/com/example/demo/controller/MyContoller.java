package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/rest/auth/test")
public class MyContoller {

	
	@GetMapping(value="/getmsg")
	public String getMassage() {
		
		return "Sucessfull spring secure loging";
	}
	
	
	
	
	
}

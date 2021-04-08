package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String [] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "1234567";
		String encodePassword = encoder.encode(rawPassword);
		
		System.out.print(encodePassword);
	}
	
	
}

package com.example.JWT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtApplication {

	public static void main(String[] args) {
		System.out.println("testing ci/cd");
		SpringApplication.run(com.example.JWT.JwtApplication.class, args);
	}

}

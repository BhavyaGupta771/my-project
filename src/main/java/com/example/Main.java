package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		System.out.println("Starting Spring Boot Application...");
		System.out.println("Started successfully! ");
		SpringApplication.run(Main.class, args);
	}

}

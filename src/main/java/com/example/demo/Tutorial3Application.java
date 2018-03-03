package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.tutorial3.controller.StudentController;

@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class Tutorial3Application {

	public static void main(String[] args) {
		SpringApplication.run(Tutorial3Application.class, args);
	}
}

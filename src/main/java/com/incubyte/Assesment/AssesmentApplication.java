package com.incubyte.Assesment;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.incubyte.Assesment.service.service;

@SpringBootApplication
public class AssesmentApplication implements CommandLineRunner {
	
	@Autowired
	service service;

	public static void main(String[] args) {
		SpringApplication.run(AssesmentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		
	}

}

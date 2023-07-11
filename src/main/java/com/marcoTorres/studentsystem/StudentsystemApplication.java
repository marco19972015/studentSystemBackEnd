package com.marcoTorres.studentsystem;

// The SpringApplication class is a fundamental class provided by Spring Boot
// that is responsible for bootstrapping and running a Spring application. It
// provides various static methods for starting and configuring the Srping
// application context.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentsystemApplication {
	public static void main(String[] args) {
		// We use run method to serve as the entry point of a Spring Boot application.
		// it is typically used in the main method to start the application
		SpringApplication.run(StudentsystemApplication.class, args);
	}

}

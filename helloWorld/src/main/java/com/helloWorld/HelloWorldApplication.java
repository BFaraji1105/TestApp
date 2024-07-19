package com.helloWorld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldApplication.class, args);

		System.out.println("\n\n-----------------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("    +++++++++++++++++++++++++++++++++++++++++++++ Hello World +++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------------------------------------------\n\n");

	}

}

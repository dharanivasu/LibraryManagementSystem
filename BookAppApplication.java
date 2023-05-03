package com.Book.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class BookAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookAppApplication.class, args);
	}

}

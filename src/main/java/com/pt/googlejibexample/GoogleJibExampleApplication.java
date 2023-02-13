package com.pt.googlejibexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GoogleJibExampleApplication {

	@GetMapping
	public String getMessage(){
		return "This is message from Google Jib example ";
	}
	public static void main(String[] args) {
		SpringApplication.run(GoogleJibExampleApplication.class, args);
	}

}

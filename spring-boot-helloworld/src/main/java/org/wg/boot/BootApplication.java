package org.wg.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BootApplication {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hello Spring Boot!");
		return "Hello Spring Boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}
}

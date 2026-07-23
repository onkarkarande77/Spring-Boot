package com.learning.myfirstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //is equal to ANNO-@Component-scan,@EnnableAutoConfigure,@springbootconfig
public class MyfirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstappApplication.class, args);
	}

}

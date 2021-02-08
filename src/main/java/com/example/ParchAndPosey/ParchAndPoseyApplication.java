package com.example.ParchAndPosey;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ParchAndPoseyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParchAndPoseyApplication.class, args);
	}
	@Bean("myBean")
	public Map<String, Object> myBean(){
		return new HashMap<>();
	}
}

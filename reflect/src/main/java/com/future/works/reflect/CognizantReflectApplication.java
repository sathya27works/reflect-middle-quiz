package com.future.works.reflect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { WebMvcAutoConfiguration.class })
public class CognizantReflectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CognizantReflectApplication.class, args);
	}

}

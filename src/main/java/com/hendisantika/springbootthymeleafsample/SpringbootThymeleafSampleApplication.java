package com.hendisantika.springbootthymeleafsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootThymeleafSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafSampleApplication.class, args);
	}

}

package com.hendisantika.springbootthymeleafsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringbootThymeleafSampleApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootThymeleafSampleApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootThymeleafSampleApplication.class);
	}

}

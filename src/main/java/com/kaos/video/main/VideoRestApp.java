package com.kaos.video.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kaos")
@EntityScan("com.kaos.model")
@EnableJpaRepositories("com.kaos.repository")
public class VideoRestApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VideoRestApp.class, args);

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(VideoRestApp.class);

	}
}

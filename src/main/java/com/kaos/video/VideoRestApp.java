package com.kaos.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kaos")
@EntityScan("com.kaos.video.model")
@EnableJpaRepositories("com.kaos.repository")
public class VideoRestApp {

	public static void main(String[] args) {
		SpringApplication.run(VideoRestApp.class, args);
	}

}

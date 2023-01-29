package com.phkmgm.ifgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IfgameApplication {

	public static void main(String[] args) {
		SpringApplication.run(IfgameApplication.class, args);
	}

}

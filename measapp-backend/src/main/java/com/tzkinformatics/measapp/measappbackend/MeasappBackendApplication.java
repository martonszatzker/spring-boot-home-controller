package com.tzkinformatics.measapp.measappbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.tzkinformatics.measapp")
@EnableJpaRepositories("com.tzkinformatics.measapp")

public class MeasappBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasappBackendApplication.class, args);
	}

}

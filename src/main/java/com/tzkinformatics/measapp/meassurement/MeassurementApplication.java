package com.tzkinformatics.measapp.meassurement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tzkinformatics.*")
public class MeassurementApplication {
	public static void main(String[] args) {
		SpringApplication.run(MeassurementApplication.class, args);
	}
}

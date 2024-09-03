package com.bezkoder.spring.jpa.postgresql;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringBootJpaPostgresqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaPostgresqlApplication.class, args);
	}

	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}

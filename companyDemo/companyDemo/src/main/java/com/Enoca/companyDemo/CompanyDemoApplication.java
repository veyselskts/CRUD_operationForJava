package com.Enoca.companyDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableJpaRepositories
public class CompanyDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CompanyDemoApplication.class, args);

	}


}

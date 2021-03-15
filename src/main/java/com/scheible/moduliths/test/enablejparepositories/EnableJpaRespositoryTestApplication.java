package com.scheible.moduliths.test.enablejparepositories;

import org.moduliths.Modulith;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Modulith
@EnableJpaRepositories
public class EnableJpaRespositoryTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnableJpaRespositoryTestApplication.class, args);
	}
}

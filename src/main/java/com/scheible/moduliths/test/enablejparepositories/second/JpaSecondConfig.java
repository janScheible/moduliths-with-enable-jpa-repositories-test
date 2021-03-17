package com.scheible.moduliths.test.enablejparepositories.second;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(enableDefaultTransactions = false)
public class JpaSecondConfig {
	
}

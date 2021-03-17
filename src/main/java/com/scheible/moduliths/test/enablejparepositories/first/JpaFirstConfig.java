package com.scheible.moduliths.test.enablejparepositories.first;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(enableDefaultTransactions = false)
public class JpaFirstConfig {
	
}

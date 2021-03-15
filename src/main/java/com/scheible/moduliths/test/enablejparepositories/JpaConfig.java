package com.scheible.moduliths.test.enablejparepositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Profile("having-the-annotation-here-also-breaks-the-test")
@EnableJpaRepositories
public class JpaConfig {
	
}

package com.diogoaltoe.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.diogoaltoe.repository.UserEventHandler;

@Configuration
public class RepositoryConfiguration {
	
	@Bean
	UserEventHandler userEventHandler() {
		return new UserEventHandler();
	}

}

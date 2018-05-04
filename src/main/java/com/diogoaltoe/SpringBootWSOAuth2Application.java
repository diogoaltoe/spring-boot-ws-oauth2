package com.diogoaltoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SpringBootWSOAuth2Application extends SpringBootServletInitializer {

	/**
     * Used when run as a WAR
     * @param args
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootWSOAuth2Application.class);
    }

    /**
     * Used when run as a JAR
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootWSOAuth2Application.class, args);
    }
}

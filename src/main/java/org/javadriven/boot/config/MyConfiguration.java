package org.javadriven.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public String message() {
        return " of javadriven";
    }

}

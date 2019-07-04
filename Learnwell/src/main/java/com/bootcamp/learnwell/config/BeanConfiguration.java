package com.bootcamp.learnwell.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.bootcamp.learnwell.components.StudentEntityConverter;

@SpringBootConfiguration
@ComponentScan(basePackages ="com.bootcamp.learnwell.*")
public class BeanConfiguration {

	
}

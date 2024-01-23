package com.skyline.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.skyline.java.config")
public class JavaConfig {
	
@Bean(name= {"student","getSamosa"})
public Samosa getSamosa() {
	return new Samosa();
}

}

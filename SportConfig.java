package com.spring.tutorials;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.spring.tutorials") we dont need to scan cause we define our beans manually
public class SportConfig {

	
	//define bean for the sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	
	//define a bean for swimCoach and inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());//Here we call the sadFortuneService on line 14
	}
	
}

package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DisplayingbeansApplication implements CommandLineRunner {
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(DisplayingbeansApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

		for (String beans:beanDefinitionNames
			 ) {
			System.out.println(beans);
		}
	}
}


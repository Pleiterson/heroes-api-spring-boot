package com.pleiterson.heroesapispringboot;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroesApiSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeroesApiSpringBootApplication.class, args);
		System.out.println("Super poderes com Webflux");
	}

}

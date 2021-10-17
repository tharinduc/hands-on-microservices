package com.tharindu.myfavoritesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MyFavoritesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFavoritesServiceApplication.class, args);
	}

}

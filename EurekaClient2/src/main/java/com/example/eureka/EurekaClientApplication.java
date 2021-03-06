package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientApplication {

	public static void main(String[] args) {
		System.out.println("========================= Client  begin ===============================");
		SpringApplication.run(EurekaClientApplication.class, args);
		System.out.println("========================= Client  End ===============================");
	}
}

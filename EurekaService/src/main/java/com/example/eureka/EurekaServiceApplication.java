package com.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {

	public static void main(String[] args) {
		System.out.println("========================= Server  begin ===============================");
		SpringApplication.run(EurekaServiceApplication.class, args);
		System.out.println("========================= Server  end ===============================");
	}
}

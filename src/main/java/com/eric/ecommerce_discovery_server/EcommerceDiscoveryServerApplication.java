package com.eric.ecommerce_discovery_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDiscoveryServerApplication.class, args);
	}

}

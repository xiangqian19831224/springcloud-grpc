package com.learn.grpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootGrpcClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGrpcClientApplication.class, args);
	}
}

package com.samina.netflixeurekanamingserver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekanamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekanamingServerApplication.class, args);
	}

}


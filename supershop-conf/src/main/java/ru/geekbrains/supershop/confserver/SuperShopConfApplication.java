package ru.geekbrains.supershop.confserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SuperShopConfApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperShopConfApplication.class, args);
	}

}
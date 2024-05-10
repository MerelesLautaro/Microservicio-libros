package com.lautadev.libros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestionLibrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionLibrosApplication.class, args);
	}

}

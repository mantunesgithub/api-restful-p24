package com.kazale.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//anotation para aletracao P24 master 
@SpringBootApplication
public class P24Application {

	public static void main(String[] args) {
		SpringApplication.run(P24Application.class, args);
		System.out.println("Teste para bapirest-p24");
		System.out.println("Deve mergear com a master");
		System.out.println("=======================");
	}
}

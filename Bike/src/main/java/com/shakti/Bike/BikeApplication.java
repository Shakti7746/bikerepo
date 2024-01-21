package com.shakti.Bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BikeApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext s = SpringApplication.run(BikeApplication.class, args);
		System.out.println("Hello");
		
		Bike b1 = s.getBean(Bike.class);
		
		b1.setId(0);
		b1.setName("john");
		System.out.println(b1);
	}

}

package com.shakti.Bike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BikeApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext s = SpringApplication.run(BikeApplication.class, args);
		System.out.println("Hello");
		
		User u1 = s.getBean(User.class);
		
		Bike b1 = s.getBean(Bike.class);
		System.out.println(b1);
		
		b1.setId(0);
		b1.setName("john");
		u1.setId(0);
		System.out.println(b1);
		System.out.println(u1);
		
	}

}

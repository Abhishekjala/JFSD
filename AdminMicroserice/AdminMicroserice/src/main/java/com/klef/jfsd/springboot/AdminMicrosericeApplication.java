package com.klef.jfsd.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.klef.jfsd.springboot"})   
public class AdminMicrosericeApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminMicrosericeApplication.class, args);
		System.out.println("*** Admin Micro Service ***");
	}
}

package com.ecommerce.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//File Strcuture:
//      src/
//		└── main/
//		    └── java/
//		        └── com/
//		            └── ecommerce/
//		                └── demo/
//                          ├── model/            # Domain models (entities)
//		                    ├── controller/       # REST controllers (for APIs)
//		                    ├── service/          # Business logic layer
//		                    ├── repository/       # Data access layer (DAOs)
//		                    └── EcommerceApplication.java  # Main application class
@SpringBootApplication
public class EcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}

package com.aspiresys.daniel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * below this annotation tells spring boot to use this class as starting point
 * and run this main class.
 */
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		/**
		 * this line will take care of running spring and create 
		 * container for spring
		 * 
		 * Just give class ref and args to it and you are done.
		 * it does the following
		 * 1) sets up default configuration
		 * 2) start spring application
		 * 3) performs class path scan
		 * 4) Start Tomcat Server (the servelet)
		 */
		SpringApplication.run(App.class, args);
	}

}

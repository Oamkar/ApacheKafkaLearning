package com.apachekafka.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application { //implements CommandLineRunner {
	
    public static void main( String[] args ) {
    	SpringApplication.run(
				new Object[] { Application.class }, args);
    }

}

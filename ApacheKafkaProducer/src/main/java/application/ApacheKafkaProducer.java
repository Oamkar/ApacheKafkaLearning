package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApacheKafkaProducer {

	public static void main( String[] args ) {
    	SpringApplication.run( new Object[] { ApacheKafkaProducer.class }, args );
    }
	
}

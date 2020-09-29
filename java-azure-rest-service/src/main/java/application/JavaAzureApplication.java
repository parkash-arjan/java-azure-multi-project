package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fibonacci.rs.controller"})
public class JavaAzureApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAzureApplication.class, args);
	}

}

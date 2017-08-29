package be.ing.app;

import be.ing.config.JerseyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"be.ing.config","be.ing.controller","be.ing.service"})
public class IngFundTransfer{

	public static void main(String[] args) {
		SpringApplication.run(IngFundTransfer.class, args);
		System.out.println("ING Fund Transfer App successfully Started");
	}
}

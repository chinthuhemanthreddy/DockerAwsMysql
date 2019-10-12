package com.hemanth.docker;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hemanth.docker.resource.ExchangeVal;
import com.hemanth.docker.resource.ExchangeValueRepository;

@SpringBootApplication
public class DockerwithmysqlApplication  implements CommandLineRunner {

	@Autowired
	ExchangeValueRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DockerwithmysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		long count = repository.count();

		if (count == 0) {
			repository.save(new ExchangeVal(10001L, "USD", "INR", BigDecimal.valueOf(60)));
			repository.save(new ExchangeVal(10002L, "EUR", "INR", BigDecimal.valueOf(70)));
			repository.save(new ExchangeVal(10003L, "AUD", "INR", BigDecimal.valueOf(20)));
		}
	}
}

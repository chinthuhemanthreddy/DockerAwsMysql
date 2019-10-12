package com.hemanth.docker.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/sayhello")
public class CurrencyExchangeServiceApplicationMySql{
	
@GetMapping
	public String sayHello() {
		
		return "Hey Haii";
	}

}

package com.hemanth.docker.resource;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeVal, Long> {
	ExchangeVal findByFromAndTo(String from, String to);
}

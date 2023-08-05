package com.matthew.microservices.currencyexachangeservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matthew.microservices.currencyexachangeservice.entities.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{
	
	CurrencyExchange findByFromAndTo(String from, String to);
}
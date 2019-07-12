package com.web.dbservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.dbservice.model.ExchangeValue;
import com.web.dbservice.repository.ExchangeRepository;

@RestController
@RequestMapping("/rest-db")
public class ForexController {

	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeRepository repository;

	@GetMapping("/currency/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return exchangeValue;
	}
}

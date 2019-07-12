package com.web.stockservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.stockservice.model.CurrencyConversion;

@FeignClient(name="db-service")
@RibbonClient(name="db-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency/{from}/to/{to}")
	public CurrencyConversion retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}

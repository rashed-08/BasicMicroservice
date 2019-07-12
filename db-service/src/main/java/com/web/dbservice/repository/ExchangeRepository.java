package com.web.dbservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.dbservice.model.ExchangeValue;

public interface ExchangeRepository extends JpaRepository<ExchangeValue, Integer> {

	public ExchangeValue findByFromAndTo(String from, String to);
}

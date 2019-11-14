package com.rl.limiteservice.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author rsilva
 * @version 1.0
 * @since 11/11/2019
 */
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);

}

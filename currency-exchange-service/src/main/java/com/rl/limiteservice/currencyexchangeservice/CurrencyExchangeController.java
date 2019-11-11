package com.rl.limiteservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author rodrigo
 * @version 1.0
 * @since 10/11/2019
 */
@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchaneValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchaneValue exchaneValue = new ExchaneValue(1000L, from, to, BigDecimal.valueOf(65));
        exchaneValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        return exchaneValue;
    }
}

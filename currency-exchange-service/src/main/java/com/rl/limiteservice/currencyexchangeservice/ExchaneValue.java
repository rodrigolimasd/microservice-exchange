package com.rl.limiteservice.currencyexchangeservice;

import java.math.BigDecimal;

/**
 * @author rodrigo
 * @version 1.0
 * @since 10/11/2019
 */
public class ExchaneValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public ExchaneValue(){

    }

    public ExchaneValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}

package com.currency.exchange.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name="CurrencyExchange")
public class CurrencyExchange {
    @Id
    private Long id;
    private String from_County;
    private String  to_County;
    private BigDecimal conversionMultiple;
    private String environment;

    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String from_County, String to_County, BigDecimal conversionMultiple, String environment) {
        this.id = id;
        this.from_County = from_County;
        this.to_County = to_County;
        this.conversionMultiple = conversionMultiple;
        this.environment = environment;
    }

    public String getFrom_County() {
        return from_County;
    }

    public String getTo_County() {
        return to_County;
    }

    public void setFrom_County(String from_County) {
        this.from_County = from_County;
    }

    public void setTo_County(String to_County) {
        this.to_County = to_County;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
    public Long getId() {
        return id;
    }



    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }


}

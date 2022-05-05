package com.currency.exchange.Currency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    public List<CurrencyExchange> getCurrencyvalue(){
       List<CurrencyExchange> ls =  currencyRepository.findAll();
        return ls;
    }

}

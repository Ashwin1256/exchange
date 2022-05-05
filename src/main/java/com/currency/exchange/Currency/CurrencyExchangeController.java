package com.currency.exchange.Currency;

import com.currency.exchange.Auth.TokenRequest;
import com.currency.exchange.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    @Autowired
    private CurrencyService cs;

    @Autowired
     private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("currency-exchange/from/{from}/to/{to}")

    public CurrencyExchange retrieveExchangevalue(@PathVariable String from, @PathVariable String to) {
        String port = environment.getProperty("local.server.port");

        CurrencyExchange ce = null;
        List<CurrencyExchange> ls = cs.getCurrencyvalue();

        for (CurrencyExchange currencyexchange : ls) {
            if (currencyexchange.getFrom_County().equalsIgnoreCase(from)  && currencyexchange.getTo_County() .equalsIgnoreCase(to)) {


                ce= currencyexchange;
                ce.setEnvironment(port);

            }
        }

      return ce;
    }
    
    @PostMapping("/auth")
    public  String generateToken(@RequestBody TokenRequest tokenRequest) throws Exception {

  try{
        authenticationManager.authenticate(
               new UsernamePasswordAuthenticationToken(tokenRequest.getName(), tokenRequest.getPassword() ));

    }catch(Exception ex){

        throw new Exception("Invalid UserName and Password");
    }
      return jwtUtil.generateToken(tokenRequest.getName());
}}

package com.wizen.rafal.walletbalance.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    @Value( "${X-CoinAPI-Key}" )
    private String apiKey;

    @GetMapping("/current-exchange-rate/{firstCurrency}/{secondCurrency}")
    public ResponseEntity<String> getCurrentExchangeRate(@PathVariable String firstCurrency, @PathVariable String secondCurrency) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://rest.coinapi.io/v1/exchangerate/" + firstCurrency + "/" + secondCurrency + "/?invert=true&output_format=json";
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.add("X-CoinAPI-Key", apiKey);
        HttpEntity <String> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
    }
}

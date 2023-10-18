package com.wizen.rafal.walletbalance.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Controller only for development purposes
@RestController
@RequestMapping("/api")
public class FirstControllerForTesting {

    @GetMapping("/hello")
    public String getHello() {

        return "hello";
    }
}

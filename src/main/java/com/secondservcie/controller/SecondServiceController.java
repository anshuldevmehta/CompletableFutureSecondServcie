package com.secondservcie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
public class SecondServiceController
{
    @RequestMapping("/second")
    public String getSecondService()
    {

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        return " Second Sample";
    }
}

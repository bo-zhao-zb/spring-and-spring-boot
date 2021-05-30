package com.oreilly.demo.controllers;

import com.oreilly.demo.entities.DemoGreeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestDemoController {

    @GetMapping("/demorest")
    public DemoGreeting demoGreet(@RequestParam(required = false, defaultValue = "demo") String demo) {
        return new DemoGreeting("This is demo for " + demo);
    }

    @GetMapping("/demomessagerest")
    public String demoGreetMessage(@RequestParam(required = false, defaultValue = "demo message") String demoMessage) {
        return demoMessage;
    }

}

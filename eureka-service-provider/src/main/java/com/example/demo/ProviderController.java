package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {
	
    @RequestMapping("/providerHello/{name}")
    public String hello(@PathVariable("name") String name) {
    	System.out.println("----------------providerHello-->"+name);
        return "Provider-Hello," + name;
    }
}

package com.example.demo.ctrl;

import com.example.demo.service.HelloHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HystrixController {

	@Autowired
	HelloHystrixService helloHystrixService;
	
	@RequestMapping("/hystrixHello/{name}")
	public String hello(@PathVariable String name) {
		System.out.println("----------------helloHystrixService.sayHello-->"+name);
		return helloHystrixService.sayHello(name);
	}

}

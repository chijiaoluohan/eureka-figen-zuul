package com.example.demo.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloService;



@RestController
public class InvokerController {
	 @Autowired
	 private HelloService helloService;
	 
	 @RequestMapping("/consmerHello/{name}")
	 public String hello(@PathVariable String name) {
		 System.out.println("----------------consmerHello-->"+name);
		 return helloService.consmerHello(name);
	 }
}

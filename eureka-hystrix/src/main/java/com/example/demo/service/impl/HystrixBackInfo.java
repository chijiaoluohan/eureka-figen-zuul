package com.example.demo.service.impl;

import org.springframework.stereotype.Component;

import com.example.demo.service.HelloHystrixService;

@Component
public class HystrixBackInfo implements HelloHystrixService{

	@Override
	public String sayHello(String name) {
		return "网络中断";
	}

}

package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.impl.HystrixBackInfo;

@FeignClient(value="service-provider",fallback=HystrixBackInfo.class)
public interface HelloHystrixService {
	
	@RequestMapping("/providerHello/{name}")
	public String sayHello(@PathVariable("name")String name) ;
}

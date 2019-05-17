package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * FeignClient注解中的值表示调用服务名为service-provider的节点,
 * RequestMapping注解声明了调用该节点的哪个路由。
 */
@Service
public class HelloService {

	@Autowired
	RestTemplate restTemplate;

	public String ribbonHello(String name) {
		return restTemplate.getForObject("http://service-provider/providerHello/"+name,String.class);
	}
}

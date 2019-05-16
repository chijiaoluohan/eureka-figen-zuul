package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FeignClient注解中的值表示调用服务名为service-provider的节点,
 * RequestMapping注解声明了调用该节点的哪个路由。
 */
@FeignClient("service-provider")
public interface HelloService {

	@RequestMapping("/providerHello/{name}")
	public String consmerHello(@PathVariable("name")String name) ;
}

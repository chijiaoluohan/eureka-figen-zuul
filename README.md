# eureka-figen-zuul

springcloud入门学习

1.注册中心

2.服务注册和发现

3.服务提供者和消费者

4.断路器

5.路由网关

6.配置中心，高可用配置中心

7.

## 2019/05/17

新增ribbon

## 2019/05/20

新增断路器hystrix

zuul新增MyFilter。

application.yml中新增

zuul.routes.figen.path=/hystrix/**

zuul.routes.figen.service-id=service-hystrix

请求 http://localhost:9304/hystrix/hystrixHello/11?token=12

## 2019/05/21

配置中心相关：eureka-config-server,eureka-config-client

启动顺序，1.eureka 2.eureka-config-server 3.eureka-config-client

可以通过#spring.cloud.config.uri= http://localhost:9401/ 注册服务端的地址获得。如果通过eureka，需要注册到eureka，并且配置serviceId。

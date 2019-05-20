# eureka-figen-zuul

springcloud入门学习，eureka+figen+zuul

其中eureka是注册中心。

eureka-service-provider是服务提供者。

eureka-service-consmer是服务消费者。

eureka-zuul是路由，将请求转发到consmer，consmer通过feigen调用provider提供的接口。

#2019/05/17

新增ribbon

#2019/05/20

新增断路器hystrix

zuul新增MyFilter。

application.yml中新增

zuul.routes.figen.path=/hystrix/**

zuul.routes.figen.service-id=service-hystrix

请求 http://localhost:9304/hystrix/hystrixHello/11?token=12

断路器
1.FigenClient已经包含了Hystrix，所有启动类不需要再开启 @EnableCircuitBreaker。

2.测试发现并没有返回想要的值，而是返回了错误信息，所以在配置文件中，添加feign.hystrix.enabled=false，并将false改为true.
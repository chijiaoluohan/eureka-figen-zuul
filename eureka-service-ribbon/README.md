1.首先在启动类中注入RestTemplate

2.把RestTemplate注入HelloService，并且调用RestTemplate的getForObject方法。

3.把HelloService注入Controller.

4.启动并且，浏览器访问http://localhost:9306/ribbonHello/11
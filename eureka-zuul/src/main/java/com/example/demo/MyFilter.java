package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyFilter extends ZuulFilter{

	/**
	 * 默认false,设定为true,对所有请求总是过滤
	 */
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		String token = request.getParameter("token");
		if(token == null) {
			ctx.setResponseBody("token is empty");
		}
		return null;
	}

	/**
	 *  pre：路由之前
	 *	routing：路由之时
	 *	post： 路由之后
	 *	error：发送错误调用
	 */
	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	/**
	 * 过滤的顺序
	 */
	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}

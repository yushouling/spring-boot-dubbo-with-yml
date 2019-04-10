package com.example.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.api.IHello;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Dubbo服务
 */
@Service
public class HelloProvider implements IHello {
	private static final Logger logger = LoggerFactory.getLogger(HelloProvider.class);

    @Override
    public String sayHello(String name) {
		logger.info("服务被调用，name:{}", name);
		return "Hello: " + name + ", this is from dubbo provider.";
    }
}

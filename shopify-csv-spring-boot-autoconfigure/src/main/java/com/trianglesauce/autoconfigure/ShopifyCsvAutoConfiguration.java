package com.trianglesauce.autoconfigure;

import com.trianglesauce.service.CustomerService;
import com.trianglesauce.service.impl.CustomerServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnBean(CustomerService.class)
public class ShopifyCsvAutoConfiguration {

	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}
}

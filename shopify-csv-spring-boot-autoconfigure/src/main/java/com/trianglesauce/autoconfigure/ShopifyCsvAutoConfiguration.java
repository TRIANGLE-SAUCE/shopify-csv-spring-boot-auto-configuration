package com.trianglesauce.autoconfigure;

import com.trianglesauce.service.CustomerService;
import com.trianglesauce.service.impl.CustomerServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ShopifyCsvAutoConfiguration {

	@ConditionalOnMissingBean(CustomerService.class)
	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}
}

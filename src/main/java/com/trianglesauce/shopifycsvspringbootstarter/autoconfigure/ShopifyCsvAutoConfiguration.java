package com.trianglesauce.shopifycsvspringbootstarter.autoconfigure;

import com.trianglesauce.service.CustomerService;
import com.trianglesauce.service.impl.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ShopifyCsvAutoConfiguration {

	@Bean
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}
}

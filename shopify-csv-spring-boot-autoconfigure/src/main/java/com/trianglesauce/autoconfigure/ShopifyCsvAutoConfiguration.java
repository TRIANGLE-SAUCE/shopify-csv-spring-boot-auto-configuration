package com.trianglesauce.autoconfigure;

import com.trianglesauce.factory.CustomerCsvFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ShopifyCsvAutoConfiguration {

	@ConditionalOnMissingBean(CustomerCsvFactory.class)
	@Bean
	public CustomerCsvFactory customerService() {
		return new CustomerCsvFactory();
	}
}

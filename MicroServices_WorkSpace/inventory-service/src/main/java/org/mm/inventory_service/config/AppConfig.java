package org.mm.inventory_service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class AppConfig 
{
	@Bean
	public RestClient restclient()
	{
		return RestClient.builder().build();
	}
}

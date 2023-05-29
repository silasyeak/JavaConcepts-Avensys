package com.example.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix= "currency-service")
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;
	
	public String getUrl() {
		return url;
	}
	public String getUser() {
		return username;
	}
	public String getKey() {
		return key;
	}
	
}

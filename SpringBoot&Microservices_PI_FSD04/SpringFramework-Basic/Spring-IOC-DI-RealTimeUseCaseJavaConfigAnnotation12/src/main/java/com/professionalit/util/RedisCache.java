package com.professionalit.util;

import org.springframework.stereotype.Component;

@Component
public class RedisCache {

	public RedisCache() {
		System.out.println("RedisCache Object is Created");
	}

	public void cacheData() {
		System.out.println("cacheData");
	}

}

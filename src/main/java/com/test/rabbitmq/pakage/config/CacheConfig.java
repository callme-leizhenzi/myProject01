package com.test.rabbitmq.pakage.config;

import com.test.rabbitmq.pakage.utils.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import redis.clients.jedis.JedisPool;
/**
 * 缓存配置
 * @author Administrator
 *
 */
@Configuration
public class CacheConfig {

	@Autowired
	JedisPool jedisPool;
	
	@Bean
	public Cache configCache() {
		return new Cache(jedisPool);
	}
}

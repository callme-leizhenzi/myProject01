package com.test.rabbitmq.pakage.config;

import com.test.rabbitmq.pakage.utils.StringUtil;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


import redis.clients.jedis.JedisPool;
/**
 * jedis配置
 * @author Administrator
 *
 */
@Configuration
public class JedisConfig {

	@Autowired
	private JedisConfigData jedisConfigData;
	
	@Bean
	public JedisPool jedisPool() {
		
		System.out.println("---------------------------redis:"+this.jedisConfigData);
		
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		poolConfig.setMinIdle(jedisConfigData.getMinIdle());
		poolConfig.setMaxIdle(jedisConfigData.getMaxIdle());
		poolConfig.setMaxTotal(jedisConfigData.getMaxTotal());
		
		poolConfig.setTestWhileIdle(true);
		poolConfig.setTimeBetweenEvictionRunsMillis(1000);
		poolConfig.setMinEvictableIdleTimeMillis(300000);
		poolConfig.setNumTestsPerEvictionRun(10);
		
		if(StringUtil.isBlank(jedisConfigData.getPassword())) {
			jedisConfigData.setPassword(null);
		}
		JedisPool jedisPool = new JedisPool(poolConfig, jedisConfigData.getHost(), jedisConfigData.getPort(),
				jedisConfigData.getTimeout(), jedisConfigData.getPassword());
		return jedisPool;
	}
}

@ConfigurationProperties(prefix = "jedis.config")
@Component
class JedisConfigData{
	/**
	 * redis地址
	 */
	private String host;
	/**
	 * 端口
	 */
	private int port;
	/**
	 * 最小空闲数量
	 */
	private int minIdle;
	/**
	 * 最大空闲数
	 */
	private int maxIdle;
	/**
	 * 最大连接数
	 */
	private int maxTotal;
	/**
	 * 超时时间
	 */
	private int timeout;
	/**
	 * 密码
	 */
	private String password;
	
	public int getTimeout() {
		return timeout;
	}
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMaxTotal() {
		return maxTotal;
	}
	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}
	@Override
	public String toString() {
		return "JedisConfigData [host=" + host + ", port=" + port + ", minIdle=" + minIdle + ", maxIdle=" + maxIdle
				+ ", maxTotal=" + maxTotal + ", timeout=" + timeout + ", password=" + password + "]";
	}
	
	
}

package com.test.rabbitmq.pakage.utils;

import java.util.List;
import java.util.Map;
import java.util.Random;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * 缓存实现类
 * @author Administrator
 *
 */
public class Cache {
	private JedisPool jedisPool;
	private Random random;

	public Cache(JedisPool jedisPool) {
		super();
		this.jedisPool = jedisPool;
		this.random = new Random();
	}
	
	/**
	 * 获取jedis资源
	 * @return
	 */
	public Jedis getResource() {
		return this.jedisPool.getResource();
	}
	
	/**
	 * 添加缓存
	 * @param id
	 * @param obj
	 */
	public void addCache(String key, Object obj) {
		if(StringUtil.isBlank(key) || obj == null) {
			return ;
		}
		Jedis jedis = this.getResource();
		jedis.set(key, JsonUtil.toJsonString(obj));
		jedis.close();
	}
	/**
	 * 添加缓存+过期时间
	 * @param key
	 * @param obj
	 * @param seconds
	 */
	public void addCacheWith(String key, Object obj, int seconds) {
		seconds += this.random.nextInt(5);
		if(StringUtil.isBlank(key) || obj == null) {
			return ;
		}
		Jedis jedis = this.getResource();
		jedis.set(key, JsonUtil.toJsonString(obj));
		jedis.expire(key, seconds);
		jedis.close();
	}
	
	/**
	 * 获取缓存
	 * @param key
	 * @param clazz
	 * @return
	 */
	public <T> T getCache(String key, Class<T> clazz) {
		if(StringUtil.isBlank(key)) {
			return null;
		}
		Jedis jedis = this.getResource();
		String value = jedis.get(key);
		jedis.close();
		if(StringUtil.isBlank(value)) {
			return null;
		}
		return JsonUtil.toBean(value, clazz);
	}
	/**
	 * redis 的hash方式缓存
	 * @param key
	 * @param name
	 * @param value
	 */
	public void addCacheItem(String key, String field, String value) {
		Jedis jedis = this.getResource();
		jedis.hset(key, field, value);
		jedis.close();
	}
	/**
	 * 批量添加缓存
	 * @param key
	 * @param list
	 */
	public void addCacheItem(String key, List<CacheItem> list) {
		Jedis jedis = this.getResource();
		for(CacheItem item : list) {
			jedis.hset(key, item.getField(), item.getValue());
		}
		jedis.close();
	}
	/**
	 * 获取缓存的单个属性
	 * @param key
	 * @param field
	 * @return
	 */
	public String getCacheItem(String key, String field) {
		Jedis jedis = this.getResource();
		String value = jedis.hget(key, field);
		jedis.close();
		return value;
	}
	/**
	 * 获取缓存的所有属性
	 * @param key
	 * @return
	 */
	public Map<String, String> getCacheItem(String key){
		Jedis jedis = this.getResource();
		Map<String, String> map = jedis.hgetAll(key);
		jedis.close();
		return map;
	}
	/**
	 *	移除缓存
	 * @param key
	 */
	public void removeCache(String key) {
		if(StringUtil.isBlank(key)) {
			return ;
		}
		Jedis jedis = this.getResource();
		jedis.del(key);
		jedis.close();
	}
}

package com.test.rabbitmq.pakage.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * json转换工具
 * 
 * @Description: TODO
 * @author A18ccms a18ccms_gmail_com
 * @date 2017年5月9日 下午2:09:00
 *
 */
public class JsonUtil {
	/**
	 * 字符串转类 @Description: TODO @param @param json @param @param
	 * clazz @param @return @return T 返回类型 @throws
	 */
	public static <T> T toBean(String json, Class<T> clazz) {
		if (StringUtil.isBlank(json)) {
			return null;
		}
		return JSON.parseObject(json, clazz);
	}

	/**
	 * 转类 @Description: TODO @param @param json @param @param
	 * clazz @param @return @return T 返回类型 @throws
	 */
	public static <T> T toBean(JSONObject json, Class<T> clazz) {
		return JSON.toJavaObject(json, clazz);
	}

	/**
	 * 类转json @Description: TODO @param @param o @param @return @return
	 * JSONObject 返回类型 @throws
	 */
	public static JSONObject toJson(Object o) {
		JSONObject parseObject = JSON.parseObject(JSON.toJSONString(o));
		return parseObject;
	}

	/**
	 * 任意类型转jsonString @Description: TODO @param @param
	 * obj @param @return @return String 返回类型 @throws
	 */
	public static String toJsonString(Object obj) {
		return JSON.toJSONString(obj);
	}

	/**
	 * 转成list @Description: TODO @param @param jsonArray @param @param
	 * clazz @param @return @return List<T> 返回类型 @throws
	 */
	public static <T> List<T> toList(String jsonArray, Class<T> clazz) {
		return JSONObject.parseArray(jsonArray, clazz);
	}
}

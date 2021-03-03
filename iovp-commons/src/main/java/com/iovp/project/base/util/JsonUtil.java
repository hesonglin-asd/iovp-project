package com.iovp.project.base.util;

import com.fasterxml.jackson.databind.json.JsonMapper;

/**
 * <b>JSON 格式数据工具类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class JsonUtil {
	/**
	 * <b>将对象转换为 JSON 格式数据</b>
	 * @param obj
	 * @return
	 */
	public static String parseToJSON(Object obj) {
		// 创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "";
	}

	/**
	 * <b>将 JSON 格式数据转换为对应的对象</b>
	 * @param json
	 * @param argCls
	 * @return
	 */
	public static Object parseToObject(String json, Class argCls) {
		// 创建 JsonMapper 对象
		JsonMapper jsonMapper = new JsonMapper();
		try {
			return jsonMapper.readValue(json, argCls);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}

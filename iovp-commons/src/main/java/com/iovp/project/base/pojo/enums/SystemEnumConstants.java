package com.iovp.project.base.pojo.enums;

import com.iovp.project.base.pojo.vo.PageVO;

import java.util.Properties;

/**
 * <b>系统枚举信息常量</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
class SystemEnumConstants {
	private static Properties props = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 props/base/base.properties
			props.load(PageVO.class.getClassLoader().getResourceAsStream("props/base/enums.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统状态枚举信息：启用状态</b>
	 */
	static final Integer STATUS_ENABLE = Integer.parseInt(props.getProperty("enum.status.enable"));

	/**
	 * <b>系统状态枚举信息：禁用状态</b>
	 */
	static final Integer STATUS_DISABLE = Integer.parseInt(props.getProperty("enum.status.disable"));

	/**
	 * <b>系统响应码信息：系统处理响应成功</b>
	 */
	static final Integer RESPONSE_SUCCESS = Integer.parseInt(props.getProperty("enum.response.success"));

	/**
	 * <b>系统响应码信息：用户未进行认证</b>
	 */
	static final Integer RESPONSE_UNAUTH = Integer.parseInt(props.getProperty("enum.response.unnauth"));

	/**
	 * <b>系统响应码信息：系统处理响应异常</b>
	 */
	static final Integer RESPONSE_EXCEPTION = Integer.parseInt(props.getProperty("enum.response.exception"));

	/**
	 * <b>系统响应码信息：系统业务处理错误</b>
	 */
	static final Integer RESPONSE_ERROR = Integer.parseInt(props.getProperty("enum.response.error"));
}

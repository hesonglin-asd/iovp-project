package com.iovp.project.base.util;

import java.util.Properties;

/**
 * <b>基础信息实体类</b>
 *
 */
public class BaseConstantUtil {
	private static Properties props = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 props/base/base.properties
			props.load(BaseConstantUtil.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>系统秘钥信息</b>
	 */
	public static final String SECRET_KEY = props.getProperty("base.secret.key");

	/**
	 * <b>系统过期时间</b>
	 */
	public static final Integer EXPIRE_MINUTE = Integer.parseInt(props.getProperty("base.expire.minute"));
}

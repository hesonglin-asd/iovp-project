package com.iovp.project.base.util;

/**
 * <b>字符串操作工具类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class StringUtil {

	/**
	 * <b>校验字符串是否不为空</b>
	 * @param str
	 * @return
	 */
	public static boolean isNotNull(String str) {
		if (str != null && !"".equals(str.trim())) {
			return true;
		}
		return false;
	}
}

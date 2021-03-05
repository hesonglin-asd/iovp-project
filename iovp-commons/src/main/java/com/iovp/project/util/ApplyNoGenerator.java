package com.iovp.project.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <b>申请编号生成工具类</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class ApplyNoGenerator {

	/**
	 * <b>获得申请编号</b>
	 * <p>
	 *     编号组成规则：
	 *     LY + yyyyMMddHHmmssSSSS
	 * </p>
	 * @return
	 */
	public static String createApplyNo() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
		return "LY" + dateFormat.format(new Date());
	}
}

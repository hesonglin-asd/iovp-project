package com.iovp.project.pojo.entity.driver;

import com.iovp.project.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-驾驶证类型实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class DriverLicenseType extends BaseEntity {
	private static final long serialVersionUID = -837695694851999589L;
	private String id;                      // 主键
	private String text;                    // 文本
	private String code;                    // 状态

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

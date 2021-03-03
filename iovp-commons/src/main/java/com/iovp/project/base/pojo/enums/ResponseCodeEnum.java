package com.iovp.project.base.pojo.enums;

/**
 * <b>系统响应码枚举信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public enum ResponseCodeEnum {
	RESPONSE_SUCCESS(SystemEnumConstants.RESPONSE_SUCCESS, "系统处理响应成功"),
	RESPONSE_UNAUTH(SystemEnumConstants.RESPONSE_UNAUTH, "用户未进行认证"),
	RESPONSE_EXCEPTION(SystemEnumConstants.RESPONSE_EXCEPTION, "系统处理响应异常"),
	RESPONSE_ERROR(SystemEnumConstants.RESPONSE_ERROR, "系统业务处理错误");

	private Integer code;                       // 编码
	private String remark;                      // 说明

	private ResponseCodeEnum(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

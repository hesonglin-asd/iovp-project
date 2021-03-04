package com.iovp.project.pojo.vo;

import java.io.Serializable;

/**
 * <b>智慧公务车信息平台-登陆界面实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class LoginVO implements Serializable {
	private static final long serialVersionUID = -4324367946216460313L;
	private String cellphone;
	private String password;

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

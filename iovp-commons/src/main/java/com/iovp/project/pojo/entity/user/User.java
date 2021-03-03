package com.iovp.project.pojo.entity.user;

import com.iovp.project.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-用户实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class User extends BaseEntity {
	private static final long serialVersionUID = -5104066698578887489L;
	private String id;                      // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
	private String password;                // 登录密码
	private Role role;                      // 角色
	private Department department;          // 部门
	private String idCard;                  // 身份证号码
	private String email;                   // 电子邮件
	private String avatar;                  // 头像

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}

package com.iovp.project.pojo.entity.user;

import com.iovp.project.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-部门实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class Department extends BaseEntity {
	private static final long serialVersionUID = 3077792367519212409L;
	private String id;                      // 主键
	private Department parent;              // 上级部门
	private String name;                    // 部门名称
	private String code;                    // 部门编码

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

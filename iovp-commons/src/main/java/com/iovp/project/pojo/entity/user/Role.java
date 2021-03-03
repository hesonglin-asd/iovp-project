package com.iovp.project.pojo.entity.user;

import com.iovp.project.base.pojo.entity.BaseEntity;

import java.util.List;

/**
 * <b>智慧公务车信息平台-角色实体信息</b>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class Role extends BaseEntity {
	private static final long serialVersionUID = 2666086493601442465L;
	private String id;                      // 主键
	private String name;                    // 名称
	private String code;                    // 编码
	private List<Menu> menuList;            // 角色对应菜单集合

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}
}

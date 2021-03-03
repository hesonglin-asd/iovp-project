package com.iovp.project.base.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础实体信息</b>
 * <p>
 *     基础实体信息设定了实体信息的通用信息，包含：<b>status</b>、<b>createUser</b>、<b>createTime</b>、
 *     <b>updateUser</b>和<b>updateTime</b>。<br/>
 *     所有模块的实体信息都应当<b>继承于</b>本基础实体信息
 * </p>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = -8434884953830796647L;
	private Integer status;                         // 系统状态：0-禁用，1-启用
	private String createUser;                      // 创建人
	private Date createTime;                        // 创建时间
	private String updateUser;                      // 修改人
	private Date updateTime;                        // 创建时间

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}

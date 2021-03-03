package com.iovp.project.pojo.entity.unit;

import com.iovp.project.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-合作单位实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class Unit extends BaseEntity {
	private static final long serialVersionUID = -6127564312190859232L;
	private String id;                      // 主键
	private UnitType unitType;              // 合作单位类型
	private String unitName;                // 合作单位名称
	private String linkman;                 // 联系人
	private String cellphone;               // 联系电话
	private String address;                 // 单位地址
	private String remark;                  // 备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UnitType getUnitType() {
		return unitType;
	}

	public void setUnitType(UnitType unitType) {
		this.unitType = unitType;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

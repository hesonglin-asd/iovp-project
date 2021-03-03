package com.iovp.project.pojo.entity.car;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.unit.Unit;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-维修保养记录实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class MaintenanceRecord extends BaseEntity {
	private static final long serialVersionUID = -9180549226437719095L;
	private String id;                      // 主键
	private Car car;                        // 车辆信息
	private Unit unit;                      // 4S店
	private MaintenanceType maintenanceType;    // 保养维修类型
	private Double totalAmount;             // 保养维修金额
	private Date maintenanceDate;           // 保养维修日期

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public MaintenanceType getMaintenanceType() {
		return maintenanceType;
	}

	public void setMaintenanceType(MaintenanceType maintenanceType) {
		this.maintenanceType = maintenanceType;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getMaintenanceDate() {
		return maintenanceDate;
	}

	public void setMaintenanceDate(Date maintenanceDate) {
		this.maintenanceDate = maintenanceDate;
	}
}

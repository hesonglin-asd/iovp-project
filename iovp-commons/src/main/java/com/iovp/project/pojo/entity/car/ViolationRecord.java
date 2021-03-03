package com.iovp.project.pojo.entity.car;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.driver.Driver;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-违章记录实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class ViolationRecord extends BaseEntity {
	private static final long serialVersionUID = -4472148872761734367L;
	private String id;                      // 主键
	private Car car;                        // 车辆信息
	private ViolationType violationType;    // 违章类型
	private String address;                 // 违章地点
	private Integer points;                 // 违章扣分
	private Double amount;                  // 违章罚款
	private Driver driver;                  // 违章司机
	private Integer violationStatus;        // 违章处理状态：0-未处理，1-已处理
	private Date violationDate;             // 违章日期

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

	public ViolationType getViolationType() {
		return violationType;
	}

	public void setViolationType(ViolationType violationType) {
		this.violationType = violationType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Integer getViolationStatus() {
		return violationStatus;
	}

	public void setViolationStatus(Integer violationStatus) {
		this.violationStatus = violationStatus;
	}

	public Date getViolationDate() {
		return violationDate;
	}

	public void setViolationDate(Date violationDate) {
		this.violationDate = violationDate;
	}
}

package com.iovp.project.pojo.entity.car;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.unit.Unit;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-年检记录实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class InspectRecord extends BaseEntity {
	private static final long serialVersionUID = -3691376877904858704L;
	private String id;                      // 主键
	private Car car;                        // 车辆信息
	private Unit unit;                      // 车管所
	private Date inspectDate;               // 年检日期
	private Date nextInspectDate;           // 下次年检日期

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

	public Date getInspectDate() {
		return inspectDate;
	}

	public void setInspectDate(Date inspectDate) {
		this.inspectDate = inspectDate;
	}

	public Date getNextInspectDate() {
		return nextInspectDate;
	}

	public void setNextInspectDate(Date nextInspectDate) {
		this.nextInspectDate = nextInspectDate;
	}
}

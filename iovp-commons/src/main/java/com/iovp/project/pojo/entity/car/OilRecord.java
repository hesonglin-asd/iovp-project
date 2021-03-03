package com.iovp.project.pojo.entity.car;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.unit.Unit;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-加油记录实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class OilRecord extends BaseEntity {
	private static final long serialVersionUID = -749645334821496811L;
	private String id;                      // 主键
	private Car car;                        // 车辆信息
	private Unit unit;                      // 加油站
	private OilLabel oilLabel;              // 油料标号
	private Double unitPrice;               // 油品单价
	private Double volume;                  // 加油容量
	private Double totalAmount;             // 总金额
	private Date oilDate;                   // 加油日期
	private String remark;                  // 备注

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

	public OilLabel getOilLabel() {
		return oilLabel;
	}

	public void setOilLabel(OilLabel oilLabel) {
		this.oilLabel = oilLabel;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getVolume() {
		return volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getOilDate() {
		return oilDate;
	}

	public void setOilDate(Date oilDate) {
		this.oilDate = oilDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

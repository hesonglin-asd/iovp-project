package com.iovp.project.pojo.entity.car;

import com.iovp.project.base.pojo.entity.BaseEntity;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-车辆信息实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class Car extends BaseEntity {
	private static final long serialVersionUID = 1414826356337550283L;
	private String id;                      // 主键
	private String no;                      // 车牌号码
	private Brand brand;                    // 车辆品牌
	private Seat seat;                      // 座位数量
	private String engineNo;                // 发动机号码
	private String frameNo;                 // 车架号
	private String carImage;                // 车辆照片
	private Date purchaseDate;              // 购买时间
	private Date nextInspectDate;           // 下次年检时间
	private Date expireInsuranceDate;       // 保险到期时间
	private CarStatus carStatus;            // 车辆状态
	private String remark;                  // 备注

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getCarImage() {
		return carImage;
	}

	public void setCarImage(String carImage) {
		this.carImage = carImage;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Date getNextInspectDate() {
		return nextInspectDate;
	}

	public void setNextInspectDate(Date nextInspectDate) {
		this.nextInspectDate = nextInspectDate;
	}

	public Date getExpireInsuranceDate() {
		return expireInsuranceDate;
	}

	public void setExpireInsuranceDate(Date expireInsuranceDate) {
		this.expireInsuranceDate = expireInsuranceDate;
	}

	public CarStatus getCarStatus() {
		return carStatus;
	}

	public void setCarStatus(CarStatus carStatus) {
		this.carStatus = carStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

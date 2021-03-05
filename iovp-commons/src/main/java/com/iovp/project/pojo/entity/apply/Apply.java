package com.iovp.project.pojo.entity.apply;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.car.Car;
import com.iovp.project.pojo.entity.car.Seat;
import com.iovp.project.pojo.entity.driver.Driver;
import com.iovp.project.pojo.entity.user.User;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-用车申请实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class Apply extends BaseEntity {
	private static final long serialVersionUID = 1767401733528650305L;
	private String id;                      // 主键
	private String applyNo;                 // 申请编码
	private User applyUser;                 // 申请人
	private String applyCellphone;          // 申请人手机号码
	private Seat seat;                      // 出行人数
	private Date applyBeginDate;            // 出行日期
	private Date expectBackDate;            // 申请返回日期
	private String targetAddress;           // 出行目的地
	private String applyRemark;             // 申请说明
	private Date applyDate;                 // 申请日期
	private User examineUser;               // 审核人
	private String examineRemark;           // 审核说明
	private Date examineDate;               // 审核日期
	private Car car;                        // 使用车辆
	private Driver driver;                  // 驾驶员信息
	private String driverCellphone;         // 驾驶员联系电话
	private Date realityBackDate;           // 实际返回时间
	private ApplyStatus applyStatus;        // 申请状态
	private Date beginQueryApplyBeginDate;  // 查询申请出车时间的开始时间点
	private Date endQueryApplyEndDate;      // 查询申请出车时间的结束时间点

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplyNo() {
		return applyNo;
	}

	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public User getApplyUser() {
		return applyUser;
	}

	public void setApplyUser(User applyUser) {
		this.applyUser = applyUser;
	}

	public String getApplyCellphone() {
		return applyCellphone;
	}

	public void setApplyCellphone(String applyCellphone) {
		this.applyCellphone = applyCellphone;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Date getApplyBeginDate() {
		return applyBeginDate;
	}

	public void setApplyBeginDate(Date applyBeginDate) {
		this.applyBeginDate = applyBeginDate;
	}

	public Date getExpectBackDate() {
		return expectBackDate;
	}

	public void setExpectBackDate(Date expectBackDate) {
		this.expectBackDate = expectBackDate;
	}

	public String getTargetAddress() {
		return targetAddress;
	}

	public void setTargetAddress(String targetAddress) {
		this.targetAddress = targetAddress;
	}

	public String getApplyRemark() {
		return applyRemark;
	}

	public void setApplyRemark(String applyRemark) {
		this.applyRemark = applyRemark;
	}

	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public User getExamineUser() {
		return examineUser;
	}

	public void setExamineUser(User examineUser) {
		this.examineUser = examineUser;
	}

	public String getExamineRemark() {
		return examineRemark;
	}

	public void setExamineRemark(String examineRemark) {
		this.examineRemark = examineRemark;
	}

	public Date getExamineDate() {
		return examineDate;
	}

	public void setExamineDate(Date examineDate) {
		this.examineDate = examineDate;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getDriverCellphone() {
		return driverCellphone;
	}

	public void setDriverCellphone(String driverCellphone) {
		this.driverCellphone = driverCellphone;
	}

	public Date getRealityBackDate() {
		return realityBackDate;
	}

	public void setRealityBackDate(Date realityBackDate) {
		this.realityBackDate = realityBackDate;
	}

	public ApplyStatus getApplyStatus() {
		return applyStatus;
	}

	public void setApplyStatus(ApplyStatus applyStatus) {
		this.applyStatus = applyStatus;
	}

	public Date getBeginQueryApplyBeginDate() {
		return beginQueryApplyBeginDate;
	}

	public void setBeginQueryApplyBeginDate(Date beginQueryApplyBeginDate) {
		this.beginQueryApplyBeginDate = beginQueryApplyBeginDate;
	}

	public Date getEndQueryApplyEndDate() {
		return endQueryApplyEndDate;
	}

	public void setEndQueryApplyEndDate(Date endQueryApplyEndDate) {
		this.endQueryApplyEndDate = endQueryApplyEndDate;
	}
}

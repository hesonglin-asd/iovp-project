package com.iovp.project.pojo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>智慧公务车信息平台-用车申请视图信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class ApplyVO implements Serializable {
	private String cellphone;                       // 申请人联系电话
	private String seat;                            // 车辆座位数量主键
	private Date applyBeginDate;                    // 出行日期
	private Date expectBackDate;                    // 申请返回日期
	private String targetAddress;                   // 出行目的地
	private String applyRemark;                     // 申请说明

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
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
}

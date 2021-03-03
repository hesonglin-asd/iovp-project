package com.iovp.project.pojo.entity.driver;

import com.iovp.project.base.pojo.entity.BaseEntity;

/**
 * <b>智慧公务车信息平台-驾驶员实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class Driver extends BaseEntity {
	private static final long serialVersionUID = -8764034939445839485L;
	private String id;                      // 主键
	private String name;                    // 驾驶员姓名
	private String cellphone;               // 手机号码
	private DriverLicenseType licenseType;  // 驾驶证类型
	private String licenseNo;               // 驾驶证号码
	private String licenseImage;            // 驾驶证照片
	private String idCard;                  // 身份证号码
	private String idCardImage;             // 身份证照片
	private String licensePoints;           // 驾驶证累计积分
	private DriverStatus driverStatus;      // 驾驶员状态
	private String remark;                  // 备注

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

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public DriverLicenseType getLicenseType() {
		return licenseType;
	}

	public void setLicenseType(DriverLicenseType licenseType) {
		this.licenseType = licenseType;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getLicenseImage() {
		return licenseImage;
	}

	public void setLicenseImage(String licenseImage) {
		this.licenseImage = licenseImage;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getIdCardImage() {
		return idCardImage;
	}

	public void setIdCardImage(String idCardImage) {
		this.idCardImage = idCardImage;
	}

	public String getLicensePoints() {
		return licensePoints;
	}

	public void setLicensePoints(String licensePoints) {
		this.licensePoints = licensePoints;
	}

	public DriverStatus getDriverStatus() {
		return driverStatus;
	}

	public void setDriverStatus(DriverStatus driverStatus) {
		this.driverStatus = driverStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}

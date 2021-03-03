package com.iovp.project.driver.service;

import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.pojo.entity.driver.DriverLicenseType;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶证类型功能业务层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public interface DriverLicenseTypeService {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<DriverLicenseType> getPageByQuery(DriverLicenseType query, PageVO<DriverLicenseType> pageVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<DriverLicenseType> getListByQuery(DriverLicenseType query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(DriverLicenseType entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(DriverLicenseType entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	DriverLicenseType getById(String id) throws Exception;

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	DriverLicenseType getByCode(String code) throws Exception;
}

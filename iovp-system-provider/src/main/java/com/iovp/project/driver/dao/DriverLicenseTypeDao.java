package com.iovp.project.driver.dao;

import com.iovp.project.pojo.entity.driver.DriverLicenseType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶证类型功能数据持久层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface DriverLicenseTypeDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<DriverLicenseType> findListByQuery(DriverLicenseType query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(DriverLicenseType entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(DriverLicenseType entity) throws Exception;
}

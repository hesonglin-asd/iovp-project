package com.iovp.project.driver.dao;

import com.iovp.project.pojo.entity.driver.DriverStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧公务车信息平台-驾驶员功能数据持久层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface DriverStatusDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<DriverStatus> findListByQuery(DriverStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(DriverStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(DriverStatus entity) throws Exception;
}

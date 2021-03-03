package com.iovp.project.apply.dao;

import com.iovp.project.pojo.entity.apply.ApplyStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用车申请状态数据持久层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@Repository
public interface ApplyStatusDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<ApplyStatus> findListByQuery(ApplyStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(ApplyStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(ApplyStatus entity) throws Exception;
}

package com.iovp.project.apply.service;

import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.pojo.entity.apply.ApplyStatus;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用车申请状态业务层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ApplyStatusService {
	/**
	 * <b>根据查询对象分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	PageVO<ApplyStatus> getPageByQuery(ApplyStatus query, PageVO<ApplyStatus> pageVO) throws Exception;

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<ApplyStatus> getListByQuery(ApplyStatus query) throws Exception;

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean save(ApplyStatus entity) throws Exception;

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	boolean update(ApplyStatus entity) throws Exception;

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	ApplyStatus getById(String id) throws Exception;

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	ApplyStatus getByCode(String code) throws Exception;
}

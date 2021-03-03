package com.iovp.project.apply.transport.impl;

import com.iovp.project.apply.service.ApplyStatusService;
import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.base.pojo.vo.QueryVO;
import com.iovp.project.pojo.entity.apply.ApplyStatus;
import com.iovp.project.transport.apply.ApplyStatusTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用车申请状态传输层接口实现类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("applyStatusTransport")
@RequestMapping("/applystatus/transprot")
public class ApplyStatusTransportImpl implements ApplyStatusTransport {
	@Autowired
	private ApplyStatusService service;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<ApplyStatus> getPageByQuery(@RequestBody QueryVO<ApplyStatus> queryVO) throws Exception {
		return service.getPageByQuery(queryVO.getQuery(), queryVO.getPageVO());
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	@Override
	public List<ApplyStatus> getListByQuery(@RequestBody ApplyStatus query) throws Exception {
		return service.getListByQuery(query);
	}

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	@Override
	public boolean save(@RequestBody ApplyStatus entity) throws Exception {
		return service.save(entity);
	}

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	@Override
	public boolean update(@RequestBody ApplyStatus entity) throws Exception {
		return service.update(entity);
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/id")
	@Override
	public ApplyStatus getById(@RequestParam String id) throws Exception {
		return service.getById(id);
	}

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/code")
	@Override
	public ApplyStatus getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}

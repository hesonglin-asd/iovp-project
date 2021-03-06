package com.iovp.project.apply.transport.impl;

import com.iovp.project.apply.service.ExpenseTypeService;
import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.base.pojo.vo.QueryVO;
import com.iovp.project.pojo.entity.apply.ExpenseType;
import com.iovp.project.transport.apply.ExpenseTypeTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用车费用类型传输层接口实现类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("expenseTypeTransport")
@RequestMapping("/trans/apply/expensetype")
public class ExpenseTypeTransportImpl implements ExpenseTypeTransport {
	@Autowired
	private ExpenseTypeService service;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param queryVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page")
	@Override
	public PageVO<ExpenseType> getPageByQuery(@RequestBody QueryVO<ExpenseType> queryVO) throws Exception {
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
	public List<ExpenseType> getListByQuery(@RequestBody ExpenseType query) throws Exception {
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
	public boolean save(@RequestBody ExpenseType entity) throws Exception {
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
	public boolean update(@RequestBody ExpenseType entity) throws Exception {
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
	public ExpenseType getById(@RequestParam String id) throws Exception {
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
	public ExpenseType getByCode(@RequestParam String code) throws Exception {
		return service.getByCode(code);
	}
}

package com.iovp.project.car.service.impl;

import com.github.pagehelper.PageHelper;
import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.base.util.IdGenerator;
import com.iovp.project.base.util.PageUtil;
import com.iovp.project.car.dao.SeatDao;
import com.iovp.project.car.service.SeatService;
import com.iovp.project.pojo.entity.car.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧公务车信息平台-汽车数量业务层接口实现类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("seatService")
@Transactional
public class SeatServiceImpl implements SeatService {
	@Autowired
	private SeatDao dao;
	@Autowired
	private IdGenerator idGenerator;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param query
	 * @param pageVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public PageVO<Seat> getPageByQuery(Seat query, PageVO<Seat> pageVO)
			throws Exception {
		// 开启 PageHelper 分页过滤器
		PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
		// 进行分页列表查询
		List<Seat> list = dao.findListByQuery(query);
		// 进行数据的切换
		new PageUtil<Seat>().parseFromPageInfoToPageVO(list, pageVO);

		return pageVO;
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Seat> getListByQuery(Seat query) throws Exception {
		return dao.findListByQuery(query);
	}

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean save(Seat entity) throws Exception {
		// 设定主键
		entity.setId(idGenerator.createId());
		if (dao.save(entity) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@Override
	public boolean update(Seat entity) throws Exception {
		if (dao.update(entity) > 0) {
			return true;
		}
		return false;
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@Override
	public Seat getById(String id) throws Exception {
		// 封装查询对象
		Seat query = new Seat();
		// 设定查询参数
		query.setId(id);
		// 查询列表
		List<Seat> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * <b>根据编码查询对象</b>
	 * @param code
	 * @return
	 * @throws Exception
	 */
	@Override
	public Seat getByCode(String code) throws Exception {
		// 封装查询对象
		Seat query = new Seat();
		// 设定查询参数
		query.setCode(code);
		// 查询列表
		List<Seat> list = dao.findListByQuery(query);
		if (list != null && !list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}
}

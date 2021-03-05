package com.iovp.project.apply.controller;

import com.iovp.project.base.controller.BaseController;
import com.iovp.project.base.pojo.vo.PageVO;
import com.iovp.project.base.pojo.vo.QueryVO;
import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.base.util.StringUtil;
import com.iovp.project.pojo.entity.apply.ExpenseType;
import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.transport.apply.ExpenseTypeTransport;
import com.iovp.project.transport.user.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <b>智慧公务车信息平台-用车费用类型控制层类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("expenseTypeController")
@RequestMapping("/apply/expensetype")
public class ExpenseTypeController extends BaseController {
	@Autowired
	private ExpenseTypeTransport transport;
	@Autowired
	private UserTransport userTransport;

	/**
	 * <b>根据查询对象分页查询</b>
	 * @param query
	 * @param pageNum
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/page/{pageNum}/{pageSize}")
	public ResponseVO getPageByQuery(@RequestBody ExpenseType query, @PathVariable("pageNum") Integer pageNum,
	                                 @PathVariable("pageSize") Integer pageSize) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获得登录用户信息
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				// 用户已登录
				// 封装查询对象
				PageVO<ExpenseType> pageVO = new PageVO<ExpenseType>(pageNum, pageSize);
				// 创建查询视图
				QueryVO<ExpenseType> queryVO = new QueryVO<ExpenseType>(query, pageVO);
				// 进行分页查询
				pageVO = transport.getPageByQuery(queryVO);
				// 获得视图响应对象
				ResponseVO responseVO = ResponseVO.getSuccessResponse(pageVO);
				return responseVO;
			} else {
				// 用户未登录
				return ResponseVO.getUnAuthResponse();
			}
		} else {
			// 用户未登录
			return ResponseVO.getUnAuthResponse();
		}
	}

	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/list")
	public ResponseVO getListByQuery(@RequestBody ExpenseType query) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获得登录用户信息
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				// 用户已登录
				return ResponseVO.getSuccessResponse(transport.getListByQuery(query));
			} else {
				// 用户未登录
				return ResponseVO.getUnAuthResponse();
			}
		} else {
			// 用户未登录
			return ResponseVO.getUnAuthResponse();
		}
	}

	/**
	 * <b>保存信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/save")
	public ResponseVO save(@RequestBody ExpenseType entity) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		// 根据 token 获得登录用户信息
		if (StringUtil.isNotNull(token)) {
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				// 用户已登录
				// 检测用户所提交的数据是否可用
				if (StringUtil.isNotNull(entity.getText()) && StringUtil.isNotNull(entity.getCode())) {
					// 校验 code 是否重复
					if (transport.getByCode(entity.getCode()) == null) {
						// 此时的 code 未被占用
						entity.setCreateUser(loginUser.getId());
						// 进行保存
						if (transport.save(entity)) {
							// 保存成功
							return ResponseVO.getSuccessResponse();
						} else {
							return ResponseVO.getErrorResponse("保存失败");
						}
					} else {
						return ResponseVO.getErrorResponse("编码已被占用");
					}
				} else {
					return ResponseVO.getErrorResponse("相关信息无效");
				}
			} else {
				// 用户未登录
				return ResponseVO.getUnAuthResponse();
			}
		} else {
			// 用户未登录
			return ResponseVO.getUnAuthResponse();
		}
	}

	/**
	 * <b>修改信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/update")
	public ResponseVO update(@RequestBody ExpenseType entity) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获得登录用户信息
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				// 用户已登录
				// 检测用户所提交的数据是否可用
				if (StringUtil.isNotNull(entity.getText()) && StringUtil.isNotNull(entity.getCode())) {
					ExpenseType obj = transport.getByCode(entity.getCode());
					// 校验 code 是否重复
					if (obj == null || obj.getId().equals(entity.getId())) {
						// 此时的 code 未被占用
						entity.setUpdateUser(loginUser.getId());
						// 进行保存
						if (transport.update(entity)) {
							// 保存成功
							return ResponseVO.getSuccessResponse();
						} else {
							return ResponseVO.getErrorResponse("保存失败");
						}
					} else {
						return ResponseVO.getErrorResponse("编码已被占用");
					}
				} else {
					return ResponseVO.getErrorResponse("相关信息无效");
				}
			} else {
				// 用户未登录
				return ResponseVO.getUnAuthResponse();
			}
		} else {
			// 用户未登录
			return ResponseVO.getUnAuthResponse();
		}
	}

	/**
	 * <b>根据主键查询对象</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/id/{id}")
	public ResponseVO getById(@PathVariable("id") String id) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获得登录用户信息
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				return ResponseVO.getSuccessResponse(transport.getById(id));
			} else {
				// 用户未登录
				return ResponseVO.getUnAuthResponse();
			}
		} else {
			// 用户未登录
			return ResponseVO.getUnAuthResponse();
		}
	}
}

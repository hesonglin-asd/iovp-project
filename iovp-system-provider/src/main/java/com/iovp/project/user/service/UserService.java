package com.iovp.project.user.service;

import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.pojo.vo.LoginVO;

/**
 * <b>智慧公务车信息平台-用户员功能业务层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public interface UserService {
	/**
	 * <b>根据 Token 获得用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	User getUserByToken(String token) throws Exception;

	/**
	 * <b>用户登录</b>
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	ResponseVO login(LoginVO loginVO)throws Exception;
}

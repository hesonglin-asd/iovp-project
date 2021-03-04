package com.iovp.project.user.controller;

import com.iovp.project.base.controller.BaseController;
import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.pojo.vo.LoginVO;
import com.iovp.project.transport.user.UserTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧公务车信息平台-用户信息功能控制层类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("userController")
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private UserTransport userTransport;
	/**
	 * <b>用户登录</b>
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/login")
	public ResponseVO loginUser(@RequestBody LoginVO loginVO) throws Exception{
		return userTransport.loginUser(loginVO);
	}


}

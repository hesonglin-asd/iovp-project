package com.iovp.project.user.transport.impl;

import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.transport.user.UserTransport;
import com.iovp.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>智慧公务车信息平台-用户员功能传输层接口实现类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("userTransport")
@RequestMapping("/user/transport")
public class UserTransportImpl implements UserTransport {
	@Autowired
	private UserService userService;

	/**
	 * <b>根据 Token 获得当前登录用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/token")
	@Override
	public User getUserByToken(String token) throws Exception {
		return userService.getUserByToken(token);
	}
}

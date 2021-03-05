package com.iovp.project.transport.user;

import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.pojo.vo.LoginVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>智慧公务车信息平台-用户员功能传输层接口</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@FeignClient(name = "iovp-system-provider")
@RequestMapping("/trans/system/user")
public interface UserTransport {
	/**
	 * <b>进行用户登录</b>
	 * @param loginVO
	 * @return
	 */
	@PostMapping("/login")
	ResponseVO loginUser(@RequestBody LoginVO loginVO)throws Exception;

	/**
	 * <b>根据 Token 获得当前登录用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/token")
	User getUserByToken(@RequestParam String token) throws Exception;

}

package com.iovp.project.base.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * <b>基础控制层类</b>
 * <p>
 *     基础控制类依赖注入了<b>HttpServletRequest</b>、<b>HttpServletResponse</b>和<b>HttpSession</b>，<br/>
 *     其他功能控制层类都必须<b>继承于</b>本基础控制层类
 * </p>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
@Controller("baseController")
public class BaseController {
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpServletResponse response;
	@Autowired
	protected HttpSession session;
}

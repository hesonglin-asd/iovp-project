package com.iovp.project.apply.controller;

import com.iovp.project.base.controller.BaseController;
import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.base.util.StringUtil;
import com.iovp.project.pojo.entity.apply.Apply;
import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.pojo.vo.ApplyVO;
import com.iovp.project.transport.apply.ApplyTransport;
import com.iovp.project.transport.car.SeatTransport;
import com.iovp.project.transport.user.UserTransport;
import com.iovp.project.util.ApplyNoGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <b>智慧公务车信息平台-用车申请控制层类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@RestController("applyController")
@RequestMapping("/apply")
public class ApplyController extends BaseController {
	@Autowired
	private ApplyTransport transport;
	@Autowired
	private UserTransport userTransport;
	@Autowired
	private SeatTransport seatTransport;

	/**
	 * <b>申请用车</b>
	 * @param applyVO
	 * @return
	 * @throws Exception
	 */
	public ResponseVO applyUseCar(@RequestBody ApplyVO applyVO) throws Exception {
		// 获得前端在请求时，存储于 HTTP 消息头中的 Authorization 所对应的 Token 信息
		String token = request.getHeader("Authorization");
		if (StringUtil.isNotNull(token)) {
			// 根据 token 获得登录用户信息
			User loginUser = userTransport.getUserByToken(token);
			if (loginUser != null) {
				// 用户已登录
				// 创建申请对象
				Apply apply = new Apply();
				String applyNo = ApplyNoGenerator.createApplyNo();
				apply.setApplyNo(applyNo);
				apply.setApplyUser(loginUser);
				apply.setApplyCellphone(applyVO.getCellphone());
				apply.setSeat(seatTransport.getById(applyVO.getSeat()));
				apply.setApplyBeginDate(applyVO.getApplyBeginDate());
				apply.setExpectBackDate(applyVO.getExpectBackDate());
				apply.setTargetAddress(applyVO.getTargetAddress());
				apply.setApplyRemark(applyVO.getApplyRemark());
				apply.setApplyDate(new Date());
				// 进行数据保存
				if (transport.save(apply)) {
					// 获得视图响应对象
					ResponseVO responseVO = ResponseVO.getSuccessResponse(applyNo);
					return responseVO;
				} else {
					return ResponseVO.getErrorResponse("申请失败");
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
}

package com.iovp.project.user.service.impl;

import com.iovp.project.base.pojo.enums.StatusEnum;
import com.iovp.project.base.pojo.vo.ResponseVO;
import com.iovp.project.base.util.*;
import com.iovp.project.pojo.entity.user.User;
import com.iovp.project.pojo.vo.LoginVO;
import com.iovp.project.user.dao.UserDao;
import com.iovp.project.user.service.UserService;
import org.apache.ibatis.executor.statement.StatementUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <b>智慧公务车信息平台-用户员功能业务层接口实现类</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private RedisUtil redisUtil;

	/**
	 * <b>根据 Token 获得用户信息</b>
	 * @param token
	 * @return
	 * @throws Exception
	 */
	@Override
	public User getUserByToken(String token) throws Exception {
		// 校验用户所给定的 token 有效
		if (TokenUtil.verifyToken(token) != null) {
			// Token 信息校验成功，那么根据 Token 在 Redis 中查找对象
			return (User) redisUtil.getFromRedis(token, User.class);
		}
		return null;
	}

	/**
	 * <b>用户登录</b>
	 * @param loginVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public ResponseVO login(LoginVO loginVO) throws Exception {
		//校验用户登陆所提交的数据是否符合要求
		if (StringUtil.isNotNull(loginVO.getCellphone()) && StringUtil.isNotNull(loginVO.getPassword())){
			//登录信息有效
			//根据手机号码查询用户信息
			//封装查询对象
			User query=new User();
			query.setCellphone(loginVO.getCellphone());
			List<User> list=userDao.findListByQuery(query);
			if(!list.isEmpty() && list != null){
				//根据用户手机号码查询相关信息
				//对于用户登录所提交的密码进行加密
				loginVO.setPassword(MD5Util.encrypt(loginVO.getPassword()));
				if (list.get(0).getPassword().equals(loginVO.getPassword())){
					if(list.get(0).getStatus().equals(StatusEnum.STATUS_ENABLE)) {
						//登陆成功，使用用户登录信息创建token
						String token=TokenUtil.createToken(list.get(0).getId());
						//将对象变为Json
						String userJSON= JsonUtil.parseToJSON(list.get(0));
						//将信息存储到redis中
						redisUtil.saveToRedis(token, userJSON);
						//返回信息
						return ResponseVO.getSuccessResponse(token);
					} else {
						return ResponseVO.getErrorResponse("您被禁止登陆");
					}
				} else {
					return ResponseVO.getErrorResponse("请正确的填写登录信息");
				}
			} else {
				return ResponseVO.getErrorResponse("请正确的填写登录信息");
			}
		} else {
			return ResponseVO.getErrorResponse("请填写有效的登录信息");
		}
	}
}

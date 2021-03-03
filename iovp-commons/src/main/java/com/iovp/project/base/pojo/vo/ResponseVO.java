package com.iovp.project.base.pojo.vo;

import cn.ekgc.socip.base.pojo.enums.ResponseCodeEnum;

import java.io.Serializable;

/**
 * <b>系统响应视图信息</b>
 * <p>
 *     本视图包含：<b>响应码 code</b>和<b>响应数据 data</b>。<br/>
 *     所有异步返回前端数据都必须以本响应视图返回
 * </p>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class ResponseVO<E> implements Serializable {
	private static final long serialVersionUID = -9085070941911930256L;
	private Integer code;                       // 响应码
	private E data;                             // 响应数据

	private ResponseVO(Integer code) {
		this.code = code;
	}

	private ResponseVO(Integer code, E data) {
		this.code = code;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	/**
	 * <b>获得系统处理响应成功视图</b>
	 * @return
	 */
	public static ResponseVO getSuccessResponse() {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_SUCCESS.getCode());
	}

	/**
	 * <b>获得系统处理响应成功视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getSuccessResponse(Object data) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_SUCCESS.getCode(), data);
	}

	/**
	 * <b>获得用户未授权视图</b>
	 * @return
	 */
	public static ResponseVO getUnAuthResponse() {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_UNAUTH.getCode(), "该用户未认证");
	}

	/**
	 * <b>获得系统处理响应异常视图</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO getExceptionResponse(Exception e) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_EXCEPTION.getCode(), e);
	}

	/**
	 * <b>获得系统业务处理错误视图</b>
	 * @param data
	 * @return
	 */
	public static ResponseVO getErrorResponse(Object data) {
		return new ResponseVO(ResponseCodeEnum.RESPONSE_ERROR.getCode(), data);
	}
}

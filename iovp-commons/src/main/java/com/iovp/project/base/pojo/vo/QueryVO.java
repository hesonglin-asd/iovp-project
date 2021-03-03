package com.iovp.project.base.pojo.vo;

import java.io.Serializable;

/**
 * <b>查询信息视图</b>
 * <p>
 *     当进行分页列表查询时，通过 Consumer 调用 Provider 时，需要将查询对象和分页对象封装为本查询视图
 * </p>
 * @param <E>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class QueryVO<E> implements Serializable {
	private static final long serialVersionUID = 6448919880846644692L;
	private E query;                        // 查询对象
	private PageVO<E> pageVO;               // 分页视图

	public QueryVO(E query, PageVO<E> pageVO) {
		this.query = query;
		this.pageVO = pageVO;
	}

	public E getQuery() {
		return query;
	}

	public void setQuery(E query) {
		this.query = query;
	}

	public PageVO<E> getPageVO() {
		return pageVO;
	}

	public void setPageVO(PageVO<E> pageVO) {
		this.pageVO = pageVO;
	}
}

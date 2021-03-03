package com.iovp.project.base.pojo.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Properties;

/**
 * <b>分页视图信息</b>
 * <p>
 *     分页视图信息包含：<b>当前页码 pageNum</b>、<b>每页显示数量 pageSize</b>、<b>Datatables 信息 draw</b>、
 *     <b>分页列表：list</b>、<b>总条数 totalCount</b>、<b>总页数 totalPage</b>。<br/>
 *     所有需要分页查询的功能，必须<b>封装和返回</b>为本分页视图。
 * </p>
 * @author Arthur
 * @version 1.0.0
 * @since 1.0.0
 */
public class PageVO<E> implements Serializable {
	private static final long serialVersionUID = -619378279227766497L;
	private Integer pageNum;                        // 当前页码
	private Integer pageSize;                       // 每页显示数量
	private Integer draw;                           // Datatables 信息
	private List<E> list;                           // 分页列表
	private Long totalCount;                        // 总条数
	private Integer totalPage;                      // 总页数
	private static Properties props = new Properties();

	static {
		try {
			// 加载位于 src 下的配置文件 props/base/base.properties
			props.load(PageVO.class.getClassLoader().getResourceAsStream("props/base/base.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = Integer.parseInt(props.getProperty("base.page.num"));
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = Integer.parseInt(props.getProperty("base.page.size"));
		}
	}

	public PageVO(Integer pageNum, Integer pageSize, Integer draw) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = Integer.parseInt(props.getProperty("base.page.num"));
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = Integer.parseInt(props.getProperty("base.page.size"));
		}

		this.draw = draw;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getDraw() {
		return draw;
	}

	public void setDraw(Integer draw) {
		this.draw = draw;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}

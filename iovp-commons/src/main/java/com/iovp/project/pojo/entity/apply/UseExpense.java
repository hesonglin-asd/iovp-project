package com.iovp.project.pojo.entity.apply;

import com.iovp.project.base.pojo.entity.BaseEntity;
import com.iovp.project.pojo.entity.car.Car;

/**
 * <b>智慧公务车信息平台-用车费用实体信息</b>
 * @author hsl
 * @version 1.0.0
 * @since 1.0.0
 */
public class UseExpense extends BaseEntity {
	private static final long serialVersionUID = -8813072402517250864L;
	private String id;                      // 主键
	private Apply apply;                    // 订单信息
	private Car car;                        // 出行车辆
	private ExpenseType expenseType;        // 费用类型
	private Double expenseAmount;           // 费用金额

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Apply getApply() {
		return apply;
	}

	public void setApply(Apply apply) {
		this.apply = apply;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public ExpenseType getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(ExpenseType expenseType) {
		this.expenseType = expenseType;
	}

	public Double getExpenseAmount() {
		return expenseAmount;
	}

	public void setExpenseAmount(Double expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
}

package org.patrick.swagger.demo.param;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 模拟订单查询参数
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@ApiModel(description = "订单列表查询参数")
public class OrderListParam implements Serializable {
  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "订单名称")
  private String orderName;
  @ApiModelProperty(value = "当前页", example = "1")
  private Integer pageIndex = 1;
  @ApiModelProperty(value = "每页记录数", example = "10")
  private Integer pageItem = 10;

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public Integer getPageItem() {
    return pageItem;
  }

  public void setPageItem(Integer pageItem) {
    this.pageItem = pageItem;
  }

}

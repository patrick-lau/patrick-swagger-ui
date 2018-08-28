package org.patrick.swagger.demo.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.RandomUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 订单
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@ApiModel(description = "订单对象")
public class Order implements Serializable {
  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "订单号", example = "0")
  private Long orderId;
  @ApiModelProperty(value = "订单名")
  private String orderName;
  @ApiModelProperty(value = "订单金额", example = "0")
  private BigDecimal orderAmount;
  @ApiModelProperty(value = "订单时间")
  private Date orderTime;

  public Order() {
    this.orderId = System.currentTimeMillis();
    this.orderName = "球鞋" + RandomUtils.nextInt();
    this.orderAmount = new BigDecimal(String.valueOf(RandomUtils.nextInt(1, 9999)));
    this.orderTime = new Date();
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public BigDecimal getOrderAmount() {
    return orderAmount;
  }

  public void setOrderAmount(BigDecimal orderAmount) {
    this.orderAmount = orderAmount;
  }

  public Date getOrderTime() {
    return orderTime;
  }

  public void setOrderTime(Date orderTime) {
    this.orderTime = orderTime;
  }

}

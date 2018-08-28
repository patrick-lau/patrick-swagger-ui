package org.patrick.swagger.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.patrick.swagger.demo.param.OrderListParam;
import org.patrick.swagger.demo.vo.ApiResult;
import org.patrick.swagger.demo.vo.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/order/")
@Api(tags = "订单")
public class OrderController {

  private Logger log = LoggerFactory.getLogger(this.getClass());

  @ApiOperation(value = "订单列表",notes="订单列表，使用场景OOXX")
  @GetMapping("/list")
  @ResponseBody
  public ApiResult<Order> list(OrderListParam param) {
    log.info("param" + param);

    List<Order> orders = new ArrayList<>();
    for (int i = 0; i < param.getPageItem(); i++) {
      orders.add(new Order());
    }

    return new ApiResult<>(orders);
  }

}

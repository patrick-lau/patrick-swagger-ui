package org.patrick.swagger.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.patrick.swagger.demo.param.UserSaveParam;
import org.patrick.swagger.demo.vo.ApiResult;
import org.patrick.swagger.demo.vo.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/user/")
@Api(tags = "用户")
public class UserController {

  private Logger log = LoggerFactory.getLogger(this.getClass());


  @ResponseBody
  @GetMapping("/list")
  @ApiOperation(value = "用户列表", notes = "根据参数返回用户列表数据")
  public ApiResult<User> list(
      @ApiParam(example = "10", value = "每页显示记录数字") @RequestParam(defaultValue = "10", required = false) int pageItem) {

    log.info("pageItem" + pageItem);

    List<User> users = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      users.add(new User());
    }

    return new ApiResult<>(users);
  }


  @ResponseBody
  @PostMapping("/save")
  @ApiOperation(value = "保存用户", notes = "保存新用户，隐藏operatorId参数")
  @ApiImplicitParams({
      @ApiImplicitParam(name = "userName", value = "用户名称", dataType = "String", paramType = "query")})
  public ApiResult<Void> save(@ApiIgnore UserSaveParam param) {
    return new ApiResult<>();
  }



}

package org.patrick.swagger.demo.vo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * API返回对象，简单写
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@ApiModel(description = "通用API返回结果")
public class ApiResult<T> {

  @ApiModelProperty(value = "状态码")
  private int code = 200;
  @ApiModelProperty(value = "返回结果集")
  private List<T> list;

  public ApiResult() {
    super();
  }


  public ApiResult(List<T> list) {
    super();
    this.list = list;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }



}

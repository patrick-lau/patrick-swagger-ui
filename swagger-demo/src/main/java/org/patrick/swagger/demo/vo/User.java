package org.patrick.swagger.demo.vo;

import java.io.Serializable;

import org.apache.commons.lang3.RandomUtils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户
 * 
 * @author patrick.lau@foxmail.com
 *
 */
@ApiModel(description = "用户对象")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID", example = "0")
  private Long userId;
  @ApiModelProperty(value = "用户名称")
  private String userName;

  public User() {
    this.userId = System.currentTimeMillis();
    this.userName = "Patrick" + RandomUtils.nextInt();
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

}

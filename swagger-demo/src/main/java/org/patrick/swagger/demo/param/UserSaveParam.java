package org.patrick.swagger.demo.param;

import java.io.Serializable;

/**
 * 用户保存参数，特地不加@ApiModel和@ApiModelProperty
 * 
 * @author patrick.lau@foxmail.com
 *
 */
public class UserSaveParam implements Serializable {

  private static final long serialVersionUID = 1L;

  private String userName;
  private String operatorId;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getOperatorId() {
    return operatorId;
  }

  public void setOperatorId(String operatorId) {
    this.operatorId = operatorId;
  }



}

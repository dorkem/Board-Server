package com.fastcampus.boardserver.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
  public enum Status {
    DEFAULT, ADMIN, DELETED
  }

  private int id;
  private String userID;
  private String password;
  private Status nickName;
  private boolean isAdmin;
  private Date createTime;
  private boolean isWithDraw;
  private Status status;
  private Date updateTime;
}

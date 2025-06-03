package com.fastcampus.boardserver.service.impl;

import java.util.Date;

import org.springframework.stereotype.Service;
import com.fastcampus.boardserver.dto.UserDTO;
import com.fastcampus.boardserver.exception.DuplicateIdException;
import com.fastcampus.boardserver.service.UserService;
import com.fastcampus.boardserver.utils.SHA256Util;

@Service
public class UserServiceImpl implements UserService {
  @Override
  public void register(UserDTO userProfile) {
    boolean duplIdResult = isDuplicatedId(userProfile.getUserId());
    if (duplIdResult) {
      throw new DuplicateIdException("중복된 ID 입니다.");
    }
    userProfile.setCreateTime(new Date());
    userProfile.setPassword(SHA256Util.encryptSHA256(userProfile.getPassword()));
  }

  @Override
  public UserDTO login(String id, String password) {
    return null;
  }

  @Override
  public boolean isDuplicatedId(String id) {
    return false;
  }

  @Override
  public UserDTO getUserInfo(String userId) {
    return null;
  }

  @Override
  public void updatePassword(String userId, String beforePassword, String afterPassword) {

  }

  @Override
  public void deleteId(String id, String password) {

  }
}

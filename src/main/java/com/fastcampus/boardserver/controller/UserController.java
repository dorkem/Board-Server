package com.fastcampus.boardserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastcampus.boardserver.service.impl.UserServiceImpl;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/users")
@Log4j2
public class UserController {
  private final UserServiceImpl userService;

  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }
}

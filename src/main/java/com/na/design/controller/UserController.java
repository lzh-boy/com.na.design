package com.na.design.controller;

import com.na.design.bean.User;
import com.na.design.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户调配器
 *
 * @author xuliang@asiainfo.com
 * <p>@createTime 2018-04-03 14:01</p>
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    private transient static final Log log = LogFactory.getLog(UserController.class);
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        log.info("获取所有的用户");
        List<User> allUsers = userService.findAllUsers();
        if (allUsers == null) {
            return new ResponseEntity<>(HttpStatus.FAILED_DEPENDENCY);
        } else {
            return new ResponseEntity<>(allUsers, HttpStatus.OK);
        }
    }
}

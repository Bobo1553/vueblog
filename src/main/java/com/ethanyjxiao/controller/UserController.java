package com.ethanyjxiao.controller;


import com.ethanyjxiao.common.lang.Result;
import com.ethanyjxiao.entity.User;
import com.ethanyjxiao.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/{id}")
    public Object test(@PathVariable("id") Long id) {
        return userService.getById(id);
    }

    @RequiresAuthentication
    @GetMapping("/index/{id}")
    public Result index(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        return Result.success(user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody User user) {
        return Result.success(user);
    }
}

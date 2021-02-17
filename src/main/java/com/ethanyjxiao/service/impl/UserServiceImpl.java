package com.ethanyjxiao.service.impl;

import com.ethanyjxiao.entity.User;
import com.ethanyjxiao.mapper.UserMapper;
import com.ethanyjxiao.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

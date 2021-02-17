package com.ethanyjxiao.service.impl;

import com.ethanyjxiao.entity.Blog;
import com.ethanyjxiao.mapper.BlogMapper;
import com.ethanyjxiao.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}

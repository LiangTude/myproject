package com.example.test.serviceImpl;

import com.example.test.bean.UBean;
import com.example.test.mapper.UMapper;
import com.example.test.service.UService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class UServiceImpl implements UService {
    @Resource
    private UMapper uMapper;
    @Override
    public UBean loginIn(String name, String password) {
        return uMapper.getInfo(name,password);
    }
}

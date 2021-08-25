package com.example.server.service.impl;

import com.example.server.dao.TestMapper;
import com.example.server.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author y.cao
 * @date 2021/8/25 14:21
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public int select() {
        return testMapper.select();
    }
}

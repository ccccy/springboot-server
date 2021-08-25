package com.example.server.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author y.cao
 * @date 2021/8/25 14:19
 */
@Mapper
public interface TestMapper {

    int select();
}

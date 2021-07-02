package com.luoyingmm.mapper;

import com.luoyingmm.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    @Override
    public List<User> getUser() {
        return getSqlSession().getMapper(UserMapper.class).getUser();
    }
}

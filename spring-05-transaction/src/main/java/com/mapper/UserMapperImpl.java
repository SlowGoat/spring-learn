package com.mapper;

import com.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> getUser() {

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.addUser(new User(4, "小四", "321"));
        mapper.deleteById(1);

        return mapper.getUser();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }
}

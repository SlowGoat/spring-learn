package com.mapper;

import com.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUser();

    public int addUser(User user);

    public int deleteById(int id);
}

package com.source.wzq.mapper;

import com.source.wzq.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> queryUserBySchoolName(User user);
}

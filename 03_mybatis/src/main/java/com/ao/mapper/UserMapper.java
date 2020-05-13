package com.ao.mapper;

import com.ao.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();

    @Select("select * from user where id = #{id}")
    User getUserById(int id);

}

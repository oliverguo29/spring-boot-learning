package com.ao.mybatis;

import com.ao.entity.User;
import com.ao.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        //List<User> allUser = userMapper.getAllUser();

       // allUser.stream().forEach(v -> System.out.println(v));
        User user = userMapper.getUserById(49);
        System.out.println(user.toString());

    }

}

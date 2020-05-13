package com.ao.demo;

import com.ao.demo.entity.User;
import com.ao.demo.service.UserService;
import org.junit.jupiter.api.Test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class DatabaseApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
       // User user = new User(50, "王二","印度");
       // System.out.println(userService.deleteUser(user));
        List<User> allUser = userService.getAllUser();
        allUser.stream().forEach(v -> System.out.println(v.toString()));

    }

}

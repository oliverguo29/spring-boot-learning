package com.ao.demo.controller;

import com.ao.demo.dao.UserDao;
import com.ao.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @PostMapping("/")
    public void addUser(){
        User user = new User();
        user.setId(1);
        user.setUserName("ao");
        user.setAddress("China");
        userDao.save(user);

    }
}

package com.ao.json.controller;

import com.ao.json.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public List<User> getAlluser(){     //返回json
        List<User> users = new ArrayList<>();
        for(int i=0;i<10;i++){
            User u = new User();
            u.setAddress("beijing:"+i);
            u.setId(i);
            u.setUsername("username: "+i);
            u.setBirthday(new Date());
            users.add(u);
        }
        return users;
    }
}

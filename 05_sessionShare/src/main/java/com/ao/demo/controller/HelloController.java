package com.ao.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import javax.servlet.http.HttpSession;

/**
 * session共享，会自动持久化到redis中
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    Integer port;

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("hello", "world");
        System.out.println("session is set");
        return String.valueOf(port);
    }

    @GetMapping("/get")
    public String getSession(HttpSession session){
        System.out.println("get session");
       return (String) session.getAttribute("hello")+ ": "+ port;
    }
}

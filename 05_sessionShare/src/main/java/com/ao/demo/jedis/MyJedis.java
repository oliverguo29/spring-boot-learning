package com.ao.demo.jedis;


import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

@Component
public class MyJedis {

    Jedis jedis = new Jedis("localhost", 6379);

}

package jedis;

import redis.clients.jedis.Jedis;

public class MyJedis {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        //密码认证
        jedis.auth("123");
        //测试联通
        System.out.println(jedis.ping());
        //测试取值
        String set = jedis.set("hello", "world");
        System.out.println(jedis.get("hello"));


    }
}

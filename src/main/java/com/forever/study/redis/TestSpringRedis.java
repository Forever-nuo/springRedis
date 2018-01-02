package com.forever.study.redis;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
@Component
public class TestSpringRedis {
    @Autowired
    private RedisTemplate redisTemplate;


    public void testSetValue() {
         redisTemplate.opsForValue().set("redisName","张三1");

    }


    public  void testGetValue(){
        Object redisName = redisTemplate.opsForValue().get("redisName");
        System.out.println(redisName);
    }


}


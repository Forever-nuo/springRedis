package com.forever.study.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Forever丶诺 on 2018/1/2.
 */
public class TestRedis {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("appcontext-core.xml");
        TestSpringRedis testSpringRedis = (TestSpringRedis) appContext.getBean("testSpringRedis");
        testSpringRedis.testGetValue();


    }
}

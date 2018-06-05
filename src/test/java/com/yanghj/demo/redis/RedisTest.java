package com.yanghj.demo.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.Assert;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisTest {

	@Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void save(){

        stringRedisTemplate.opsForValue().set("JavaYh","yang hai ji");
        Assert.assertEquals("yang hai ji",stringRedisTemplate.opsForValue().get("JavaYh"));
    }
}

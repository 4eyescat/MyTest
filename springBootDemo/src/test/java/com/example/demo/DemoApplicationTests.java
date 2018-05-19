package com.example.demo;

import com.example.demo.com.elasticSearch.TestController;
import com.example.demo.com.example.bean.User;
import com.example.demo.com.example.mapper.UserMapper;
import com.example.demo.com.test.BlogProperties;
import com.example.demo.com.xusy.controller.UserDemo;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.example.demo.com.mq.Producer;
//import org.springframework.data.redis.core.RedisTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Slf4j
@MapperScan(basePackages = {"com.example.demo.com.example.mapper"})
@CacheConfig(cacheNames = "testusers")
public class DemoApplicationTests {


    @Autowired
    private BlogProperties blogProperties;

    /*@Autowired
    private UserMapper userMapper;*/

    @Autowired
    private UserDemo userDemo;

   /* @Autowired
    private Producer producer;*/

    @Autowired
    private TestController testController;

//    @Autowired
//    private RedisTemplate<String, User> redisTemplate;

/*    @Test
//    @Rollback
    @Cacheable(key = "aa")
    public void testMysql() throws Exception {
//        userMapper.insert("AAA", "BBB");
        User u = userMapper.findByName("AAA");
        System.out.println("第一次查询");
        User uu = userMapper.findByName("AAA");
        System.out.println("第二次查询");
//        Assert.assertEquals(20, u.getAge().intValue());
    }*/

    @Test
    @Cacheable
    public void testCash() throws Exception {
        userDemo.digeist(new User());
    }

    @Test
    public void contextLoads() {
        System.out.println(blogProperties.getName());
        log.info("aa");
    }

//    @Test
//    public void testRedis() {
//        redisTemplate.opsForValue().set("aaa", new User());
//        System.out.println(redisTemplate.opsForValue().get("aaa"));
////        Assert.assertEquals("111", redisTemplate.opsForValue().get("aaa"));
//
//    }

   /* @Test
    public void testMq() {
        Destination destination = new ActiveMQQueue("mytest.queue");
        for(int i=0; i<100; i++){
            producer.sendMessage(destination, "myname is yunqi");
        }

    }*/

    @Test
    public void testElasticSearch() {
//        testController.testSaveArticleIndex();
//        testController.testSearch();
    }

    /**
     * nonNull 和不加一样抛出空指针异常，只是比不加会多一个空指针位置，java.lang.NullPointerException: blogProperties，更好定位问题
     * @param blogProperties
     */
    private void testNotNull(@NonNull BlogProperties blogProperties) {
        blogProperties.getName();
    }

}

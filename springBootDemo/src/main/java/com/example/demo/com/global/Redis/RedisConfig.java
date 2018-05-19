//package com.example.demo.com.global.Redis;
//
//import com.example.demo.com.example.bean.User;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
///**
// * @Description: 配置 使用redis 的User模版
// * @Author: yun qi
// * @Date: 2018/4/6 下午4:45
// */
//@Configuration
//public class RedisConfig {
//
//    @Bean
//    public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, User> template = new RedisTemplate<>();
//        template.setConnectionFactory(factory);
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new RedisObjectSerializer());
//        return template;
//    }
//
//
//}

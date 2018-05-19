package com.example.demo.com.xusy.controller;

import com.example.demo.com.example.bean.Result;
import com.example.demo.com.example.bean.User;
import com.example.demo.com.example.mapper.UserMapper;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/2 下午2:14
 */
@RestController
@RequestMapping(value = "/users")     // 通过这里配置使下面的映射都在/users下，可去除
@CacheConfig(cacheNames = "users")
public class UserDemo {

    @Autowired
    private UserMapper userMapper;

    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "个人注册", notes = "")
    @RequestMapping(value = {""}, method = RequestMethod.GET)
    @Cacheable
    public Result digeist(@RequestBody User user) {
        User u = userMapper.findByName("AAA");
        System.out.println("第一次查询");
        User uu = userMapper.findByName("AAA");
        System.out.println("第二次查询");
        return null;
    }

    @ApiOperation(value = "登陆", notes = "")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public void logIn(@RequestBody User user) {
    }

    /*@ApiOperation(value="验证码", notes="")
    @RequestMapping(value={"/check"}, method= RequestMethod.GET)
    public void check(User user) {
    }


    @ApiOperation(value="忘记密码", notes="")
    @RequestMapping(value={"/check"}, method= RequestMethod.GET)
    public void check(User user) {
    }

    @ApiOperation(value="会话同步-分布式session spring-web-session", notes="")
    @RequestMapping(value={"/check"}, method= RequestMethod.GET)
    public void check(User user) {
    }


    @ApiOperation(value="退出", notes="")
    @RequestMapping(value={"/check"}, method= RequestMethod.GET)
    public void check(User user) {
    }


    @ApiOperation(value="实名认证-运营商三要素", notes="")
    @RequestMapping(value={"/three"}, method= RequestMethod.GET)
    public void threePart(ThreePart threePart) {
    }

    *//**
     * 统计图 一年内，以月为单位
     * 数据 t+1 job 跑
     * @param threePart
     *//*
    @ApiOperation(value="业务数据统计接口", notes="")
    @RequestMapping(value={"/three"}, method= RequestMethod.GET)
    public void threePart(ThreePart threePart) {
    }*/

    /*
         出证
            电子签名业务真实性报告-默认电子版（纸质版打电话给客服申请）
            公证书  司法鉴定意见书 - 只有纸质

            获取电子凭证 蓝色框框 底下有按钮下载（pdf） 浏览：图片
            裁决书先不做

            安全设置： 放实名认证

            没有实名认证： 出证不能用 只能看，不能操作
     */
}

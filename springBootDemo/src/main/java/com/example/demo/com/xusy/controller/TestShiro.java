package com.example.demo.com.xusy.controller;

import com.example.demo.com.global.Exception.CertifiedException;
import com.example.demo.com.global.Exception.SysErrorEnums;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/6 上午12:35
 */
@Controller
public class TestShiro {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Map<String, Object> map) throws Exception{
        System.out.println("HomeController.login()");

        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(request.getParameter("name"), "123");
        try {
            //4、登录，即身份验证
            subject.login(token);
            return "/hello";
        } catch (AuthenticationException e) {
            //5、身份验证失败
            System.out.println("error");
            return "/login";
        }
    }

    @RequestMapping("/success")
    public String hello(HttpServletRequest request, Map<String, Object> map) throws Exception{
        return "/hello";
    }

}

package com.example.demo.com.global.Exception;

import com.example.demo.com.example.bean.Result;
import com.example.demo.com.example.bean.Resultbak;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description: 统一异常处理
 * @Author: yun qi
 * @Date: 2018/4/5 下午4:16
 */
@ControllerAdvice
public class CertifiedExceptionHandler {

    @ExceptionHandler(value = CertifiedException.class)
    @ResponseBody
    public Resultbak<String> errorHandler(HttpServletRequest req, CertifiedException e) throws Exception {
        return e.getResult();
    }


}

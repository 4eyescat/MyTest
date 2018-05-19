package com.example.demo.com.xusy.controller;

import com.example.demo.com.example.bean.Result;
import com.example.demo.com.example.bean.Resultbak;
import com.example.demo.com.global.Exception.CertifiedException;
import com.example.demo.com.global.Exception.SysErrorEnums;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/5 下午3:56
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String index(ModelMap map) throws CertifiedException {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        throw new CertifiedException(SysErrorEnums.ERROR_PARAME);
//        throw new CertifiedException(SysErrorEnums.EMPTY_PARAME);
    }

    @RequestMapping("/res")
    public ResponseEntity<Resultbak> res(ModelMap map) throws CertifiedException {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return ResponseEntity.ok(new Resultbak.ResultbakBuilder<String>().setData("date").build());
//        throw new CertifiedException(SysErrorEnums.ERROR_PARAME);

    }

}

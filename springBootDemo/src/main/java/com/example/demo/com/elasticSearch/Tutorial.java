package com.example.demo.com.elasticSearch;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/7 上午12:04
 */
@Data
public class Tutorial implements Serializable {
    private Long id;
    private String name;//教程名称

    //setters and getters
    //toString
}

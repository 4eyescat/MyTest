package com.example.demo.com.elasticSearch;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/7 上午12:05
 */
@Data
public class Author implements Serializable {
    /**
     * 作者id
     */
    private Long id;
    /**
     * 作者姓名
     */
    private String name;
    /**
     * 作者简介
     */
    private String remark;

    //setters and getters
    //toString

}

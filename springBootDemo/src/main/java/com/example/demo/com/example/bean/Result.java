package com.example.demo.com.example.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Description: 放在global
 * @Author: yun qi
 * @Date: 2018/4/3 下午3:06
 */
@Data
public class Result<T> extends BaseBean{
    public static final String OK = "success";
    public static final String ERROR = "false";
    public static final String CODE = "200";

    private String result = Result.OK;

    private String message;

    private String code = Result.CODE;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String codeRange;

    private T data;

    public Result() {
    }




}

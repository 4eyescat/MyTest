package com.example.demo.com.example.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Description: 放在global
 * @Author: yun qi
 * @Date: 2018/4/3 下午3:06
 */
@Data
public class Resultbak<T> extends BaseBean{
    public static final String OK = "success";
    public static final String ERROR = "false";
    public static final String CODE = "false";

    private String result = Resultbak.OK;
    private String message;
    private String code = Resultbak.CODE;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String codeRange;
    private T data;

    public Resultbak() {
    }

    public Resultbak(String result, String message, String code, String codeRange, T data) {
        this.result = result;
        this.message = message;
        this.code = code;
        this.codeRange = codeRange;
        this.data = data;
    }

    public static class ResultbakBuilder<T> {
        private String result = Resultbak.OK;

        private String message;

        private String code = Resultbak.CODE;

        private String codeRange;

        private T data;

        public Resultbak build() {
            Resultbak resultbak = new Resultbak(result, message, code, codeRange, data);
            return resultbak;
        }

        public ResultbakBuilder setResult(String result) {
            this.result = result;
            return this;
        }

        public ResultbakBuilder setMessage(String message) {
            this.message = message;
            return this;
        }

        public ResultbakBuilder setCode(String code) {
            this.code = code;
            return this;
        }

        public ResultbakBuilder setCodeRange(String codeRange) {
            this.codeRange = codeRange;
            return this;
        }

        public ResultbakBuilder setData(T data) {
            this.data = data;
            return this;
        }
    }
}

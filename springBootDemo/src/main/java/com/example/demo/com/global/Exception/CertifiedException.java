package com.example.demo.com.global.Exception;

import com.example.demo.com.example.bean.Result;
import com.example.demo.com.example.bean.Resultbak;
import lombok.Data;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/5 下午4:15
 */
@Data
public class CertifiedException extends Exception {

    private Resultbak result;

    public CertifiedException(IErrorCode errorCode) {
        this.result = new Resultbak();
        this.result.setCode(errorCode.getErrorCode());
        this.result.setMessage(errorCode.getErrorMessage());
        this.result.setCodeRange(errorCode.getCodeRange());
        this.result.setResult(Result.ERROR);
    }
}

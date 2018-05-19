package com.example.demo.com.global.Exception;

/**
 * @Description:
 * @Author: yun qi
 * @Date: 2018/4/5 下午4:36
 */
public enum SysErrorEnums implements IErrorCode {

    EMPTY_PARAME("A11002", "参数为空", "11"),
    ERROR_PARAME("A11002", "参数错误", "22");

    private String errorCode;
    private String errorMessage;
    private String codeRange;

    private SysErrorEnums(String errorCode, String errorMessage, String codeRange) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.codeRange = codeRange;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getCodeRange() {
        return codeRange;
    }

    public void setCodeRange(String codeRange) {
        this.codeRange = codeRange;
    }
}
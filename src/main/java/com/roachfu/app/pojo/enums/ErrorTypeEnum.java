package com.roachfu.app.pojo.enums;

/**
 * 错误类型集合
 * @author fuqiang
 * @time 2017/3/4 12:28
 */
public enum ErrorTypeEnum {

    /**
     * 200, 成功
     */
    SUCCEED(200, "成功"),

    /**
     * 500, 服务器繁忙, 请稍后再试
     */
    ERROR(500, "服务器繁忙, 请稍后再试");

    /** 错误码 */
    private Integer code;

    /** 错误信息 */
    private String msg;

    private ErrorTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

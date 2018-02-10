package com.yking.sp.common;

/**
 * 通用返回状态码
 */
public enum ResponseCode {
    SUCCESS(200,"SUCCESS"),
    ERROR(500,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT"),
    ILLEGAL_AUTH(401,"登录时效过期");
    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }
    public String getDesc(){
        return desc;
    }

}

package com.zwb.retail.data;

/**
 * @author liuyong
 * @version 1.0.0
 * @ClassName ResponseCode.java
 * @Description 响应码枚举对象
 * @createTime 2021年05月28日 16:38:00
 */
public enum ResponseCode {
    OK(2000, "成功"),
    ERROR(500, "系统异常");
    private final int code;
    private final String description;

    ResponseCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }


}

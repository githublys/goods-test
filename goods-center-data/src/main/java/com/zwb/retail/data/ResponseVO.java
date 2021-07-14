package com.zwb.retail.data;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liuyong
 * @version 1.0.0
 * @ClassName ResultVO.java
 * @Description 响应实体
 * @createTime 2021年05月28日 16:42:00
 */
@Data
@ApiModel("响应实体")
public class ResponseVO<T> implements Serializable {
    @ApiModelProperty("编码 2000:成功,其他异常")
    private int code;

    @ApiModelProperty("消息")
    private String msg;

    @ApiModelProperty("数据结果集")
    private T data;

    @ApiModelProperty("服务器时间戳")
    private Long timestamp;

    public ResponseVO(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.msg = responseCode.getDescription();
        this.timestamp = System.currentTimeMillis();
    }

    public ResponseVO(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.msg = responseCode.getDescription();
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }
}

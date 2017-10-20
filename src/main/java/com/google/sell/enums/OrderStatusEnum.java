package com.google.sell.enums;

import lombok.Getter;

/**
 * Created by HuangHaoDong on 2017/10/19 on 23:03.
 */
@Getter
public enum OrderStatusEnum implements CodeEnum {
    NEW(0,"新订单"),
    FiNISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

package com.google.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Created by HuangHaoDong on 2017/10/19 on 22:52.
 */

@Getter
public enum ProductStatusEnum implements CodeEnum {

    UP(0,"在架"),
    DOWN(1,"下架");
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

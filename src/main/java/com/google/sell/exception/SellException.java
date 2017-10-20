package com.google.sell.exception;

import com.google.sell.enums.ResultEnum;

/**
 * Created by HuangHaoDong on 2017/10/20 on 22:35.
 */

public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {

        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message) {
        super(message);
        this.code = code;
    }



}

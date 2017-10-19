package com.google.sell.VO;

import lombok.Data;

/**
 * hhtp请求返回的最外层对象
 * Created by HuangHaoDong on 2017/10/19 on 22:28.
 */

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

}

package com.google.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by HuangHaoDong on 2017/11/2 on 20:12.
 */

@Data
public class ProductForm {

    private String productId;

    /**
     * 商品名称
     */
    private String producetName;

    /**
     * 商品单价
     */
    private BigDecimal productPrice;

    /**
     * 商品库存
     */
    private Integer productStock;

    /**
     * 商品描述
     */
    private String productDescription;

    /**
     * 类目编号
     */
    private Integer categoryType;

}

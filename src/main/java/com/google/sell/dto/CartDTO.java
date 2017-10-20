package com.google.sell.dto;

import lombok.Data;

/**
 * Created by HuangHaoDong on 2017/10/20 on 21:32.
 */

@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

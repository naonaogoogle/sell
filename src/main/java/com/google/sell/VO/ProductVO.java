package com.google.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.util.List;

/**
 * 商品 包含类目
 * Created by HuangHaoDong on 2017/10/19 on 22:25.
 */

@Data
public class ProductVO {

    /**
     * 商品类目名称
     */
    @JsonProperty("name")
    private String categoryName;

    /**
     * 商品类目类型
     */
    @JsonProperty("type")
    private Integer categoryType;

    /**
     * 商品类目list
     */
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}

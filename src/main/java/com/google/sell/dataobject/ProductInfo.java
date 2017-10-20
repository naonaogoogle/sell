package com.google.sell.dataobject;

import com.google.sell.enums.ProductStatusEnum;
import com.google.sell.utils.EnumUtil;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品
 * Created by HuangHaoDong on 2017/10/19 on 22:34.
 */

@Data
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 商品名称
     */
    private String productName;

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
     * 商品小图
     */
    private String productIcon;

    /**
     * 状态 0正常1下架
     */
    private Integer productStatus = ProductStatusEnum.UP.getCode();

    /**
     * 类目编号
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductStatusEnum getProductStatusEnum() {
        return EnumUtil.getByCode(productStatus,ProductStatusEnum.class);
    }
}

package com.google.sell.repository;

import com.google.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 *
 * Created by HuangHaoDong on 2017/10/19 on 23:21.
 */

public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /**
     * 根据商品状态查询所有商品
     * @param productStatus 商品状态code
     * @return 商品信息列表
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}

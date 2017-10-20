package com.google.sell.service;

import com.google.sell.dataobject.ProductInfo;
import com.google.sell.dto.CartDTO;
import org.apache.catalina.LifecycleState;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 商品service
 * Created by HuangHaoDong on 2017/10/20 on 21:30.
 */
public interface ProductService {

    /**
     * 根据商品id查询商品
     * @param productId 商品id
     * @return 商品对象
     */
    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * @return 所有商品list集合
     */
    List<ProductInfo> findUpAll();

    /**
     * 分页查询商品
     * @param pageable 分页对象
     * @return 分页查询商品结果
     */
    Page<ProductInfo> findAll(Pageable pageable);

    /**
     * 添加商品
     * @param productInfo 商品信息对象
     * @return 被添加的对象
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 加库存
     * @param cartDTOList 购物车集合
     */
    void increaseStock(List<CartDTO> cartDTOList);

    /**
     * 减库存
     * @param cartDTOList 购物车集合
     */
    void decreaseStock(List<CartDTO> cartDTOList);

    /**
     * 商品上架
     * @param productId 上架商品id
     * @return 上架商品对象
     */
    ProductInfo onSale(String productId);

    /**
     * 下架
     * @param productId 下架商品id
     * @return 下架商品对象
     */
    ProductInfo offSale(String productId);






}

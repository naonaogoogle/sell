package com.google.sell.service.impl;

import com.google.sell.dataobject.ProductInfo;
import com.google.sell.dto.CartDTO;
import com.google.sell.enums.ProductStatusEnum;
import com.google.sell.enums.ResultEnum;
import com.google.sell.exception.SellException;
import com.google.sell.repository.ProductInfoRepository;
import com.google.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by HuangHaoDong on 2017/10/20 on 22:26.
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository repository;

    /**
     * 根据商品id查询商品
     *
     * @param productId 商品id
     * @return 商品对象
     */
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    /**
     * 查询所有在架商品
     *
     * @return 所有商品list集合
     */
    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    /**
     * 分页查询商品
     *
     * @param pageable 分页对象
     * @return 分页查询商品结果
     */
    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    /**
     * 添加商品
     *
     * @param productInfo 商品信息对象
     * @return 被添加的对象
     */
    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }

    /**
     * 加库存
     *
     * @param cartDTOList 购物车集合
     */
    @Override
    public void increaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() + cartDTO.getProductQuantity();
            productInfo.setProductStock(result);
            repository.save(productInfo);
        }
    }

    /**
     * 减库存
     *
     * @param cartDTOList 购物车集合
     */
    @Override
    public void decreaseStock(List<CartDTO> cartDTOList) {
        for (CartDTO cartDTO : cartDTOList) {
            ProductInfo productInfo = repository.findOne(cartDTO.getProductId());
            if (productInfo == null) {
                throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
            }
            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            if (result < 0) {
                throw new SellException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
        }

    }

    /**
     * 商品上架
     *
     * @param productId 上架商品id
     * @return 上架商品对象
     */
    @Override
    public ProductInfo onSale(String productId) {
        ProductInfo productInfo = repository.findOne(productId);
        if (productInfo == null) {
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        if (productInfo.getProductStatusEnum() == ProductStatusEnum.UP) {
            throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
        }
        productInfo.setProductStatus(ProductStatusEnum.UP.getCode());
        return repository.save(productInfo);
    }

    /**
     * 下架
     *
     * @param productId 下架商品id
     * @return 下架商品对象
     */
    @Override
    public ProductInfo offSale(String productId) {
        ProductInfo productInfo = repository.findOne(productId);
        if (productInfo == null) {
            throw new SellException(ResultEnum.PRODUCT_NOT_EXIST);
        }
        if (productInfo.getProductStatusEnum() == ProductStatusEnum.DOWN) {
            throw new SellException(ResultEnum.PRODUCT_STATUS_ERROR);
        }
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        return repository.save(productInfo);
    }
}

package com.google.sell.repository;

import com.google.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类型dao层
 * Created by HuangHaoDong on 2017/10/20 on 20:52.
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    /**
     * 根据类型id查询类型商品类型名称
     * @param categoryTypeList 商品类型id
     * @return 商品类型对象集合
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}

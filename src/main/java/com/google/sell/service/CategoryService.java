package com.google.sell.service;

import com.google.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 商品类目接口
 * Created by HuangHaoDong on 2017/10/20 on 21:24.
 */
public interface CategoryService {

    /**
     * 根据类目id查询一个类目
     * @param categoryId 类目id
     * @return 类目对象
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有类目对象
     * @return 所有商品分类
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目id集合查询类目
     * @param categoryTpyeList 类目id集合
     * @return 类目集合
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTpyeList);

    /**
     * 添加一个类目
     * @param productCategory 被添加的类目对象
     * @return 被添加的类目对象
     */
    ProductCategory save(ProductCategory productCategory);


}

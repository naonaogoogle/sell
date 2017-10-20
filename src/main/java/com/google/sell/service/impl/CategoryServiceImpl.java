package com.google.sell.service.impl;

import com.google.sell.dataobject.ProductCategory;
import com.google.sell.repository.ProductCategoryRepository;
import com.google.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by HuangHaoDong on 2017/10/20 on 23:20.
 */

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;

    /**
     * 根据类目id查询一个类目
     *
     * @param categoryId 类目id
     * @return 类目对象
     */
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findOne(categoryId);
    }

    /**
     * 查询所有类目对象
     *
     * @return 所有商品分类
     */
    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    /**
     * 根据类目id集合查询类目
     *
     * @param categoryTpyeList 类目id集合
     * @return 类目集合
     */
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTpyeList) {
        return repository.findByCategoryTypeIn(categoryTpyeList);
    }

    /**
     * 添加一个类目
     *
     * @param productCategory 被添加的类目对象
     * @return 被添加的类目对象
     */
    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}

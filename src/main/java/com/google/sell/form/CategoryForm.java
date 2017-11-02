package com.google.sell.form;

import lombok.Data;

/**
 * Created by HuangHaoDong on 2017/11/2 on 20:09.
 */

@Data
public class CategoryForm {

    private Integer categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;
}

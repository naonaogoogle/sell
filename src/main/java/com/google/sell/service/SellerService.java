package com.google.sell.service;

import com.google.sell.dataobject.SellerInfo;

/**
 * 卖家端
 * Created by HuangHaoDong on 2017/10/21 on 11:02.
 */

public interface SellerService {

    /**
     * 通过openid查询卖家端的信息
     * @param openid 卖家端openid
     * @return 卖家端信息对象
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}

package com.google.sell.service.impl;

import com.google.sell.dataobject.SellerInfo;
import com.google.sell.repository.SellInfoRepository;
import com.google.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by HuangHaoDong on 2017/10/21 on 11:05.
 */

public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellInfoRepository repository;

    /**
     * 通过openid查询卖家端的信息
     *
     * @param openid 卖家端openid
     * @return 卖家端信息对象
     */
    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}

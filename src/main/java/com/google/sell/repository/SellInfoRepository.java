package com.google.sell.repository;

import com.google.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * Created by HuangHaoDong on 2017/10/21 on 10:43.
 */
public interface SellInfoRepository extends JpaRepository<SellerInfo, String> {

    /**
     * 根据买家用户id查询
     * @param openid 微信用户的openid
     * @return  买家的信息
     */
    SellerInfo findByOpenid(String openid);

}

package com.google.sell.repository;

import com.google.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by HuangHaoDong on 2017/10/20 on 21:19.
 */

public interface OrderMasterRepository extends JpaRepository<OrderMaster,String> {

    /**
     * 根据用户的id分页查询用户所有订单
     * @param buyerOpenid 用户的openid
     * @param pageable 分页对象
     * @return 返回分页订单
     */
    Page<OrderMaster> findByBuyerOpenId(String buyerOpenid, Pageable pageable);
}

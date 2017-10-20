package com.google.sell.repository;

import com.google.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by HuangHaoDong on 2017/10/20 on 20:56.
 */

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    /**
     * 根据订单id查询订单详情
     * @param orderId 订单id
     * @return 订单详情集合
     */
    List<OrderDetail> findByOrOrderId(String orderId);


}

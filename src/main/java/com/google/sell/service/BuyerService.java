package com.google.sell.service;

import com.google.sell.dto.OrderDTO;

/**
 * Created by HuangHaoDong on 2017/10/21 on 11:08.
 */

public interface BuyerService {

    /**
     * 查询一个订单
     * @param openid 买家端openid
     * @param orderId 订单id
     * @return 订单详情
     */
    OrderDTO findOrderOne(String openid, String orderId);

    /**
     * 取消订单
     * @param openid 买家端openid
     * @param orderId 订单id
     * @return 取消订单对象
     */
    OrderDTO cancelOrder(String openid, String orderId);

}

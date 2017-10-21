package com.google.sell.service.impl;

import com.google.sell.dto.OrderDTO;
import com.google.sell.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by HuangHaoDong on 2017/10/21 on 11:11.
 */

public class BuyerServiceImpl implements BuyerService {

    /**
     * 查询一个订单
     *
     * @param openid  买家端openid
     * @param orderId 订单id
     * @return 订单详情
     */
    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return null;
    }

    /**
     * 取消订单
     *
     * @param openid  买家端openid
     * @param orderId 订单id
     * @return 取消订单对象
     */
    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        return null;
    }
}

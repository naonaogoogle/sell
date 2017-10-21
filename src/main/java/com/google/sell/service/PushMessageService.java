package com.google.sell.service;

import com.google.sell.dto.OrderDTO;

/**
 * Created by HuangHaoDong on 2017/10/21 on 22:41.
 */

public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO 订单
     */
    void orderStatus(OrderDTO orderDTO);

}

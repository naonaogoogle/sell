package com.google.sell.service;

import com.google.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 *
 * 支付
 * Created by HuangHaoDong on 2017/10/21 on 11:49.
 */

public interface PayService {

    /**
     *支付订单
     * @param orderDTO 订单
     * @return 支付结果
     */
    PayResponse create(OrderDTO orderDTO);


    /**
     * 支付提醒
     * @param notifyData 提醒结果
     * @return 支付结果
     */
    PayResponse notify(String notifyData);

    /**
     * 支付退款
     * @param orderDTO 订单
     * @return 退款结果
     */
    RefundResponse refund(OrderDTO orderDTO);


}


package com.google.sell.service.impl;

import com.google.sell.dto.OrderDTO;
import com.google.sell.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * Created by HuangHaoDong on 2017/10/21 on 23:04.
 */
@Service
@Slf4j
public class PushMessageServiceImpl implements PushMessageService {

    /**
     * 订单状态变更消息
     *
     * @param orderDTO 订单
     */
    @Override
    public void orderStatus(OrderDTO orderDTO) {

    }
}

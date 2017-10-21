package com.google.sell.service.impl;

import com.google.sell.dto.OrderDTO;
import com.google.sell.repository.OrderDetailRepository;
import com.google.sell.repository.OrderMasterRepository;
import com.google.sell.service.OrderService;
import com.google.sell.service.PayService;
import com.google.sell.service.ProductService;
import com.google.sell.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * Created by HuangHaoDong on 2017/10/21 on 11:45.
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ProductService productService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private PayService payService;

    @Autowired
    private PushMessageService pushMessageService;




    /**
     * 创建订单
     *
     * @param orderDTO 前端页面传来的订单参数
     * @return 被创建的订单
     */
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }

    /**
     * 查询单个订单
     *
     * @param orderId 订单id
     * @return 订单详情
     */
    @Override
    public OrderDTO findOne(String orderId) {
        return null;
    }

    /**
     * 查询订单列表
     *
     * @param buyerOpenid 买家端openid
     * @param pageable    分页对象
     * @return 分页后的订单列表
     */
    @Override
    public Page<OrderDTO> findList(String buyerOpenid, Pageable pageable) {
        return null;
    }

    /**
     * 取消订单
     *
     * @param orderDTO 订单
     * @return 被取消的订单
     */
    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    /**
     * 完结订单
     *
     * @param orderDTO 订单对象
     * @return 已完成的订单
     */
    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    /**
     * 支付订单
     *
     * @param orderDTO 订单对象
     * @return 被支付的订单
     */
    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    /**
     * 查询订单列表
     *
     * @param pageable 分页对象
     * @return 查询出来的订单list列表
     */
    @Override
    public Page<OrderDTO> findList(Pageable pageable) {
        return null;
    }
}

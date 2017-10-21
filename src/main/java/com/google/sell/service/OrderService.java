package com.google.sell.service;

import com.google.sell.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * Created by HuangHaoDong on 2017/10/21 on 11:13.
 */

public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO 前端页面传来的订单参数
     * @return 被创建的订单
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个订单
     * @param orderId 订单id
     * @return 订单详情
     */
    OrderDTO findOne(String orderId);

    /**
     * 查询订单列表
     * @param buyerOpenid 买家端openid
     * @param pageable 分页对象
     * @return 分页后的订单列表
     */
    Page<OrderDTO> findList(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     * @param orderDTO 订单
     * @return 被取消的订单
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO 订单对象
     * @return 已完成的订单
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     * @param orderDTO 订单对象
     * @return 被支付的订单
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * 查询订单列表
     * @param pageable 分页对象
     * @return 查询出来的订单list列表
     */
    Page<OrderDTO> findList(Pageable pageable);
}

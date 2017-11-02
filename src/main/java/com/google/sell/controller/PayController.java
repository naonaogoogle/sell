package com.google.sell.controller;

import com.google.sell.dto.OrderDTO;
import com.google.sell.enums.ResultEnum;
import com.google.sell.exception.SellException;
import com.google.sell.service.OrderService;
import com.google.sell.service.PayService;
import com.lly835.bestpay.model.PayResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by HuangHaoDong on 2017/11/2 on 21:35.
 */

@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    /**
     * 创建支付
     * @param orderId 订单号
     * @param returnUrl 支付完后返回的链接
     * @param map TODO 没啥用把
     * @return 返回去了
     */
    @GetMapping("/create")
    public ModelAndView create(@RequestParam("orderId") String orderId,
                               @RequestParam("returnUrl") String returnUrl,
                               Map<String ,Object> map
                               ) {
        //查询订单详情
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            throw new SellException(ResultEnum.ORDERDETAIL_NOT_EXIST);
        }
        //发起支付
        PayResponse payResponse = payService.create(orderDTO);
        map.put("payRespone", payResponse);
        map.put("returnUrl",returnUrl);
        return new ModelAndView("/pay/create",map);
    }


    /**
     * 微信异步通知
     * @param notityData 需要通知的内容
     * @return 嘎嘎嘎嘎嘎嘎嘎
     */
    public ModelAndView notity(@RequestParam String notityData) {
        payService.notify(notityData);

        //返回给微信返回的结果
        return new ModelAndView("/pay/success");
    }


}

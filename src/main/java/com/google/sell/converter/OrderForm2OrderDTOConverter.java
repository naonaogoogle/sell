package com.google.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.sell.dataobject.OrderDetail;
import com.google.sell.dto.OrderDTO;
import com.google.sell.enums.ResultEnum;
import com.google.sell.exception.SellException;
import com.google.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangHaoDong on 2017/10/31 on 23:23.
 */

@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm) {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
            gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误, string={}",orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROE);
        }
        return orderDTO;

    }

}

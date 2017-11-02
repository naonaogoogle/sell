package com.google.sell.converter;

import com.google.sell.dataobject.OrderMaster;
import com.google.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by HuangHaoDong on 2017/10/26 on 22:26.
 */

public class OrderMaster2OrderDTOConverter {

    private static OrderDTO convert(OrderMaster orderMaster) {

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster, orderDTO);
        return orderDTO;
    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(OrderMaster2OrderDTOConverter::convert
        ).collect(Collectors.toList());
    }
}

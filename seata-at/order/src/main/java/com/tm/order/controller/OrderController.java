package com.tm.order.controller;

import com.tm.order.entity.Order;
import com.tm.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LongTao
 * @Description: xx
 * @date 2020/12/2 14:25
 */

@RestController
@Slf4j
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/create")
    public String create(Order order){
        log.info("创建订单");
        orderService.create(order);
        return "创建订单成功";
    }

}

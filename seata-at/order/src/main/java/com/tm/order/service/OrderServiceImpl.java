package com.tm.order.service;

import com.tm.order.entity.Order;
import com.tm.order.feign.AccountClient;
import com.tm.order.feign.EasyIdGeneratorClient;
import com.tm.order.feign.StorageClient;
import com.tm.order.mapper.OrderMapper;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.security.AccessControlContext;
import java.util.Random;

/**
 * @author LongTao
 * @Description: impl
 * @date 2020/12/2 11:46
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    EasyIdGeneratorClient easyIdGeneratorClient;

    @Autowired
    AccountClient accountClient;

    @Autowired
    StorageClient storageClient;

    @Override
    public void create(Order order) {
        Long orderId = Long.valueOf(new Random().nextInt(Integer.MAX_VALUE));
        // Long orderId = easyIdGeneratorClient.nextId("order_business");
        order.setId(orderId);
        orderMapper.create(order);
        //调用storage，修改库存
        storageClient.decrease(order.getProductId(), order.getCount());
        //调用account，修改账户余额
        accountClient.decrease(order.getUserId(),order.getMoney());
    }
}

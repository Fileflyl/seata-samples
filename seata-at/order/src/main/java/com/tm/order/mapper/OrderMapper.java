package com.tm.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tm.order.entity.Order;

/**
 * @author LongTao
 * @Description:
 * @date 2020/12/2 11:44
 */
public interface OrderMapper extends BaseMapper<Order> {
    void create(Order order);
}

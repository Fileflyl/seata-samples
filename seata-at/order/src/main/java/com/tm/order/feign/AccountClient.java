package com.tm.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description: 账户服务的客户端的接口
 * @date 2020/12/2 16:31
 */
@FeignClient(name = "account")
public interface AccountClient {

    @GetMapping("/decrease")
    String decrease(@RequestParam Long userId, @RequestParam BigDecimal money);
}

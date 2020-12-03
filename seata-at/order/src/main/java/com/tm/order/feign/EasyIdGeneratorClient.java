package com.tm.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LongTao
 * @Description:发号器的客户端接口
 * @date 2020/12/2 16:25
 */

@FeignClient(name = "EASY-ID-GENERATOR")
public interface EasyIdGeneratorClient {

    @GetMapping("/segment/ids/next_id")
    Long nextId(@RequestParam String businessType);
}

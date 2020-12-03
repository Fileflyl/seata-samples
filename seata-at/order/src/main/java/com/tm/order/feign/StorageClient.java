package com.tm.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LongTao
 * @Description:库存服务的客户端接口
 * @date 2020/12/2 16:29
 */

@FeignClient(name = "storage")
public interface StorageClient {

    @GetMapping("/decrease")
    String decrease(@RequestParam Long productId, @RequestParam Integer count);


}

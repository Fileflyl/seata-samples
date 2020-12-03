package com.easy.id.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LongTao
 * @Description: 控制
 * @date 2020/12/2 11:01
 */
@RestController
public class StorageController {

    @GetMapping("/decrease")
    public String decrease() {
        return "减少商品库存成功";
    }
}

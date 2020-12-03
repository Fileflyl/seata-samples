package com.tm.storage.controller;

import com.tm.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LongTao
 * @Description: 控制
 * @date 2020/12/2 11:01
 */
@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    @GetMapping("/decrease")
    public String decrease(Long productId, Integer count) {
        storageService.decrease(productId,count);
        return "减少商品库存成功";
    }
}

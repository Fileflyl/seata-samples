package com.tm.account.controller;

import com.tm.account.mapper.AccountMapper;
import com.tm.account.service.AccountService;
import com.tm.account.service.AccountServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description:
 * @date 2020/12/1 17:34
 */
@RestController
@Slf4j
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/decrease")
    public String decrease(Long userId, BigDecimal money){
        this.accountService.decrease(userId,money);
        System.out.println(111);
        return "用户账户扣减金额成功";
    }
}

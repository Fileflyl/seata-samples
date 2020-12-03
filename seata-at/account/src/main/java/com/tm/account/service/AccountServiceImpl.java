package com.tm.account.service;

import com.tm.account.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description:
 * @date 2020/12/1 17:28
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountMapper.decrease(userId,money);
    }
}

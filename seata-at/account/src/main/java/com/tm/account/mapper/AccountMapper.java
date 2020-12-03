package com.tm.account.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tm.account.entity.Account;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description: dao
 * @date 2020/12/1 17:25
 */
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(Long userId, BigDecimal money);


}

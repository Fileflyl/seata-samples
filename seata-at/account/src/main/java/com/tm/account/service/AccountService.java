package com.tm.account.service;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description:
 * @date 2020/12/1 17:27
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);
}

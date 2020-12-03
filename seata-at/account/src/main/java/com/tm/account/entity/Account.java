package com.tm.account.entity;

import com.netflix.ribbon.Ribbon;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author LongTao
 * @Description:
 * @date 2020/12/1 17:23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private Long id;
    private Long userId;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
    private BigDecimal frozen;


}

package com.tm.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LongTao
 * @Description: 实体类
 * @date 2020/12/2 10:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;
    private Long productId;
    private Integer total;
    private Integer used;
    private Integer residue;
    private Integer frozen;
}

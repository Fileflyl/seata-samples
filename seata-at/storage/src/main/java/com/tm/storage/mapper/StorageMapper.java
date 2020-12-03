package com.tm.storage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author LongTao
 * @Description: 接口
 * @date 2020/12/2 10:57
 */
public interface StorageMapper extends BaseMapper<StorageMapper> {

    void decrease(Long productId, Integer count);
}

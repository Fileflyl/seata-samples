package com.tm.storage.service;

import com.tm.storage.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LongTao
 * @Description: 实现类Service
 * @date 2020/12/2 10:59
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    StorageMapper storageMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        storageMapper.decrease(productId,count);
    }
}

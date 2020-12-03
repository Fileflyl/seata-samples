package com.tm.storage.service;

/**
 * @author LongTao
 * @Description: service
 * @date 2020/12/2 10:58
 */
public interface StorageService {

    void decrease(Long productId, Integer count);
}

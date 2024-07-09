package com.fanchen.service;

import com.fanchen.entity.AccessReturn;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 未归用户表 服务类
 * </p>
 */
public interface AccessReturnService extends IService<AccessReturn> {

    void deleteByName(String name);
}

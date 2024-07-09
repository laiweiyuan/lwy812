package com.fanchen.service;

import com.fanchen.entity.SysDept;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 部门表 服务类
 * </p>
 */
public interface SysDeptService extends IService<SysDept> {

    List<SysDept> getAllDept(boolean flag);
}

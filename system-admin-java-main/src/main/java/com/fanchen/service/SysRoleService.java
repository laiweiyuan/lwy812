package com.fanchen.service;

import com.fanchen.entity.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface SysRoleService extends IService<SysRole> {

    boolean insertRole(SysRole sysRole);
}

package com.fanchen.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fanchen.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface SysUserService extends IService<SysUser> {

    SysUser getByUsername(String username);

    String getUserAuthority(String username);

    void clearUserAuthority(String username);

    void clearUserAuthorityByRoleId(Long roleId);

    void clearUserAuthorityByMenuId(Long menuId);

    boolean registerUser(String username, String password, Integer roleType, String registerCode, Long deptId, String phoneNumber);
}

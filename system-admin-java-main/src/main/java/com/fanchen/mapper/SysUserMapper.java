package com.fanchen.mapper;

import com.fanchen.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 */
public interface SysUserMapper extends BaseMapper<SysUser> {
    List<Long> getMenuIds(Long userId);

    List<SysUser> listByMenuId(Long menuId);

    int register(SysUser user);
}

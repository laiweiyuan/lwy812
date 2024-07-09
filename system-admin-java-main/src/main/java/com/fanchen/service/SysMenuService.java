package com.fanchen.service;

import com.fanchen.common.dto.NavMenu;
import com.fanchen.entity.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 */
public interface SysMenuService extends IService<SysMenu> {

    List<NavMenu> getCurrentUserNav();

    List<SysMenu> getCurrentUserMenu();
}

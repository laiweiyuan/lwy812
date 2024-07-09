package com.fanchen.service.impl;

import com.fanchen.entity.SysLoginInfo;
import com.fanchen.mapper.SysLoginInfoMapper;
import com.fanchen.service.SysLoginInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 系统访问记录 服务实现类
 * </p>
 */
@Service
public class SysLoginInfoServiceImpl extends ServiceImpl<SysLoginInfoMapper, SysLoginInfo> implements SysLoginInfoService {

    @Resource
    private SysLoginInfoMapper sysLoginInfoMapper;

    @Override
    public int clearAllInfo() {
        return sysLoginInfoMapper.clearAllData();
    }

}

package com.fanchen.mapper;

import com.fanchen.entity.SysOperateLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 操作日志记录 Mapper 接口
 * </p>
 */
public interface SysOperateLogMapper extends BaseMapper<SysOperateLog> {

    int clearAll();
}

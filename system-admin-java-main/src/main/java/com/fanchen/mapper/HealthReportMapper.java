package com.fanchen.mapper;

import com.fanchen.entity.HealthReport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 二码一报告表 Mapper 接口
 * </p>
 */
public interface HealthReportMapper extends BaseMapper<HealthReport> {

    int checkReportToday(String name);
}

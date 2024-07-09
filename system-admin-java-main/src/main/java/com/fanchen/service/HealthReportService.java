package com.fanchen.service;

import com.fanchen.entity.HealthReport;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 二码一报告表 服务类
 * </p>
 */
public interface HealthReportService extends IService<HealthReport> {

    int checkReportToday(String name);
}

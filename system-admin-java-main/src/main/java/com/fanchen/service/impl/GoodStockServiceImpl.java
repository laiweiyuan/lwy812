package com.fanchen.service.impl;

import com.fanchen.entity.GoodStock;
import com.fanchen.mapper.GoodStockMapper;
import com.fanchen.service.GoodStockService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 物资出入库表 服务实现类
 * </p>
 */
@Service
public class GoodStockServiceImpl extends ServiceImpl<GoodStockMapper, GoodStock> implements GoodStockService {

}

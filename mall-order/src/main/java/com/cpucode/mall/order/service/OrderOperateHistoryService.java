package com.cpucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:35
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


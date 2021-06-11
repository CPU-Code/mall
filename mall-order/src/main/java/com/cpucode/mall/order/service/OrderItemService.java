package com.cpucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:34
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


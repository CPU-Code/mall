package com.cpucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:34
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


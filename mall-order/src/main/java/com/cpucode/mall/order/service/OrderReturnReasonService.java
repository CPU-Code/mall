package com.cpucode.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:34
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


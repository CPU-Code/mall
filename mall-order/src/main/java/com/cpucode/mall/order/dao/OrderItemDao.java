package com.cpucode.mall.order.dao;

import com.cpucode.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:34
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}

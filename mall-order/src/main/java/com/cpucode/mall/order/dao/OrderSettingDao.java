package com.cpucode.mall.order.dao;

import com.cpucode.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:24:34
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

package com.cpucode.mall.coupon.dao;

import com.cpucode.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 17:29:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

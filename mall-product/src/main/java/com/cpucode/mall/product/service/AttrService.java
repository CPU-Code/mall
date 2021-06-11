package com.cpucode.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 09:52:27
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


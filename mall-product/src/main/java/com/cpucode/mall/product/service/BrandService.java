package com.cpucode.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 09:52:27
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


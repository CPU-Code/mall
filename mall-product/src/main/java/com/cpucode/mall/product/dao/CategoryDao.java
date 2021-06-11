package com.cpucode.mall.product.dao;

import com.cpucode.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 09:52:27
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

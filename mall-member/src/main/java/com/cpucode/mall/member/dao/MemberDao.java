package com.cpucode.mall.member.dao;

import com.cpucode.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:19:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

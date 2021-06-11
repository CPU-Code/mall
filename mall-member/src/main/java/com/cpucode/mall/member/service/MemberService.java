package com.cpucode.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cpucode.common.utils.PageUtils;
import com.cpucode.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author cpucode
 * @email 923992029@qq.com
 * @date 2021-06-11 19:19:25
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


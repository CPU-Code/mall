package com.cpucode.mall.member.feign;

import com.cpucode.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : cpucode
 * @date : 2021/6/11
 * @time : 21:55
 * @github : https://github.com/CPU-Code
 * @csdn : https://blog.csdn.net/qq_44226094
 */

/**
 * 告诉spring cloud这个接口是一个远程客户端，要调用coupon服务(nacos中找到)，
 * 具体是调用coupon服务的/coupon/coupon/member/list对应的方法
 */
@FeignClient("mall-coupon")
public interface CouponFeignService {
    /**
     * 远程服务的url
     *  注意写全优惠券类上还有映射//注意我们这个地方不是控制层，
     *  所以这个请求映射请求的不是我们服务器上的东西，而是 nacos 注册中心的
     */
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}

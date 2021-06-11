package com.cpucode.mall.coupon;


import com.cpucode.mall.coupon.entity.CouponEntity;
import com.cpucode.mall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    public void saveTest() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("好优惠");

        couponService.save(couponEntity);

        System.out.println("保存成功");
    }

}

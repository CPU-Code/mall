package com.cpucode.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cpucode.mall.product.entity.BrandEntity;
import com.cpucode.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    /**
     * 创建品牌 名字
     */
    @Test
    public void saveTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("荣耀");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

    /**
     * 更新品牌
     */
    @Test
    public void updateByIdTest() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("小米");
        brandEntity.setDescript("小米六比");

        brandService.updateById(brandEntity);
        System.out.println("修改成功");
    }

    /**
     * 查看品牌数据
     */
    @Test
    public void listTest() {
        List<BrandEntity> lists = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));

        lists.forEach((list)->{
            System.out.println(list);
        });
    }

}

package com.leofight.gulimall.product;

import com.leofight.gulimall.product.entity.BrandEntity;
import com.leofight.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class GuilimallProductApplicationTests {
	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("华为");
		brandEntity.setDescript("华为");
		brandEntity.setBrandId(1302509750932099074l);
		//brandService.save(brandEntity);
		//System.out.println("保存成功");
		brandService.updateById(brandEntity);
	}

}

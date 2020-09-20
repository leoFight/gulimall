package com.leofight.gulimall.product.dao;

import com.leofight.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 09:56:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

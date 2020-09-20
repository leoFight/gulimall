package com.leofight.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leofight.common.utils.PageUtils;
import com.leofight.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 09:56:49
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


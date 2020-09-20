package com.leofight.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leofight.common.utils.PageUtils;
import com.leofight.gulimall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 09:56:48
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


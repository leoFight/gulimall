package com.leofight.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.leofight.common.utils.PageUtils;
import com.leofight.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author fly
 * @email fly@gmail.com
 * @date 2020-09-06 15:52:26
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

